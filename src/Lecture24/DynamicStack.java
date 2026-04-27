package Lecture24;

import Lecture23StackAndQueue.Stack;

public class DynamicStack extends Stack {
    @Override
    public void push(int x)throws Exception{
        if(isFill()){
            int[] new_arr = new int[2*arr.length];
            for (int i = 0; i < arr.length; i++) {
                new_arr[i] = arr[i];
            }
            arr = new_arr;
        }
        super.push(x);
    }
}
