public class c1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("10,000 <= 입력받는 수 <= 99,999 로 입력하세요");
		int n = sc.nextInt();
		String[] str = Integer.toString(n).split("");
		
		for(int i=0; i<str.length; i++){
			System.out.printf("[%s", str[i]);
				for(int j=str.length-1; j>i; j--){
					System.out.printf("0");
			}
			System.out.printf("]\n");
		}

	}

}
