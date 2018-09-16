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
	<s:form action="addSt.action" method="post">
		<s:textfield name="student.name"/>
		<s:textfield name="student.telephone"/>
		<s:textfield name="student.address"/>
		<s:submit value="提交"/>
	</s:form>
	
</body>
</html>