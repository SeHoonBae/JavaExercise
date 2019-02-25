import java.io.*;

class Ex16_2 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 숫자 : ");
		int first_num = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		int second_num = Integer.parseInt(reader.readLine());
		System.out.printf("%,d + %,d=%,d\n",first_num,second_num,first_num+second_num);
		System.out.printf("%,d - %,d=%,d\n",first_num,second_num,first_num-second_num);
		System.out.printf("%,d * %,d=%,d\n",first_num,second_num,first_num*second_num);
		System.out.printf("%,d / %,d=%,.1f\n",first_num,second_num,(double)first_num/second_num);
		System.out.printf("%,d %% %,d=%,d\n",first_num,second_num,first_num%second_num);


	}
}
