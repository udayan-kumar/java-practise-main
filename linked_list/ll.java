package linked_list;


public class ll {

    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size = 0;
    }

    void insertHead(int value){
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        if(head == null) head = tail = temp;
        size++;
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
        list.insertHead(23);
        list.insertHead(22);
        list.insertHead(45);
        list.insertHead(21);
        list.display();
    }
}
27:44