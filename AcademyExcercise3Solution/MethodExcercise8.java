import java.io.*;

class MethodExcercise8 {
	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� : ");
		int kor = Integer.parseInt(reader.readLine());
		System.out.print("���� : ");
		int eng = Integer.parseInt(reader.readLine());
		System.out.print("���� : ");
		int math = Integer.parseInt(reader.readLine());

		System.out.println(test(kor,eng,math));
	}

	public static String test(int kor, int eng, int math){

		int avg = (kor+eng+math)/3;


		return avg>=60?kor>=40?eng>=40?math>=40?"�հ�":"���հ�":"���հ�":"���հ�":"���հ�";

	}
}
