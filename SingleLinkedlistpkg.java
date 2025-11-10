
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
class linkedlist{
    Node head,tail;
    public void insert(int data){
        Node original = new Node(data);
        original.next = null;
        if(head==null){
            head=original;
            tail=original;
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
            temp =temp.next;
        }
    }
}

public class SingleLinkedlistpkg {
    public static void main(String[] args){
        linkedlist list = new linkedlist();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();

    }
}
