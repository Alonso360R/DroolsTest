package com.fisi.droolsweb.to;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

public class ComputadorTest {
	public static final void main(String[] args) {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in
			// kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSession = kContainer.newKieSession("ComputerKS");

			ComputadoraTO com = new ComputadoraTO();
			MonitorTO mo = new MonitorTO();
			
			mo.setEnciende(true);
			mo.setConectado(true);
			mo.setFuenteFunciona(false);
			mo.setMuestraImagen(false);
			com.setMonitor(mo);
			
			CableVgaTO cable = new CableVgaTO();
			cable.setConectado(true);
			cable.setFunciona(true);
			
			kSession.insert(com);
			kSession.insert(mo);
			kSession.insert(cable);
			
			kSession.fireAllRules();
			
			System.out.println(com.getProblema());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
