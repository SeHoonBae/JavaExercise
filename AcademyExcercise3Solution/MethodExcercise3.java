import java.io.*;

class MethodExcercise3 {
	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° ���� : ");
		int n1 = Integer.parseInt(reader.readLine());
		System.out.print("�ι�° ���� : ");
		int n2 = Integer.parseInt(reader.readLine());

		add(n1,n2);
		add(n1,n1);

		subtract(n1, n2);

		multiply(n1,n2);
		multiply(n1,n1);

		divide(n1, n2);

		mod(n1, n2);
	}

	public static void add (int n1, int n2){
		System.out.printf("%d+%d=%d\n",n1,n2,n1+n2);
	}

	public static void subtract(int n1, int n2){
		System.out.printf("%d-%d=%d\n",n1,n2,n1-n2);
	}

	public static void multiply(int n1, int n2){
		System.out.printf("%d*%d=%d\n",n1,n2,n1*n2);
	}

	public static void divide(int n1, int n2){
		System.out.printf("%d/%d=%d\n",n1,n2,n1/n2);
	}

	public static void mod(int n1, int n2){
		System.out.printf("%d%%%d=%d\n",n1,n2,n1%n2);
	}
}
