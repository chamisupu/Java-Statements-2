import java.util.*;
class Mywork8{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String binary_number = "";
		while(number != 0){
			binary_number = (number%2) + binary_number;
			number /= 2;
		}
				System.out.println(binary_number);
		}
	
}
