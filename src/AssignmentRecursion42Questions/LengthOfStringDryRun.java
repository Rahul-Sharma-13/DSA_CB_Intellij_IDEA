package AssignmentRecursion42Questions;

public class LengthOfStringDryRun {
    public static void main(String[] args) {
        String s = "hello";
        int i = 0;
        System.out.println(Length(s,i));
    }
    public static int Length(String word, int i){
        int count = 0;
        if(word.isEmpty()){
            return count;
        }else{
            count++;
        }
        return Length(word.substring(i+1), i+1) + count;
    }
}
