package com.personal.practice.week4.homework;

public class LemonadeCharge {
    public boolean lemonadeChange(int[] bills) {
        if (bills.length==0){
            return false;
        }
        int five=0,ten=0;

        for (int start=0;start<bills.length;start++){
/*            if (bills[start]==10||bills[start]==20){
                return false;
            }*/
            if (bills[start]==5){
                five++;
            }else if (bills[start]==10){
                if (five==0)return false;
                ten++;
                five--;
            }else {
                if (ten>0&&five>0){
                    ten--;
                    five--;
                }else if (five>=3){
                    five-=3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
