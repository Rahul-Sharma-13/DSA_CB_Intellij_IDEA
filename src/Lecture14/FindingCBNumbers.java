package Lecture14;

public class FindingCBNumbers {
    public static void main(String[] args) {
        String s = "81615";
        print(s);
    }
    public static void print(String s){
        int c = 0;
        boolean [] visited = new boolean[s.length()];
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                long num = Long.parseLong(s.substring(i, j));
                if(isCBNumber(num)&&isVisited(visited, i , j-1)){
                    c++;
                    for(int k = i; k<=j-1; k++){
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(c);
    }
    public static boolean isVisited(boolean[] visited, int start, int end){
        for (int i = start; i<=end; i++){
            if(visited[i] == true){
                return false;
            }
        }
        return true;
    }
    public static boolean isCBNumber(long num){
        if(num ==0 || num == 1){
            return false;
        }
        int [] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(num%arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}
