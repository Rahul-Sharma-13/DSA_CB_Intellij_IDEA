package AssignmentRecursion42Questions;

public class RemCharX {
    public static void main(String[] args) {
        String word = "xoxox";
        System.out.println(RemoveX(word));
    }
    public static String RemoveX(String word){
        int i =0;
        String sum ="";
        if(word.isEmpty()){
            return sum;
        }
        char ch = word.charAt(i);
        if(ch == 'x'){
            return RemoveX(word.substring(i+1));
        }else{
            sum += RemoveX(word.substring(i+1))+ch;
        }
        return sum;
    }
}
