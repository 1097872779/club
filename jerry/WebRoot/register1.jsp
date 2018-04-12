<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="./css/camera.css">
<link rel="stylesheet" href="./css/bootstrap-responsive.min.css">
<link rel="stylesheet" href="./css/matrix-login.css">
<link rel="stylesheet" href="./css/font-awesome.css">
<script type="text/javascript" src="./js/jquery-1.5.1.min.js.下载"></script>
</head>
<body>

<form         action="student_save"   method="post"   namespace="/"   id="saveForm">
	<div class="control-group normal_text">
					<h3>
						<img src="./images/logo.png" alt="Logo">
					</h3>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>姓名</i>
							</span><input type="text" name="sname" value="" placeholder="请输入姓名" truetype="textinput" class="textinput">
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>性别</i>
							</span><input type="text" name="sex" placeholder="请输入性别男或女" >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>年级</i>
							</span><input type="text" name="grade"  placeholder="请输入所属年级" >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>学号</i>
							</span><input type="text" name="username" id="name" value="" placeholder="请输入你的学号" onkeyup="value=value.replace(/[^\d]/g,'')">
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>密码</i>
							</span><input type="text" name="password"  placeholder="请输入密码" truetype="textinput" class="textinput">
						</div>
					</div>
				</div>
				
				<input type="submit" value="注册">
				</form>
				
				
</body>
</html>