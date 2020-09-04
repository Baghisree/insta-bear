/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Main
{
    public static long calcWeekDays1(final LocalDate start,final LocalDate end){
        final DayofWeek startW= start.getDayOfWeek();
        final DayofWeek endW= end.getDayOfWeek();
         final long days =ChronoUnit.Days.between(start,end);
         final long daysWithoutWeekends=days -2 *((days +startW.getValue())/7);
         
         
         return daysWithoutWeekends+(startW == DayofWeek.Sunday?1:0)+(endW == DayofWeek.Sunday?1:0);
         
        
    }
	public static void main(String[] args) throws IOException {
	    final DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd MM YYYY");
	    final BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	    final String firstInput =reader.readLine();
	     final String secondInput =reader.readLine();
	     final LocalDate firstDate=LocalDate.parse(firstInput, formatter);
	     final LocalDate secondDate=LocalDate.parse(secondInput, formatter);
	     final long days =ChronoUnit.DAYS.between(firstDate,secondDate);

		System.out.print(days.calcWeekDays1(firstDate,secondDate));
	}
}
