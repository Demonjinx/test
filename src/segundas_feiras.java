import java.time.LocalDate;
import java.time.DayOfWeek;

public class segundas_feiras {
	
	public static void main (String[] args) {
		
		LocalDate data = LocalDate.of(2022, 1, 1);
		
		for(int valor =1; valor<365; valor++) {
			LocalDate d = data.plusDays(valor);
			if( d.getDayOfWeek() == DayOfWeek.MONDAY )
				System.out.println( d + "="+ d.getDayOfWeek());
			
		}
	}

}
