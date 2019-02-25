import java.io.*;

class MethodExcercise8 {
	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어 : ");
		int kor = Integer.parseInt(reader.readLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(reader.readLine());
		System.out.print("수학 : ");
		int math = Integer.parseInt(reader.readLine());

		System.out.println(test(kor,eng,math));
	}

	public static String test(int kor, int eng, int math){

		int avg = (kor+eng+math)/3;


		return avg>=60?kor>=40?eng>=40?math>=40?"합격":"불합격":"불합격":"불합격":"불합격";

	}
}
