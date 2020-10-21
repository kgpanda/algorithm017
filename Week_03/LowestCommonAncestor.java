package com.personal.practice.week3.test.homework;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||p==null||q==null){//  如果根为null，即返回根；p或者q为null时，返回root(即终止递归的条件)
            return root;
        }
        if (root==p||root==q){ //如果root等于p或者q，代表找到，即返回对应的值（root）
            return root;
        }
        //使用递归对树进行后序遍历，从底至顶向上回溯，遇到p或者q时返回；当节点p、q在root的异侧时，root即为最近公共祖先
        TreeNode left=lowestCommonAncestor(root.left,p,q); //向下判断左子树、重复上述判断
        TreeNode right=lowestCommonAncestor(root.right,p,q);//向下判断右子树
        if (left==null) return right;//如果左边子树为null，返回右; 下层递归结束后，判断返回值时的条件
        if (right==null) return left;//如果右边子树为null，返回左
        return root; //如果左和右都不为null，退出本次递归，往上返回
    }

}
class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
