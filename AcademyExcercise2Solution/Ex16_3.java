import java.io.*;

class Ex16_3 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ʺ�(cm) : ");
		int width = Integer.parseInt(reader.readLine());
		System.out.print("����(cm) : ");
		int height = Integer.parseInt(reader.readLine());

		System.out.printf("�簢���� ���̴� %dcm2�Դϴ�. �簢���� �ѷ��� %dcm�Դϴ�.\n",width*height,(width+height)*2);
	}
}
