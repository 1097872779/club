<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags"    prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>申请入社</title>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="./css/camera.css">
<link rel="stylesheet" href="./css/bootstrap-responsive.min.css">
<link rel="stylesheet" href="./css/matrix-login.css">
<link rel="stylesheet" href="./css/font-awesome.css">
<script type="text/javascript" src="./js/jquery-1.5.1.min.js.下载"></script>
</head>
<body>

<s:form         action="apply_save"   method="post"   namespace="/"   id="saveForm">
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
							</span><input type="text" name="eno"  value="<s:property value="#session.existStudent.username"/>">
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>姓名</i>
							</span><input type="text" name="aname"   value="<s:property value="#session.existStudent.sname"/>">
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly">
							<i>性别</i>
							</span><input type="text" name="asex"   value="<s:property value="#session.existStudent.sex"/>">
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>身高</i>
							</span><input type="text" name="ahight" >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>年龄</i>
							</span><input type="text" name="aage"  >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>电话</i>
							</span><input type="text" name="phone"  >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>籍贯</i>
							</span><input type="text" name="adress"  >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>院校</i>
							</span><input type="text" name="school"  >
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>申请的社团</i>
							</span>	
				 <select  name="aclub">
					    <option>街舞社</option>
					    <option>动漫社</option>
					    <option>计算机协会</option>
                  </select>
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>个人经历</i>
							</span><textarea name="experience" placeholder="简单介绍自己的真实经历"></textarea>
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>兴趣爱好</i>
							</span><textarea name="interest" placeholder="介绍自己喜欢运动、食物、爱好、以及感兴趣的事情"></textarea>
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg">
							<i>外貌描述</i>
							</span><textarea name="look" placeholder="简单介绍自己形象"></textarea>
						</div>
					</div>
				</div>
				
				<input type="submit" value="提交申请">
				</s:form>
				<a href="./frame.jsp">取消申请</a>
				
</body>
</html>