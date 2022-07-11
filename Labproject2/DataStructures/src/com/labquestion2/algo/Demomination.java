package com.labquestion2.algo;
import java.util.Scanner;
public class Demomination {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MergeSort merge=new MergeSort();
		NoteCount note=new NoteCount();
		System.out.println("Enter the size of currency denominations");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter the currency denominations value");
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		merge.sort(arr, 0, num-1);
		note.countDenominations(arr,  amount);
		sc.close();
	}

}
