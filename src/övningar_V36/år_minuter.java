package övningar_V36;

import java.util.Scanner;

public class år_minuter {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner ( System.in);
		
	
	int	min = input.nextInt();
		
time(min);
		
input.close();
	}public static void time (int totalmin ) {
		
		
	int hour = 0 ;
	int  min =0 ;
hour = totalmin / 60 ;
	if ( totalmin >= 60 ) {
		
	min = totalmin % 60 ;
		
	}else {
		min = totalmin ;
	
	}
	
	int day = totalmin / 1440 ;
	if ( totalmin >= 1440 ) {
		hour = totalmin % 1440 ;
		
		}else {
			hour = totalmin ;
		
		}
	
	
	int år = totalmin / (1440*365) ;
	
	
	
	
	System.out.printf("år %d day %d hour %d min %d",år,day,hour,min);
	}

}
