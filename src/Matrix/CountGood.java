//package Matrix;
//import java.util.*;
//public class CountGood {
//	public static void main(String[] args) {
//		int[] a = { 2, 3, 4, 5, 6, 8 };
//		System.out.println(countGoodValue(a));
//
//	}
//
//	public static int countGroups(Integer[] notes) {
//		List<Integer> list= Arrays.asList(notes);
//		Set<Integer> set= new HashSet<>();
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//        
//        for(Integer i : list) {
//        	if(!set.contains(i)) {
//        		set.add(i);
//        	}frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
//        }
//        for(Integer i : list) {
//        	
//        }
//        
//        
//        
//        return list.size();
//    }
//
//	private static int countGoodValue(int[] a) {
//		int count = 0;
//		for (int num : a) {
//			if (checkDivideByTwo(num * 2)) {
//				count++;
//			}
//		}
//		return count;
//
//	}
//
//	private static boolean checkDivideByTwo(int no) {
//		return (no > 0) && ((no & (no - 1)) == 0);
//	}
//
//}
