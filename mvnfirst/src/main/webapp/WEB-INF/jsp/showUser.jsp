<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- easyui 前端框架 -->
<script type="text/javascript" src="../js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/jquery-easyui-1.5/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.5/theme/default/easyui.css"></link>
<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.5/theme/default/icon.css"></link>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
Hello World !!!
<br>
用户ID:<label>${user.userId}</label><br>
用户名称:<label>${user.name}</label>

test 
<select id="cc" class="easyui-combobox" name="dept" style="width:200px;">
    <option value="aa">aitem1</option>
    <option>bitem2</option>
    <option>bitem3</option>
    <option>ditem4</option>
    <option>eitem5</option>
</select>
	<div id="mm" class="easyui-menu" style="width:120px;">
		<div onclick="javascript:alert('new')">New</div>
		<div>
			<span>Open</span>
			<div style="width:150px;">
				<div><b>Word</b></div>
				<div>Excel</div>
				<div>PowerPoint</div>
			</div>
		</div>
		<div icon="icon-save">Save</div>
		<div class="menu-sep"></div>
		<div>Exit</div>
	</div>
	<table id="dg" title="My Users" class="easyui-datagrid" style="width:550px;height:250px"
		url="get_users.php"
		toolbar="#toolbar"
		rownumbers="true" fitColumns="true" singleSelect="true">
	<thead>
		<tr>
			<th field="firstname" width="50">First Name</th>
			<th field="lastname" width="50">Last Name</th>
			<th field="phone" width="50">Phone</th>
			<th field="email" width="50">Email</th>
		</tr>
	</thead>
</table>
<div id="toolbar">
	<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
</div>
</body>
<script type="text/javascript">
	$('#cc').combobox({
	    url:'combobox_data.json',
	    valueField:'id',
	    textField:'text'
	});
	
	$('#mm').menu('show', {
		  left: 200,
		  top: 100
		});
</script>
</html>