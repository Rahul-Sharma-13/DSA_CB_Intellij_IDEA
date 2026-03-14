package AssignmentRecursion42Questions;

public class PrintReverse {
    public static void main(String[] args) {
        int n = 5;
        Print(n);
    }
    public static void Print(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        Print(num -1);
    }
}
//37
