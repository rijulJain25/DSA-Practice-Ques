class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 0){
            return ans;
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        ans.add(list1);
        for(int i = 2; i<= numRows; i++){
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            for(int j = 0; j< list1.size()-1; j++){
                list2.add(list1.get(j)+list1.get(j+1));
            }
            list2.add(1);
            ans.add(list2);
            list1 = list2;
        }

        return ans;
    }
}