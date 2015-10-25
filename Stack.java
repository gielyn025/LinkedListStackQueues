
package activity.pkg2;

public class Stack {
    private int top;
    private int MaxSize;
    private int [] stackArray;
    
    public Stack(int size){
        MaxSize = size;
        stackArray = new int [MaxSize];
        top = -1;
    }
    private boolean isEmpty(){
        return (top == -1);
    }
    private boolean isFull(){
        return (top == (MaxSize - 1));
    }
    private int pop(){
        if (isEmpty()){
            System.out.println("Stack is now Empty");
            return 0;
        }else{
            int number = stackArray[top];
            stackArray[top]= 0;
            top--;
            return number;
        }
    }
    private boolean push(int value){
        if (isFull()){
            return false;
        }else{
            stackArray [top] = value;
            top++;
            return true;
        }
            
        }
    private int peek(){
        return stackArray[top];
    }
}