<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common_header.jsp"%>

<div class="container mt-2 bg-light rounded">
	<a href="javascript:history.go(-1)"class="btn btn-primary btn-lg active float-right text-right mt-2" role="button">Vissza</a>
	<div class="row">
		<h1 class="col-12 text-center my-4">Regisztráció</h1>
		<div class="col-6 mx-auto p-3 bg-white mb-5 shadow text-center">
		    <form action="" method="post" class="col-6 mx-auto">
		        <label>Felhasználónév:</label>
		        <input type="text" name="username" class="form-control mb-3" required>
		        <label>e-mail cím:</label>
		        <input type="email" name="email" class="form-control mb-3" required>
		        <label>Jelszó:</label>
		        <input type="password" name="password" class="form-control mb-3" required>
		        <label>Jelszó megerősítése:</label>
		        <input type="password" name="again" class="form-control mb-3" required>
		        <button type="submit" name="reg" class="btn btn-dark mb-3">Regisztráció</button>
		    </form>
		</div>
	</div>
</div>

<%@include file="common_footer.jsp" %>