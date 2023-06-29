class Solution {

    public static void HelperFunc(int[] arr, int target, List<Integer> list, List<List<Integer>> res, int idx){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx; i< arr.length; i++){
            if(i>idx && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            list.add(arr[i]);
            HelperFunc(arr, target-arr[i], list, res, i+1);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        HelperFunc(candidates, target, new ArrayList<>(), res, 0);
        return res;
    }
}