//This is m linkedList class, has the basic features! Can be very useful in certain scenarios

class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value = value;
	}
	
}
public class LinkedList {
	public Node root;
	public int size;
	LinkedList(){ // constructor, sets up the root node!
		
		root = null; // makes the first node null
		size = 0;
		
	}
	
	public int getSize(){
		return size;
	}
	
	public void insertToFront(int i){
		Node node = new Node(i); // creates a new node
		node.next = root; //this new node points to the previous node!
		this.root = node; // root is the newest node added.
		this.size++;
	}
	
	public void insertToBack(int i){
		Node newNode = new Node(i);
		Node node = root;
		while(node.next != null){
			node = node.next;
		}
		//node is now the last node, kept getting addresses XD
		node.next = newNode;
		newNode.next = null;
		
		this.size++;
		
	}
	
	public void removeFromFront(){

		if( !isEmpty() ){
			root = root.next; // sets root (newest node) to what it was point to
		}else{
			System.out.println("\nERROR: unable to remove from list, list is empty!");
		}
		
		this.size--;
		
	}
	
	public void removeFromBack(){
		this.removeIndex(this.size-1);
	}
	
	public void printLinkedList(){
		Node iterator = root;
		while(iterator != null){
			System.out.println(iterator.value);
			iterator = iterator.next;
		}
	}
	
	public void removeIndex(int index){
		
		if(index < -1 || index >= size){ // index is out of bounds
			System.out.println(" \nERROR: invalid index size");
		}
		else if(index == 0){ // if index is 0, simply remove from front
			this.removeFromFront();
		}
		else{
			// find the index and assign the previous node to the node after it
			// TODO: find a better way
			
			Node previous = root; 
			Node node = root.next;
			Node after = node.next;
			
			for(int i=0; i<index-1; i++){ //  keep shifting through the linked list until "node" is the index in question
				previous = node;
				node = after;
				after = after.next;
			}
			
			
			previous.next = after;
			this.size--;
	
		}
		
	}
	
	public Node findNode(int inQuestion){  //defaults to sending last node
		
		Node node = root;
		
		while(node.next != null){
			if(node.value == inQuestion){
				return node;
			}
			node = node.next;
		}
		
		return node; // default case, find a way around this...
	}
	
	public boolean isEmpty(){
		return (root == null);
	}
}
