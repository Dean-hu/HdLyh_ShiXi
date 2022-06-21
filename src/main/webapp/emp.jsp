<%--
  Created by IntelliJ IDEA.
  User: Dean Hu
  Date: 2022/6/21
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>员工列表</h2>
<table border="1">
    <tr>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>员工职务</th>
        <th>经理编号</th>
        <th>入职日期</th>
        <th>员工薪资</th>
        <th>员工奖金</th>
        <th>部门编号</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${empList}" var="emp">
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.sal}</td>
            <td>${emp.comm}</td>
            <td>${emp.deptno}</td>
            <td>
                <a href="delEmp.action?empno=${emp.empno}">删除</a>
                &nbsp;&nbsp;
                <a href="findEmp.action?empno=${emp.empno}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

