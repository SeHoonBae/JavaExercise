import java.io.*;

class Ex16_2 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù��° ���� : ");
		int first_num = Integer.parseInt(reader.readLine());
		System.out.print("�ι�° ���� : ");
		int second_num = Integer.parseInt(reader.readLine());
		System.out.printf("%,d + %,d=%,d\n",first_num,second_num,first_num+second_num);
		System.out.printf("%,d - %,d=%,d\n",first_num,second_num,first_num-second_num);
		System.out.printf("%,d * %,d=%,d\n",first_num,second_num,first_num*second_num);
		System.out.printf("%,d / %,d=%,.1f\n",first_num,second_num,(double)first_num/second_num);
		System.out.printf("%,d %% %,d=%,d\n",first_num,second_num,first_num%second_num);


	}
}
