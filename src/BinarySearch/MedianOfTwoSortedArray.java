package BinarySearch;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5,7 };
		int[] b = { 3, 4, 9, 10, 12 };

		findMedian(a, b);
	}

	private static void findMedian(int[] a, int[] b) {
		int n1=a.length;
		int n2=b.length;
		if(n1>n2) {
			findMedian(b, a);
		}
		
		int left=-1,right=n1;
		int avg=(n1+n2+1)/2;
		while(left+1<right) {
			int mid=left+(right-left)/2;
			int mid2=avg-mid;
			int l1=0,l2=0,r1=0,r2=0;
			if(mid<n1) {
				r1=a[mid];
			}if(mid2<n2) {
				r2=b[mid2];
			}if(mid-1>=0) {
				l1=a[mid-1];
			}if(mid2-1>=0) {
				l2=b[mid2-1];
			}
			if(l1<=r2 && l2<=r1) {
				if((n1+n2)/2%2==0) {
					System.out.println((Math.max(l1,l2)+Math.min(r1, r2))/2.0);
				}else {
					System.out.println(Math.max(l1, l1));
				}
				break;
			}
			else if(l1>r2) {
				right=mid;
			}else {
				left=mid;
			}
			
		}
		
	}

}
