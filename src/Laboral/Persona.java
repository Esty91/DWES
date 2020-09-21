package Laboral;

public class Persona {

	public String sNombre;
	public String sDni;
	public char cSexo;

	public Persona(String sNombre, String sDni, char cSexo) {

		this.sNombre = sNombre;
		this.sDni = sDni;
		this.cSexo = cSexo;
	}

	public Persona(String sNombre, char cSexo) {

		this.sNombre = sNombre;
		this.cSexo = cSexo;
	}

	public void setsDni(String sDni) {
		this.sDni = sDni;
	}

	public String imprime() {
		return "  Nombre: "+this.sNombre +"  Dni: "+this.sDni;
	}
}
