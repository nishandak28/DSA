class Solution {

    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {

            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
     }
}

/*
prefix = "flower"
index:    0 1 2 3 4 5
          f l o w e r

prefix.length() = 6
prefix.length() - 1 = 5

prefix.substring(0, 5) = "flowe"  ← takes index 0 to 4 (5 is EXCLUDED)


strs[1] = "flow"

does "flow".startsWith("flower")? ❌ NO
  prefix = "flower".substring(0,5) = "flowe"

does "flow".startsWith("flowe")? ❌ NO
  prefix = "flowe".substring(0,4) = "flow"

does "flow".startsWith("flow")? ✅ YES
  exit while loop

prefix = "flow"
*/