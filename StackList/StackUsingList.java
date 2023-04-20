import java.util.ArrayList;

public class StackUsingList {
	
	private ArrayList<String> stack;
	private int top;
	// private boolean growOnDemand;
	// private int size;

	public StackUsingList(){
		this.stack = new ArrayList<String>();
		this.top = 0;
		// this.growOnDemand = false;
		// this.size = StackSize;
	}

	public void push(String newItem){
		this.stack.add(newItem);
		this.top++;
	}

	public void pop(){
		if (top <= 0)
		this.stack.remove();
		this.top--;
	}

	public String toString(){
		//return this.stack.toString();

		String currentStack = " ";
		for (String item: this.stack){
			currentStack += "\n" + item;
		}
		return currentStack;
	}


	public static void main(String [] args){
		StackUsingList test = new StackUsingList();

		test.push("h");
		test.push("e");
		test.push("y");

		System.out.println(test.toString());

		test.pop();
		System.out.println(test.toString());



	}
}
