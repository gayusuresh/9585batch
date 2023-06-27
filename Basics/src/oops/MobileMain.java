package oops;

public class MobileMain {

	public static void main(String[] args) {
		Mobile samsung=new Mobile();//
		samsung.ram=4;
		samsung.rom=32;
		samsung.color="white";
		samsung.processor="intel";
		System.out.println("Samsung Ram=:"+samsung.ram);
		System.out.println("Samsung Rom=:"+samsung.rom);
		System.out.println("Samsung color=:"+samsung.color);
		System.out.println("Samsung processor=:"+samsung.processor);
		samsung.communication();
       System.out.println("===============================");
       Mobile honor=new Mobile();//
       honor.ram=8;
       honor.rom=64;
       honor.color="blue";
       honor.processor="i3";
		System.out.println("honor Ram=:"+honor.ram);
		System.out.println("honor Rom=:"+honor.rom);
		System.out.println("honor color=:"+honor.color);
		System.out.println("honor processor=:"+honor.processor);
		honor.communication();
	}

}
