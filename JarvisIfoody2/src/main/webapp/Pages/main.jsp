
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
<!------------ Adicionando Links ------------>
<%@ include file="Links.jsp"%>

</head>




<body>
	<%@ page
		import="br.com.jarvis.entity.*,br.com.jarvis.ifoody.dao.*, java.util.*"%>
	<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<!------------ Adicionando NavBar ------------>
	
	<nav>
		<%@ include file="NavBar.jsp"%>
	</nav>
	
	
	<!------------ Adicionando Menu Lareal ------------>
	
	
	<div class="container-fluid px-0">
	<div class="row">
	<div
		
		class="col-md-3 align-self-center order-md-2 order-1 mb-md-0 mb-4 Esp-10px">

		<div class="container-fluid px-4 backgroundColor ">
			<form action="Login.jsp" method="post">
				<div class="mb-3">
					<h3 class="text-center backgroundColor Esp-10px ">Cadastro de
						Pratos</h3>
				</div>

				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Nome
						do Prato</label> <input type="text" name="descrição" class="form-control"
						id="descriçãodoprato">
				</div>

				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Descrição</label>
					<input type="text" name="descrição" class="form-control"
						id="descriçãodoprato">
				</div>

				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Valor</label>
					<input type="text" name="descrição" class="form-control"
						id="descriçãodoprato">
				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Codigo
						do restaurante</label> <input type="text" name="descrição"
						class="form-control" id="descriçãodoprato">
				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Codigo
						do estilo de comida</label> <input type="text" name="descrição"
						class="form-control" id="descriçãodoprato">
				</div>


				<div class="mb-3">
					<button type="submit" class="btn btn-primary btn-conf">Cadastrar</button>
				</div>

			</form>
		</div>


	</div>
			<!------------ Adicionando Menu Tabela ------------>
	<div
		class="col-md-9 align-self-center order-md-2 order-1 mb-md-0 mb-4 Esp-10px">
		<div class="container-fluid px-4  ">
			<table  class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Codigo</th>
					<th scope="col">Restaurante</th>
					<th scope="col">Nome do Prato </th>
					<th scope="col">Descrição</th>
					<th scope="col">Valor</th>
					<th scope="col">estilo de comida</th>
				</tr>
			</thead>
			<tbody>
			
			<!------------ Adicionando Lógica get da tabela ------------>
			<% 
			Parceiro parceiro = new Parceiro();
			ParceiroIfoodyDAO dao = DaoFactory.getParceiroIfoodyDAO();
			
							
			
			
			%>
				<tr>
					<th scope="row">1</th>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
					<td>6</td>
					<td>7</td>
				</tr>

			</tbody>
			</table>

		</div>





	</div>
	</div>
	</div>
</body>
</html>