package linked_list;


public class ll {

    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size = 0;
    }

    void insertAtHead(int value){
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        if(head == null) head = tail = temp;
        size++;
    }

    void insertAtTail(int value){
        Node temp = new Node(value);
        if(head==null) head = tail = temp;
        else
        tail.next = temp;
        tail = temp;
       
        size++;
    }

    void insertAtIndex(int value , int index){
        if(index==0){
            insertAtHead(value);
            return;
        }

        if(index== size){
            insertAtTail(value);
            return;
        }
       Node temp = head;
      for(int i = 1; i<index;i++){
        temp = temp.next;
      }
      Node t  = new Node(value);
      t.next  = temp.next;
      temp.next = t;
      size++;

    }

    void deleteAtHead(int index){
        Node temp = head;
        temp = head.next;
        head = temp;
        size--;
    }

    void deleteAtIndex(int index){
        if(index<0 || index>=size){
            System.out.println("invalid index");
            return;
        }
        Node temp = head;
        if(index==0) deleteAtHead(index);
        else{
            for(int i = 0;i<index;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(index==size-1) tail = temp;
        }
        size--;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ll list = new ll();
        list.insertAtTail(23);
        list.insertAtTail(22);
        list.insertAtTail(45);
        list.insertAtTail(21);
        list.display();

        list.insertAtHead(200);
        list.display();

        list.insertAtIndex(300,3);
        list.display();

        list.deleteAtHead(0);
        list.display();

        list.deleteAtIndex(4);
        list.display();
    }
}
