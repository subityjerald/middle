import java.util.Scanner;
public class MiddleElee {
	public static void main (String args[]) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int number=Keyboard.nextInt();
		int element[]=new int[number];
		System.out.println("enter the  elements:");
		for(int i=0;i<number;i++) {
			element[i]=Keyboard.nextInt();
		}
		for(int i=0;i<number;i++) {
			
				for(int j=i+1;j<number;j++) {
					
				
		if(i%2==0) {			
					int	temp=element[i];
						     element[i]=element[j];
						     element[j]=temp;
		}
		}
		}
		for(int i=0;i<number;i++) {
		System.out.print(element[i]+" ,");
		}
		System.out.println("sorted");
		for(int i=element.length-1;i>=0;i--) {
			
			System.out.print(element[i]+" ,");
			
		}
}
}