<%--
  Created by IntelliJ IDEA.
  User: Dean Hu
  Date: 2022/6/22
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="../css/public.css" media="all">
    <style>
        body {
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<div class="layui-container">
    <div class="admin-login-background">
        <div class="layui-form login-form">
            <form class="layui-form" action="../addProject.action" method="post">
                <div class="layui-form-item logo-title">
                    <h1>申请新项目</h1>
                </div>
                <div class="layui-form-item">
                    <input type="text" name="project_name" lay-verify="required|account" placeholder="用户名或者邮箱" autocomplete="off" class="layui-input" >
                </div>
                <div class="layui-form-item">
                    <input type="password" name="project_owner" lay-verify="required|password" placeholder="密码" autocomplete="off" class="layui-input" >
                </div>
                <div class="layui-form-item">
                    <input type="password" name="project_tel" lay-verify="required|password" placeholder="再次输入密码" autocomplete="off" class="layui-input" >
                </div>
                <div class="layui-form-item">
                    <input type="text" name="project_owner_info" lay-verify="required|account" placeholder="用户名或者邮箱" autocomplete="off" class="layui-input" >
                </div>
                <div class="layui-form-item">
                    <button class="layui-btn layui-btn layui-btn-normal layui-btn-fluid" type="submit" >注 册</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form'], function () {
        var form = layui.form,
            layer = layui.layer;

        // 登录过期的时候，跳出ifram框架
        if (top.location != self.location) top.location = self.location;

        // 进行注册操作
        form.on('submit(login)', function (data) {
            data = data.field;
            if (data.project_name == '') {
                layer.msg('项目名不能为空');
                return false;
            }
            if (data.project_owner == '') {
                layer.msg('项目拥有人不能为空');
                return false;
            }
            if (data.project_tel == '') {
                layer.msg('项目联系人不能为空');
                return false;
            }
            if(data.project_owner_info==""){
                layer.msg("项目拥有人信息不能为空");
                return false;
            }
            layer.msg('申请信息已提交，等待审批', function () {
                window.location = './myProject.jsp';
            });
            return false;
        });
    });
</script>
</body>
</html>
