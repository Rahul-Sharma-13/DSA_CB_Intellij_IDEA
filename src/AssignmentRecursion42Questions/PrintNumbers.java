package AssignmentRecursion42Questions;

public class PrintNumbers {
    public static void main(String[] args) {
        int n = 5;
        Print(n);
    }
    public static void Print(int num){
        if(num == 1){
            System.out.println(1);
            return;
        }
        Print(num-1);
        System.out.println(num);
    }
}
