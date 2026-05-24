package Lecture36;

public class StringBuilderDemo {
    public static void main(String[] args){
//        StringBuilder sb = new StringBuilder("Hello");
//        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());
        sb.append('a');
        sb.append(1);
        sb.append(true);
        sb.append("coding");
        sb.append("Hey");
        System.out.println(sb);
        sb.append("nab");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.substring(1,4));
        System.out.println(sb.charAt(3));
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append("coding Bloks");
        System.out.println(sb.equals(sb1));
        System.out.println(sb.compareTo(sb1));
        String s = sb.toString();
    }
}
