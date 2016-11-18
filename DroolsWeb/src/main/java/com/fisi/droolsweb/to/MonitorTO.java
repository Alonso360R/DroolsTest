package com.fisi.droolsweb.to;

public class MonitorTO {

	public enum Calidad {
		RAYAS, DISTORSIONADO, MANCHAS
	}

	private boolean enciende;
	private boolean conectado;
	private boolean fuenteFunciona;
	private boolean muestraImagen;
	private Calidad calidadImagen;
	private CableVgaTO cableVGA;

	public boolean isEnciende() {
		return enciende;
	}

	public void setEnciende(boolean enciende) {
		this.enciende = enciende;
	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

	public boolean isFuenteFunciona() {
		return fuenteFunciona;
	}

	public void setFuenteFunciona(boolean fuenteFunciona) {
		this.fuenteFunciona = fuenteFunciona;
	}

	public boolean isMuestraImagen() {
		return muestraImagen;
	}

	public void setMuestraImagen(boolean muestraImagen) {
		this.muestraImagen = muestraImagen;
	}

	public CableVgaTO getCableVGA() {
		return cableVGA;
	}

	public void setCableVGA(CableVgaTO cableVGA) {
		this.cableVGA = cableVGA;
	}

	public Calidad getCalidadImagen() {
		return calidadImagen;
	}

	public void setCalidadImagen(Calidad calidadImagen) {
		this.calidadImagen = calidadImagen;
	}

}
