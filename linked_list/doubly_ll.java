package linked_list;

public class doubly_ll {

    private Node head;
    private Node tail;
   

    void insertAtHead(int value){
        Node temp = new Node(value);
        temp.next = head;
        temp.pre = null;

        if(head!=null){
            head.pre = temp;
        }
        head = temp;
    }

    void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.value + " " );
            last = temp;
            temp = temp.next;
        }
        System.out.println();

        
        while(last!=null){
            System.out.print(last.value + " " );
            last = last.pre;
        }
        System.out.println();
    }

    void insertAtTail(int value){
        Node temp = new Node(value);
        Node t = head;

        while(t.next!=null){
            t = t.next;
        }
        temp.next = null;
        t.next = temp;
        temp.pre = t;
        if(head==null){
            temp.pre = null;
            head = temp;
        }

    }

    void insertAtIndex(int value , int index){
        Node temp = new Node(value);
        Node t = head;
        for(int i = 0; i<index;i++){
            t = t.next;
        }
        temp.next = t.next;
        t.next = temp;
        temp.pre = t;
        if(temp.next!=null){
            temp.next.pre = temp;
        }

       
    }
     void delete(int index){
        Node temp = head;
        for(int i = 0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
       
         temp.next.next.pre = temp;
    }

    private class Node{
        int value;
        Node next;
        Node pre;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next,Node pre){
            this.value = value;
            this.next = next;
            this.pre = pre;
        }
        
    }
    public static void main(String[] args) {
            doubly_ll list = new doubly_ll();
            list.insertAtHead(10);
            list.insertAtHead(20);
            list.insertAtHead(30);
            list.insertAtHead(40);
            list.insertAtHead(50);
            list.display();

            // list.insertAtTail(300);
            // list.display();

            list.insertAtIndex(500, 3);
            list.display();

            list.delete(3);
            list.display();

    }
}
