package Lecture13;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";// ye or upar wala Heap (string pool) me bnega or ye duplicate nhi honge s1 and s2 dono same "Hello" ko point kr rhe h
        String s3 = new String("Hello");//ye Heap me bnega outside the String pool ek alag location pe
        String s4 = new String("Hello");//ye bhi alag location pe bnega iske pehle wale se bhale hi same content hai
        System.out.println(s1);
        System.out.println(s1);
        System.out.println(s1);
        System.out.println(s1);
        // ham address print nhi krwa sakte isme direct value print hoti hai kyu??? oops ki classes me cover karwaenge
        System.out.println(s1==s3);// s1 pool me s3 pool se bahar hai isliye false return hoga
        System.out.println(s1 == s2);// s1 pool me s2 bhi pool me ban rha hai isliye true return hoga
        System.out.println(s4 == s3);// s4 pool se bahar s3 bhi pool se bahar hai lekin alag alag location pe isliye false return hoga
        // isme ham address compare krwa rhe h

        System.out.println(s1.length());// ye method hota hai string ke case me lekin int me ye ek variable hota hai
        System.out.println(s1.charAt(2));//to find any character from the string
    }
}
