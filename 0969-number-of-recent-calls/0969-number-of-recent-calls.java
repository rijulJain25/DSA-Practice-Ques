class RecentCounter {

    ArrayList<Integer> list;
    public RecentCounter() {
        list = new ArrayList<>();
    }
    
    public int ping(int t) {
        list.add(t);
        int cnt = 0;
        for(Integer val: list){
            if(t-val <= 3000){
                cnt++;
            }
        }
        return cnt;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */