import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcademyExcercise9Solution1_7 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		q1(reader);
		q2(reader);
		q3();
		q4(reader);
		q5(reader);
		q6(reader);
		q7(reader);

	}

	private static void q7(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("삭제 위치 : ");
		int deleteNum = Integer.parseInt(reader.readLine());

		int[] randomNum = new int[5];
		System.out.print("원본 : [");
		for(int i=0; i<randomNum.length; i++) {
			randomNum[i]=(int)(Math.random()*10);
			System.out.print(randomNum[i]+", ");
		}
		System.out.println("]");

		if(deleteNum==randomNum.length-1) randomNum[randomNum.length-1]=0;
		else {
			for(int i=deleteNum; i<randomNum.length-1; i++)
				randomNum[i]=randomNum[i+1];
			randomNum[randomNum.length-1]=0;
		}

		System.out.print("결과 : [");
		for(int i=0; i<randomNum.length; i++)
			System.out.print(randomNum[i]+", ");

		System.out.println("]");



	}

	private static void q6(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("삽입 위치 : ");
		int insertNum = Integer.parseInt(reader.readLine());
		System.out.print("값 : ");
		int num = Integer.parseInt(reader.readLine());

		int[] randomNum = new int[10];

		System.out.print("원본 : [");
		for(int i=0; i<randomNum.length; i++) {
			randomNum[i]=(int)(Math.random()*10);
			System.out.print(randomNum[i]+", ");
		}
		System.out.println("]");

		//배열 개수가 1개이거나
		if(insertNum==randomNum.length-1) randomNum[randomNum.length-1]=num;
		else {
			for(int i = randomNum.length-2; i > insertNum; i--)
				randomNum[i+1]=randomNum[i];
			randomNum[insertNum]=num;
		}
		System.out.print("결과 : [");
		for(int i=0; i<randomNum.length; i++)
			System.out.print(randomNum[i]+", ");
		System.out.println("]");

	}


	private static void q5(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("숫자 최소 범위 : ");
		int minNum=Integer.parseInt(reader.readLine());
		System.out.print("숫자 최대 범위 : ");
		int maxNum=Integer.parseInt(reader.readLine());
		System.out.print("입력받을 개수 : ");
		int n=Integer.parseInt(reader.readLine());


		int[] num = new int[n];

		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*(maxNum-minNum+1))+minNum;

			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
		}

		System.out.print("["+num[0]);
		for(int i=1; i<num.length; i++) System.out.print(", "+num[i]);
		System.out.println("]");


	}


	private static void q4(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("최대 범위 : ");
		int maxNum=Integer.parseInt(reader.readLine());
		System.out.print("최소 범위 : ");
		int minNum=Integer.parseInt(reader.readLine());

		int[] randomNum=new int[20];


		for(int i=0; i<randomNum.length; i++)
			randomNum[i]=(int)(Math.random()*20+1);

		System.out.print("원본 : "+randomNum[0]);
		for(int i=1; i<randomNum.length; i++)
			System.out.print(", "+randomNum[i]);
		System.out.println();

		System.out.print("결과 : ");
		for(int i=0; i<randomNum.length; i++) {
			if(randomNum[i] > maxNum) continue;
			if(randomNum[i] < minNum) continue;
			System.out.print(randomNum[i]+", ");
		}



	}

	private static void q3() {

		int[] randomNum = new int[20];

		int max=0;
		int min=0;


		for(int i=0; i<randomNum.length; i++) {
			randomNum[i]=(int)(Math.random()*20+1);
			if(max<randomNum[i]) max = randomNum[i];
			if(min>randomNum[i]) min = randomNum[i];
		}
		System.out.print("원본 : "+randomNum[0]);
		for(int i=1; i<randomNum.length; i++) System.out.printf(", %d",randomNum[i]);
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);



	}

	private static void q2(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("학생 수 : ");
		int StudentNum=Integer.parseInt(reader.readLine());

		String[] name=new String[StudentNum];

		for(int i=0; i<name.length; i++) {
			System.out.print("학생명 : ");
			String inputName = reader.readLine();
			name[i]=inputName;

		}

		int j=1;

		for(int i = name.length-1; i>=0; i--) {

			System.out.printf("%d. %s\n",j,name[i]);
			j++;
		}


	}

	private static void q1(BufferedReader reader) throws NumberFormatException, IOException {

		int[] num = new int[5];

		for(int i = 0; i<5; i++) {
			System.out.print("숫자 : ");
			num[i]=Integer.parseInt(reader.readLine());

		}
		for(int i = num.length-1; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n",i,num[i]);
		}

	}
}
