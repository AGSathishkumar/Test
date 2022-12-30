package Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class FindallAnagram {
	
	@Test
	public void td1() {
		
		String s = "cbaebabacd", p = "abc";
		List<Integer> containsNearbyDuplicate = findAnagrams(s,p);
		System.out.println(containsNearbyDuplicate);
	}
	
	public List<Integer> findAnagrams(String s, String p){
		HashMap<Character,Integer> hmap1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> hmap2 = new HashMap<Character,Integer>();
		
		for(int i=0;i<p.length();i++) {
			hmap1.put(p.charAt(i),hmap1.getOrDefault(p.charAt(i), 0)+1);
		}
		
		List<Integer> ls = new ArrayList<Integer>();
		for(int i=0;i<p.length();i++) {
			for(int j=i;j<s.length();j++) {
				hmap2.put(s.charAt(i), hmap2.getOrDefault(s.charAt(i), 0)+1);
				if(hmap1.size() == hmap2.size()) {
					if(hmap1.equals(hmap2)) {
						ls.add(i);
					}
				}
			}
		}
		hmap2.clear();
		
		
		return ls;
		
		
	}

}
