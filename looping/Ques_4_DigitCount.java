package looping;

import java.util.Scanner;

public class Ques_4_DigitCount {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		while(n>0) {
			cnt++;
			n/=10;
		}
		System.out.println(cnt);
		sc.close();
	}

}
