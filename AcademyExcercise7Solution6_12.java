
public class AcademyExcercise7Solution6_12 {
	public static void main(String[] args) {

		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();



	}

	private static void q12() {

		int sum;
		String perfectNum = "";

		for(int i=2; i<100; i++) {
			sum=0;
			for(int j=1; j<i; j++) {
				if(i % j == 0) {
					sum += j;
					perfectNum = perfectNum+j+" ";
				}
			}
			if(i==sum) System.out.printf("%d = [ %s]\n",sum,perfectNum);
			perfectNum="";
		}

	}

	private static void q11() {

		int j;

		for(int i=2; i<100; i++) {
			for(j=2; j<i; j++) {
				if(i % j == 0) break;
			}
			if(j==i) System.out.print(i+" ");
		}

	}

	private static void q10() {

		int cntSum=1;
		int resultSum=2;

		System.out.print("1 + 1");
		for(int i=2; i<100; i += cntSum) {
			cntSum += i;
			resultSum = resultSum + i + cntSum;
			System.out.print(" + "+i);
			if(cntSum<100 ) System.out.print(" + "+cntSum);
			else break;
		} System.out.println(" = "+resultSum);


	}

	private static void q9() {

		int sum=1;
		int cnt=1;

		System.out.print(sum);
		for(int i=2; i<100; i += cnt) {
			sum+=i;
			System.out.print(" + "+i);
			cnt++;
		}
		System.out.println("="+sum);



	}

	private static void q8() {

		int max=10;
		int start=1;
		int sum;

		for(int i=1; i<=10; i++) {
			sum = 0;

			for(int j=start; j<=max*i; j++ ) sum += j;

			System.out.printf("%d ~ %d\t: %7d",start,max,sum);
			System.out.println();
			start += 10;
		}

	}

	private static void q7() {

		int max=10;
		int sum;

		for(int i=1; i<=10; i++) {
			sum=0;
			for(int j=1; j<=max*i; j++) sum += j;
			System.out.printf("1 ~ %d\t:%7d", max, sum);
			System.out.println();

		}

	}

	private static void q6() {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%d x %d = %2d\t",j,i,j*i);
			}System.out.println();

		}
		System.out.println();
		for(int i=1; i<=9; i++) {
			for(int j=6; j<=9; j++) {
				System.out.printf("%d x %d = %2d\t",j,i,j*i);
			}System.out.println();

		}

	}
}
