class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int s : map.keySet()){
            if(set.contains(map.get(s))){
                return false;
            }else{
                set.add(map.get(s));
            }
        } 
        return true;       
    }
}