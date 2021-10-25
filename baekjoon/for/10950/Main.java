import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len*2];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int j=0; j<arr.length; j=j+2) {
            System.out.println(arr[j] + arr[j+1]);
        }
    }

    /*

		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		
		for(int i=0;i<c;i++) {
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
		}

    */


}
