package Lecture33Generics;

public class Pair <K,L> {
    K x ;
    L y;
    public Pair(){

    }
    public Pair(K x, L y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Pair<Integer, Boolean> p = new Pair<>();
    }
}
