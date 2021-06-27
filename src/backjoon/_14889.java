package backjoon;
// https://www.acmicpc.net/problem/14889
// 스타트와 링크
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14889 {
  public static int N; // 주어진 숫자 개수
  public static int[][] skill; // 능력치
  static boolean[] visit;
  static int Min = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 15696 runtime 324
    N = Integer.parseInt(br.readLine());
    skill = new int[N][N];
    visit = new boolean[N];

    // 숫자들 배열에 넣기
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for(int j=0; j<N; j++){
        skill[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    combination(0, 0);
    System.out.println(Min);
  }

  static void combination(int idx, int cnt){
    // 팀 조합이 완성된 경우
    if(cnt == N/2){
      diff();
      return;
    }

    for(int i=idx; i<N; i++){
      // 방문하지않은 경우
      if(!visit[i]){
        visit[i] = true;
        combination(i+1, cnt+1); // 재귀
        visit[i] = false;
      }
    }
  }
  // 두 팀의 능력치 차이를 계산하는 함수
  static void diff(){
    int team_start = 0;
    int team_link = 0;

    for(int i=0; i<N-1; i++){
      for(int j=i+1; j<N; j++){
        if(visit[i] == true && visit[j] == true){
          team_start += skill[i][j];
          team_start += skill[j][i];
        }
        // i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스
        else if (visit[i] == false && visit[j] == false) {
          team_link += skill[i][j];
          team_link += skill[j][i];
        }
      }
    }
    // 두 팀의 점수 차이 (절댓값)
    int val = Math.abs(team_start - team_link);

    // 두 팀의 차이가 0이라면 가낭 낮은 최솟값이기때문에 종료
    if (val == 0) {
      System.out.println(val);
      System.exit(0);
    }
    Min = Math.min(val, Min);
  }
}
/*
input
6
0 1 2 3 4 5
1 0 2 3 4 5
1 2 0 3 4 5
1 2 3 0 4 5
1 2 3 4 0 5
1 2 3 4 5 0

output
2
 */