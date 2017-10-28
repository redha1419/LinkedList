public class MyLinkedList {
	
	public static void main(String[] args){
		
		LinkedList myCoolList = new LinkedList();
		// have created our linked list
		
		//assigned out data
		
		myCoolList.insertToFront(0); // first node -> points to null
		myCoolList.insertToFront(1);		
		myCoolList.insertToFront(2);
		myCoolList.insertToFront(3);
		myCoolList.insertToFront(4);
		myCoolList.insertToFront(5); // head -> points to 4 ... 
		

		//can get its size
		int size = myCoolList.getSize();
		System.out.print("The size of the list is: "+ size + "\n\n");
		
		
		//we can print it out, in order (head first to tail)
		System.out.println("Current state of the list: ");
		myCoolList.printLinkedList();
		
		
		// remove a particular index, index 0 is what is at the front and go on from there
		myCoolList.removeIndex(0);
		myCoolList.removeFromBack();
		myCoolList.removeIndex(2);
		System.out.println();
		
		myCoolList.printLinkedList();
		
		System.out.println();
	
		
		Node test = myCoolList.findNode(0);
		System.out.println(test.next);
		

		

		
		
	}

}
