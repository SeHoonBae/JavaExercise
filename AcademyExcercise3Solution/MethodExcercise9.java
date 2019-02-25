import java.io.*;

class MethodExcercise9 {
	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("역의 개수 : ");
		int station = Integer.parseInt(reader.readLine());
		System.out.print("환승역의 횟수 : ");
		int transfer = Integer.parseInt(reader.readLine());
		System.out.print("평상,출근,퇴근 중 하나를 입력하세요. ");
		String transferTime = reader.readLine();

		System.out.printf("총 소요 시간은 %d분입니다.\n",getTime(station,transfer));

		System.out.println("===추가===");
		System.out.printf("총 소요 시간은 %d분입니다.\n",getTime(station,transfer,transferTime));


	}

	public static int getTime(int station, int transfer){
		int add = station*2 + transfer*3;
		return add;
	}



	public static int getTime(int station, int transfer, String time){

		int transferTime = time.equals("출근")?4:time.equals("퇴근")?5:3;
		int add = station*2 + transfer*transferTime;
		return add;
	}
}
