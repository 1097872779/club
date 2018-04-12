<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/struts-tags"    prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>授权管理</title>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="./css/camera.css">
<link rel="stylesheet" href="./css/bootstrap-responsive.min.css">
<link rel="stylesheet" href="./css/matrix-login.css">
<link rel="stylesheet" href="./css/font-awesome.css">
<script type="text/javascript" src="./js/jquery-1.5.1.min.js.下载"></script>
</head>
<body>

<s:form         action="manager_save"   method="post"   namespace="/"   id="saveForm">
	
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
							</span><input type="text" name="mname" value="<s:property value="#session.existMapply.mname"/>" >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>性别</i>
							</span><input type="text" name="msex" value="<s:property value="#session.existMapply.msex"/>">
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>管理的社团</i>
							</span><input type="text" name="mclub"  value="<s:property value="#session.existMapply.mclub"/>"  >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>学号</i>
							</span><input type="text" name="mno" value="<s:property value="#session.existMapply.mno"/>" >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>密码</i>
							</span><input type="text" name="mpassword"  placeholder="请赋予该管理员密码" >
						</div>
					</div>
				</div>
			
				<input type="submit" value="完成">
			
				</s:form>
				
				
</body>
</html>