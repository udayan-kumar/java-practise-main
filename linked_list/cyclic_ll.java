package linked_list;

public class cyclic_ll {
    private Node head;
    private Node tail;


    void insert(int value){
        Node temp = new Node(value);
        if(head == null){
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        temp.next = head;
        tail = temp;
    }

    void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.value + " ");
                temp = temp.next;
            }while(temp!=head);
        }
        System.out.println();
    }

    void delete(int index){
        Node temp = head;
        for(int i = 0; i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    private class Node {
        int value;
       Node next;

       Node(int value){
        this.value = value;
       }

    }
    public static void main(String[] args) {
        cyclic_ll list = new cyclic_ll();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();

        list.delete(1);
        list.display();
    }
}
