class Solution {
    public int[][] merge(int[][] interval) {
        
        if(interval == null || interval.length <= 1) return interval;

        Arrays.sort(interval, (a,b)  -> Integer.compare(a[0],b[0]));
        
        List<int[]> list = new ArrayList<>();

        
        int start = interval[0][0];
        int end = interval[0][1];

        for(int i = 1; i < interval.length; i++) {
            if(end >= interval[i][0]) {
                end = Math.max(end,interval[i][1]);
            }
            else {
                list.add(new int[]{start,end});
                start = interval[i][0];
                end = interval[i][1];
            }
        }
        list.add(new int[]{start,end});

        int[][] ans = new int[list.size()][2];
        
        for(int i = 0;i < list.size();i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}


// USING LIST EASY BUT TAKES MORE TIME TO FETCH DATA FROM LIST 


/*

class Solution {
    public int[][] merge(int[][] interval) {

        if (interval == null || interval.length <= 1) return interval;

        Arrays.sort(interval, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> list = new ArrayList<>();

        int start = interval[0][0];
        int end   = interval[0][1];

        for (int i = 1; i < interval.length; i++) {
            if (end >= interval[i][0]) {
                end = Math.max(end, interval[i][1]);
            } else {
                list.add(Arrays.asList(start, end));
                start = interval[i][0];
                end   = interval[i][1];
            }
        }
        list.add(Arrays.asList(start, end));

        int[][] ans = new int[list.size()][list.get(0).size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                ans[i][j] = list.get(i).get(j);
            }
        }

        return ans;
    }
}

*/