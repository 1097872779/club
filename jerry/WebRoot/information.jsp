<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags"    prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body background="./images/head.jpg">
        
        <div>
         
            <h3 >姓名：<s:property value="#session.existStudent.sname"/></h3>
            <h3 >学号：<s:property value="#session.existStudent.username"/></h3>
            <h3 >性别：<s:property value="#session.existStudent.sex"/></h3>
            <h3 >年级：<s:property value="#session.existStudent.grade"/></h3>
            
        </div>
      
</body>
</html>