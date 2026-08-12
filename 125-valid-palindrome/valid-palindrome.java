class Solution {
    public boolean isPalindrome(String s) {
      String s3=s.toLowerCase();
      StringBuffer s1=new StringBuffer();
      
      int i=0;
      while(i<s3.length())
      {
        if(Character.isLetterOrDigit(s3.charAt(i)))
        {
            s1.append(s3.charAt(i));
        }
        i++;
      }  
      String forr=s1.toString();
      String rev=s1.reverse().toString();
      return forr.equals(rev);
    }
}