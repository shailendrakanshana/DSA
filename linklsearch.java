import java.util.Scanner;

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}



public class linklsearch {
    static node head;
    node tail;
    public void insert(int x){
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
    public void print(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public boolean l_search(int x,node temp){
        if(temp == null){
            return false;
        }
        else if(temp.data == x){
            return true;
        }
        else{
            temp = temp.next;
            return l_search(x,temp);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linklsearch obj = new linklsearch();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            obj.insert(sc.nextInt());
        }
        obj.print();
        System.out.print("Data to search : ");
        int d = sc.nextInt();
        System.out.println(obj.l_search(d,head));
        System.out.print("Data to search : ");
        int e = sc.nextInt();
        System.out.println(obj.l_search(e,head));


    }
    
}
