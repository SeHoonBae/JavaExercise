import java.io.*;

class MethodExcercise7 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� : ");
		int num = Integer.parseInt(reader.readLine());

		System.out.printf("�Է��Ͻ� ���� \'%d\'��(��) \'%s\'�Դϴ�.\n",num,getNumber(num));
	}

	public static String getNumber(int num){

		return num%2==0?"¦��":"Ȧ��";
	}
}
