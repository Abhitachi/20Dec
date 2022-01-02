package javatap;
import java.util.Scanner;
public class Sqrt {


    public static int sqrt(int[] arr , int  x) {
    long start = 0;
    long end = x;
    
    while(start+1<end){  
    	long mid = start+(end-start)/2;
    	
    	if(mid*mid==x) {
    		return (int)mid;
    		
    	}if(mid*mid>x) {
    		end=mid;
    		
    		
    	}else {
    		start=mid;
    		
    	}if(end*end==x) {
    		return (int)end;
    	}
    }
    return (int) start;
    }    

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
			
	
		int s = sc.nextInt();
		
		int sq = sqrt(a,s);
		System.out.println(sq);
	}
}



		

