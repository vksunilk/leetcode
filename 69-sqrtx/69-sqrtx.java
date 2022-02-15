class Solution {
    public int mySqrt(int x) {
        int l=0;
        int r = x;
        if(x<=1) {
            return x;
        }
        while(l<r) {
            int m = l+(r-l)/2;
            if(m<=x/m) {
                l=m+1;
            } else {
                r=m;            
            }
        }
        return l-1;
    }

}