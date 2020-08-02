import java.util.Stack;
/**************************************************************
 Author's Panther ID: 3276301
 Purpose: This program takes in a Stack list of integers and 
          sorts the integers in chronological order so the 
          smallest number is at the top of the Stack.
 Certification: I hereby certify that this work is my own
   		  and none of it is the work of any other person.
**************************************************************/
public class StackSort {

	/* This method takes in a Stack of Integers and
	 * chronologically sorts the elements so that the 
	 * smallest number is on the top of the Stack.
	 * 
	 * @param s  ,the Stack of Integers to be sorted.
	 * @return ,returns value of x^n
	 */
	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> tempStack = new Stack<>();      //stack for sorted integers
		int tempNum = 0;
		while (!s.isEmpty()){                                                     
			tempNum = s.pop();                         //removes top element of s stack
			//sorts stack to keep smallest number at the top of the stack
			while(!tempStack.isEmpty() && (tempStack.peek() < tempNum)){ 
				int swap = tempStack.pop();            //pops from tempStack
				s.push(swap);                          //adds back to s stack
			}
			tempStack.push(tempNum);                   //adds to tempStack
		}
		return tempStack;                              //returns sorted stack
	}
	
	/*
	 * Main Method
	 * 
	 */
	public static void main(String[] args){
		Stack<Integer> stackList = new Stack<>();
		Stack<Integer> sortedStack = new Stack<>();
		//add numbers to stack
		stackList.push(9);
		stackList.push(6);
		stackList.push(8);
		stackList.push(5);
		stackList.push(4);
		stackList.push(11);
		stackList.push(4);
		sortedStack = sort(stackList);                 //obtains sorted stack
		System.out.print("The sorted stack is: ");
		while(!sortedStack.isEmpty()){                 //loop to print out sorted stack
				int num = sortedStack.pop();
		System.out.print(num + ", ");
		}
	}
}
