import java.io.*;

class Ex16_7 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int dayNum = Integer.parseInt(reader.readLine());

		String day = dayNum%7==1?"금요일":dayNum%7==2?"토요일":dayNum%7==3?"일요일":dayNum%7==4?"월요일":dayNum%7==5?"화요일":dayNum%7==6?"수요일":"목요일";
		System.out.printf("입력한 2019년 2월 %d일은 %s입니다.\n",dayNum,day);
		//System.out.println(day);
/*
		day%7==1 금
		day%7==2 토
		day%7==3 일
		day%7==4 월
		day%7==5 화
		day%7==6 수
		day%7==0 목
*/
	}
}
