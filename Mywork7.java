import java.util.*;
class Mywork7{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		while(start <= end){
			if (start%2 == 1) {
				System.out.println(start);
			}
			start++;
		}
	}
}
