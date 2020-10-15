
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class c1084 {

	public static void main(String[] args) {
		//시간초과 문제 발생
		
/*		Scanner sc = new Scanner(System.in);
		String[] color = sc.nextLine().split(" ");
		sc.close();
		
		int rPick = Integer.parseInt(color[0]);
		int gPick = Integer.parseInt(color[1]);
		int bPick = Integer.parseInt(color[2]);

		int count = 0;
		for(int r=0; r<rPick; r++){
			for(int g=0; g<gPick; g++){
				for(int b=0; b<bPick; b++){
					System.out.printf("%d %d %d\n", r,g,b);
					count ++;
				}
			}
		}
		System.out.println(count);*/
		
		//시간 초과 해결
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
		try {
			String[] n = br.readLine().split(" ");
			int count = 0;
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			for (int i = 0; i < Integer.valueOf(n[0]); i++) {
				for (int j = 0; j < Integer.valueOf(n[1]); j++) {
					for (int k = 0; k < Integer.valueOf(n[2]); k++) {
						bw.write(i + " " + j + " " + k + "\n");
						count++;
					}
				}
			}
			bw.write(String.valueOf(count));
			bw.flush();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//end of main()
}
