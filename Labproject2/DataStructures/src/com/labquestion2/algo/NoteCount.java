package com.labquestion2.algo;

public class NoteCount {
	public void countDenominations(int arr[],int amount) {
		int[] countArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (amount >= arr[i]) {
				countArray[i] = amount / arr[i];
				amount = amount - countArray[i] * arr[i];
			}
		}
		//If amount cannot be paid
		if(amount > 0) {
			System.out.println("Exact amount cannot be given with the highest denomination");	
		}else {
			System.out.println("Your payment approach in order to give min no of notes will be");
   
			for (int i = 0; i < countArray.length; i++) {
				if (countArray[i] != 0) {
					System.out.println(arr[i] + " : " + countArray[i]);
				}
			}
		}
	}
	}
