<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="/resources/css/boardDetail.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${board.title }</title>
</head>
<body>
	<div class="container">
		<table class="table table-bordered">
			<caption>${ board.title }</caption>
			<tbody>
				<tr>
					<th>글번호</th>
					<td>${board.bidx }</td>
				</tr>
				<tr>
					<th>작성일자</th>
					<td>${board.writedate }</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${board.userid }</td>
				</tr>
				<tr>
					<th>조회수</th>
					<td>${ board.hitcnt }</td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea class="form-control" type="textarea"
							id="message" rows="10" readonly="readonly">${board.contents }</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<a href="/" class="btn btn-default"style="float: right; margin-right: 5px;">HOME</a>
						<a href="#" class="btn btn-success" style="float: right; margin-right: 5px;">글 쓰기</a>
						<c:if test="${login.userid eq board.userid }">
							<a href="#" class="btn btn-danger" style="float: right; margin-right: 5px;">글 삭제하기</a>
							<a href="#" class="btn btn-info" style="float: right; margin-right: 5px;">글 수정하기</a>
						</c:if>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>