package dsa;
class hw13{
	public static int findInterval(int[] A, int r, int l) {
		int countInterval=r-l+1,res=0;
		for(int i=0;i<A.length;i++) {
			if(countInterval==0) {
				return res;}
			if(A[i]<=r&&A[i]>=l) {
				res++;
				countInterval--;
			}else {
				res=0;
				countInterval=r-l+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(hw13.findInterval(new int[] {1,3,5,7},5,3));
	}
}