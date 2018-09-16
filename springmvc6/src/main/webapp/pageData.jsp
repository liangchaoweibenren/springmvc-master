<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<s:iterator value="pageBean.list" var="student">
			<tr>
			<td><s:property value="#student.id" /></td>
				<td><s:property value="#student.name" /></td>
				<td><s:property value="#student.telephone" /></td>
				<td><s:property value="#student.address" /></td>
				
			</tr>
		</s:iterator>
		
		 <tr>
		
		<td>共<s:property value="pageBean.getTotalPages()" />叶</td>
		<td>当前<s:property value="pageBean.pageNo" />页</td>
		
		<td><a href ="pageData.action?pageNo=1">首页</a></td>
			
			<s:if test="pageNo<=1">
				<td>上一页</td>
			</s:if>
			<s:else>
				<td><a href = "pageData.action?pageNo=<s:property value="pageNo-1"/>">上一页</a></td>
			</s:else>
			
			<s:if test="pageNo>=pageBean.getTotalPages()">
				下一页
			</s:if>
			<s:else>
				<td><a href = "pageData.action?pageNo=<s:property value="pageNo+1"/>">下一页</a></td>
			</s:else>
			
		<td><a href ="pageData.action?pageNo=<s:property value="pageBean.getTotalPages()" />">尾页</a></td>
		</tr>
		
	</table>
 	<a href="addStu.jsp">添加学生</a>
	
	
</body>
</html>