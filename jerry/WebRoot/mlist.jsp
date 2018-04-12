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
<td align="center" style="font-size:24px; color:#666"> 申请信息</td>
</tr>
<tr>

</tr>
</table>
<br/>


<table cellspacing="0" border="1" class="table1">
<thead>
  <tr>
<td align="center">学号</td>
<td align="center">姓名</td>
<td align="center">性别</td>
<td align="center">申请管理的社团</td>
<td align="center">理由</td>
<td align="center">同意</td>
<td align="center">拒绝</td>
<td align="center">删除</td>
</tr>
</thead>
<tbody>
<s:iterator  value="list" var="e">

<tr>
<td align="center"><s:property value="#e.mno"/></td>
<td align="center"><s:property value="#e.mname"/></td>
<td align="center"><s:property value="#e.msex"/></td>
<td align="center"><s:property value="#e.mclub"/></td>
<td align="center"><s:property value="#e.reason"/></td>
<td align="center"><a href="./mapply_edit.action?mid=<s:property value="#e.mid"/>">同意</a></td>
<td align="center"><a href="./mapply_edit1.action?mid=<s:property value="#e.mid"/>">拒绝</a></td>
<td align="center"><a href="./mapply_delete.action?mid=<s:property value="#e.mid"/>">删除</a></td>
</tr>

</s:iterator>
</tbody>
</table>
<br/>

<table  border="0" cellspacing="0" cellpadding="0"  width="900px">
<tr>
<td align="right">
   <span>第<s:property value="currPage"/>/<s:property value="totalPage"/>页</span>&nbsp;&nbsp;
   <span>总记录数：<s:property value="totalCount"/>&nbsp;&nbsp;每页显示：<s:property value="pageSize"/></span>&nbsp;&nbsp;
   <span>
       <s:if test="currPage !=1">
       <a href="./mapply_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
       <a href="./mapply_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
       </s:if>
       <s:if test="currPage !=totalPage">
       <a href="./mapply_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
       <a href="./mapply_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
       </s:if>
   </span>
</td>
</tr>
</table>
</body>
</html>