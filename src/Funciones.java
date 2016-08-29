
final public class Funciones {

	public Funciones() {
		// TODO Auto-generated constructor stub
	}

	static boolean comprobarCamposErroneos(String spiritsoulOres, String cristales) {
		boolean error = false;
		/*
		 * shotsCristales shotsSoulOres
		 * 
		 * blessedCristales blessedSpiritOres
		 */

		if (!isNumeric(spiritsoulOres) || !isNumeric(cristales))
			error = true;

		return error;

	}

	public static boolean isNumeric(String str) {
		if (str == "")
			return false;
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}

		try {
			@SuppressWarnings("unused")
			Integer temp = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			return false;
		}

		return true;
	}

	public static Integer calcularShots(String grado, Integer soulOres, Integer Cristales) {
		Integer resultado = null;

		switch (grado) {
			case "S" :
				resultado = (Cristales + (40 * soulOres)) / 350;

				break;
			case "A" :
				resultado = (Cristales + (36 * soulOres)) / 300;

				break;
			case "B" :
				resultado = (Cristales + (54 * soulOres)) / 450;

				break;

		}
		return resultado;
	}

	public static Integer calcularBlesseds(String grado, Integer spiritOres, Integer Cristales) {
		Integer resultado = null;

		switch (grado) {
			case "S" :
				resultado = ((Cristales * 2) + (50 * spiritOres)) / 200;

				break;
			case "A" :
				resultado = ((Cristales * 2) + (70 * spiritOres)) / 200;

				break;
			case "B" :
				resultado = ((Cristales * 2) + (16 * spiritOres)) / 100;

				break;
		}
		return resultado;
	}
}
