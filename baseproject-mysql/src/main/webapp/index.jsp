<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>示例</title>
</head>
<body>

<h2>分页查询</h2>
<form type="POST" action="/user/toIndex">
    page:<input type="input" name="page" value="${page}">
    size:<input type="input" name="size" value="${size}">
    id:<input type="input" name="id" value="${user.id}">
    姓名:<input type="input" name="username" value="${user.username}">
    <input type="submit" value="查询">
</form>
<table>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>密码</th>
        <th>邮箱</th>
        <th>性别</th>
        <th>注册日期</th>
        <th>部门</th>
    </tr>

    <c:forEach var="user" items="${users}">
    <tr>
        <th>${user.id}</th>
        <th>${user.username}</th>
        <th>${user.password}</th>
        <th>${user.email}</th>
        <th>${user.sex}</th>
        <th><fmt:formatDate value="${user.registerDate}" pattern="yyyy-MM-dd HH:mm:ss" /></th>
        <th>${user.deptId}</th>
    </tr>
    </c:forEach>
</table>

<h2>添加</h2>

<h2>删除</h2>

<h2>修改</h2>

<h2>多文件上传</h2>

<h2>文件下载</h2>


<script>
    // $.post("http://localhost/user/list",{page:1,size:1},function(data){
    //     console.log(data);
    // })
</script>
<script src="/static/jquery-2.2.3.min.js"></script>
</body>
</html>