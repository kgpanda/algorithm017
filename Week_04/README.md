学习笔记
#第九课：深度、广度优先搜索的实现和特征
##1.	定义：  
Public Class TreeNode{  
	TreeNode left,right;  
	Int val;  
	Public TreeNode(int val){  
	This.val=val;  
	This.left=null;  
	This.right=null;  
  }  
}  
##2.搜索、遍历  
保证每个节点都要访问到，且每个节点仅访问一次  
对访问节点的访问顺序的不同可以分为：广度优先（breadth first search）、深度优先（depth first search）  
##3.dfs递归写法  
Visited=set();  
Def dfs(node,visited):  
	//终止条件  
	if node in visited:  
		return;  
	Visited.add(node) //将当前节点加入到已访集合中  
	for next_node in node.children():  
		if not next_node in visited:  
			dfs(next_node,visited). //判断该节点不在已访问的集合中，进入下一层访问  

##dfs非递归写法（手动维护栈）  
##def dfs(self,tree):  
	if tree.root is none:  
		return []  
  visited,stack=[],[tree,root]  
  while stack:  
		node=stack.pop() //取出元素  
		visited.add(node)  //添加到visited  
		process(node)  
		node=generate_related_nodes(node)  
		stack.push(nodes)  

##4.广度优先遍历（bfs），代码样例：  
  使用队列实现，遍历时一层一层向下扩散  
	def BFS(graph,start,end):  
		queue = []. //队列承接（数组、链表）  
		queue.append([start])  
		visited.add(start)  
		
    while queue:  
	  node = queue.pop()  
	  visited.add(node)  
	  process(node)  
	  nodes = generate_related_nodes(node)  
	  queue.push(nodes)  
##第10课：贪心算法、特征及实现  
贪心算法是在每一步选择中都采取在当前状态下最好或最优（即最有利）的选择，从而得到结果是全局最好或最优的算法。  
贪心算法与动态规划的区别在于它对每个子问题的解决方案都做出选择，不能回退。动态规划会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。  
贪心算法适用场景：
	问题可以分解为子问题，且子问题的最优解能递推到最终问题的最优解。这种子问题最优解成为最优子结构。
学习笔记