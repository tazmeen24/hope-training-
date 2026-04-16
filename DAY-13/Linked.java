class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertAtStart(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPosition(int position,int data){
        if(position==0){
            insertAtStart(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp==null)  return;
            temp=temp.next;
        } 
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteAtStart(){
        if(head==null)  return;
        head=head.next;
    }
    public void deleteAtEnd(){
        Node temp=head;
        if(head==null)  return;
        if(head.next==null){
            head=null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty");
        }
        while(temp.next!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);
        System.out.println("null");
    }
}
public class Linked{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtStart(10);
        System.out.println(list);
        list.insertAtEnd(20);
        System.out.println(list);
        list.display();
        list.deleteAtEnd();
        System.out.println("After deleting");
        list.display();
    }
}
