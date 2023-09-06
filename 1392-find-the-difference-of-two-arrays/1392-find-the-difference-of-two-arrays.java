import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> one = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> two = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> oneCopy = new HashSet<>(one);
        List<List<Integer>> answ = new ArrayList<>();
        one.removeAll(two);
        two.removeAll(oneCopy);
        answ.add(new ArrayList<>(one));
        answ.add(new ArrayList<>(two));
        return answ;
    }
}