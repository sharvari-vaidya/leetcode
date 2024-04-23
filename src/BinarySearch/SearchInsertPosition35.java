package BinarySearch;

public class SearchInsertPosition35 {
	
	public static void main(String[] args) {
		int[] num= {1,3,5,6};
		int target=2;
		int ans=searchInsert(num,target);
		System.out.println(ans);
	}

	private static int searchInsert(int[] num, int target) {
		
		int left=-1,right=num.length;
		while(left+1<right) {
			int mid=left+(right-left)/2;
			
			if(predicate(num[mid],target)==0) {
				left=mid;
			}else {
				right=mid;
			}
			
		}
		
		return right;
	}

	private static int predicate(int mid, int target) {
		if(mid<target) {
			return 0;
		}
		
		return 1;
	}

}
