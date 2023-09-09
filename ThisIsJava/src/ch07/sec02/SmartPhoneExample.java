package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("누구세요");
		myPhone.receiveVoice("저는 졸린데여");
		myPhone.sendVoice("네 저도요");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
