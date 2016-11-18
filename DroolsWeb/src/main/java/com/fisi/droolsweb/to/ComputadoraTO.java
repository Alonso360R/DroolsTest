package com.fisi.droolsweb.to;

public class ComputadoraTO {

	private String problema;
	private boolean enciende;
	private MonitorTO monitor;

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public MonitorTO getMonitor() {
		return monitor;
	}

	public void setMonitor(MonitorTO monitor) {
		this.monitor = monitor;
	}

	public boolean isEnciende() {
		return enciende;
	}

	public void setEnciende(boolean enciende) {
		this.enciende = enciende;
	}

}
