package linked_list;


public class singly_ll {

    private Node head;
    private Node tail;
    private int size;

    public singly_ll(){
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
            for(int i = 0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(index==size-1) tail=temp;
        }
        size--;
    }

    int get(int index){
        Node temp = head;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }
        return temp.value;
    }

    int search(int value){
        Node temp = head;
        while(temp!=null){
          if(temp.value == value){
            return temp.value;
          }
          temp = temp.next;
        }
      return -1;
    }

    Node remove_dublicate(Node head){
        Node temp = head;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
            temp.next = temp.next.next;
            
            }
            else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
        return head;
       
    }

    Node merge (Node head1 , Node head2){
        Node dummy = new Node(-1);
        Node i = head1;
        Node j = head2;
        Node k= dummy;
        while(i!=null && j!=null){
            if(i.value<j.value){
                k.next = i;
                i = i.next;
            }
            else {
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return dummy.next;
    }

    boolean cyclic(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
             if(slow==fast) return true;
        }
       
        return false;
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
        // singly_ll list = new singly_ll();
        // list.insertAtTail(23);
        // list.insertAtTail(22);
        // list.insertAtTail(45);
        // list.insertAtTail(21);
        // list.display();

        // list.insertAtHead(200);
        // list.display();

        // list.insertAtIndex(300,3);
        // list.display();

        // list.deleteAtHead(0);
        // list.display();

        // list.deleteAtIndex(4);
        // list.display();

        // System.out.println(list.get(3));

        // System.out.println(list.search(300));

        // System.out.println(list.size);

        // singly_ll list1 = new singly_ll();
        // list1.insertAtTail(1);
        // list1.insertAtTail(1);
        // list1.insertAtTail(2);
        // list1.insertAtTail(3);
        // list1.insertAtTail(3);
        // list1.display();

        // list1.remove_dublicate(list1.head);
        // list1.display();

        singly_ll list2 = new singly_ll();
        list2.insertAtTail(1);
        list2.insertAtTail(3);
        list2.insertAtTail(5);
        
       
        singly_ll list3 = new singly_ll();
        list3.insertAtTail(1);
        list3.insertAtTail(2);
        list3.insertAtTail(9);
        
        // list3.insertAtTail(14);

        list2.head = list2.merge(list2.head, list3.head);
        // list2.display();


       System.out.println(list3.cyclic(list3.head));
        



    }
}
