package com.bluepartner.model;

public class Resultado {
	boolean valid;
    String  mensaje;
       
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "Reporte [valid=" + valid + ", mensaje=" + mensaje + "]";
	}
    
}