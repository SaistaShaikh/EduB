public class RotateLinkedList{

    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

   static Node head = null;
   
   static Node tail = null;
   int l = 0;

   public void add(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = tail = newNode;
        head.prev = null;
        tail.next = null;
    }
    else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next = null;

    }
    l++;
   }

   public void rotate(int N){

    Node curr = head;
    if(N==0||N>=l) return;
    else{
        for(int i=1;i<N;i++){
            curr = curr.next;
        }
        tail.next = head;
        head = curr.next;
        head.prev=null;
        tail = curr;
        tail.next = null;
    }

   }

   public void display(Node curr){

   
    while (curr != null) {
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
}

public static void main(String[] args){
    
RotateLinkedList list = new RotateLinkedList();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);

System.out.println("Orignal List:");
list.display(head);
list.rotate(3);
System.out.println();
System.out.println("Updated List:");
list.display(head);
    }
}