import java.util.Date;

class MethodExcercise4 {
	public static void main(String[] args) {

		nowTime();

	}

	public static void nowTime(){
		Date now = new Date();
		int hour = now.getHours()>12?now.getHours()-12:now.getHours();
		String hourHangul = now.getHours()>12?"오후:":"오전";
		System.out.printf("%s%d시 %d분 %d초\n", hourHangul,hour, now.getMinutes(), now.getSeconds());
	}
}
