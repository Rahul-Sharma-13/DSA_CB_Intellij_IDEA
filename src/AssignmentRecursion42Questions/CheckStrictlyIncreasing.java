package AssignmentRecursion42Questions;

public class CheckStrictlyIncreasing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        int i = 0;
        System.out.println(CheckInc(arr, i));
    }
    public static boolean CheckInc(int[] num,int i){
        if(i+1 == num.length){
            return true;
        }
        if(num[i] >num[i+1]){
            return false;
        }

        return CheckInc(num, i+1);
    }
}
