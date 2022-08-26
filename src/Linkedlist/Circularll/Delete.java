package Linkedlist.Circularll;
import static Linkedlist.Circularll.Traversal.printLink;

public class Delete {
    static Node DeleteHead(Node head) {
        if (head == null) return null;     //empty node
        if (head.next == null) return null;       //single node
        else {                 //if exists a linkedlist: 10 20 30 40 50
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }                           //curr=50
            curr.next = head.next;

        }
        return head;
    }

    //efficient solution
    public class DeleteEff {
        static Node DeleteHeadNode(Node head) {
            if (head == null) return null;     //empty node
            if (head.next == null) return null;       //single node
            else {                 //if exists a linkedlist: 10 20 30 40 50
                //copy data of next node to head
                head.data = head.next.data;    //20 10 30 40 50
                //remove the 2nd element
                head.next = head.next.next;   // 20 30 40 50


            }
            return head;
        }

        public static void main(String[] args) {

            Node head = new Node(10);
            Node temp1 = new Node(20);
            Node temp2 = new Node(30);
            Node temp3 = new Node(40);
            Node  temp4 = new Node(50);
            head.next = temp1;
            temp1.next = temp2;
            temp2.next = temp3;
            temp3.next = temp4;
            temp4.next =head;
            printLink(head);
            DeleteHead(head);

        }
    }
}
