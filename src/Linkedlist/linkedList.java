
package Linkedlist;
class Node {
    int data;                           //data variable jisme ye content of node ko store krega
    Node next;       //next node lia h jo agla ref ko store krega

    Node(int d){
        data=d;
        next =null;

    }
}
class linkedProp {
     //main method
     public static void main(String[] args) {
         // Node head = null;
         Node head = new Node(10);
         head.next = new Node(20);
         head.next.next = new Node(30);
         head.next.next.next = new Node(40);

         rPrint(head);

     }
     //printing and traversing linkedlist

     static void print(Node head) {
         Node curr = head;
         while (curr != null) {
             System.out.print(curr.data + " ");
             curr = curr.next;
         }
     }
     //printing and traversing by using recursion
     static void rPrint(Node head) {
         if (head == null)
             return;
         System.out.print(head.data + " ");
         rPrint(head.next);
     }
 }









