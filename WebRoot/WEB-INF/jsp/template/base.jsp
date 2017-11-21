<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>${title }</title>
        <link rel="stylesheet" href="css/materialize.min.css" />
        <link rel="stylesheet" href="css/bbs.css" />
        <script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
	</head>
	<body style="background: #eaeaea;">
        <!-- 头部Logo导航 -->
		<tiles:insertAttribute name="header" />
            
        <div class="row">
            <div class="col s1"></div>
            <div class="col s7">
                <!-- 主体内容 -->
                <tiles:insertAttribute name="body" />
            </div>
            <div class="col s3">
                <!-- 侧边菜单栏 -->
                <tiles:insertAttribute name="menu" />
            </div>
            <div class="col s1"></div>
        </div>
        
        <tiles:insertAttribute name="footer" />
	</body>
</html>