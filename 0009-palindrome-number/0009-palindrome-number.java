import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        
        String s=String.valueOf(x);
        String rev= new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Main{
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sol.isPalindrome(n));
    }
}