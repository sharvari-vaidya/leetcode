package BinarySearch;

public class Sqrt69 {
	public static void main(String[] args) {
		int num=99;
		
		System.out.println(findSqrt(num));
	}

	private static int findSqrt(int num) {
		int left=-1,right=num;
		while(left+1<right) {
			int mid=left+(right-left)/2;
			if(mid*mid<=num) {
				left=mid;
			}else {
				right=mid;
			}
		}
			
		
		
		return left;
	}

}
