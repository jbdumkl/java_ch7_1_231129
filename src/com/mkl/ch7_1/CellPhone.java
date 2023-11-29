package com.mkl.ch7_1;

// 부모 클래스
public class CellPhone {
	// 필드
	String model;
	String color;
	String cType;
	int channel;// dmb 채널
	
	// 메소드
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
	public void sendVoice(String message) {
		System.out.println("나:" + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방:" + message);
	}
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	public void turnOnDmb() {
		System.out.println("Dmb 방송 수신을 시작합니다.");
	}
	public void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 종료합니다.");
	}
	public void dmbChannel(int channel) {
		System.out.println("Dmb 채널 수신을 시작합니다.");
	}
}
