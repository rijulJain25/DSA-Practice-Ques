class Solution {

    public static void Helper(int[] arr, int target, List<Integer> list, List<List<Integer>> res, int index){
        if(index == arr.length){
            if(target == 0){
                res.add(new ArrayList<>(list));
            }
            return; 
        }
        if(arr[index] <= target){
            list.add(arr[index]);
            Helper(arr, target-arr[index], list, res, index);
            list.remove(list.size()-1);
        }
        Helper(arr, target, list, res, index+1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Helper(candidates, target, new ArrayList<>(), res, 0);
        return res;
    }
}