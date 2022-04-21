public class Test {
	public static void main(String[] args) {
		StackInt si = new StackInt();    
		si.push(300);      si.push(200); 
		si.push(100);      si.push(700); 
		si.push(600);
		
		System.out.println("Orginal Stack: ");
		si.print();
		
		System.out.println("Duplicate Stack: ");
		StackInt duplicateStack = si.copyStack();
		duplicateStack.print();
		
	}
}
