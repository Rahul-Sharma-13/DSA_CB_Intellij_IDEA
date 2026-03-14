package AssignmentRecursion42Questions;

public class ReplaceCharDryRun {
    public static void main(String[] args) {
        String s = "cat";
        System.out.println(Replace(s));
    }
    public static String Replace(String word){
        int i = 0;
        if(word.isEmpty()){
            return word;
        }
        if(word.charAt(i) =='a'){
            return 'o' + Replace(word.substring(i+1)) ;
        }else{
            return word.charAt(i) + Replace(word.substring(i+1));
        }

    }
}
