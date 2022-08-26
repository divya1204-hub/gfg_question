package Linkedlist.Circularll;
import static Linkedlist.Circularll.Traversal.printLink;
public class Insert {
    //Insert at beginning
    static Node InsertBegin(Node head, int x) {     //x is the element we want to insert
        Node temp = new Node(x);     //a temp array to store x
        if (head == null)
            temp = temp.next;

        else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
        return temp;

    }



    //Efficeint soluion   :O(1)
    //Insert at beginning
    static   Node InsertBegin1(Node head, int x) {     //x is the element we want to insert
        Node temp = new Node(x);     //a temp array to store x
        if (head == null)
            temp = temp.next;

        else {
            temp.next = head.next;      // i.e temp.next = 20       : initialy : 10 20 30 40 ,x=16=temp
            head.next = temp;         //head.next =16       : 10 16 20 30 40
            //swapping
            int t = head.data;         //t=10;
            head.data = temp.data;   // head.data =16
            temp.data = t;           //temp.data =10           //swapped


        }

        return head;                //head is now 16 ; so o/p is: 16 10 20 30 40
    }
    //naive solution
    static Node InsertLast(Node head,int x){
        Node temp = new Node(x);                 //L.L. is 10 20 30 40 , we want : 10 20 30 40 16
        if(head==null) {
            temp =temp.next;
            return temp;
        }
        else{
            Node curr =head;
            while(curr.next!=head){
                curr=curr.next;             //traversing through L.L
            }
                                       //curr= 40
            curr.next =temp;           //curr.nextt =16
            temp.next= head;          // temp.next =10     // connectiong 16 and 10
        }

             return head;
    }
    //efficoent solution     //wrong solution
    static Node InsertLast1(Node head, int x) {     //x is the element we want to insert
        Node temp = new Node(x);     //a temp array to store x
        if (head == null)
            temp = temp.next;

        else {                           //L.L. is 10 20 30 40 ,x=16
           temp.next =head.next;    //    temp.next =20
            head.next = temp;         // head.next =16          10 16 20 30 40
            int t= temp.data;         // t=16
            temp.data=head.data;      //temp = 10
            head.data =t;             //head =16 ; LL 16 10 20 30 40
        }
        return temp;

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
       // head =InsertBegin(head,16);        //storing new head in old head
        // InsertLast1(head,16);
      //  InsertLast(head, 16);


      printLink(head);

    }
}
