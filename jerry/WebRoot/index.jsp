<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags"    prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生登录</title>
<link href="./css/login.css" rel="stylesheet" type="text/css">
</head>

<body>
<div class="login_box">
      <div class="login_l_img"><img src="./images/login-img.png"></div>
      <div class="login">
          <div class="login_logo" ><img src="./images/login_logo.png"></div>
          <div class="login_name">
               <p>学生登录</p>
          </div>
          <form action="student_login"  method="post"  namespace="/" >
              <h3><s:actionerror/></h3>
              <input name="username" type="text"  placeholder="在这输入学号下一栏输入密码">
              
               <input name="password" type="password"   >
              <input value="登录" style="width:100%;" type="submit">
              
          </form>
          <a href="manager.jsp"  name=""   >管理员登录</a>   --------  <a href="register1.jsp">注册用户</a>
      </div>
      
</div>
</body>
</html>