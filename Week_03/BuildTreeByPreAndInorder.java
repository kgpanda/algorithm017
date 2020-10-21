package com.personal.practice.week3.test.homework;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeByPreAndInorder {
    private Map<Integer,Integer> inmap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //两数组长度不等，无法比较，返回即可
        if (preorder.length!=inorder.length){
            return null;
        }
        //将中序遍历的结果集合方法哈希表中 key（值）——>对应下标（i）
        inmap=new HashMap<>(inorder.length);
        for (int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        return subBuildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    //处理函数
    public TreeNode subBuildTree(int[] preorder,int[] inorder,int preorder_left,
                                 int preorder_right,int inorder_left,int inorder_right){
        //递归终结条件
        if (preorder_left>preorder_right){
            return null;
        }
        int pre_root=preorder_left;//前序遍历第一个节点即为根节点
        int index_root=inmap.get(preorder[pre_root]);//获取中序遍历的结果集中根节点的下标
        TreeNode root=new TreeNode(preorder[pre_root]);//根
        int size_left_subtree=index_root-inorder_left; //根据中序遍历下标-开始位置得到左子树节点数目


        /*
        递归构造构造左子树
        前序遍历的左右区间
        preorder_left+1 从左子树第一个开始
        preorder_left+size_left_subtree 左子树结束位置
        中序遍历的左右区间
        inorder_left  从中序遍历的左边界开始
        index_root-1：中序遍历的根节点位置-1 表示为左子树的右边界
         */
        root.left=subBuildTree(preorder,inorder,preorder_left+1,preorder_left+size_left_subtree,
                inorder_left,index_root-1);
        /*
        遍历构造右子树

         */
        root.right=subBuildTree(preorder,inorder,preorder_left+1+size_left_subtree,preorder_right,index_root+1,inorder_right);
        return root;
    }
}
