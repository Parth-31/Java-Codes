import java.util.*;

public class Clock {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		
		

	}

}
