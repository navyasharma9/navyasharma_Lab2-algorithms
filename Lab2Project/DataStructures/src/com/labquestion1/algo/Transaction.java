package com.labquestion1.algo;

public class Transaction {
	public void processTransactions(int[] arr, int target) {
        int status = 0;
        //int sum=0;
        for (int i=0; i<arr.length; i++) { //linear iteration, linear searching
          // sum += arr[i];
            //check if target is achieved
            if(arr[i] >= target) {
            	System.out.println("Target achieved after "+(i+1) +" transactions ");
            	status = i+1;
            	break;
            }
        }
		//check if looped across all the transactions
        if(status == 0) {
        	System.out.println("Given target is not achieved ");
        }
        /*public int isTargetAchive(int arr[],int value) {
    	int status=-1;
    	long sum=0;
    	for(int i=0;i<arr.length;i++) {
    		sum+=arr[i];
    		if(sum<=value) {
    			status=i+1;
    			break;
    		}
    	}
    	return status;
    }*/
	}
	
}
