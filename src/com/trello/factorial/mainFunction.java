package com.trello.factorial;

import java.util.Scanner;

public class mainFunction {
	static int factorial(int n){
		 if (n == 0 )    
			    return 1; 

			  else    
			    return(n * factorial(n-1));    
			 }    
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Say� giriniz:");
		int sayi=s.nextInt();
		 if(sayi<0){
			 System.out.println("S�f�rdan b�y�k bir say� giriniz");
		 }else{
		int k=factorial(sayi)	;
		System.out.println(k);
		 }
		}
    
}


