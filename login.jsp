<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common_header.jsp"%>

	<div class="container mt-2 bg-light rounded">
		<a href="javascript:history.go(-1)" class="btn btn-primary btn-lg active float-right text-right mt-2" role="button">Vissza</a>
		<div class="row">
			<h1 class="col-12 text-center my-4">Bejelentkezés</h1>
			<div class="col-6 mx-auto p-3 bg-white mb-5 shadow text-center rounded">
				<form action="" method="post" class="col-6 mx-auto">
				
					<label>Felhasználónév:</label>
					<input type="text" name="username" class="form-control mb-3" required>
					<label>Jelszó:</label>
					<input type="password" name="password" class="form-control mb-3" required>
					<button type="submit" name="login" class="btn btn-dark mb-3">Bejelentkezés</button>
				</form>
			</div>

		</div>

	<%@include file="common_footer.jsp"%>