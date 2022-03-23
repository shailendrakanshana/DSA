import java.util.Scanner;

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}


public class slinkedlist {
    node head;
    public void sprint(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void sinsertAtbeg(int x){
        node n = new node(x);
        if(head==null){
            head = n;
        }
        else{
            n.next = head;
            head = n;
        }
    }
    public void sinsertAtend(int x){
        node n = new node(x);
        if(head == null){
            head = n;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }
    public int scount(){
        
        node temp = head;
        int c = 0;
        while(temp!=null){
            temp = temp.next;
            c++;
        }
        return c;
    }
    public void sinsertAtpos(int p,int x){
        node n = new node(x);
        if(head==null){
            if(p==1){
                head = n;
            }
            else{
                System.out.println("Invalid pos");
                return;
            }
        }
        else if(p>scount()+1){
            System.out.println("Invalid pos");
            return;
        }
        else{
            if(p==1){
                n.next = head;
                head = n;
            }
            else{
                node temp = head;
                int c = 1;
                while(temp.next!=null){
                    if(c==p-1){
                        break;
                    }
                    else{
                        c++;
                        temp = temp.next;
                    }
                }
                n.next = temp.next;
                temp.next = n;
            }
        }

    }
    public void sdeleteAtbeg(){
        if(head==null){
            System.out.println("Empty ll");
            return;
        }
        else{
            head = head.next;
        } 
    }
    public void sdeleteAtend(){
        if(head==null){
            System.out.println("Empty ll");
            return;
        }
        else if(head.next==null){
            head=null;
        }
        else{
            node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void sdeleteAtpos(int p){
        if(head==null){
            System.out.println("Empty ll");
            return;
        }
        else if(head.next==null){
            if(p==1){
                head = null;
            }
            else{
                System.out.println("Invalid pos");
                return;
            }
        }
        else if(p==1){
            head = head.next;
        }
        else{
            node temp = head;
            int c = 1;
            while(temp.next!=null){
                if(c==p-1){
                    break;
                }
                else{
                    c++;
                    temp = temp.next;
                }
            }
            temp.next = temp.next.next;
        }
    }
    public static void main(String[] args) {
        slinkedlist obj = new slinkedlist();
        obj.sinsertAtbeg(10);
        obj.sinsertAtbeg(20);
        obj.sinsertAtbeg(30);
        obj.sinsertAtbeg(40);
        obj.sinsertAtbeg(50);
        obj.sprint();
        obj.sinsertAtend(60);
        obj.sinsertAtend(70);
        obj.sinsertAtend(90);
        obj.sprint();
        obj.sdeleteAtbeg();
        obj.sdeleteAtend();
        obj.sprint();
        obj.sinsertAtpos(7,15);
        obj.sprint();
        obj.sdeleteAtpos(7);
        obj.sprint();
    }
    
}
