<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<link 	rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link 	rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript" src="/resources/js/main.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/main.css">
<title>소민호님의 게시판</title>
</head>
<body>
	<div class="container">
		<div class="pull-right">
			<c:choose>
				<c:when test="${ empty login }">
					<div>
						<form id="signin" class="navbar-form navbar-right" role="form" method="post" action="/login">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input id="userid" type="text" class="form-control" name="userid" value="${loginDTO.userid}" placeholder="Login ID">                                        
                        </div>

                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                            <input id="userpw" type="password" class="form-control" name="userpw" value="" placeholder="Password">                                        
                        </div>

                        <button type="submit" class="btn btn-primary">Login</button>
                   </form>
					</div>
				</c:when>
				<c:otherwise>
					<a href="/logout"> ${ login.username } 님 로그아웃 </a>
				</c:otherwise>
			</c:choose>
		</div>
		<hr>
		<div class="row">
			<div class="panel panel-primary filterable">
				<div class="panel-heading">
					<h3 class="panel-title">Board</h3>
					<div class="pull-right">
						<button class="btn btn-default btn-xs btn-filter">
							<span class="glyphicon glyphicon-filter"></span> Filter
						</button>
					</div>
				</div>
				<table class="table">
					<thead>
						<tr class="filters">
							<th style="width: 5%; margin: auto;"><input type="text"
								class="form-control" placeholder="글번호" disabled></th>
							<th style="width: 60%;"><input type="text"
								class="form-control" placeholder="제목" disabled></th>
							<th style="width: 10%; margin: auto;"><input type="text"
								class="form-control" placeholder="아이디" disabled></th>
							<th style="width: 15%; margin: auto;"><input type="text"
								class="form-control" placeholder="작성일자" disabled></th>
							<th style="width: 10%; margin: auto;"><input type="text"
								class="form-control" placeholder="조회수" disabled></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ boardList }" var="boardVO">
							<tr>
								<td>${boardVO.bidx }</td>
								<td><a href="/board/detail/${boardVO.bidx}">${boardVO.title }</a></td>
								<td>${ boardVO.userid }</td>
								<td>${ boardVO.writedate }</td>
								<td>${ boardVO.hitcnt }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<a class="btn btn-warning" href="/doError">에러발생 버튼</a>
		<c:if test="${ not empty login }">
			<a class="btn btn-warning" href="#">게시글 작성하기</a>
		</c:if>
		
	</div>
</body>
</html>
