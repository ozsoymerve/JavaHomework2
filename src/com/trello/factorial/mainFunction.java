package com.trello.factorial;

import java.util.Scanner;

public class mainFunction {
	static int factorial(int n){
		 if (n == 0 )    
			    return 1; 
		 else if(n<0){
			 int sonuc=n*factorial(n+1);
			 return sonuc;
		 }
			  else {
				 int sonuc=n * factorial(n-1);
			    return(sonuc);  
			  }
			 }    
	
static void printFunction(int s){
	
	System.out.println(factorial(s));
}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Sayý giriniz:");
		int sayi=s.nextInt();
		factorial(sayi);
		printFunction(sayi);
		 
	
		 }
		}
    



