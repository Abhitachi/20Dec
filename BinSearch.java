package javatap;
import java.util.Scanner;
public class BinSearch {

	 
		
	 static int floor(int[] a,int target) {
		 int start=0;
			int end=a.length-1;
			int mid;
			
			while(start<=end) {
				mid = start+(end-start)/2;
				
				if(a[mid]==target) {
//					System.out.println("found at "+mid);
//					System.out.println("floor element "+ a[mid-1]);
//					System.out.println("ceil element "+a[mid+1]);
					
					return a[end];
				}
				 if(a[mid]<target) {
					start = mid+1;
				}
				else {
					end=mid-1;
				}
				 	
			}	
			return a[end];
	 }
	 
	 
	 static int ceil(int[] a,int target) {
		 int start=0;
			int end=a.length-1;
			int mid;
			
			while(start<=end) {
				mid = start+(end-start)/2;
				
				if(a[mid]==target) {
//					System.out.println("found at "+mid);
//					System.out.println("floor element "+ a[mid-1]);
//					System.out.println("ceil element "+a[mid+1]);
					
					return a[start];
				}
				 if(a[mid]<target) {
					start = mid+1;
				}
				else {
					end=mid-1;
				}
				 	
			}	
			return a[start];
	 }
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		
		//System.out.println("where did you went wrong!!!");
		
//		System.out.println(binSearch(a,target));
		System.out.println(floor(a,target));
		System.out.println(ceil(a,target));
		
		
//		System.out.println(a[start]);		//ceiling
//		System.out.println(a[end]);			//flooring
	}

}
