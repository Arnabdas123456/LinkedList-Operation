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
    System.err.println("List is Empty");
    return;
    }
    Node currNode=head; //cretae a current node 
    while(currNode!=null){ 
    System.out.print(currNode.data+ " -> ");
    currNode=currNode.next;
  }
  System.out.println("NULL");
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

    }
    
}
