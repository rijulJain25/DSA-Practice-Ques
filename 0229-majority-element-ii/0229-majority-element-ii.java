class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i])> (int)(nums.length/3)){
                list.add(nums[i]);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<list.size(); i++){
            set.add(list.get(i));
        }
        List<Integer> list1 = new ArrayList<>();
        for(Integer val : set){
            list1.add(val);
        }
        return list1;
    }
}