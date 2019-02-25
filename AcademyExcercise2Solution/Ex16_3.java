import java.io.*;

class Ex16_3 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("너비(cm) : ");
		int width = Integer.parseInt(reader.readLine());
		System.out.print("높이(cm) : ");
		int height = Integer.parseInt(reader.readLine());

		System.out.printf("사각형의 넓이는 %dcm2입니다. 사각형의 둘레는 %dcm입니다.\n",width*height,(width+height)*2);
	}
}
