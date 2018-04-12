<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
        .table1{
            border:1px solid #ddd;
            width:900px;
            
        }
        thead{
            background-color:lightblue;
        }

    </style>
</head>
<body>
<table border="0" width="900px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 社团成员</td>
</tr>

</table>
<br/>


<table cellspacing="0" border="1" class="table1">
<thead>
  <tr>
<td align="center">学号</td>
<td align="center">姓名</td>
<td align="center">性别</td>
<td align="center">年龄</td>
<td align="center">电话</td>
<td align="center">院校</td>
<td align="center">所属社团</td>
<td align="center">删除成员</td>


</tr>
</thead>
<tbody>

<s:iterator  value="list" var="e">
<tr>
<td align="center"><s:property value="#e.cno"/></td>
<td align="center"><s:property value="#e.cname"/></td>
<td align="center"><s:property value="#e.csex"/></td>
<td align="center"><s:property value="#e.cage"/></td>
<td align="center"><s:property value="#e.cphone"/></td>
<td align="center"><s:property value="#e.school"/></td>
<td align="center"><s:property value="#e.cclub"/></td>
<td align="center"><a href="./club_delete.action?cid=<s:property value="#e.cid"/>">删除</a></td>


</tr>
</s:iterator>

</tbody>
</table>
<br/>


</body>
</html>