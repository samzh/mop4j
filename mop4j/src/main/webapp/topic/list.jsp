<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>
<body>
<s:if test="dataList.size > 0">
	<s:iterator value="dataList" status="dl">
		<s:property value="dl.index" />, <s:property value="dl.title" />
	</s:iterator>
</s:if>
<s:else>
	<h2>目前没有任何帖子</h2>
	<a href="<s:url value='/topic/new'/>" target="contentright">新建主题</a>
</s:else>
</body>
</html>