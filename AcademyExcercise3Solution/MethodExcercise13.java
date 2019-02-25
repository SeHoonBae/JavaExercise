class MethodExcercise13 {
	public static void main(String[] args) {
		System.out.printf("양수 : %d개\n",positive(10));
		System.out.printf("양수 : %d개\n",positive(10,20));
		System.out.printf("양수 : %d개\n",positive(10,20,-30));
		System.out.printf("양수 : %d개\n",positive(10,20,-30,40));
		System.out.printf("양수 : %d개\n",positive(10,20,-30,40,50));
	}

	public static int positive(int a){
		int result =0;
		result=a>0?++result:result;
		return result;
	}

	public static int positive(int a,int b){
		int result =0;
		result=a>0?++result:result;
		result=b>0?++result:result;
		return result;
	}

	public static int positive(int a,int b,int c){
		int result =0;
		result=a>0?++result:result;
		result=b>0?++result:result;
		result=c>0?++result:result;
		return result;
	}

	public static int positive(int a,int b,int c,int d){
		int result =0;
		result=a>0?++result:result;
		result=b>0?++result:result;
		result=c>0?++result:result;
		result=d>0?++result:result;
		return result;
	}

	public static int positive(int a,int b,int c,int d,int e){
		int result =0;
		result=a>0?++result:result;
		result=b>0?++result:result;
		result=c>0?++result:result;
		result=d>0?++result:result;
		result=e>0?++result:result;
		return result;
	}
}
