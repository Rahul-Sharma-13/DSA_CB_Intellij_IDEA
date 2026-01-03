package Lecture1;

public class SkipMultiplesOf_3 {
    public static void main(String[] args) {
        int n = 100;

        for(int i = 0; i<=n; i++){
            if(i%3==0){
                continue;
            } else{
                System.out.println(i);
            }
        }
    }
}
