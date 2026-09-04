package com.basicsprograms;

public class MajorityElement {
public static void main(String[] args) {
	int arr[]= {2,2,1,3,2,2,1,1,2};
	int majority=-1;
	for(int i=0;i<arr.length;i++) {//to maintain the candidate
		int cnt=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				cnt++;
			}
		}
		if(cnt>arr.length/2) {
			majority=arr[i];
			break;
		}
	}
	System.out.println("Majority : "+majority);

}
}
