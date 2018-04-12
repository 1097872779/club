<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="/struts-tags"    prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
                <a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>成员管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="./club_findAll.action"  target="right"><span>街舞社成员</span></a></li>
                    <li><a href="./club_findAll1.action" target="right"><span>动漫社成员</span></a></li>
                    <li><a href="./club_findAll2.action" target="right"><span>计算机协会成员</span></a></li>
                    <li><a href="./student_findAll.action"  target="right"><span>所有用户信息</span></a></li>
                </ul>
            </li>
            <li class="nav-item">
                <a href="javascript:;"><i class="my-icon nav-icon icon_2"></i><span>授权管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="./manager_findAll.action" target="right"><span>目前管理员信息</span></a></li>
                    <li><a href="./grant1.jsp" target="right"><span>授权社团管理员</span></a></li>
                  
                </ul>
            </li>
            <li class="nav-item">
                <a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>信息管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="javascript:;"><span>公告管理</span></a></li>
                    <li><a href="./mapply_findAll.action" target="right"><span>申请信息管理</span></a></li>      
                </ul>
            </li>
            <li class="nav-item">
                <a href="./index.jsp" target="_parent"><i class="my-icon nav-icon icon_3"></i><span>安全退出</span><i class="my-icon nav-more"></i></a>
            
            </li>
        </ul>
    </div>
            
</body>
</html>