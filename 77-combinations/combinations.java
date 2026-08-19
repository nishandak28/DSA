class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        combination(1, n, k, list, new ArrayList<>());
        return list;
    }

    public void combination(int s, int n, int k, List<List<Integer>> list, List<Integer> li) {
        
        if(li.size() == k) {
            list.add(new ArrayList<>(li));
            return;
        }

        for(int i = s; i <= n; i++) {
            li.add(i);
            combination(i + 1, n , k, list, li);
            li.remove(li.size()-1);
        }
    }
}