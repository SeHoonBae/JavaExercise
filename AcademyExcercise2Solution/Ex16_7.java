import java.io.*;

class Ex16_7 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int dayNum = Integer.parseInt(reader.readLine());

		String day = dayNum%7==1?"�ݿ���":dayNum%7==2?"�����":dayNum%7==3?"�Ͽ���":dayNum%7==4?"������":dayNum%7==5?"ȭ����":dayNum%7==6?"������":"�����";
		System.out.printf("�Է��� 2019�� 2�� %d���� %s�Դϴ�.\n",dayNum,day);
		//System.out.println(day);
/*
		day%7==1 ��
		day%7==2 ��
		day%7==3 ��
		day%7==4 ��
		day%7==5 ȭ
		day%7==6 ��
		day%7==0 ��
*/
	}
}
