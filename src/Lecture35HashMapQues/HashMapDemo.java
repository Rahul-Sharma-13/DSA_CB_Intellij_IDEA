package Lecture35HashMapQues;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
//        Map ka helping data structure Linked List hota hai
int x = 5;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raj", 67);
        map.put("Ankit", 88);
        map.put("Amisha", 57);
        map.put("Shivam", 89);
        map.put("Pooja", 57);
        map.put("Ankita", 78);
        map.put("Kunal", 93);

//        we can also add null as a key but it could only be added once bcz if we add it
//        again then it will just update the value of null
//        map.put(null, 17);

//        duplicate keys aane pe key ke correspoding value update ho jaati hai
//        map.put("Shivam", 86);
        System.out.println(map);
////        get method
//        System.out.println(map.get("Raj"));
//        System.out.println(map.get("Rajesh"));
////        remove
//        System.out.println(map.remove("Raj"));
//        System.out.println(map.remove("Rajesh"));
//        System.out.println(map);
////        containsKey
//        System.out.println(map.containsKey("Ankit"));
//        System.out.println(map.containsKey("Rajesh"));



//        Tree ka helping data structure red black tree hota hai
//        isme sara kaam log (n) me hota hai
//        isme hum null as a key nhi use kr sakte kyunki yahan pe data sorted order
//        me store hota hai to andar null ko baaki keys se compare kiya jaata h which is wrong
        TreeMap<String, Integer> map1 = new TreeMap<>();
        //add
        map1.put("Raj", 67);
        map1.put("Ankit", 88);
        map1.put("Amisha", 57);
        map1.put("Shivam", 89);
        map1.put("Pooja", 57);
        map1.put("Ankita", 78);
        map1.put("Kunal", 93);
        System.out.println(map1);


//        isme helping data structure doubly linked list use hota h or isme null allowed hota hai
//        isme me bhi sara kaam constant time me hota hai
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        //add
        map2.put("Raj", 67);
        map2.put("Ankit", 88);
        map2.put("Amisha", 57);
        map2.put("Shivam", 89);
        map2.put("Pooja", 57);
        map2.put("Ankita", 78);
        map2.put("Kunal", 93);
        System.out.println(map2);



    }
}
