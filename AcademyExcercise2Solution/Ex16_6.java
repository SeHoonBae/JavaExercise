import java.io.*;

class Ex16_6 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 숫자 : ");
		int firstNum=Integer.parseInt(reader.readLine());
		System.out.print("두.번째 숫자 : ");
		int secondNum=Integer.parseInt(reader.readLine());
		System.out.printf("%d과(와) %d중 더 큰 숫자는 %d입니다.\n",firstNum,secondNum,firstNum>secondNum?firstNum:secondNum);
		int thirdNum=Integer.parseInt(reader.readLine());
		System.out.printf("%d과(와) %d,%d중 더 큰 숫자는 %d입니다.\n",firstNum,secondNum,thirdNum,firstNum>secondNum?firstNum>thirdNum?firstNum:thirdNum:secondNum>thirdNum?secondNum:thirdNum);
	}
}
