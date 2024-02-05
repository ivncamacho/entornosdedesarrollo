import java.time.LocalDateTime;

public class Principal{
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		LocalDateTime datetime = fechaHoraActual();
		System.out.println(datetime);
	}
	public static LocalDateTime fechaHoraActual(){
		LocalDateTime datetime = LocalDateTime.now();
		return datetime;
	}
}