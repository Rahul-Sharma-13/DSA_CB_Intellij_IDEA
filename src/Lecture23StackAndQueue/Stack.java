package Lecture23StackAndQueue;

public class Stack {
    protected int[] arr;
    private int idx = -1;
    public Stack(){
//        agar kisi bhi constructor ko call krna hai kisi or const se to this use krte hai with the same number of agruments
        this(5);
    }
    public Stack(int n ){
        arr = new int[n];
    }
    //O(1)
    public boolean isEmpty(){
        return idx == -1;
    }
//    O(1)
    public boolean isFill(){
        return idx == arr.length-1;
    }
//    O(1)
    public void push(int x) throws Exception{
        if(isFill()){
            throw new Exception("Stack full ho gya");
        }
        arr[++idx] = x;
    }
//    O(1)
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack empty hai");
        }
        return arr[idx];
    }
//    O(1)
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack empty hai");
        }
        return arr[idx--];
    }
//    O(1)

    public void Display() {
        for (int i = 0; i <=idx; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int size(){
        return idx+1;
    }
}
