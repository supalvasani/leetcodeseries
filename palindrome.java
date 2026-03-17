public class palindrome {
    public boolean isPalindrome(int x) {
        int m = x; int rev =0;
        while(m>0){
            int last = m%10;
            rev = rev*10 + last;
            m=m/10;
        }
        if(rev == x){
            return true;
        }else{
            return false;
        }
        
    }
}
