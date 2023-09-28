class Solution {

    public static void helper(int k, int n , int st, List<Integer> list, List<List<Integer>> val){

        if(list.size()== k && n == 0){
            val.add(new ArrayList<>(list));
        }

        for(int i= st; i<=9; i++){
            list.add(i);
            helper(k, n-i, i+1, list, val);
            list.remove(list.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(k, n, 1, new ArrayList<Integer>(), ans);
        return ans;
    }
}