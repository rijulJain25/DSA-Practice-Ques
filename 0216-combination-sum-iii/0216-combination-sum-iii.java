class Solution {

    public static void Helper(int str, int n, int k , int end, List<List<Integer>> res, List<Integer> list){
        // if(res.contains(list)){
        //     return;
        // }
        if(n == 0 && list.size() == k){
            res.add(new ArrayList<>(list));
        }
        
       for(int i = str; i<=9; i++){
           list.add(i);
           Helper(i+1, n-i, k, end, res, list);
           list.remove(list.size()-1);
       }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res= new ArrayList<>();
        Helper(1, n, k, 9, res, new ArrayList<>());
        return res;

    }
}