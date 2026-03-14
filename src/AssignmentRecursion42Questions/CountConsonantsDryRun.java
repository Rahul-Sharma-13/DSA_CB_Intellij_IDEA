package AssignmentRecursion42Questions;

public class CountConsonantsDryRun {
    public static void main(String[] args) {
        String word = "abcde";
        System.out.println(CountConso(word));
    }
    public static int CountConso(String word){
        int count = 0;
        int i = 0;
        if(word.isEmpty()){
            return count;
        }
        char ch = word.charAt(i);
        if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
            return CountConso(word.substring(i+1));
        }else{
            count++;
            return CountConso(word.substring(i+1))+count;
        }
    }
}
