package com.fisi.droolsweb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fisi.droolsweb.services.DiagnosticoService;
import com.fisi.droolsweb.to.CableVgaTO;
import com.fisi.droolsweb.to.ComputadoraTO;
import com.fisi.droolsweb.to.MonitorTO;

/**
 * Servlet implementation class DiagnosticoServlet
 */
public class DiagnosticoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiagnosticoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ComputadoraTO c = llamaDiagnostico(request, response);
		DiagnosticoService service = new DiagnosticoService();
		c = service.getDiagnostico(c);
		
		request.setAttribute("problema", c.getProblema());
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	private ComputadoraTO llamaDiagnostico(HttpServletRequest request, HttpServletResponse response) {
		String monitorEnciende = request.getParameter("monitorEnciende");
		String fuenteConectado = request.getParameter("fuenteConectado");
		String fuenteFunciona = request.getParameter("fuenteFunciona");
		String muestraImagen = request.getParameter("muestraImagen");
		String vgaConectado = request.getParameter("vgaConectado");
		String vgaFunciona = request.getParameter("vgaFunciona");
		
		MonitorTO monitor = new MonitorTO();
		ComputadoraTO computadora = new ComputadoraTO();
		CableVgaTO cableVga = new CableVgaTO();
		
		if (monitorEnciende != null && monitorEnciende != "") {
			monitor.setEnciende(filtraParametro(monitorEnciende));
		}
		
		if (fuenteConectado != null && fuenteConectado != "") {
			monitor.setConectado(filtraParametro(fuenteConectado));
		}
		
		if (fuenteFunciona != null && fuenteFunciona != "") {
			monitor.setFuenteFunciona(filtraParametro(fuenteFunciona));
		}
		
		if (muestraImagen != null && muestraImagen != "") {
			monitor.setMuestraImagen(filtraParametro(muestraImagen));
		}
		
		if (vgaConectado != null && vgaConectado != "") {
			cableVga.setConectado(filtraParametro(vgaConectado));
		}
		
		if (vgaFunciona != null && vgaFunciona != "") {
			cableVga.setFunciona(filtraParametro(vgaFunciona));
		}
		
		monitor.setCableVGA(cableVga);
		computadora.setMonitor(monitor);
		
		return computadora;
	}

	private boolean filtraParametro(String parametro) {
		if (parametro.equals("Si")) {
			return true;
		}
		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
