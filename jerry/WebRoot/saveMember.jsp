<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/struts-tags"    prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>保存入社信息</title>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="./css/camera.css">
<link rel="stylesheet" href="./css/bootstrap-responsive.min.css">
<link rel="stylesheet" href="./css/matrix-login.css">
<link rel="stylesheet" href="./css/font-awesome.css">
<script type="text/javascript" src="./js/jquery-1.5.1.min.js.下载"></script>
</head>
<body>

<s:form         action="club_save"   method="post"   namespace="/"   id="saveForm">
	
	<div class="control-group normal_text">
					<h3>
						<img src="./images/logo.png" alt="Logo">
					</h3>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>学号</i>
							</span><input type="text" name="cno" value="<s:property value="#session.existApply.eno"/>" >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>姓名</i>
							</span><input type="text" name="cname" value="<s:property value="#session.existApply.aname"/>">
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>性别</i>
							</span><input type="text" name="csex"  value="<s:property value="#session.existApply.asex"/>"  >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>年龄</i>
							</span><input type="text" name="cage" value="<s:property value="#session.existApply.aage"/>" >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>电话</i>
							</span><input type="text" name="cphone"   value="<s:property value="#session.existApply.phone"/>" >
						</div>
					</div>
				</div>
			<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>院校</i>
							</span><input type="text" name="school"  value="<s:property value="#session.existApply.school"/>" >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>社团</i>
							</span><input type="text" name="cclub" value="<s:property value="#session.existApply.aclub"/>" >
						</div>
					</div>
				</div>
				<input type="submit" value="完成">
			
				</s:form>
				
				
</body>
</html>