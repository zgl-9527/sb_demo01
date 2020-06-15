<%@ page language="java" contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <script src="js/jquery-1.8.3.min.js" language="JavaScript"></script>
    <script language="JavaScript">
        $(function () {
            alert("dad")
        })
    </script>
</head>
<body>
<h2>显示学生信息</h2><hr/>
  <table border="2" width="80%">
      <tr>
          <td>学号</td>
          <td>姓名</td>
          <td>年龄</td>
          <td>性别</td>
          <td>地址</td>
          <td>状态</td>
          <td>生日</td>
          <td>年级编号</td>
          <td>操作</td>
      </tr>
      <c:forEach items="${list}" var="s">
          <tr>
              <td>${s.xh}</td>
              <td>${s.name}</td>
              <td>${s.age}</td>
              <td>${s.sex}</td>
              <td>${s.address}</td>
              <td>${s.state}</td>
              <td>${s.birthday}</td>
              <td>${s.gid}</td>
              <td><a>修改</a>
                  <a>删除</a>
              </td>
          </tr>
      </c:forEach>
  </table>
</body>
</html>
