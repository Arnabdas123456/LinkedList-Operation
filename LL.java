public class LL
{
    Node head;
    class Node{
        String data;
        Node next;
    
    Node(String data)
    {
        this.data=data;
        this.next=null;
    }
}

//Add -First,Last Node
    public void addFirst(String data){
        Node newNode=new Node(data); //Create a New Node
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //Add -Last Node
    public void addLast(String data){
      Node newNode=new Node(data); 
        if(head==null){
        head=newNode;
        return;
    }
    Node currNode=head;
    while(currNode.next!=null){
        currNode=currNode.next;
    }
    currNode.next=newNode;

}
//Print LinkedList
public void printList(){
    if(head==null){
    System.out.println("List is Empty");
    return;
    }
    Node currNode=head; //cretae a current node 
    while(currNode!=null){ 
    System.out.print(currNode.data+ " -> ");
    currNode=currNode.next;
  }
  System.out.println("NULL");
}

//Delete First Node

public void DeleteFirst(){
    if(head == null){
        System.out.println("The List is Empty");
        return;
    }
    head = head.next; //If head is not null
}

//Delete Last Node

public void DeleteLast(){ 
    if(head == null){
        System.out.println("The List is Empty");
        return;
    }
    
    if(head.next == null){ //In this case one node in Lineked List
     head = null;
     return;

    }

    Node SecondLast=head;
    Node LastNode=head.next; // head.next = null -> LastNode = null
    
    //Traverse operartion
    while(LastNode.next!=null){
     LastNode=LastNode.next; 
     SecondLast=SecondLast.next; 
    }
    SecondLast.next=null;
}

    public static void main(String[] args) 
    {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        //list.printList();
        list.addLast("LinekdList");
        //list.printList();
        list.addFirst("This");
        list.printList();
        list.DeleteFirst();//Delete First Node
        list.printList();
        list.DeleteLast();//Delete Last Node
        list.printList();

    }
    
}
