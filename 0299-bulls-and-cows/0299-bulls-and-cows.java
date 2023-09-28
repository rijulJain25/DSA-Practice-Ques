class Solution {
    public String getHint(String secret, String guess) {
        int b = 0;
        int a = 0;
        int arr[]= new int[10];
        for(int i = 0; i<guess.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                a++;
            }else{
                if(arr[Character.getNumericValue(secret.charAt(i))] < 0){
                    b++;
                }
                if(arr[Character.getNumericValue(guess.charAt(i))] > 0){
                    b++;
                }
                arr[Character.getNumericValue(secret.charAt(i))]++;
                arr[Character.getNumericValue(guess.charAt(i))]--;
            }
        }
        return a+"A"+b+"B";
    }
}