import Laboral.Empleado;
import Laboral.Nomina;
import Laboral.Validaciones;

public class CalculaNominas {

	public static void main(String[] args) {
		/*
		 * Se desea desarrollar una aplicaci�n en Java para controlar las n�minas de los
		 * empleados de una empresa. Para ello, debes realizar los siguientes apartados
		 * (en principio, no se suponen errores en los datos de entrada):
		 * 
		 * 
		 * 
		 * 1. Definir la clase p�blica Persona que pertenece al paquete Laboral.
		 * 
		 * 
		 * 
		 * 1.1. Los atributos que definen una Persona son: un nombre (cadena), un dni
		 * (cadena) y un sexo (car�cter). Los atributos son p�blicos.
		 * 
		 * 1.2. La clase tiene dos constructores, uno con los tres atributos de la
		 * Persona, y otro con s�lo el nombre y el sexo.
		 * 
		 * 1.3. Tendr� dos m�todos p�blicos: 1.3.1. setDni para modificar el valor del
		 * dni de una persona. 1.3.2. Imprime que presenta por pantalla el nombre y el
		 * dni.
		 * 
		 * 2. Definir la clase Empleado que extiende a Persona y que tiene:
		 * 
		 * 2.1. Dos nuevos atributos: categoria (atributo privado) debe ser una valor
		 * positivo entre 1 y 10; y a�os (anyos) trabajados (atributo p�blico) que debe
		 * ser positivo.
		 * 
		 * 2.2. Dos constructores: uno que recibe todos los valores de sus atributos y
		 * otro que solo recibe el nombre, sexo y dni. En este caso, se entiende que la
		 * categor�a es 1 y el n�mero de a�os trabajados es 0. 2.3. Los siguientes
		 * m�todos p�blicos:
		 * 
		 * 2.3.1. setCategoria que sirve para cambiar de categor�a de un empleado, que
		 * recibe como par�metro de entrada.
		 * 
		 * 2.3.2. getCategoria que devuelve el valor del atributo categoria.
		 * 
		 * 
		 * 2.3.3. incrAnyo que incrementa en uno el n�mero de a�os trabajados.
		 * 
		 * 
		 * 2.3.4. imprime que presenta todos los datos del empleado.
		 * 
		 * 
		 * 3. La siguiente tabla contiene los sueldos base de cada Empleado, de acuerdo
		 * con su categor�a. Siendo 50000 para la categor�a 1 e increment�ndose en 20000
		 * para cada nueva categor�a. Esta tabla debe definirse en una nueva clase de
		 * nombre Nomina: private static final int SUELDO_BASE[] = {50000, 70000, 90000,
		 * 110000, 130000, 150000, 170000, 190000, 210000, 230000}
		 * 
		 * 
		 * 3.1. La clase es una biblioteca y tiene un m�todo sueldo que recibe un
		 * Empleado y devuelve su sueldo obtenido como resultado de evaluar la
		 * expresi�n: sueldo = sueldoBase + 5000*a�os trabajados
		 * 
		 * 4. Crear la clase CalculaNominas con un programa principal que:
		 * 
		 * 
		 * 4.1. Cree el empleado: �James Cosling�, dni=32000032G, sexo=�M�, categor�a=4,
		 * a�os=7 4.2. Cree el empleado: �Ada Lovelace�, dni=32000031R, sexo=�F�
		 * 
		 * 
		 * 4.3. Declare un m�todo privado escribe que reciba los valores de los dos
		 * empleados e imprima sus atributos y el sueldo que cada uno gana.
		 * 
		 * 
		 * 4.4. Haga una llamada en el programa principal a ese m�todo.
		 * 
		 * 4.5. Incremente los a�os trabajados del segundo empleado y haga que la
		 * categor�a del primero sea 9.
		 * 
		 * 4.6. Imprima de nuevo ambos empleados y su sueldo.
		 * 
		 * 5. Modificar el c�digo para comprobar que los datos que se pasan son
		 * correctos cuando se crea un nuevo Empleado y en caso contrario se eleve la
		 * excepci�n DatosNoCorrectosException.
		 * 
		 * Declara un manejador de excepciones que cuando se produzca dicha excepci�n,
		 * emita el mensaje �Datos no correctos�, y termine la ejecuci�n. Modifica el
		 * programa principal para que pueda elevarse esta excepci�n. Deber�s controlar
		 * las excepciones del sistema, as� como documenta convenientemente el c�digo
		 * generando el Javadoc.
		 */
		String sNombre1 = null;
		String sDni1 = null;
		char cSexo1 = 0;

		byte bCategoria = 0;
		byte bAnyos = 0;
		boolean bError = true;

		String sNombre2 = null;
		String sDni2 = null;
		char cSexo2 = 0;

		do {

			try {
				sNombre1 = Validaciones.leer("Introduce nombre");
				if (sNombre1 != null && sNombre1.length() > 1 && sNombre1.length() <= 40) {
					bError = false;
				} else {
					System.out.println("Datos no correctos.");
				}
			} catch (NumberFormatException e) {
				if (sNombre1 == null || sNombre1.length() <= 1 || sNombre1.length() > 40) {
					System.out.println("Datos no correctos.");
				}
			} catch (Exception e) {
				System.out.println("Datos no correctos.");
			}
		} while (bError);

		do {
			try {
				sDni1 = Validaciones.leer("Introduce DNI");
				if (sDni1 != null && sDni1.length() == 9) {
					bError = false;
				} else {
					System.out.println("Datos no correctos.");
				}
			} catch (NumberFormatException e) {
				if (sDni1 == null || sDni1.length() != 9) {
					System.out.println("Datos no correctos.");
				}
			} catch (Exception e) {
				System.out.println("Datos no correctos.");
			}
		} while (bError);

		byte bOption = (byte) Validaciones.valida("Introduce sexo"
				//
				+ "\nHOMBRE: (1)"
				//
				+ "\nMUJER: (2)", 1, 2, 3);

		if (bOption == 1) {
			cSexo1 = 'H';
		} else if (bOption == 2) {
			cSexo1 = 'M';
		}

		do {
			try {
				bCategoria = (byte) Validaciones.valida("Introduce categoria", 1, 10, 3);
				if (bCategoria >= 1 && bCategoria <= 10) {
					bError = false;
				} else {
					System.out.println("Datos no correctos.");
				}
			} catch (NumberFormatException e) {
				if (bCategoria < 1 || bCategoria > 10) {
					System.out.println("Datos no correctos.");
				}

			} catch (Exception e) {
				bCategoria = 1;
				System.out.println("Datos no correctos.");
			}
		} while (bError);

		do {
			try {

				bAnyos = (byte) Validaciones.valida("Introduce anyos", 1, 70, 3);
				if (bAnyos >= 1 && sNombre1.length() <= 80) {
					bError = false;
				} else {
					System.out.println("Datos no correctos.");
				}
			} catch (NumberFormatException e) {
				if (bAnyos < 1 || bAnyos > 80) {
					System.out.println("Datos no correctos.");
				}

			} catch (Exception e) {
				System.out.println("Datos no correctos.");
			}
		} while (bError);

		do {

			try {
				sNombre1 = Validaciones.leer("Introduce nombre");
				if (sNombre1 != null && sNombre1.length() > 1 && sNombre1.length() <= 40) {
					bError = false;
				} else {
					System.out.println("Datos no correctos.");
				}
			} catch (NumberFormatException e) {
				if (sNombre1 == null || sNombre1.length() <= 1 || sNombre1.length() > 40) {
					System.out.println("Datos no correctos.");
				}
			} catch (Exception e) {
				System.out.println("Datos no correctos.");
			}
		} while (bError);

		do {

			try {
				sNombre2 = Validaciones.leer("Introduce nombre segundo empleado");
				if (sNombre2 != null && sNombre2.length() > 1 && sNombre2.length() <= 40) {
					bError = false;
				} else {
					System.out.println("Datos no correctos.");
				}
			} catch (NumberFormatException e) {
				if (sNombre2 == null || sNombre2.length() <= 1 || sNombre2.length() > 40) {
					System.out.println("Datos no correctos.");
				}
			} catch (Exception e) {
				System.out.println("Datos no correctos.");
			}
		} while (bError);

		do {
			try {
				sDni2 = Validaciones.leer("Introduce DNI segundo empleado");
				if (sDni2 != null && sDni2.length() == 9) {
					bError = false;
				} else {
					System.out.println("Datos no correctos.");
				}
			} catch (NumberFormatException e) {
				if (sDni2 == null || sDni2.length() != 9) {
					System.out.println("Datos no correctos.");
				}
			} catch (Exception e) {
				System.out.println("Datos no correctos.");
			}
		} while (bError);

		byte bOption2 = (byte) Validaciones.valida("Introduce sexo segundo empleado"
				//
				+ "\nHOMBRE: (1)"
				//
				+ "\nMUJER: (2)", 1, 2, 3);

		if (bOption2 == 1) {
			cSexo1 = 'H';
		} else if (bOption2 == 2) {
			cSexo1 = 'M';
		}

		Empleado oEmp1 = new Empleado(sNombre1, sDni1, cSexo1, bCategoria, bAnyos);

		Empleado oEmp2 = new Empleado(sNombre2, sDni2, cSexo2);
		escribe(oEmp1, oEmp2);

		oEmp2.setbAnyos((byte) 2);
		oEmp1.setbCategoria((byte) 9);
		escribe(oEmp1, oEmp2);

	}

	/**
	 * 
	 * @param oEmp1 tipo empleado
	 * @param oEmp2
	 */
	private static void escribe(Empleado oEmp1, Empleado oEmp2) {
		System.out.println(oEmp1.imprimeEmpleado(oEmp1));
		System.out.println(Nomina.sueldo(oEmp1));
		System.out.println(oEmp2.imprimeEmpleado(oEmp2));
		System.out.println(Nomina.sueldo(oEmp2));
	}
}
