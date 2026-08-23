import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {

        StringBuffer sb = new StringBuffer("");
        int i = a.length()-1, j = b.length()-1, carry = 0;

        while(i >= 0 || j >= 0 || carry > 0) {

            int sum = carry; // instead of sum+carry assing this;

            if(i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if( j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum %2);
            carry = sum/2;
        }

        return sb.reverse().toString();
    }
}



// class Solution {
//     public String addBinary(String a, String b) {
        
//         BigInteger bs1 = new BigInteger(a, 2);
//         BigInteger bs2 = new BigInteger(b, 2);

//         BigInteger sum = bs1.add(bs2);

//         return sum.toString(2);
//     }
// }