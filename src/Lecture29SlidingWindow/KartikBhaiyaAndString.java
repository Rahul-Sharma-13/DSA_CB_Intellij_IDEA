package Lecture29SlidingWindow;

//https://codeskiller.codingblocks.com/problems/446
public class KartikBhaiyaAndString {
    public static void main(String[] args) {
        String s = "ababbababababaaabbabaa";
        int k = 2;
        int flipA = findSub(s, k, 'a');
        int flipB = findSub(s, k, 'b');
        System.out.println(Math.max(flipA,flipB));
    }
    public static int findSub(String s, int k, char ch){
        int start = 0, end = 0, ans = 0, flip = 0;
        while(end<s.length()){
            //window grow
            if(s.charAt(end) == ch){
                flip++;
            }
            //window shrink
            while(flip>k&&start<=end){
                if(s.charAt(start)== ch){
                    flip--;
                }
                start++;
            }
            //ans update
            ans = Math.max(ans, end-start+1);
            end++;
        }
        return ans;
    }
}
