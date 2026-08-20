class Solution {
    public int reverse(int x) {
       
       long finall = 0;
       while(x !=0) {
            int last = x % 10;
            finall = finall*10 + last;
            x /= 10;
       }

       if(finall > Integer.MAX_VALUE || finall < Integer.MIN_VALUE) return 0;
       
       if(x < 0) return (int)(-1*finall);
       else return (int)finall;
    }
}