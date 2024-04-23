package BinarySearch;

public class BSIn2DArray74 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int target = 10;
		System.out.println(searchMatrix(a,target));

	}

	public static boolean searchMatrix(int[][] a, int target) {

		boolean flag = false;
		int left = -1, right = a.length * a[0].length;
		while (left + 1 < right) {
			int mid = (left + right) / 2;

			int row = mid / a[0].length;
			int col = mid % a[0].length;
			if (a[row][col] == target) {
				return true;
			} else if (a[row][col] > target) {
				right = mid;
			} else {
				left = mid;
			}

		}

		return flag;

	}
}
