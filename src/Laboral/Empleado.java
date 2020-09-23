package Laboral;

public class Empleado extends Persona {

	private byte bCategoria;
	public byte bAnyos;

	public Empleado(String sNombre, String sDni, char cSexo, byte bCategoria, byte bAnyos) {
		super(sNombre, sDni, cSexo);
		setbCategoria(bCategoria);
		setbAnyos(bAnyos);

	}

	public Empleado(String sNombre, String sDni, char cSexo) {
		super(sNombre, sDni, cSexo);
		this.bAnyos = 0;
		this.bCategoria = 1;
		// TODO Auto-generated constructor stub
	}

	public boolean setbCategoria(byte bCategoria) {
		boolean bExito = false;
		if (bCategoria >= 1 && bCategoria <= 10) {
			bExito = true;
			this.bCategoria = bCategoria;
		}

		return bExito;
	}

	public byte getbAnyos() {
		return bAnyos;
	}

	public boolean setbAnyos(byte bAnyos) {
		boolean bExito = false;
		if (bAnyos >= 1 && bAnyos <= 70) {
			bExito = true;
			this.bAnyos = bAnyos;
		}

		return bExito;

	}

	public byte getbCategoria() {
		return bCategoria;
	}

	/**
	 * 
	 * @param oEmpleado tipo empleado
	 */
	public void incrAnyo(Empleado oEmpleado) {

		byte bAnyo = (byte) (oEmpleado.getbAnyos() + 1);

		oEmpleado.setbAnyos(bAnyo);

	}
    /**
     * 
     * @param oEmpleado tipo empleado
     * @return
     */
	public String imprimeEmpleado(Empleado oEmpleado) {
		return "  Empleado: \n" + Empleado.super.imprime()
		//
				+ "\n  Sexo: " + Empleado.super.cSexo + "\n  Categoria: " + this.bCategoria + "\n  Anyo: " + this.bAnyos;
	}
}
