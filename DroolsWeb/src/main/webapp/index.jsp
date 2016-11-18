<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Fallas en el Monitor</title>
	<link rel="stylesheet" type="text/css" href="assets/css/lib/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="assets/css/styles.css">
	<link href="https://fonts.googleapis.com/css?family=Indie+Flower" rel="stylesheet">
</head>
<body>
	<div class="container">
			
		<h1>Diagnóstico de fallas del monitor</h1>

		<div class="col-xs-offset-4 col-xs-6">


			<form action="DiagnosticoServlet">
				<input type="hidden" name="command" id="command" value="">

				<div class="form-group" id="monitorEnciendeDiv">
					<label for="monitorEnciende">¿Su Monitor enciende?</label>
					<br>
					<input type="radio" name="monitorEnciende" value="Si">Si
					<input type="radio" name="monitorEnciende" value="No">No
				</div>

				<div class="form-group" id="fuenteConectadoDiv">
					<label for="fuenteConectado">¿El cable de corriente esta conectado?</label>
					<br>
					<input type="radio" name="fuenteConectado" value="Si">Si
					<input type="radio" name="fuenteConectado" value="No">No
				</div>

				<div class="form-group" id="fuenteFuncionaDiv">
					<label for="fuenteFunciona">¿El cable de corriente funciona en otra pc?</label>
					<br>
					<input type="radio" name="fuenteFunciona" value="Si">Si
					<input type="radio" name="fuenteFunciona" value="No">No
				</div>

				<div class="form-group" id="muestraImagenDiv">
					<label for="fuenteFunciona">¿Se muestra la imagen en el monitor?</label>
					<br>
					<input type="radio" name="muestraImagen" value="Si">Si
					<input type="radio" name="muestraImagen" value="No">No
				</div>

				<div class="form-group" id="vgaConectadoDiv">
					<label for="vgaConectado">¿El cable VGA esta conectado?</label>
					<br>
					<input type="radio" name="vgaConectado" value="Si">Si
					<input type="radio" name="vgaConectado" value="No">No
				</div>

				<div class="form-group" id="vgaFuncionaDiv">
					<label for="vgaFunciona">¿El cable VGA funciona en otra pc?</label>
					<br>
					<input type="radio" name="vgaFunciona" value="Si">Si
					<input type="radio" name="vgaFunciona" value="No">No
				</div>
				
				<div class="form-group center-block">
					<button class="btn btn-primary">Obtener Diagnóstico</button>
				</div>
			</form>
			
			<%
				String problema = (String)request.getAttribute("problema");
				if(problema == null){
					problema="";
				}
			%>

			<p><%= problema%></p>
		</div>
	</div>

	<script type="text/javascript" src="assets/js/lib/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="assets/js/script.js"></script>

</body>
</html>