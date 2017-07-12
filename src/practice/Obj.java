package practice;

public class Obj {
	int a=15;
	int b=8;
	Obj(int c){
		System.out.println("from c"+c);
	}
	 public static void  main(String[] arg) {
		Obj obj = new Obj(10);
		Obj obj1 = new Obj(20);
		System.out.println(obj);
		System.out.println(obj1.a);
	}
}
