import java.util.Scanner;



public class bblshort {
    public void bshort(int[] ar){
        for(int i = 0;i<ar.length-1;i++){
            for(int j = i+1;j<ar.length-1;j++){
                if(ar[i]>ar[j]){
                    int t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        bblshort obj = new bblshort();
        obj.bshort(ar);
        for(int i = 0;i<n;i++){
            System.out.print(ar[i]+" ");
        }


    }
    
}
