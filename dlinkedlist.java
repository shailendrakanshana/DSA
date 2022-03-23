class node{
    int data;
    node next;
    node prev;
    node(int data){
        this.data = data;
    }
}

public class dlinkedlist {
    node head;
    public void dprint(){
        node temp  = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void dinsertAtbeg(int x){
        node n = new node(x);
        if(head==null){
            head = n;
        }
        else{
            n.next = head;
            head.prev = n;
            head = n;
        }

    }
    public void dinsertAtend(int x){
        node n = new node(x);
        if(head==null){
            head = n;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            n.prev = temp;
            temp.next = n;
        }
    }
    public int dcount(){
        node temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public void dinsertAtpos(int p,int x){
        node n = new node(x);
        if(head==null){
            if(p==1){
                head = n;
            }
            else{
                System.out.println("Invalid pos");
                return ;
            }
        }
        if(p>dcount()+1){
            System.out.println("Invalud pos");
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
                if(p==dcount()+1){
                    n.prev = temp;
                    n.next = temp.next;
                    temp.next = n;
                }
                else{
                    n.prev = temp;
                    n.next = temp.next;
                    temp.next.prev = n;
                    temp.next = n;
                }
            }
        }
        
    }
    public void ddeleteAtbeg(){
        if(head==null){
            System.out.println("Empty ll");
            return;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }
    public void ddeleteAtend(){
        if(head==null){
            System.out.println("Empty ll");
            return;
        }
        else if(head.next==null){
            head = null;
        }
        else{
            node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void ddeleteAtpos(int p){
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
        else{
            if(p==1){
                head = head.next;
                head.prev = null;
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
                if(p==dcount()){
                    temp.next = null;
                }
                else{
                    temp.next = temp.next.next;
                    temp.next.prev = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        dlinkedlist obj = new dlinkedlist();
        obj.dinsertAtbeg(10);
        obj.dinsertAtbeg(20);
        obj.dinsertAtbeg(30);
        obj.dinsertAtbeg(40);
        obj.dprint();
        obj.dinsertAtend(50);
        obj.dinsertAtend(60);
        obj.dinsertAtend(70);
        obj.dinsertAtend(80);
        obj.dprint();
        obj.ddeleteAtbeg();
        obj.ddeleteAtend();
        obj.dprint();
        obj.dinsertAtpos(3, 15);
        obj.dprint();
        obj.ddeleteAtpos(4);
        obj.dprint();
    }
    
}
