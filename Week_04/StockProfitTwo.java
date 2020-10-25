package com.personal.practice.week4.homework;

public class StockProfitTwo {
    public int maxProfit(int[] prices) {
        if (prices.length==0){
            return 0;
        }
        int sum=0;
        //后一天比前一天大，即卖出 将收益累加
        for (int i=1;i<prices.length;i++){
            if (prices[i]>prices[i-1]){
                sum+=prices[i]-prices[i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int re=0;
        re=new StockProfitTwo().maxProfit(new int[]{1,3,4,6,7,6});
        System.out.println(re);
    }
}
