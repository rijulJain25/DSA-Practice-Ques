class Solution {
    public int romanToInt(String s) {
        int cnt = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){
                if(i != s.length()-1 && s.charAt(i+1) == 'V'){
                    cnt+=4;
                    i++;
                }else if(i != s.length()-1 && s.charAt(i+1) == 'X'){
                    cnt+=9;
                    i++;
                }
                else{
                    cnt += 1;
                }
            }
            else if(s.charAt(i) == 'V'){
                cnt += 5;
            }
            else if(s.charAt(i) == 'X'){
                if(i != s.length()-1 && s.charAt(i+1) == 'L'){
                    cnt+=40;
                    i++;
                }else if(i != s.length()-1 && s.charAt(i+1) == 'C'){
                    cnt+=90;
                    i++;
                }
                else{
                    cnt += 10;
                }
            }
            else if(s.charAt(i) == 'L'){
                cnt += 50;
            }
            else if(s.charAt(i) == 'C'){
                if(i != s.length()-1 && s.charAt(i+1) == 'D'){
                    cnt+=400;
                    i++;
                }else if(i != s.length()-1 && s.charAt(i+1) == 'M'){
                    cnt+=900;
                    i++;
                }
                else{
                    cnt += 100;
                }
            }
            else if(s.charAt(i) == 'D'){
                cnt += 500;
            }
            else if(s.charAt(i) == 'M'){
                cnt += 1000;
            }
        }
        return cnt;
    }
}