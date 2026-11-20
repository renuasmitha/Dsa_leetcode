class Solution {
    public int reverse(int x) {
        if(x>(Math.pow(2,31)-1) || x<-(Math.pow(2,31)) ){
            return 0;
        }
        
        long rev=0;
        String s=String.valueOf(x);
        int len=s.length();
        int count=len;
        if(x<0){
            count=len-1;
        }
        while(x!=0){
            int rem=x%10;
            rev+=rem*Math.pow(10,count-1);
            count--;
            x=x/10;
        }
        if(rev>(Math.pow(2,31)-1) || rev<-(Math.pow(2,31)) ){
            return 0;
        }
        return (int)rev;
    }
}