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
<td align="center" style="font-size:24px; color:#666"> <s:property value="#session.existManager.mclub"/></td>
</tr>

</table>
<br/>


<table cellspacing="0" border="1" class="table1">
<thead>
  <tr>
<td align="center">学号</td>
<td align="center">姓名</td>
<td align="center">性别</td>
<td align="center">身高</td>
<td align="center">年龄</td>
<td align="center">电话</td>
<td align="center">地址</td>
<td align="center">院校</td>
<td align="center">申请的社团</td>
<td align="center">个人经历</td>
<td align="center">个人兴趣</td>
<td align="center">外貌描述</td>
<td align="center">查看明细</td>
<td align="center">同意申请</td>
<td align="center">拒绝申请</td>

</tr>
</thead>
<tbody>

<s:iterator  value="list" var="e">
<tr>
<td align="center"><s:property value="#e.eno"/></td>
<td align="center"><s:property value="#e.aname"/></td>
<td align="center"><s:property value="#e.asex"/></td>
<td align="center"><s:property value="#e.ahight"/></td>
<td align="center"><s:property value="#e.aage"/></td>
<td align="center"><s:property value="#e.phone"/></td>
<td align="center"><s:property value="#e.adress"/></td>
<td align="center"><s:property value="#e.school"/></td>
<td align="center"><s:property value="#e.aclub"/></td>
<td align="center"><s:property value="#e.experience"/></td>
<td align="center"><s:property value="#e.interest"/></td>
<td align="center"><s:property value="#e.look"/></td>
<td align="center"><a href="./apply_edit.action?did=<s:property value="#e.did"/>">同意</a></td>
<td align="center"><a href="./apply_edit1.action?did=<s:property value="#e.did"/>">拒绝</a></td>
<td align="center"><a href="./apply_delete.action?did=<s:property value="#e.did"/>">删除</a></td>


</tr>
</s:iterator>

</tbody>
</table>
<br/>


</body>
</html>