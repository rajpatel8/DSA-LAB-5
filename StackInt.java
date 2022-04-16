public class StackInt {
    public int[] arr = new int[5] ;
    private int top = -1 ;
    int b[] ;
    int c[] ;

    public int[] getArr() {
        return this.arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getTop() {
        return this.top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public StackInt() {
        arr = new int[10];
        top = -1; }

    public StackInt(int sz) {
        arr = new int[sz]; 
        top = -1;
        }
    
    public void print() {
          for (int i = 0; i < top+1; i++) {
              System.out.print(arr[i] + "    ");
          }
        }
    public void push(int item) {
        if ((top +1)==arr.length) {
            System.out.println("The Stack is full");
        }
        else {
            top ++ ;
            arr[top] = item ;
            System.out.println(item + " pushed into stack");
            }
        }
    public int getop() {
        return arr[top] ;
    }   
    public int pop() { 
        if (top==-1) {
            System.out.println("\nStack is empty\n");
            return 0 ;
        }
        else{
        top--;
        System.out.println("\nElement popped\n");
        return 1 ;
         }
    }
    public int peek (){
        if (top==-1) {
            System.out.println("Stack is empty");
            return 0 ;
        }
        else{
        return arr[top] ;}
    }
    public void equal(){
        
    }
    public void getminElement()
    {
        int x = arr[0];
        for (int i = 0; i < top; i++) {
            if (arr[i]<x) {
                x = arr[i];
            }
        }
        System.out.println(x);
    }
    public void copyStack() {
        int b[] = arr.clone();
        for (int i = 0; i < b.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void rev()
    {
        int z = 0 ;
        int c[] = arr.clone();
        for (int i = arr.length-1; i>=0 ;--i) {
            c[z] = arr[i];
            z++;
        } 
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]); ;
        }     
    }
}
 
        