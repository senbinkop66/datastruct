import java.util.*;

class Solution{
	public boolean containsDuplicate(int[] nums){
		int len=nums.length;
		if (len<=1) return false;
		
		//使用set
		Set<Integer> set=new HashSet<>();
		for (int n:nums){
			//当重复添加返回true
			if (!set.add(n)) {
				return true;
			}
		}
		return false;
	}
}

public class TestArray1{
	public static void main(String[] args) {
		int[] testnums={4,1,2,3};
		Solution mysolution=new Solution();
		boolean result=mysolution.containsDuplicate(testnums);
		System.out.println(result);
		System.out.println(Arrays.toString(testnums));
	}
}