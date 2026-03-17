public class reversestring {
    public void reverseString(char[] s) {
     int i = 0;
     int j = s.length -1;
     char a;
     while(i<j){
        a = s[i];
        s[i] = s[j];
        s[j] = a;
        i++;
        j--;
     }  
    }
}
