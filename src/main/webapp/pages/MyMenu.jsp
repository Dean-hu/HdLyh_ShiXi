<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>主页一</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="../lib/font-awesome-4.7.0/css/font-awesome.min.css" media="all">
    <link rel="stylesheet" href="../css/public.css" media="all">
</head>
<style>
    .layui-top-box {padding:40px 20px 20px 20px;color:#fff}
    .panel {margin-bottom:17px;background-color:#fff;border:1px solid transparent;border-radius:3px;-webkit-box-shadow:0 1px 1px rgba(0,0,0,.05);box-shadow:0 1px 1px rgba(0,0,0,.05)}
    .panel-body {padding:15px}
    .panel-title {margin-top:0;margin-bottom:0;font-size:14px;color:inherit}
    .label {display:inline;padding:.2em .6em .3em;font-size:75%;font-weight:700;line-height:1;color:#fff;text-align:center;white-space:nowrap;vertical-align:baseline;border-radius:.25em;margin-top: .3em;}
    .layui-red {color:red}
    .main_btn > p {height:40px;}
</style>
<body style="background: url(../images/home_background.jpg)">
<div class="layuimini-container " style="padding-top: 200px; background: bottom; border: hidden">
    <div class="layuimini-main layui-top-box">
        <div class="layui-row " style="background:bottom; height: 200px;">
            <div class="layui-col-md2 layui-col-md-offset3" style=" height: 200px;">
                <a href="./myProject.jsp" class="layui-btn layui-btn-fluid" style="line-height:200px;color: red; text-align:center; height: 200px;"><h1>我的项目</h1></a>
            </div>
            <div class="layui-col-md2"style="background: bottom;">
                <a href="404.html" class="layui-btn layui-btn-fluid" style="line-height:200px;color: #0000FF; text-align:center; height: 200px;"><h1>查看点赞</h1></a>
            </div>
            <div class="layui-col-md2 " style=" height: 200px;">
                <a href="./login.jsp" class="layui-btn layui-btn-fluid" style="line-height:200px;color: red; text-align:center; height: 200px;"><h1>退出登录</h1></a>
            </div>
        </div>

        <div class="layui-row " style="background:bottom; height: 200px;">
            <div class="layui-col-md2 layui-col-md-offset3" style="background: bottom;">
                <a href="./MyMessage.jsp" class="layui-btn layui-btn-fluid" style="line-height:200px;color: darkgreen; text-align:center; height: 200px;"><h1>查看留言</h1></a>
            </div>
            <div class="layui-col-md2"style="background:red;">
                <a href="404.html" class="layui-btn layui-btn-fluid" style="line-height:200px;color: #00FFFF; text-align:center; height: 200px;"><h1>我的收藏</h1></a>
            </div>
            <div class="layui-col-md2"style="background:red;">
                <a href="./visitorProject.jsp" class="layui-btn layui-btn-fluid" style="line-height:200px;color: #00FFFF; text-align:center; height: 200px;"><h1>全部项目</h1></a>
            </div>
        </div>
    </div>
</div>
</div>
<script src="../lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
</body>
</html>