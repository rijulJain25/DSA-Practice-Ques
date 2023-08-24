class Solution {
    static int mod = (int)(Math.pow(10, 9)+7);
    public int countPairs(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            int pow = 1;
            for(int j = 0; j<22; j++){
                if(map.containsKey(pow-arr[i])){
                    ans += map.get(pow-arr[i]);
                    ans %= mod;
                }
                pow *= 2;
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        return (int)ans;
    }
}