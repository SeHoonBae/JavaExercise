import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcademyExcercise8Solution1_9 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		q1(reader);
		q2(reader);
		q3(reader);
		q4(reader);
		q5(reader);
		q6();
		q7(reader);
		q8();
		q9(reader);

	}



	// 주민번호 유효숫자검사 월(12) 일(1~31) (남1,3여2,4) 마지막 유효성번호
	//1. 2 3 4 5 6 7 8 9 2 3 4 5를 각 곱함
	//2. 계산 값을 다 더함
	//3. 11로 나눔 몫은버리고 나머지취함
	//4. 11 - 나머지 = 유효성번호가되야함
	//5. 11 - 나머지가 10 ,11일 경우 10의 자리 버림 0,1

	private static void q9(BufferedReader reader) throws IOException {

		System.out.print("주민등록번호 : ");
		String jumin=reader.readLine();
		if(jumin.length()==14 && jumin.charAt(6)=='-') {

			int valid = conversion(jumin,0,1)*2
						+ conversion(jumin,1,2)*3
						+ conversion(jumin,2,3)*4
						+ conversion(jumin,3,4)*5
						+ conversion(jumin,4,5)*6
						+ conversion(jumin,5,6)*7
						+ conversion(jumin,7,8)*8
						+ conversion(jumin,8,9)*9
						+ conversion(jumin,9,10)*2
						+ conversion(jumin,10,11)*3
						+ conversion(jumin,11,12)*4
						+ conversion(jumin,12,13)*5;

			valid=(11-(valid%11))%10;

			if( conversion(jumin,2,4) > 12 || conversion(jumin,4,6) > 31 || conversion(jumin,13,14) != valid ){
				System.out.println("잘못된 주민번호입니다. 주민번호를 다시 입력하세요.");
			}else System.out.printf("주민번호는 %s 입니다.\n", jumin);

		}else System.out.println("잘못된 주민번호입니다. 주민번호를 다시 입력하세요.");

	}

	private static int conversion(String jumin,int start, int end) { // 문자열을 숫자로 변환시키기 위한 메소드

		return Integer.parseInt(jumin.substring(start, end));
	}

	private static void q8() {
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int i=0;
		int cnt=0;

		while(true) {
			if(content.indexOf(word,i) != -1) {
				cnt++;
				i=content.indexOf(word,i)+word.length();
			} else break;
		}
		System.out.printf(" \'%s\'을 총 %d회 발견했습니다.\n",word,cnt);

	}

	private static void q7(BufferedReader reader) throws IOException {

		System.out.print("단어 : ");
		String word=reader.readLine();
		String divideWord = "";
		int start=0;

		for(int i=1; i<word.length(); i++) {
			if(word.charAt(i)>=65 && word.charAt(i)<=90 ) {
				divideWord+=word.substring(start,i)+" ";
				start = i;
			}
		}
		System.out.println("결과 : "+divideWord+word.substring(start,word.length()));

	}

	private static void q6() {

		String original = "\"   하나   둘   셋   \"";
		System.out.println("원본 문자열 : "+original);

		String one = original.substring(0,original.indexOf("나")+1);
		String two = original.substring(original.indexOf("나")+1,original.indexOf("셋"));
		String three = original.substring(original.indexOf("셋"), original.length());

		System.out.println("결과 문자열 : "+one+two.trim()+three);


	}

	private static void q5(BufferedReader reader) throws IOException {

		System.out.print("숫자 : ");
		String num=reader.readLine();


		if(num.length()>3) {
			if(num.length()%3==1) {
				System.out.printf("결과 : %s",num.substring(0,1));
				for(int i=1; i<num.length(); i+=3)
					System.out.printf(",%s",num.substring(i, i+3));
			}
			else if(num.length()%3==2) {
				System.out.printf("결과 : %s",num.substring(0,2));
				for(int i=2; i<num.length(); i+=3)
					System.out.printf(",%s",num.substring(i, i+3));
			}
			else if(num.length()%3==0) {
				System.out.printf("결과 : %s",num.substring(0,3));
				for(int i=3; i<num.length(); i+=3)
					System.out.printf(",%s",num.substring(i, i+3));
			}
		}
		else System.out.println("결과 : "+num);

	}

	private static void q4(BufferedReader reader) throws Exception {

		int gifNum=0;
		int jpgNum=0;
		int pngNum=0;
		int hwpNum=0;
		int docNum=0;

		for(int i=0; i<10; i++) {

			System.out.print("파일명 : ");
			String fileName=reader.readLine();

			int fileExtensionSplit = fileName.indexOf(".");
			String e = fileName.substring(fileExtensionSplit+1, fileName.length());

			if(e.equals("gif")) gifNum++;
			else if(e.equals("jpg")) jpgNum++;
			else if(e.equals("png")) pngNum++;
			else if(e.equals("hwp")) hwpNum++;
			else if(e.equals("doc")) docNum++;

		}
		System.out.printf("gif : %d개\n",gifNum);
		System.out.printf("jpg : %d개\n",jpgNum);
		System.out.printf("png : %d개\n",pngNum);
		System.out.printf("hwp : %d개\n",hwpNum);
		System.out.printf("doc : %d개\n",docNum);


	}

	private static void q3(BufferedReader reader) throws IOException {

		System.out.print("숫자 : ");
		String num = reader.readLine();

		int sum=Integer.parseInt(num.substring(0,1));
		int txtNum;

		System.out.printf("결과 : %d",Integer.parseInt(num.substring(0,1)));

		for(int i=1; i<num.length(); i++) {
			txtNum=Integer.parseInt(num.substring(i,i+1));
			sum+=txtNum;
			System.out.printf(" + %d",Integer.parseInt(num.substring(i,i+1)));
		}

		System.out.println(" = "+sum);


	}

	private static void q2(BufferedReader reader) throws IOException {

		System.out.print("이메일 : ");
		String email = reader.readLine();


		int specialtxt = email.indexOf("@");

		String id=email.substring(0,specialtxt);
		String domain=email.substring(specialtxt+1,email.length());


		System.out.printf("아이디 : %s\n",id);
		System.out.printf("도메일 : %s\n",domain);



	}

	private static void q1(BufferedReader reader) throws IOException {

		System.out.print("문장 입력 : ");
		String txt = reader.readLine();
		String conversionTxt="";


		for(int i=txt.length()-1; i>=0; i--) {
			conversionTxt+=txt.charAt(i);
		}
		System.out.printf("역순 결과 : %s\n",conversionTxt);


	}
}

