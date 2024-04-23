package BinarySearch;

public class TwoSum2ArraySorted167 {
	
	public static void main(String[] args) {
		int[] a= {2,7,11,15};
		int target=9;
		int[] findTwoSum = findTwoSum(a,target);
		System.out.println(findTwoSum[0]+"  "+findTwoSum[1]);
	}

	private static int[] findTwoSum(int[] a, int target) {
		int[] ans= new int[2];
		int left=-1,right=a.length;
		while(left+1<right) {
			int mid=left+(right-left)/2;
			if(predicate(a[mid],target)==0) {
				right=mid;
			}else {
				left=mid;
			}
			if(a[left]+a[right]==target) {
				ans[0]=a[left];
				ans[1]=a[right];
				return ans;
			}
		}
		
		
		return ans;
		
	}

	private static int predicate(int mid, int target) {
		if(mid<=target) {
			return 1;
		}
		
		
		return 0;
	}

}
