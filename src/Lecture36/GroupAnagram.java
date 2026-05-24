package Lecture36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
//    https://leetcode.com/problems/group-anagrams/submissions/2011781675/
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
    }
    public static List<List<String>> GroupAnagram(String[] arr){
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            String key = GenKey(s);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        List<List<String>>ans = new ArrayList<>();
        for(String key: map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }

    private static String GenKey(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            sb.append(freq[i] + " ");
        }
        return sb.toString();
    }
}
