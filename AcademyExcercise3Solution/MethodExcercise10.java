import java.io.*;

class MethodExcercise10 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("¸¼Àº ³¯ : ");
		int sunny = Integer.parseInt(reader.readLine());
		System.out.print("Èå¸° ³¯ : ");
		int blur = Integer.parseInt(reader.readLine());

		System.out.printf("»ç°ú°¡ ÃÑ %d°³ ¿­·È½À´Ï´Ù.\n",getApple(sunny,blur));

	}

	public static int getApple(int sunny, int blur){
		int sum = 0;
		sum = sunny*5 + blur*2;
		sum = sum>=100?sum-100:0;
		return sum/10;
	}
}
