import java.io.*;
import java.lang.*;

class MethodExcercise2 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� �Է� : ");
		int number = Integer.parseInt(reader.readLine());
		digit(number);
		System.out.print("���� �Է� : ");
		number = Integer.parseInt(reader.readLine());
		digit(number);
		System.out.print("���� �Է� : ");
		number = Integer.parseInt(reader.readLine());
		digit(number);
		System.out.print("���� �Է� : ");
		number = Integer.parseInt(reader.readLine());
		digit(number);
	}


	public static void digit(int number) throws Exception{

		String numberDigit = number>=1000 ? ""+number : number>=100 ? "0"+number : number>=10 ? "00"+number : "000"+number;
		System.out.printf("%d -> %s\n",number,numberDigit);
	}
}
