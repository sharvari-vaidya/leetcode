package BinarySearch;

public class AgnosticBS {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5 };

		int target = 1;
		findEle(a, target);
	}

	private static void findEle(int[] a, int target) {
		boolean flag = false;
		if (a[0] > a[a.length - 1]) {
			flag = true;
		}

		int left = -1, right = a.length;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (!flag) {
				if (a[mid] <= target) {
					left = mid;
				} else {
					right = mid;
				}
			}else {
				if(a[mid]>=target) {
					left=mid;
				}else {
					right=mid;
				}
			}
		}
		System.out.println(left);

	}

}
