import java.util.LinkedList;
public class Linkedlistpkg {
    public static void main(String[] args){
        LinkedList<String> Linkedlist = new LinkedList<String>();
        Linkedlist.push("kowshick");
        Linkedlist.push("Prabha");
        Linkedlist.push("Pranesh");
        Linkedlist.push("Shrivathsan");
        Linkedlist.add(1,"Nithish");
        System.out.println(Linkedlist);

        String value = Linkedlist.pop();


        System.out.println(Linkedlist);
        System.out.println(value);
        System.out.println(Linkedlist.peekFirst());
        System.out.println(Linkedlist.peekLast());
        System.out.println();
        

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.offer("kowshick");
        linkedList.offer("Shrivathsan");
        linkedList.offer("Prabha");
        linkedList.offer("Pranesh");
        linkedList.add(1,"Nithish");
        
        System.out.println(linkedList);
        String value1 = linkedList.poll();
        
        System.out.println(value1);
        System.out.println(linkedList);
        linkedList.remove("Pranesh");
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("Pranesh");
        System.out.println(linkedList);
    }
}
