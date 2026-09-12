package com.twopointers;

public class FoundOutPairSum {
	
	public static void main(String[] args) {
		//Time complexity -O(n square)
//		int arr[]= {1,2,3,4,6};
//		int target=6;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.println("Found Pairs : "+arr[i]+" "+arr[j]+" ->  		"+target);
//				}
//			}
//		}
	//O(n) time complexity
		int arr[]= {1,2,3,4,6,9,10,11};
		int target=14;
		pairsum(arr, target);
	}
	public static void pairsum(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
	
		while(left<=right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				System.out.println("Found Pairs : "+arr[left]+" "+arr[right]);
				left++;
				right--;
			}
			else if(sum>target) {
				right--;
			}
			else {
				left++;
			}
	}
}
}
