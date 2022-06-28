<%--
  Created by IntelliJ IDEA.
  User: Dean Hu
  Date: 2022/6/26
  Time: 21:04
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
</head>
<body>
<%--<div style="color: #00a2d4">我的项目</div>--%>
<blockquote class="layui-elem-quote" lay-size="100px">
    我的留言
</blockquote>
<div class="layuimini-container">
    <div class="layuimini-main">
        <script type="text/html" id="toolbarDemo">
            <div class="layui-btn-container">
                <button class="layui-btn layui-btn-normal layui-btn-sm data-add-btn" lay-event="add"> 添加 </button>
                <button class="layui-btn layui-btn-sm layui-btn-danger data-delete-btn" lay-event="delete"> 删除 </button>
            </div>
        </script>

        <table class="layui-hide" id="currentTableId" lay-filter="currentTableFilter"></table>

        <script type="text/html" id="currentTableBar">
            <a class="layui-btn layui-btn-normal layui-btn-xs data-count-delete" lay-event="delete">
              删除</a>
        </script>
        <blockquote class="layui-elem-quote" lay-size="100px">
            我的项目留言
        </blockquote>
        <table class="layui-hide" id="currentTableId2" lay-filter="currentTableFilter"></table>

    </div>
</div>
<script src="../lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form', 'table'], function () {
        var $ = layui.jquery,
            form = layui.form,
            table = layui.table;

        table.render({
            elem: '#currentTableId',
            url: '../findMyMessage.action',
            toolbar: null,
            cols: [[
              /*  {field: 'message_id', width: 0, },*/
                {field: 'user_name', width: 100, title: '留言人'},
                {field: 'project_name', width: 100, title: "留言项目"},
                {field: 'message_content', width: 200, title: "留言内容"},
                {title: '操作', minWidth: 150, toolbar: '#currentTableBar', align: "center"}
            ]],
            limits: [10, 15, 20, 25, 50, 100],
            limit: 15,
            page: true,
            skin: 'line'
        });
        table.render({
            elem: '#currentTableId2',
            url: '../findMyMessage.action',
            toolbar: null,
            cols: [[
                /*{field: 'message_id', width: 0, },*/
                {field: 'user_name', width: 100, title: '留言人'},
                {field: 'project_name', width: 100, title: "留言项目"},
                {field: 'message_content', width: 200, title: "留言内容"},
            ]],
            limits: [10, 15, 20, 25, 50, 100],
            limit: 15,
            page: true,
            skin: 'line'
        });

        table.on('tool(currentTableFilter)', function (obj) {
            var data = obj.data;
             if (obj.event === 'delete') {
                layer.confirm('真的删除行么', function (index) {
                    $.getJSON("../delMessage.action",{message_id:obj.data.message_id});
                     obj.del();
                     layer.close(index);
                });
            }
        });

    });
</script>

</body>
</html>

