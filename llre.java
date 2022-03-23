import java.text.NumberFormat.Style;

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}

public class llre {
    static node head;
    node tail;
    public void instAtEnd(int x){
        node n = new node(x);
        if(head==null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }

    }
    public void prnt(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void rev_print(node a){
        if(a==null){
            return;
        }
        if(a.next==null){
            System.out.print(a.data+" ");
            return;
        }
        else{
            node temp = a;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            int x = temp.next.data;
            temp.next = null;
            System.out.print(x+" ");
            rev_print(a);
        }
    }
    public static void main(String[] args) {
        llre obj = new llre();
        obj.instAtEnd(10);
        obj.instAtEnd(20);
        obj.instAtEnd(30);
        obj.instAtEnd(40);
        obj.prnt();
        obj.rev_print(head);

    }
    
}
