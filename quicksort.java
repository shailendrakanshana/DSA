
public class quicksort {
    public int partition(int ar[],int l, int r){
        int j = l-1;
        for(int i = l;i<r;i++){

            if(ar[i]<ar[r]){
                j++;
                int t = ar[j];
                ar[j] = ar[i];
                ar[i] = t;
                
            }
        }
        int temp = ar[j+1];
        ar[j+1] = ar[r];
        ar[r] = temp;
        return j+1;
    }
    public void quick_sort(int ar[] , int l,int r){
        if(l<r){
            int pi = partition(ar, l, r);
            quick_sort(ar, l, pi-1);
            quick_sort(ar, pi+1, r);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        int ar[] = {10,5,8,6,9,7};
        quicksort obj = new quicksort();
        obj.quick_sort(ar, 0, 5);
        for(int i = 0;i<6;i++){
            System.out.print(ar[i]+" ");
        }
    }
    
}
