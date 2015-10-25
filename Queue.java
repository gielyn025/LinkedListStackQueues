
package activity.pkg2;

public class Queue {
    private int Qsize;
    private int [] queue;
    private int Items;
    
    public Queue(int size){
        Qsize = size;
        queue = new int [Qsize];
    }
    public void showQueue(){
        int h;
        for(h = 0; h < Qsize; h++){
            System.out.printf("Queue [%d] = %d\n", h, queue[h]);
       }
    }
    private boolean isEmpty(){
        if(Items == 0){
            System.out.println("Queue is Empty");
            return true;
        }else{
            return false;
        }
    }
    private boolean isFull(){
        if(Items == Qsize){
            System.out.println("Queue is now Full");
            return true;
        }else{
            return false;
        }
    
    }
    public boolean Enequeue(int num){
    System.out.print("Trying to enequeue the number "+ num + "...");
    if(!isFull()){
        queue[Items] = num;
        System.out.println("Adding "+ num);
        Items++;
        return true;
    }else{
        System.out.println("Failed to be Enequeue "+ num);
        return false;
       }
    }
    public void dequeue(){
        System.out.print("Dequeue....");
        if(! isEmpty()){
            int n = queue[0];
            System.out.println("Removed " + n);
            RearrangeQueue();
        }else{
            System.out.println("Failed to be dequeue");
        }
    
    }
    private void RearrangeQueue(){
        System.out.println("Rearrange of Queue");
        int [] temp = new int [Items];
        int h;
        for(h = 0; h < (Items - 1); h++){
            temp[h] = queue[h + 1];
        }
        Items--;
        for(h = 0; h < Qsize; h++){
            if(h <= Items){
                queue[h] = temp[h];
            }else{
                queue[h] = 0;
            }
        }
    
    
    }
    public int peekFront(){
        return queue[0];
    }
    public int peekRear(){
        return queue[Items];
   }
}



