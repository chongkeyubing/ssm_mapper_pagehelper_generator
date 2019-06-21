<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<body>
<h2>Hello!</h2>
<script src="/static/jquery-2.2.3.min.js"></script>

<script>
    $.post("http://localhost/user/list",{page:1,size:1},function(data){
        console.log(data);
    })
</script>
</body>
</html>