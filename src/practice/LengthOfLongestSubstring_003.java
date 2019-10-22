package practice;

import java.util.HashMap;
import java.util.Map;

//给定一个字符串，请你找出其中不含有重复字符的最长子串 的长度。

public class LengthOfLongestSubstring_003 {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int end = 0, start = 0; end < n; end++) {
			char alpha = s.charAt(end);
			if (map.containsKey(alpha)) {
				start = Math.max(map.get(alpha), start);
			}
			ans = Math.max(ans, end - start + 1);
			map.put(s.charAt(end), end + 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		String a = "pwwkew";
		LengthOfLongestSubstring_003 lel = new LengthOfLongestSubstring_003();
		System.out.println(lel.lengthOfLongestSubstring(a));
	}

	public int lenthOfLongestSubstringPrac(String str) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		int n = str.length();
		int ans = 0;
		for (int end = 0,start = 0; end < n; end++) {
			char a = str.charAt(end);
			if(map.containsKey(a)) {
				start = Math.max(map.get(a), start);
			}
			ans = Math.max(ans, end-start+1);
			map.put(str.charAt(end), end +1);
		}
		return ans;
	}
}
