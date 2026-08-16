class Solution {
    public int countAsterisks(String s) {
        if(s == null || s.length() == 0 || (!s.contains("*")))return 0;
        int count = 0;
        String[] arr = s.split("\\|");

        for(int i = 0; i < arr.length; i += 2) {
            String curr = arr[i];

            for(char ch : curr.toCharArray()) {
                if(ch == '*')count++;
            }
        }
        //System.out.println(Arrays.toString(arr));
        return count;
    }
}