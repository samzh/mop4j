<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>

<script type="text/javascript">
function reloadLeft() {
	//var urlParam = location.search;
	var urlParam = location.search;
	if (urlParam) {
		if (urlParam.indexOf("refresh=true") >= 0) {
			window.top.frames['contentleft'].location.reload();
		}
	}
}

</script>
</head>
<body onload="reloadLeft()">
<h2>快点左边的帖子！别愣着！！</h2>
</body>
</html>