class MethodExcercise11 {
	public static void main(String[] args) {
		sum(10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
		sum(10,20,30,40,50);

	}

	public static void sum(int num1){
		System.out.printf("%d\n",num1);
	}

	public static void sum(int num1,int num2){
		System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
	}

	public static void sum(int num1, int num2, int num3){
		System.out.printf("%d+%d+%d=%d\n",num1,num2,num3,num1+num2+num3);
	}

	public static void sum(int num1,int num2,int num3,int num4){
		System.out.printf("%d+%d+%d+%d=%d\n",num1,num2,num3,num4,num1+num2+num3+num4);
	}

	public static void sum(int num1,int num2,int num3,int num4,int num5){
		System.out.printf("%d+%d+%d+%d+%d=%d\n",num1,num2,num3,num4,num5,num1+num2+num3+num4+num5);
	}
}
