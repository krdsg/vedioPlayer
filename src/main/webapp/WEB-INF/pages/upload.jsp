<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="../js/jquery-1.11.2.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>upload file</title>
</head>
<body>
<h1>上传文件</h1>
<form name="userForm2" action="/upload/doUpload" enctype="multipart/form-data" method="post">
<div id="newUpload">
    <input type="file" name="file">
</div>
<input type="submit" value="上传" >


</form>
</body>
</html>