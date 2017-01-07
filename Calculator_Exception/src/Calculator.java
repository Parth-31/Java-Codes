
public class Calculator {
	public static void main(String[] args){
		float sum = 0;
		for(int i = 0; i< args.length; i++){
			
			try{
			sum += Float.parseFloat(args[i]);
			}catch(NumberFormatException e){
			System.out.println(args[i] + " is not a valid number!");	
			}
			}
		System.out.println("Sum: " + sum);
	}

}
