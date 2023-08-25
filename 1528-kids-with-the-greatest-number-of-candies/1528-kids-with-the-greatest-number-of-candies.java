class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<candies.length; i++){
            max = Math.max(candies[i], max);
        }
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i<candies.length; i++){
            if(candies[i]+extraCandies >=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}