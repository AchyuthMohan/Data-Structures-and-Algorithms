import java.util.Scanner;

class ll{

    Node head;
    Node tail;
    int size;
    ll(){
        this.size=0;
        this.head=null;
        this.tail=null;
    }

    void addFront(int x){
        Node newnode=new Node(x);
        newnode.next=null;
        if(head==null&&tail==null){
            head=tail=newnode;

            this.size++;
        }
        else{
            newnode.next=head;
            head=newnode;
            this.size++;
        }
    }
    void addRear(int x){
        Node newnode=new Node(x);
        if(head==null&&tail==null){
            head=tail=newnode;
            this.size++;
        }
        else{
            tail.next=newnode;
            tail=newnode;
            this.size++;

        }
    }
    void display(){
        if(head==null&&tail==null){
            System.out.println("Empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println("Data: "+temp.data);
                temp=temp.next;
            }
        }
    }
    void getsize(){
        System.out.println("Size: "+this.size);
    }
    void deleteFront(){
        if(head==null){
            System.out.println("Nothing to delete");
        }
        else if(head==tail){
            System.out.println("Deleted: "+head.data);
            head=tail=null;
        }
        else{
            Node temp=head;
            head=head.next;
            System.out.println("Deleted: "+temp.data);
        }
    }

    void deleteend(){
        if(head==null){
            System.out.println("Nothing to delete");
        }
        else if(head==tail){
            System.out.println("Deleted: "+head.data);
            head=tail=null;
        }
        else{
            Node temp=head;
            Node temp2=temp;
            while(temp!=tail){
                temp2=temp;
                temp=temp.next;
            }
            System.out.println("Deleted: "+temp.data);
            temp2.next=null;

        }
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
public class Linked {
    public static void main(String[] args) {
        ll linked=new ll();
        Scanner sc=new Scanner(System.in);
        int state=0;
        while(state==0){
            System.out.println("1.Add front 2. Add end 3. display 4.exit 5. get size  6.delete front 7.delete rear: ");
            int choice;
            choice=sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter the number :");
                    int item;
                    item=sc.nextInt();
                    linked.addFront(item);
                    break;
                }
                case 2:{
                    System.out.println("Enter the number :");
                    int item;
                    item=sc.nextInt();
                    linked.addRear(item);
                    break;
                }
                case 3:{
                    linked.display();
                    break;
                }
                case 4:{
                    state=1;
                    break;
                }
                case 5:{
                    linked.getsize();
                    break;
                }
                case 6:{
                    linked.deleteFront();
                    break;
                }
                case 7:{
                    linked.deleteend();
                    break;
                }
            }

        }
    }
}
