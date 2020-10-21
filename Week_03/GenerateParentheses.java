package com.personal.practice.week3.test.homework;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private List<String> result;
    public List<String> generateParenthesis(int n) {
        result=new ArrayList<String >();
        generate(0,0,n,"");
        return result;
    }
    public void generate(int left,int right,int n,String param){
        //结束条件，左括号和有括号都为n（3）
        if (left==n&&right==n){
            //处理结果
            result.add(param);
            return;
        }
        if (left<n){
//            param=param+"(";//这样写
            generate(left+1,right,n,param+"(");
        }
        if (left>right){
            generate(left,right+1,n,param+")");
        }
    }

    public static void main(String[] args) {
        GenerateParentheses g=new GenerateParentheses();
        List re=new ArrayList();

        re=g.generateParenthesis(3);
        System.out.println(re);
    }
}
