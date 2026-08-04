class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums) {
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }

      //  System.out.println(hm.keySet());    
        PriorityQueue<Integer> pq = new PriorityQueue((a,b) -> hm.get(a) - hm.get(b));
        for(int a : hm.keySet()) {
            
            pq.offer(a);
       ///     System.out.println(pq);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int i = 0;
        while(!pq.isEmpty()) {
            ans[i++] = pq.poll();
        }
        return ans;
        
    }
}