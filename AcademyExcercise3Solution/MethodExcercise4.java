import java.util.Date;

class MethodExcercise4 {
	public static void main(String[] args) {

		nowTime();

	}

	public static void nowTime(){
		Date now = new Date();
		int hour = now.getHours()>12?now.getHours()-12:now.getHours();
		String hourHangul = now.getHours()>12?"����:":"����";
		System.out.printf("%s%d�� %d�� %d��\n", hourHangul,hour, now.getMinutes(), now.getSeconds());
	}
}
