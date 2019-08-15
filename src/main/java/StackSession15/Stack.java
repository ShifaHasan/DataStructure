package StackSession15;

public class Stack {

    int top=-1;
    int MAX_INTEGER = 99;
    int[] a = new int[MAX_INTEGER];

    Stack(){
        for (int i = 0; i < a.length; i++) {
            a[i]=999;
        }
    }

    void push (int x) {
        if (!isFull()) {
            a[++top] = x;
        }
    }

    int pop () {
        if (!isEmpty()) {
            //return a[top--];
            int temp = a[top];
            a[top]=999;
            top--;
            return  temp;
        } else {
            return -999;
        }
    }

    boolean isEmpty(){
        if(top<0){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if(top == MAX_INTEGER ){
            return true;
        }
        return false;
    }

    public static void main (String[] args) {
        Stack stack = new Stack();
        int[] a = new int[]{2, 3, 4, 5, 6, 7};
        for (int i = 0; i < a.length; i++) {
            stack.push(a[i]);
        }
        System.out.println(stack.top);
    }

    static  Stack  createStack(int[] a ){
        Stack stack = new Stack();
        for (int i = 0; i < a.length; i++) {
            stack.push(a[i]);
        }
        return stack;
    }
    int getStackTop(){
        if(this.top>=0)
        return this.a[this.top];
        else
            return -1;
    }

}
