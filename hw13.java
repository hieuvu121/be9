package dsa;
import java.util.*;
class hw13{
	public static int findInterval(int[] A, int r, int l) {
		int leftPointer=0,res=0,missing=r-l+1,rightPointer=0;
		HashMap<Integer,Integer> checkValid=new HashMap<>();
		for(int i=l;i<r+1;i++) {
			checkValid.put(i, 0);
		}

		for(rightPointer=0;rightPointer<A.length;rightPointer++) {
			if(A[rightPointer]>=l&&A[rightPointer]<=r) {
				int oldValue=checkValid.get(A[rightPointer]);
				if(oldValue==0) {
					missing--;
					}
				checkValid.put(A[rightPointer],oldValue+1);
			}
			
			while(missing==0&&leftPointer<=rightPointer) {
				if(res==0) {
					res=rightPointer-leftPointer+1;
				}else {
					res=Math.min(res, rightPointer-leftPointer+1);}
				
				if(A[leftPointer]>=l&&A[rightPointer]<=r) {
					int oldValue=checkValid.get(A[leftPointer]);
					if(oldValue==1) {
						missing++;
					}
					checkValid.put(A[leftPointer], oldValue-1);
				}
				leftPointer++;
				
				}
				}
		if(res!=0) {return res;}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(hw13.findInterval(new int[] {2, 1, 4, 3, 2, 1, 1, 4},4,2));
	}
}