package Lecture23StackAndQueue;

public class Queue {
    protected int[] arr;
    protected int front;
    private int size;
    public Queue(){
        this(5);
    }
    public Queue(int n){
        arr = new int[n];
    }
//    O(1)
    public boolean isEmpty(){
        return size==0;
    }
//    O(1)
    public boolean isFull(){
        return size == arr.length;
    }
//    O(1)
    public void Enqueue(int x)throws Exception{
        if(isFull()){
            throw new Exception("Queue full hai");
        }
        int idx = (front+size)%arr.length;
        arr[idx] = x;
        size++;
    }

    public int Dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Empty hai");
        }
        int x = arr[front];
        front = (front +1)%arr.length;
        size--;
        return x;
    }

    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Empty hai");
        }
        int x = arr[front];
        return x;
    }
    public void Display(){
        for (int i = 0; i < size; i++) {
            int idx = (front+i)%arr.length;
            System.out.print(arr[idx] +" ");
        }
        System.out.println();
    }
    public int size(){
        return size;
    }
}
