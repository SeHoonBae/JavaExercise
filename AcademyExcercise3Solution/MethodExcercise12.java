class MethodExcercise12 {
	public static void main(String[] args) {

		position("ȫ�浿");
		line();
		position("ȫ�浿","���缮");
		line();
		position("ȫ�浿","���缮","�ڸ��");
		line();
		position("ȫ�浿","���缮","�ڸ��","������");

	}

	public static void position(String name1){
		System.out.printf("��� : %s\n",name1);
	}

	public static void position(String name1,String name2){
		System.out.printf("��� : %s\n",name1);
		System.out.printf("�븮 : %s\n",name2);
	}

	public static void position(String name1,String name2,String name3){
		System.out.printf("��� : %s\n",name1);
		System.out.printf("�븮 : %s\n",name2);
		System.out.printf("���� : %s\n",name3);
	}

	public static void position(String name1,String name2,String name3,String name4){
		System.out.printf("��� : %s\n",name1);
		System.out.printf("�븮 : %s\n",name2);
		System.out.printf("���� : %s\n",name3);
		System.out.printf("���� : %s\n",name4);
	}

	public static void line(){
		System.out.println("==========");
	}
}
