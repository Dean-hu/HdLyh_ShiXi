<%--
  Created by IntelliJ IDEA.
  User: Dean Hu
  Date: 2022/6/22
  Time: 16:46
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
<div class="layui-form layuimini-form">

    <div class="layui-form-item">
        <label class="layui-form-label required">项目名</label>
        <div class="layui-input-block">
            <input type="text" name="project_name" lay-verify="required" lay-reqtext="项目名不能为空" placeholder="请输入项目名" value="" class="layui-input">
        </div>
    </div>
<%--    <div class="layui-form-item">
        <label class="layui-form-label required">项目信息</label>
        <div class="layui-input-block">
            <input type="text" name="project_info" lay-verify="required" lay-reqtext="项目信息不能为空" placeholder="请输入项目信息" value="" class="layui-input">
        </div>
    </div>--%>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">项目信息</label>
        <div class="layui-input-block">
            <textarea name="project_info" lay-verify="required" class="layui-textarea" placeholder="请输入项目信息"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">传承人姓名</label>
        <div class="layui-input-block">
            <input type="text" name="project_owner" lay-verify="required" lay-reqtext="传承人姓名不能为空" placeholder="请输入传承人姓名" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">传承人信息</label>
        <div class="layui-input-block">
            <input type="text" name="project_owner_info" lay-verify="required" placeholder="请输入传承人信息" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">传承人手机号</label>
        <div class="layui-input-block">
            <input type="text" name="project_tel" lay-verify="required" lay-reqtext="传承人手机号不能为空" placeholder="请输入传承人手机号" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-normal" lay-submit lay-filter="saveBtn">确认保存</button>
        </div>
    </div>
</div>
</div>
<script src="../lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form'], function () {
        var form = layui.form,
            layer = layui.layer,
            $ = layui.$;

        //监听提交
        form.on('submit(saveBtn)', function (data) {
            var index = layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            }, function () {
                // 关闭弹出层
                layer.close(index);
                var iframeIndex = parent.layer.getFrameIndex(window.name);
                parent.layer.close(iframeIndex);
            });
            return false;
        });

    });
</script>
</body>
</html>