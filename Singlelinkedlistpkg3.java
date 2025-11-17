
class Node{
	int data;
	Node next;
	Node (int data){
		this.data=data;
	}
}
class linkedlist{
	Node head,tail;
	public void insert(int data){
		Node original = new Node(data);
		original.next = null;
		if(head == null){
			head = original;
			tail = original;
		}
		else{
			tail.next = original;
			tail = original;
		}
	}
	public void display(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
    public void insertBeg(int data){
        Node original = new Node(data);
        original.next = head;
        head = original;
    }
    public void insertAt(int pos, int data){
        Node original = new Node(data);
        Node temp = head;
        for(int i=0; i<pos-1; i++){
            temp =temp.next;
        }
        original.next = temp.next;
        temp.next = original;
    }
    public void deletebeg(){
         Node temp = head;
         head = head.next;
         temp.next =null;   
    }
    public void deleteEnd(){
        Node temp = head;
        while(temp.next!=tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    public void deleteAt(int pos){
        Node temp = head;
        for(int i = 0; i<pos-1; i++){
            temp =temp.next;
        }
        temp.next = temp.next.next;
    }
}

public class  Singlelinkedlistpkg3{
	public static void main(String[] args){
		
	linkedlist list = new linkedlist();
	list.insert(10);
	list.insert(20);
	list.insert(30);
    list.insertBeg(5);
    list.insert(40);
    list.insertAt(2,15);

    //list.deletebeg();
    //list.deleteEnd();
    list.deleteAt(2);

	list.display();
 }   
}

