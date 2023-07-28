class Solution {
    public int maxProfit(int[] Arr) {
        
        int n = Arr.length;
    int cur[] = new int[2];
    int front1[] = new int[2];
    int front2[] = new int[2];
    
    for(int ind = n-1; ind>=0; ind--){
        for(int buy=0; buy<=1; buy++){
            int profit=0;
            
            if(buy==0){// We can buy the stock
                profit = Math.max(0+front1[0], -Arr[ind] + front1[1]);
            }
    
            if(buy==1){// We can sell the stock
                profit = Math.max(0+front1[1], Arr[ind] + front2[0]);
            }
            
            cur[buy] = profit;
        }
        
        front2 = (int[])(front1.clone());
        front1 = (int [])(cur.clone());
        
    }
    
    return cur[0];
    }
}