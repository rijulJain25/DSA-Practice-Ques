class Solution {
    public String intToRoman(int num) {
        String str = "";
        while(num > 0){
            if(num>=1000){
                str += 'M';
                num = num-1000;
            }else if(num >=500){
                if(num>=900 && num<1000){
                    str += "CM";
                    num -= 900;
                }else{
                    str += 'D';
                    num -= 500;
                }
            }else if(num >=100){
                if(num>=400 && num<500){
                    str += "CD";
                    num -= 400;
                }else{
                    str += 'C';
                    num -= 100;
                }
            }else if(num >=50){
                if(num>=90 && num<100){
                    str += "XC";
                    num -= 90;
                }else{
                    str += 'L';
                    num -= 50;
                }
            }else if(num >=10){
                if(num>=40 && num<50){
                    str += "XL";
                    num -= 40;
                }else{
                    str += 'X';
                    num -= 10;
                }
            }else if(num >= 5){
                if(num>=9 && num<10){
                    str += "IX";
                    num -= 9;
                }else{
                    str += 'V';
                    num -= 5;
                }
            }else{
                if(num == 4){
                    str += "IV";
                    num -= 4;
                }else{
                    str += 'I';
                    num -= 1;
                }
            }
        }
        return str;
    }
}