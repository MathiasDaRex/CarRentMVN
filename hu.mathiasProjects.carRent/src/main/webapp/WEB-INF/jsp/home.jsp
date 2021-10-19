<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common_header.jsp"%>

 <div class="row">
        <div class="col-12 container mt-3">
          <div class="jumbotron mx-auto">
            <h1 class="display-4">North Star Car Rent</h1>
            <p class="lead">Üdvözöljük a North Star Rental oldalán! Bármilyen járműre is van szüksége nálunk megtalálja!</p>
            
            <p class="lead">
              <a class="btn btn-primary btn-lg" href="cars" role="button">Autóink</a>
              <a class="btn btn-secondary btn-lg" href="#" role="button">Motorjaink</a>
            </p>
            
          </div>
        </div>
      </div>
    

      <!-- Képváltó -->
      <div class="row">
        <div class="col-12">
          <div id="carouselExampleIndicators" class="carousel slide mx-auto p-3 rounded" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="d-block w-100" src="img/f40.jpg" alt="First slide" >
                <div class="carousel-caption d-none d-md-block">
                  <h5>Ferrari F40</h5>
                  <p>Korunk egyik legikonikusabb sportautója</p>
                </div>
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="img/GT-R.jpg" alt="Second slide" href="#">
                <div class="carousel-caption d-none d-md-block">
                  <h5>Nissan GT-R</h5>
                  <p>Nem véletlenül nevezik Godzillának</p>
                </div>
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="img/supra.jpg" alt="Third slide">
                <div class="carousel-caption d-none d-md-block">
                  <h5>Toyota supra mk-4</h5>
                  <p>Egy legenda újjászületése</p>
                </div>
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
        </div>
      </div>

      <!-- Miért válasszon minket -->
      <div class="row">
        <div class="col-12">
          
        </div>
      </div>


<%@include file="common_footer.jsp" %>	
