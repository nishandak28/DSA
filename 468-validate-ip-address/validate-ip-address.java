class Solution {
    String n = "Neither";
    public String validIPAddress(String queryIP) {
        if(queryIP == null)return n;
        if(queryIP.contains("."))return IPVer4(queryIP);
        else return IPVer6(queryIP);
    }

    public String IPVer4(String queryIP) {
        if(queryIP.charAt(0) == '.' || queryIP.charAt(queryIP.length()-1) == '.') return n;
        String[] arr = queryIP.split("\\.",-1);

        if(arr.length != 4)return n;

        for (String str : arr) {
        // Length must be between 1 and 3 characters
        if (str.length() == 0 || str.length() > 3) return "Neither";

        // Prevent leading zeros (e.g., "01" is invalid, "0" is valid)
        if (str.length() > 1 && str.charAt(0) == '0') return "Neither";

        // Ensure all characters are digits first
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) return "Neither";
        }

        // Validate numeric range (0 - 255)
        int val = Integer.parseInt(str);
        if (val < 0 || val > 255) return "Neither";
    }

    return "IPv4";
    }

    public String IPVer6(String queryIP) {
    if (queryIP == null || queryIP.isEmpty()) return "Neither";

    // Split with limit -1 to preserve empty trailing/leading segments
    String[] arr = queryIP.split(":", -1);
    if (arr.length != 8) return "Neither";

    for (String str : arr) {
        // Length of each segment must be between 1 and 4 characters
        if (str.length() == 0 || str.length() > 4) return "Neither";

        // Check if every character is a valid hex character (0-9, a-f, A-F)
        for (char ch : str.toCharArray()) {
            boolean isDigit = (ch >= '0' && ch <= '9');
            boolean isLowerHex = (ch >= 'a' && ch <= 'f');
            boolean isUpperHex = (ch >= 'A' && ch <= 'F');

            if (!isDigit && !isLowerHex && !isUpperHex) {
                return "Neither";
            }
        }
    }

    return "IPv6";
}
}