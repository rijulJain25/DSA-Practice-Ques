class Solution {

    public static void HelperFunc(int arr[], List<Integer> list, int i, List<List<Integer>> res){
        if(res.contains(list)){
            return;
        }
        if(i == arr.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        list.add(arr[i]);
        HelperFunc(arr, list, i+1, res);
        list.remove(list.size()-1);
        HelperFunc(arr, list, i+1, res);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        HelperFunc(nums, new ArrayList<>(), 0, list);
        return list;
    }
}