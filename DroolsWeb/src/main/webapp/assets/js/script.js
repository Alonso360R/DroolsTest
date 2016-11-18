var monitorEnciendeDiv = $("#monitorEnciendeDiv");
var fuenteConectadoDiv = $("#fuenteConectadoDiv");
var fuenteFuncionaDiv = $("#fuenteFuncionaDiv");
var muestraImagenDiv = $("#muestraImagenDiv");
var vgaConectadoDiv = $("#vgaConectadoDiv");
var vgaFuncionaDiv = $("#vgaFuncionaDiv");

var command = $("#command");

init();

function init(){
	ocultar(fuenteConectadoDiv);
	ocultar(fuenteFuncionaDiv);
	ocultar(muestraImagenDiv);
	ocultar(vgaConectadoDiv);
	ocultar(vgaFuncionaDiv);
	eventos();
}


function eventos(){
	$("input:radio[name='monitorEnciende']").on('click',function() {
		var value = $("input:radio[name='monitorEnciende']:checked").val();
		if (value === "No") {
			mostrar(fuenteConectadoDiv);
			ocultar(muestraImagenDiv);
			ocultar(vgaConectadoDiv);
			ocultar(vgaFuncionaDiv);
		}else if (value === "Si") {
			ocultar(fuenteConectadoDiv);
			ocultar(fuenteFuncionaDiv);
			mostrar(muestraImagenDiv);
		}
	});

	$("input:radio[name='fuenteConectado']").on('click',function() {
		var value = $("input:radio[name='fuenteConectado']:checked").val();
		if (value === "No") {
			ocultar(fuenteFuncionaDiv);
			command.val("fuenteNoConectado");
		}else if (value === "Si") {
			mostrar(fuenteFuncionaDiv);
		}
	});

	$("input:radio[name='fuenteFunciona']").on('click',function() {
		var value = $("input:radio[name='fuenteFunciona']:checked").val();
		if (value === "No") {
			command.val("fuenteFunciona");
		}else if (value === "Si") {
			command.val("fuenteNoFunciona");
		}
	});


	$("input:radio[name='muestraImagen']").on('click',function() {
		var value = $("input:radio[name='muestraImagen']:checked").val();
		if (value === "No") {
			mostrar(vgaConectadoDiv);
		}else if (value === "Si") {
			ocultar(vgaConectadoDiv);
			ocultar(vgaFuncionaDiv);
			// por implementar
		}
	});

	$("input:radio[name='vgaConectado']").on('click',function() {
		var value = $("input:radio[name='vgaConectado']:checked").val();
		if (value === "No") {
			ocultar(vgaFuncionaDiv);
			command.val("vgaNoConectado");
		}else if (value === "Si") {
			mostrar(vgaFuncionaDiv);
		}
	});

	$("input:radio[name='vgaFunciona']").on('click',function() {
		var value = $("input:radio[name='vgaFunciona']:checked").val();
		if (value === "No") {
			command.val("vgaNoFunciona");
		}else if (value === "Si") {
			command.val("vgaFunciona");
		}
	});
}


function mostrar(div) {
	div.removeClass('fadeAway');
}

function ocultar(div){
	div.addClass('fadeAway');
}