    package Linkedlist.Circularll;

    public class Traversal {
       public static void  printLink(Node head){
            if(head==null) return;
            Node curr=head.next;
            System.out.println(head.data+" ");
            while (curr!=head){

                System.out.println(curr.data+" ");
                curr=curr.next;
            }



        }
        public static void main(String[] args) {
            Node head = new Node(10);
            Node temp1 = new Node(20);
            Node temp2 = new Node(30);
            Node temp3= new Node(40);
            head.next=temp1;
            temp1.next =temp2;
            temp2.next =temp3;
            temp3.next=head;
            printLink(head);

        }
    }
