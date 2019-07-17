package com.techlabs.basic;

public class PrimeTest {
	public static void main(String[] args){
		int i,m=0,prime=0;
		int n=4;
		m=n/2;
		if(n==0||n==1){
			System.out.print("No Prime");
		}else{
			for(i=2;i<=m;i++){
				if(n%i==0){
					System.out.print("No Prime");
					prime=1;
					break;
				}
		}
			if(prime==0){
				System.out.print(n+ " IS Prime");
			}
		}
		
		
		
	  }
	}
