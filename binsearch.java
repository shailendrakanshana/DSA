public class binsearch {
    public boolean bsearch(int[] ar,int x,int l,int r){
        if(l>r){
            return false;
        }
        int m = (l+r)/2;
        if(ar[m]==x){
            return true;
        }
        else if(ar[m]>x){
            return bsearch(ar, x, l, m-1);
        }
        else{
            return bsearch(ar, x, m+1, r);
        }
        
    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6};
        binsearch obj = new binsearch();
        System.out.println(obj.bsearch(ar, 2, 0, 5));
    }
    
}
