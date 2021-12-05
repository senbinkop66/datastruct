import java.util.*;

class Solution {
	public void reverseString(char[] s) {
		int len=s.length;
		if (len<=1) return;
		char c;
		//int len=Math.floor(s.length/2);
		for (int i=0;i<len/2;i++) {
			c=s[i];
			s[i]=s[len-1-i];
			s[len-1-i]=c;
		}
	}

	public int reverse(int x) {
		if (x>-10 && x<10) return x;
		long result=0;
		while(x!=0){
			result=result*10+x%10;
			x=x/10;
		}
		//检测是否溢出，溢出则返回0
		return (int) result==result ? (int) result :0;
	}

	public int firstUniqChar(String s) {
		char[] str=s.toCharArray();
		if (str.length<=1) {
			return 0;
		}
		for (int i=0;i<str.length;i++){
			if (str[i]!=str[i+1]) return i;
		}
		return -1;
	}
}


public class TestOperateString{
	public static void main(String[] args) {

		//int[] testnums={1,2,3,4,5,6,7,8,9,10};
		//char[] testStr={'h','e','l','l','o','b'};
		//int n=-136469;
		String testStr="lliverpool";

		Solution mysolution=new Solution();
		//mysolution.reverseString(testStr);
		//int result=mysolution.reverse(n);
		//System.out.println(result);
		//System.out.println(Arrays.toString(testStr));
		int result=mysolution.firstUniqChar(testStr);
		System.out.println(result);
	}
}