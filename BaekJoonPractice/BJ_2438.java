package javaTEst;

import java.util.Scanner;

public class BJ_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int a=1;a<=N;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

