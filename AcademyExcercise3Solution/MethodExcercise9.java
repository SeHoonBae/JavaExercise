import java.io.*;

class MethodExcercise9 {
	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� ���� : ");
		int station = Integer.parseInt(reader.readLine());
		System.out.print("ȯ�¿��� Ƚ�� : ");
		int transfer = Integer.parseInt(reader.readLine());
		System.out.print("���,���,��� �� �ϳ��� �Է��ϼ���. ");
		String transferTime = reader.readLine();

		System.out.printf("�� �ҿ� �ð��� %d���Դϴ�.\n",getTime(station,transfer));

		System.out.println("===�߰�===");
		System.out.printf("�� �ҿ� �ð��� %d���Դϴ�.\n",getTime(station,transfer,transferTime));


	}

	public static int getTime(int station, int transfer){
		int add = station*2 + transfer*3;
		return add;
	}



	public static int getTime(int station, int transfer, String time){

		int transferTime = time.equals("���")?4:time.equals("���")?5:3;
		int add = station*2 + transfer*transferTime;
		return add;
	}
}
