class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs = new HashMap<>();

        for(String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);

            if(! hs.containsKey(st)) {
                hs.put(st, new ArrayList<>());
            }

            hs.get(st).add(str);
        }

        return new ArrayList<>(hs.values());
    }
}