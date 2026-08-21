class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        int i = 0;
        boolean isNegative = false;
        long number = 0;

        // ✅ handle both signs
        if (s.charAt(i) == '-') {
            isNegative = true;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // ✅ process digits directly — no string building needed
        while (i < s.length()) {
            char c = s.charAt(i);

            if (!(c >= '0' && c <= '9')) break; // ✅ stop on non-digit

            number = number * 10 + (c - '0');   // ✅ c-'0' converts char to int

            // ✅ clamp DURING loop to prevent long overflow too
            if (number > Integer.MAX_VALUE) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            i++;
        }

        number = isNegative ? -number : number;
        return (int) number;
    }
}