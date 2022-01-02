package javatap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FirstAndlastOccuranace {

	public static int[] SearchRange(int[] nums,int target) {
		int first=firstoccurance(nums,target);
		int last=lastoccurance(nums,target);
		
		int[] ans= {first,last};
		
		return ans;
		
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
//		ArrayList<Integer> a=new ArrayList<Integer>();
		
		int[] nums =new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		
		int target=sc.nextInt();
		int[] result=SearchRange(nums,target);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
//		
		
//		System.out.println(SearchRange(nums,target));
		
	}

}
