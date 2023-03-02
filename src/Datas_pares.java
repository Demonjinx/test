import java.time.LocalDate;

public class Datas_pares {
	
	public static void main (String [] args) {
		
		LocalDate date = LocalDate.of(2022,1, 1 );
		
		for(int valor= 1;valor<365; valor++ ) {
			LocalDate d = date.plusDays(valor);
			if(d.getDayOfMonth() % 2 == 0)
				System.out.println(d);
		}
	}
	
}
