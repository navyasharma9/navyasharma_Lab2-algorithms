package com.labquestion1.algo;
import java.util.Scanner;
public class PayMoneyTransation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Transaction tans=new Transaction();
		
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] transactionsArr = new int[size];
		System.out.println("Enter the values of array");
		for(int i=0; i<size; i++)
        	transactionsArr[i] = sc.nextInt();
		System.out.println("Enter the total no. of targets that needs to be achieved");
        int targetCount = sc.nextInt();
        System.out.println("Enter the value of targets");
        int target;
        int Sum[] = new int[size];
        Sum[0] = transactionsArr[0];
        for(int i=1; i<size; i++) {
        	Sum[i] = Sum[i-1] + transactionsArr[i];
        }
      
        for(int i=0; i<targetCount; i++) {
        	target = sc.nextInt();
        	tans.processTransactions(Sum, target);
        }


        sc.close();
		
	}
}
