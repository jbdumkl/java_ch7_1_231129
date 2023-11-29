package com.mkl.ch7_1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.model = "갤럭시폰";
		dmbCellPhone.color = "검정";
		
		// 부모클래스 선언되어 있는 메소드 호출 가능
		dmbCellPhone.sendVoice("누구세요");
		dmbCellPhone.receiveVoice("여보세요");
		
		CameraCellPhone cameraCellPhone = new CameraCellPhone();
		
		cameraCellPhone.model = "아이폰";
		
		People people = new People("홍길동", "881201-1234567");
		//People people2 = new People();
		
		Student student = new Student("이순신", "891201-1234567");
		
		//student.phone 부모 클래스에서 private 접근 제한자는 불러올 수 없다
		
		Soldier soldier = new Soldier("김유신", "911201-1234567");
		System.out.println("soldier.printName();");
		soldier.printName();
		soldier.name = "강감찬";
		
		people.printName();
		student.printName();
		soldier.printName();
		
		People people1 = new Student("강감찬", "871201-1124567");
		People people2 = new Student("김유신", "901201-1234567");
	}

}
