import java.io.*;

class Ex16_6 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù��° ���� : ");
		int firstNum=Integer.parseInt(reader.readLine());
		System.out.print("��.��° ���� : ");
		int secondNum=Integer.parseInt(reader.readLine());
		System.out.printf("%d��(��) %d�� �� ū ���ڴ� %d�Դϴ�.\n",firstNum,secondNum,firstNum>secondNum?firstNum:secondNum);
		int thirdNum=Integer.parseInt(reader.readLine());
		System.out.printf("%d��(��) %d,%d�� �� ū ���ڴ� %d�Դϴ�.\n",firstNum,secondNum,thirdNum,firstNum>secondNum?firstNum>thirdNum?firstNum:thirdNum:secondNum>thirdNum?secondNum:thirdNum);
	}
}
