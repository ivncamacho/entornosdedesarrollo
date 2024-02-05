import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int numero = 2;
		
		Usuario[] usuarios = rellenarUsuarios(numero);
		
		for (int i = 0; i < usuarios.length; i++) {
			System.out.println("USUARIO " + (i+1) + "\n--------");
			System.out.println("Nombre : " + usuarios[i].nombre + " " +  usuarios[i].apellidos + " \nEmail: " +usuarios[i].email + "\n");
		}
	}
	public static Usuario[] rellenarUsuarios(int numero) {
		Scanner teclado = new Scanner(System.in);
		Usuario[] usuarios = new Usuario[numero];
		for (int i = 0; i < usuarios.length; i++) {
			Usuario personas = new Usuario();
			System.out.println("Escribe el nombre del usuario nº" +  (i+1));
			personas.nombre = teclado.nextLine();
			System.out.println("Escribe los apellidos del usuario nº" +  (i+1));
			personas.apellidos = teclado.nextLine();
			System.out.println("Escribe el email del usuario nº" +  (i+1));
			personas.email = teclado.nextLine();
			
			usuarios[i] = personas;
		}
		
		return usuarios;
	}
}