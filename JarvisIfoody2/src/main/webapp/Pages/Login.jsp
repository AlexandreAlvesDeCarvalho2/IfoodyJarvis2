<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<!---------------------------------------------------     Adicionando Links --------------------------------------------------->

<%@ include file="Links.jsp"%>
</head>




<body>
	<!--------------------------------------------------- Adicionando NavBar------------------------------------------- ------------>

	<nav>
		<%@ include file="NavBar.jsp"%>
	</nav>


	<main>
	
	
	<!--------------------------------------------------- Adicionando Carousel ------------------------------------------- ------------>
		<div class="container-fluid px-0">
			<div class="row">


				<div
					class="col-md-9 align-self-center text-center order-md-1 order-2">

					

						<div id="carouselExampleIndicators" class="carousel slide"
							data-bs-ride="carousel">
							<div class="carousel-indicators">
								<button type="button"
									data-bs-target="#carouselExampleIndicators"
									data-bs-slide-to="0" class="active" aria-current="true"
									aria-label="Slide 1"></button>
								<button type="button"
									data-bs-target="#carouselExampleIndicators"
									data-bs-slide-to="1" aria-label="Slide 2"></button>
								<button type="button"
									data-bs-target="#carouselExampleIndicators"
									data-bs-slide-to="2" aria-label="Slide 3"></button>
							</div>
							<div class="carousel-inner">
								<div class="carousel-item active">
									<img src="img/Atv1.jpg" class="d-block w-100" alt="...">

									<div class="carousel-caption d-md-block">
										<h5>60 milhões de pedidos em apenas um mês</h5>
										<p>Esse é o alcance das lojas parceiras do iFood. Faça parte e alavanque suas vendas em São Paulo.</p>

										

									</div>
								</div>


								<div class="carousel-item">
									<img src="img/Atv2.jpg" class="d-block w-100" alt="...">
								
								</div>
								<div class="carousel-item">
									<img src="img/Atv3.jpg" class="d-block w-100" alt="...">
									
									
								</div>
							</div>

							<button class="carousel-control-prev" type="button"
								data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
								<span class="carousel-control-prev-icon" aria-hidden="true"></span>
								<span class="visually-hidden">Previous</span>
							</button>
							<button class="carousel-control-next" type="button"
								data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
								<span class="carousel-control-next-icon" aria-hidden="true"></span>
								<span class="visually-hidden">Next</span>
							</button>
						</div>
					
				</div>

<!-------------------------------------------------         FORMULARIO DE LOGIN ------------------------------------------------------------------>


				<div
					class="col-md-3 align-self-center order-md-2 order-1 mb-md-0 mb-4">

					<div class="container-fluid px-4">
						<form action="Login.jsp" method="post">
							<div class="mb-3"> 
								<h3 class="text-center">Bem vindo</h3>
								<h3 class="text-center">Parceiro Ifoody</h3>
								<label for="exampleInputEmail1" class="form-label">Email
								</label> <input type="email" name="login" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
								<div id="emailHelp" class="form-text">.</div>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Senha</label>
								<input type="password" name="senha" class="form-control"
									id="exampleInputPassword1">
							</div>
							<div class="Esp-10px">
								 
								<button type="submit" class="btn btn-primary btn-conf">Entrar</button>
								
							</div>

						</form>
						
	<!--------------------------------------------------------------- Validacao de dados!---------------------------------------------------- -->
	
						<%  String login =  request.getParameter("login");
						    String senha =  request.getParameter("senha");	
						
										
							if(login!=null && senha!=null && !login.isEmpty() && !senha.isEmpty())  {
								session.setAttribute("login", login);
								response.sendRedirect("main.jsp");
							} %>
						
							<p class="Esp-10px">
								<a href="#" class="btn btn-primary btn-conf">Cadastrar</a>
								
							<p />
						
					</div>

				</div>





			</div>
		</div>
	</main>



</body>
</html>