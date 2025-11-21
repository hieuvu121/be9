package dsa;

import java.util.Arrays;

public class hw11{
	public static int evenPairs(int[] A) {
		int count=0;
		int index=0;
		while(true) {
			if(index==A.length-1) {
				int res=A[index]+A[0];
				if(res%2==0) {
					count+=1;
					return count;
				}
				return count;
			}
			int res=A[index]+A[index+1];1

			if(res%2==0) {
				count+=1;
				if(index==A.length-2) {return count;}
				index+=2;
			}else {index+=1;}
		}
	}
	public static long minNum(int[] A) {
		Arrays.sort(A);
		long count=0;
		for(int i=0;i<A.length;i++) {
			int val=i+1;
			if ((i+1)!=A[i]) {
				count+= Math.abs(A[i]-val);
			}
			if(count>1000000000) {return -1;};
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(hw11.evenPairs(new int[] {14,21,16,35,22}));
		System.out.println(hw11.minNum(new int[] {6,2,3,5,6,3}));
	}
}