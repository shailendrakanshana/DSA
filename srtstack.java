import java.util.Scanner;

public class srtstack {
    public static int max = 10000;
    int[] ar = new int[max];
    int top;
    srtstack(){
        top = -1;
    }
    public void push(int x){
        top++;
        ar[top] = x;
        for(int i = 0;i<top;i++){
            if(ar[i]>ar[i+1]){
                int t = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = t;
            }
        }
    }
    public int peek(){
        try{
            return ar[top];
        }
        catch(Exception e){
            return -1;
        }
    }
    public int pop(){
        try{
            int x = ar[top];
            top--;
            return x;

        }
        catch(Exception e){
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        srtstack s = new srtstack();
        for(int i = 0;i<n;i++){
            s.push(sc.nextInt());

        }
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
