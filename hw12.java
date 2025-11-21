package dsa;
import java.util.*;
public class hw12 {
	public static int valueOccur(int[] A) {
		int count=0;
		int max=A[A.length-1];
		int[] arr=new int[max+1];
		for(int i=0;i<A.length;i++) {
			int v=A[i];
			arr[v]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(i!=arr[i]&&arr[i]!=0) {
				count+=Math.min(arr[i],Math.abs(i-arr[i]));
			}
		}
		return count;
	}
	
	public static int noEqualDigits(int A) {
		boolean notEqualDigit=true;
		int digit=A;
		while(notEqualDigit) {
			notEqualDigit=false;
			digit++;
			String num=String.valueOf(digit);
			for(int i=0;i<num.length()-1;i++) {
				if(num.charAt(i)==num.charAt(i+1)) {
					notEqualDigit=true;
				}
				}
			}
		return digit;
		}	
	
	public static int sameDigitMerge(int[] A) {
		HashMap<Integer,Integer> first=new HashMap<>();
		HashMap<Integer,Integer> last=new HashMap<>();
		int res=0;
		for(int i:A) {
			int lastDigit=i%10;
			int firstDigit=i;
			while (firstDigit>=10) {
				firstDigit /=10;
			}
			first.put(firstDigit,first.getOrDefault(firstDigit,0)+1 );
			last.put(lastDigit, last.getOrDefault(lastDigit,0)+1);
		}
		for(Integer key:first.keySet()) {
			if(last.get(key)!=null){
				res+=first.get(key)*last.get(key);
			}
		}
		return res;
	}
	
	
	public static int findNumber(int[] A, int findNumber) {
		int left=0;
		int right=A.length-1;
		while(left<=right) {
			int mid=(right+left)/2;
			if(A[mid]==findNumber) {
				return mid;
			}else if(findNumber<A[mid]) {
				right=mid-1;
			}else {left=mid+1;}
		}
		return 0;
	}
	public static double sqrt(int A) {
		if (A==0||A==1) return A;
		double x=A;
		double eps=0.01;
		while(true) {
			double next=0.5*(x+(double) A/x);
			if(Math.abs(next-x)<eps) {
				return next;
			}
			x=next;
		}
	}

	

	
	public static void main(String[] args) {
		System.out.println(hw12.valueOccur(new int[] {10,10,10}));
		System.out.println(hw12.noEqualDigits(1099));
		System.out.println(hw12.sameDigitMerge(new int[] {15,15,15,51,51,51}));
		System.out.println(hw12.sqrt(26));
		
	}
}
