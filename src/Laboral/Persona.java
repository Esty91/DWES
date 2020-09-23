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

	public void setsNombre(String sNombre) {
		if (sNombre != null && sNombre.length() > 1 && sNombre.length() <= 40) {
			this.sNombre = sNombre;
		}

	}

	public void setcSexo(char cSexo) {
		if (cSexo != 0 && cSexo >=1 && cSexo <=2) {
			this.cSexo = cSexo;
		}

	}

	public boolean setsDni(String sDni) {
		boolean bExito = false;
		if (sDni != null && sDni.length() == 9) {
			bExito = true;
			this.sDni = sDni;
		}

		return bExito;
	}

	public String imprime() {
		return "  Nombre: " + this.sNombre + "  Dni: " + this.sDni;
	}
}
