public class Stack {
    int stk[];
    int top = -1;
    int size;
    Stack(int size){
        this.size=size;
        stk=new int[size];

    }
    Boolean isFull(){
        return (top == stk.length -1);
    }
    boolean isEmpty(){
        return (top == -1);
    }

    void push (int data){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            top++;
            stk[top]=data;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;

        }
//        int temp = top;
//        top --;
        return stk[top --];
    }
    int peek(){
        return stk[top];
    }
    int size(){
        return top + 1;

    }
}
