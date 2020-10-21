学习笔记
# 第三周：递归、分治、回溯
## 第七课：泛型递归、树的递归
1.通过函数体来进行循环.  
2.用参数来作为不同层次传递的连接。  
3.切勿傻递归  
4.找最近重复子问题的解决方法  
5.使用数学归纳法  
递归代码模板（java)  
Public void recursion(int level,int max,param,param)  
{  
	if(level>max){  
		//process result  
		return;  
}  
//处理当前层  
Process(level,param);
//drill down下探到下一层
Recursion(level+1,max,param);
//restore current status 清理当前层状态（如果需要的话）
}
实战题目：括号生成问题
在n=3的情况下使用debug模式执行了代码，按步骤走之后了解了代码执行路径，了解了老师讲的逐层下探的含义。


第八课：分治，回溯
递归题目：找重复性。分为最优重复性（动态规划）、最近重复性（分治divide、回溯）
分治：拆分成子问题，将子问题问题解决后将结果组合。
Template：
Private static int divide_conquer(Problem problem){
//结束条件
	If(problem==null){
	Int result=process_last_result();
	return result;
}
subProblems=split_problem(problem);
res0=divide_conquer(subProblems[0]);
res1=divide_conquer(subProblems[1]);
…
Result=process_result(res0,res1..);
Return result;
}
习题；pow（x，n）
分治：
1.	递归终结条件
2.	Process：分解问题
3.	Drill down 下探一层处理问题，合并处理结果（merge）
4.	清理状态
此问题subproblem：pow（x，n/2） 为奇数（n%2==1）是再*2 时间复杂度降为 log（n）
回溯(Backtracking)：采用试错的思想，尝试分布去解决问题。在分步解决问题的过程中，当通过尝试发现现有的分布答案不能得到有效的答案时，将取消上一步或者上几步的计算，再通过其他方式获取结果。

