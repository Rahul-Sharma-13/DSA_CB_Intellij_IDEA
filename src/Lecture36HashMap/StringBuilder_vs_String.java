package Lecture36HashMap;

public class StringBuilder_vs_String {
    public static void main(String[] args) {
//        StringDemo();
//        StringBuilder();
    }
    public static void StringBuilder(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
    }
    public static void StringDemo(){
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + i;
        }
    }
}
