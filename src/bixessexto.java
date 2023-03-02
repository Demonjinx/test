import java.time.LocalDate;

public class bixessexto {

	public static void main (String[] args) {
		
		for(int valor = 1900; valor <= 2022; valor++) {
			
			LocalDate data = LocalDate.of(valor, 1 , 1);
			
			if(data.isLeapYear ())
				System.out.println( data.getYear() + "e bissexto)");
		}
	}
}
