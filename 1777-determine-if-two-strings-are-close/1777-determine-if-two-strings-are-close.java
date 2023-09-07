class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i< word1.length(); i++){
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0)+1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);
        }

       int[] arr1 = new int[map1.size()];
        int[] arr2 = new int[map2.size()];
        char[] ch1 = new char[map1.size()];
        char[] ch2 = new char[map2.size()];

        int k = 0;

        for(Integer value: map1.values()){
            arr1[k] = value;
            k++;
        }
         k = 0;
        for(Character value: map1.keySet()){
            ch1[k] = value;
            k++;
        }
        k = 0;

        for(Integer value: map2.values()){
            arr2[k] = value;
            k++;
        }
         k = 0;

        for(Character value: map2.keySet()){
            ch2[k] = value;
            k++;
        }

        Arrays.sort(arr1);
        Arrays.sort(ch1);
        Arrays.sort(arr2);
        Arrays.sort(ch2);

        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != arr2[i] || ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
}