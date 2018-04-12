<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags"    prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社团招新</title>	

<link rel="stylesheet" href="./css/reset.css"> 
<link rel="stylesheet" href="./css/style.css">

</head>
<body>

<header class="cd-header">

	<nav class="cd-primary-nav">
		<ul>
			<li><a href="./personal.jsp">个人中心</a></li>
			
			<li><a href="./index.jsp">安全退出</a></li>
		</ul>
	</nav> 
</header>

<section class="cd-hero">
	<ul class="cd-hero-slider">

		<li class="selected">
			<div class="cd-half-width">
				<h2>Welcome   <s:property value="#session.existStudent.sname"/>  </h2>
				<p>在这里你可以了解各社团的信息，并申请你想去的社团！让我们开始我们大学的社团之旅吧！</p>
				
			</div> 

			<div class="cd-half-width cd-img-container">
				<img src="./images/timg.jpg" alt="tech 1">
			</div> 
		</li>

		<li>
			<div class="cd-half-width cd-img-container">
				<img src="./images/dance.jpg" alt="tech 2">
			</div> 

			<div class="cd-half-width">
				<h2>街舞社</h2>
				<p>街舞对于现代的年轻人来讲非常的潮流，伴随着强劲的音乐，配合着巧妙的舞步，让我们舞出了新一代人的热情，所以，相信我们的街舞社一定会走的更加辉煌</p>
				<a href="./apply.jsp" class="cd-btn">Apply to join</a>
				<a href="./dance.jsp" class="cd-btn secondary">Learn More</a>
			</div> 
			
		</li>

		<li class="cd-bg-video">
			<div class="cd-full-width">
				<h2>动漫社</h2>
				<p>动漫社是以丰富同学们的业余生活为目标,给喜欢动漫的同学们提供一个尽情享受动漫的空间,同学们对动漫社的喜爱是我们社的基础.</p>
				<a href="apply.jsp" class="cd-btn">Apply to join</a>
				<a href="./carton.jsp" class="cd-btn secondary">Learn More</a>
			</div> <!-- .cd-full-width -->

			<div class="cd-bg-video-wrapper" data-video="assets/video/video">
				
			<video loop=""><source src="assets/video/video.mp4" type="video/mp4"><source src="assets/video/video.webm" type="video/webm"></video></div> <!-- .cd-bg-video-wrapper -->
		</li>

		<li>
			<div class="cd-full-width">
				<h2>计算机协会</h2>
				<p>是由广大的电脑爱好者自发组成，以“学习计算机知识，提高自身素质，相互帮助，团结协作”为宗旨，以“先进带动后进，刻苦钻研计算机知识，勇攀IT科技高峰”为原则。积极大胆地走进计算机各个领域，不断总结交流，树立良好的计算机知识氛围，全面提高我院广大计算机爱好者们的计算机知识水平</p>
				<a href="apply.jsp" class="cd-btn">Apply to join</a>
				<a href="./computer.jsp" class="cd-btn secondary">Learn More</a>
			</div> <!-- .cd-full-width -->
		</li>
	</ul> <!-- .cd-hero-slider -->

	<div class="cd-slider-nav">
		<nav>
			<span class="cd-marker item-1"></span>
			
			<ul>
				<li class="selected"><a href="">首页</a></li>
				<li><a href="">街舞社</a></li>
				<li><a href="">动漫社</a></li>
				<li><a href="">计算机协会</a></li>
			</ul>
		</nav> 
	</div> <!-- .cd-slider-nav -->
	
</section> <!-- .cd-hero -->

<script type="text/javascript" src="./js/jquery-2.1.1.js.下载"></script>
<script type="text/javascript" src="./js/main.js.下载"></script>


</body></html>