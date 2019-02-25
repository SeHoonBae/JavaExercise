import java.io.*;

class MethodExcercise5 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("¿Ã∏ß : ");
		String fullName = reader.readLine();

		String name=getName(fullName);
		System.out.println(name);
	}

	public static String getName(String name){
		return name+"¥‘";
	}
}
