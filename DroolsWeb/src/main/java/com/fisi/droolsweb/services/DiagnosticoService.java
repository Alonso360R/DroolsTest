package com.fisi.droolsweb.services;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.fisi.droolsweb.to.ComputadoraTO;

public class DiagnosticoService {
	
	public ComputadoraTO getDiagnostico(ComputadoraTO c){
		ComputadoraTO temp = c;
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in
			// kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSession = kContainer.newKieSession("ComputerKS");
			

			
			kSession.insert(temp);
			kSession.insert(temp.getMonitor());
			kSession.insert(temp.getMonitor().getCableVGA());
			
			kSession.fireAllRules();

			System.out.println("Monitor enciende: " + temp.getMonitor().isEnciende());
			System.out.println("Monitor conectado: " + temp.getMonitor().isConectado());
			System.out.println("Cable de corriente funciona: " + temp.getMonitor().isFuenteFunciona());
			System.out.println("Monitor muestra imagen: " + temp.getMonitor().isMuestraImagen());
			System.out.println("Cable VGA Conectado: " + temp.getMonitor().getCableVGA().isConectado());
			System.out.println("Cable VGA Funciona: " + temp.getMonitor().getCableVGA().isFunciona());
			
			System.out.println(temp.getProblema());
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
		return temp;
	}
}
