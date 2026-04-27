package Assignment4;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] arr = { {11, 12, 13, 14},
                        {21, 22, 23, 24},
                        {31, 32, 34, 35},
                        {41, 42, 43, 44}};
        tanspose(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void tanspose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
