package baekjoon;

import java.util.Scanner;
public class baekjoon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.printf(">");
		}
		else if(a<b) {
			System.out.printf("<");
		}
		else {
			System.out.printf("==");
		}

	}

}
