//目標
//intの最大値（２１億）まで変換できる

import java.util.Scanner;


public class IntToEng {
     // メインメソッド
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("入力：");
         int input = sc.nextInt();
         System.out.println("出力："+translateEng(input));
     }

     // 数値を英訳する変換するメソッド
     static String translateEng(int n) {//121
    	 String[] eng0 = {"zero"};

		  if (n==0) {
		       return eng0[0];
		  } else
			return translate(n);

     	}

	public static String translate(int n) {
		String[] eng1 = {"", "one ", "two ", "three ", "four ",
			    "five ", "six ", "seven ", "eight ", "nine ","ten ",
			   "eleven ", "twelve ", "thirteen ", "fourteen ",
			   "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};

			String[] eng2 = {"","","twenty ", "thirty ", "fourty ", "fifty ",
			    "sixty ","seventy ","eighty ","ninety "};

			  String[] eng3 = {"hundred ","thousand ","million ","billion "};
			  //     100        1000      1,000,000  1,000,000,000
		if (n < 20) {
			  return eng1[n];
		  } else if (n < 100) {
			  return eng2[n/10] + eng1[n%10];
		  } else if (n < 1000) {
			  return eng1[n/100] + eng3[0] + translate(n%100);
		  } else if (n < 1000000) {//thousandがいくつあるか
			  return translate(n/1000) + eng3[1] + translate(n%1000);
		  } else if ( n < 1000000000) {
			  return translate(n/1000000) + eng3[2] + translate(n%1000000) ;
		  } else if ( n <= Integer.MAX_VALUE) {
			  return translate(n/1000000000) + eng3[3] + translate(n%1000000000);
		  }
		return "";
	}



}