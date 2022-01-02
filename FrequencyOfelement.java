package javatap;
import java.util.Scanner;
public class FrequencyOfelement {

	static int frequencyCounter(int[] a,int tar) {
		int first=firstoccurance(a,tar);
		int last=lastoccurance(a,tar);
		
		return (last-first+1);
		
	}
	
	
	private static int lastoccurance(int[] nums, int target) {
		// TODO Auto-generated method stub
		int last=-1;
		int s=0;
		int e=nums.length-1;
		int m=s+(e-s)/2;
		
		while(s<=e) {
			m=s+(e-s)/2;
			
			if(nums[m]==target) {
				last=m;
				s=m+1;
			}
			else if(nums[m]<target){
				s=m+1;
			}
			else {
				e=m-1;
			}
		}
		return last;
	}

	private static int firstoccurance(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		int first=-1;
		int s=0;
		int e=nums.length-1;
		int m=s+(e-s)/2;
		
		while(s<=e) {
			m=s+(e-s)/2;
			
			if(nums[m]==target) {
				first=m;
				e=m-1;
			}
			else if(nums[m]<target){
				s=m+1;
			}
			else {
				e=m-1;
			}
		}
		return first;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int tar=sc.nextInt();
		
		System.out.println(frequencyCounter(a,tar));
	}

}
