package Laboral;

public class Nomina {

	private static final int SUELDO_BASE[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };

	public static float sueldo(Empleado oEmpleado) {
		byte bCategoria = oEmpleado.getbCategoria();
		byte bAnyo = oEmpleado.getbAnyos();
		float fSueldo = SUELDO_BASE[bCategoria - 1] + bAnyo * 5000;

		return fSueldo;

	}
}
