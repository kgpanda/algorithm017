学习笔记
第一课：
1、    二叉树：（包括父节点、子节点、叶子节点）即子节点只有2个的树 Binary Tree
2、    二叉树串行格式化[3,1,4,null,null,5,6]在转换为二叉树时一层一层进行定义
图：即形成回环的树，（即树是特殊化的图Graph）
LinkedList：可以认为是特殊化的树。
Java树的定义：
Public Class TreeNode{
    Public int val;
    Public TreeNode left,right;
    Public TreeNode(int val){
    This.val=val;
    This.left=null;
    This.right=null;
}
}
2、二叉树的遍历方式（以根所在的位置定义前中后）：
前序遍历：根、左、右
中序遍历：左、根、右
后序遍历：左、右、根
3、二叉搜索树（二叉排序树、有序二叉树）
特点：
左子树小于根节点、右字数大于根节点；对应的左右子树也为二叉搜索树
采用中序遍历：可实现升序排列
退化成链表后插入、查询时间复杂度即为o(n)

前序遍历：
def preorder(self,root):
    if root:
        self.traverse_path.append(root,val)
        self.preorder(root,left);
        self.preorder(root,rigth);
中序遍历：
def inorder(self,root):
    if(root):
        self.inorder(root,left)
        self.traverse_path.append(root.val)
        self.inorder(root,right)
后序遍历：
def postorder(self,root):
    if root:
        self.postorder(root,left)
        self.postorder(root,right)
        self.traverse_path.append(root.val)


思考：关于树的面试题，一般大都是递归？
第二课：堆（heap）和二叉堆（Binary heap）
堆：可以迅速找到一堆树种的最大或最小值的数据结构
将根节点最大的堆成为大顶堆或大根堆，根节点最小的堆叫小顶堆
二叉堆（大）满足以下两个性质：
是一颗完全树
树中任意节点的值总是>=其子节点的值
二叉堆一般通过数组来实现，假设第一个元素在数组中的索引为0
则父节点和子节点的位置关系如下：
索引为I的节点的左儿子的索引 2i+1
。。。。。的右儿子的索引2i+2
。。。。。的父节点的索引floor((i-1)/2)
 Java中的二叉堆实现priority_queue(优先队列)
实战例题：


图的实现和特性（Graph）：
定义：有点有边 
v-vertex;点
度：入度和出度（指点之前连接了多少边）；点与点之间连通与否
E-edge:边
分有向和无向（单行线）、权重（边长）

