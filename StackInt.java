public class StackInt {
	int []arr;
	int top;
	int sz1,sz2;
	
	StackInt(){
		arr = new int[10];
		top = -1;
	}
	
	StackInt(int sz){
		arr = new int[sz];
		top = -1;
	}
	
	public void print() {
		
		if(top == -1) {
			System.out.println("The stack is empty");
		}
		
		for(int i = 0; i <= top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void push(int item) {
		
		if(top == arr.length - 1) {
			System.out.println("Stack OverFlow");
			return;
		}
		arr[++top] = item;
	}
	
	public int getTop() {
		
		return arr[top];
	}
	
	public int pop() {
		
		if(top == -1) {
			System.out.println("Can't PoP");
			return -1;
		}
		return arr[top--];
	}
	
	public int peek() {
		if(top == -1) {
			System.out.println("Can't Peek");
			return -1;
		}
		else {
			return arr[top];
		}
	}
	
	public boolean equals(StackInt si2) {
		
		if(this.top != si2.top) {
			return false;
		}
		else {
			while(top != -1) {
				if(this.arr[top] != si2.arr[top]) {
					return false;
				}
				top--;
			}
			return true;
		}
		
	}
	
	public int getMinElement() {
		
		int Min = 99999999; 
		if(top == -1) {
			System.out.println("The stack is empty");
			return -1;
		}
		else {
			while(top != -1) {
				if(this.peek() < Min ) {
					Min = this.pop();
					top--;
				}
			}
			return Min;
		}
	}
	
	public StackInt copyStack() {
		StackInt newStack = new StackInt(this.arr.length);
		StackInt duplicate = new StackInt(this.arr.length);
		
		while(!this.isEmpty()) {
			newStack.push(this.peek());
			duplicate.push(this.pop());
		}
		
		while(!duplicate.isEmpty()) {
			this.push(duplicate.pop());
		
		}
		
		while(!newStack.isEmpty()) {
			duplicate.push(newStack.pop());
		
		}
		
		return duplicate;
		
	}
	
	public int deleteMiddle() {
		StackInt temp = new StackInt(top);
		int middle = top/2;
		
		while(this.top > middle) {
			temp.push(this.pop());
		}
		int deletedElement = this.pop();
		
		while(temp.top != -1) {
			this.push(temp.pop());
		}

		return deletedElement;
		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public StackInt sort() {
		StackInt tempStack = new StackInt(this.arr.length);
		while(!(this.isEmpty())){
			if(tempStack.isEmpty()) {
				tempStack.push(this.pop());
			}
			else {
				int element = this.pop();  
				while(tempStack.top !=-1 && (tempStack.peek() > element)) {
					this.push(tempStack.pop());
				}
				tempStack.push(element);
			}
		}
		
		return tempStack;
	}
	
}
