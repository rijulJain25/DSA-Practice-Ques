class Solution {

    public static void HelperFunc(int[] arr, List<List<Integer>> res, List<Integer> list, int idx){
        res.add(new ArrayList<>(list));

        for(int i = idx; i<arr.length; i++){
            if(i != idx && arr[i] == arr[i-1]){
                continue;
            }
            list.add(arr[i]);
            HelperFunc(arr, res, list, i+1);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        HelperFunc(nums, res, new ArrayList<>(), 0);
        return res;
    }
}