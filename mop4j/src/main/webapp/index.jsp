<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><s:property value="%{getText('page.title')}" /></title>
</head>
<frameset rows="36, *">
	<frame id="top" name="topframe" noresize="noresize" src="forum/top"
		scrolling="no" title="Welcome" frameborder="0"></frame>

	<frameset cols="50%, 50%">
		<frame id="contentleft" name="contentleft" frameborder="1"
			src="topic/list" />
		<frame id="contentright" name="contentright" frameborder="1"
			src="welcome" />
	</frameset>

</frameset>
</html>