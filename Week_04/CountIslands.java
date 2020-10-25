package com.personal.practice.week4.homework;

public class CountIslands {
    private int n;
    private int m;
    public int numIslands(char[][] grid){
        int count=0;// 记录岛屿数量
        n=grid.length; // 行
        if (n==0)return 0;
        m=grid[0].length;//列
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]=='1'){
                    dfsMark(grid,i,j);
                    ++count;
                }
            }
        }
        return count;
    }
    public void dfsMark(char[][] grid,int i,int j){
        // 最后的grid[i][j]!=1是为了递归的将临近的为1的数字全部转换为0，当条件不成立时，递归结束，退回一层
        if (i<0||j<0||i>=n||j>=m||grid[i][j]!='1')return;
        grid[i][j]='0';

        dfsMark(grid,i-1,j);//up
        dfsMark(grid,i+1,j);//down
        dfsMark(grid,i,j-1);//left
        dfsMark(grid,i,j+1);//right
    }
}
