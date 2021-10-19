<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common_header.jsp"%>

<div class="row">
	<div class="col-sm-12">
			<div class="jumbotron bg-dark text-white">
				<h1 class="display-4 text-center">Autóink</h1>
				<a class="btn btn-primary btn-sm float-right" href="new">Új autó 
				<i class="far fa-plus-square"></i></a>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-12">
		<table class="col-12 rounded table table-borderless table-striped table-hover table-light text-center">
		    <thead>
		        <tr>
<!-- 		            <th>Kép</th> -->
		            <th>Id</th>
		            <th>Márka</th>
		            <th>Típus</th>
		            <th>Üzemanyag</th>
		            <th>Klíma</th>
		            <th>Napi ár</th>
		            <th>Foglalás</th>
		        </tr>
		    </thead>
		    <tbody>
		    
		    	<c:forEach var="car" items="${cars}">
		    		<tr>
<%-- 		    			<td>${car.carPics.pic}</td> --%>
		    			<td>${car.carId}</td>
		    			<td>${car.carBrand}</td>
		    			<td>${car.carTypeName}</td>
		    			<td>${car.fuel}</td>
		    			<td>${car.aircon=true ? "van" : "nincs"}</td>
		    			<td>${car.dailyCost}</td>
		    			<td>
							<a class="btn btn-warning" href="edit/${car.carId}">
								Módosít <i class="far fa-edit"></i> 
							</a>
						</td> 
		    		</tr>
		    	</c:forEach>

		    </tbody>
	<!-- 	     <tr> -->
	<!-- 	         <td><img src="img/f40.jpg" alt="F40" width="50%" height="auto"></td> -->
	<!-- 	         <td>Ferrari</td> -->
	<!-- 	         <td>F40</td> -->
	<!-- 	         <td>Benzin</td> -->
	<!-- 	         <td>Nincs</td> -->
	<!-- 	         <td>500000</td> -->
	<!-- 	         <td><a href="reserve.html" class="btn btn-primary btn-md active float-right text-center ">Foglalás</a></td> -->
	<!-- 	     </tr> -->
	<!--         <tr> -->
	<!--             <td><img src="img/GT-R.jpg" alt="GT-R" width="50%" height="auto"></td> -->
	<!--             <td>Nissan</td> -->
	<!--             <td>GT-R</td> -->
	<!--             <td>Benzin</td> -->
	<!--             <td>Van</td> -->
	<!--             <td>350000</td> -->
	<!--             <td><a href="reserve.html" class="btn btn-primary btn-md active float-right text-center ">Foglalás</a></td> -->
	
	<!--         </tr> -->
	<!--         <tr> -->
	<!--             <td><img src="img/supra.jpg" alt="supra" width="50%" height="auto"></td> -->
	<!--             <td>Toyota</td> -->
	<!--             <td>Supra</td> -->
	<!--             <td>Benzin</td> -->
	<!--             <td>Van</td> -->
	<!--             <td>3600000</td> -->
	<!--             <td><a href="reserve.html" class="btn btn-primary btn-md active float-right text-center ">Foglalás</a></td> -->
	<!--         </tr> -->
	    </table>
    </div>
</div>

<%@include file="common_footer.jsp" %>