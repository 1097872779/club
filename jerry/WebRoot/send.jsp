<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"    prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="info_save"  method="post" namespace="/"   id="saveinfo">
      
                       <div class="main_input_box">
							<span class="add-on bg_lg">
							<i>收件人学号</i>
							</span><input type="text" name="mno" value="<s:property value="#session.existMapply.mno"/>" >
						</div>
                             <div class="main_input_box"   height="100px">
							<span class="add-on bg_lg" >
							<i align="top">信&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;    息</i>
							</span><input type="text" name="info" value=""  height="80px" style="height: 90px; width: 269px">
						</div>
						
<input type="submit" value="确认发送">
</s:form>
</body>
</html>