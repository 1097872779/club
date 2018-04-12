<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags"    prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
<link rel="stylesheet" type="text/css" href="./css/nav.css">
    <link rel="stylesheet" type="text/css" href="./css/iconfont.css">
	
    <script type="text/javascript" src="./js/jquery.min.js(1).下载"></script>
    <script type="text/javascript" src="./js/nav.js.下载"></script>
</head>
<body>
             <div class="nav">
        <div class="nav-top">
            <div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><img src="./images/mini.png"></div>
        </div>
        <ul>
            <li class="nav-item">
                <a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>个人信息管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="./information.jsp" target="right1"><span>我的个人信息</span></a></li>     
                
                    <li><a href="./mapply.jsp" target="right1"><span>申请成为管理员</span></a></li>
                    
                </ul>
            </li>
            <li class="nav-item">
                <a href="javascript:;"><i class="my-icon nav-icon icon_2"></i><span>消息中心</span><i class="my-icon nav-more"></i></a>
                <ul>
                    
                    <li><a href="./info_findAll.action?mno=<s:property value="#session.existStudent.username"/>" target="right1"><span>消息</span></a></li>
                    
                </ul>
            </li>
            <li class="nav-item">
                <a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>社团管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="javascript:;"><span>我参加的社团</span></a></li>
                    <li><a href="./manager_find.action?mno=<s:property value="#session.existStudent.username"/>" target="right1"><span>我管理的社团</span></a></li>
                    <li><a href="./manager_findinfo.action?mno=<s:property value="#session.existStudent.username"/>" target="right1"><span>申请信息管理</span></a></li>
                    
                </ul>
            </li>
         <li class="nav-item">
                <a href="./frame.jsp" target="_parent"><i class="my-icon nav-icon icon_3"></i><span>返回首页</span><i class="my-icon nav-more"></i></a>
               
            </li>
        </ul>
    </div>
            
</body>
</html>