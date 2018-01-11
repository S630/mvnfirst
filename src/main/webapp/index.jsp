<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<!-- easyui 前端框架 -->
<script type="text/javascript" src="../js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/jquery-easyui-1.5/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.5/theme/default/easyui.css"></link>
<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.5/theme/icon.css"></link>

</head>
<body>
	<h2>Hello World!</h2>
	<h2>WELCOM TO MY STUDY SYSTEM </h2>

	<form action="login/logincheck">
		<table weight="80%" border="solid 1px">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="id" /></td>
				<td></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="passwd" /></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit" name="登录">登录</button></td>
				<td></td>
			</tr>
			<tr>
			<td></td>
				<td>
				
				</td>
				<td></td>
			</tr>
		</table>

	</form>
	
	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">easyui确认</a>
	<div style="padding:5px;background:#fafafa;width:500px;border:1px solid #ccc">
					<a href="#" class="easyui-linkbutton" iconCls="icon-cancel">Cancel</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-reload">Refresh</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-search">Query</a>
					<a href="#" class="easyui-linkbutton">text button</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-print">Print</a>
				</div>
	<h2>配置信息 </h2>
	<h3><a style="color: #FF0000">*</a>框架SSM</h3>
	<h3><a style="color: #FF0000">*</a>java1.7.0_45</h3>
	<h3><a style="color: #FF0000">*</a>Apache Tomcat/7.0.64</h3>
	<h3><a style="color: #FF0000">*</a>oracle11r2</h3>
	<h2>配置信息</h2>
	

</body>

</html>