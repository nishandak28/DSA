import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        
        BigInteger bs1 = new BigInteger(a, 2);
        BigInteger bs2 = new BigInteger(b, 2);

        BigInteger sum = bs1.add(bs2);

        return sum.toString(2);
    }
}