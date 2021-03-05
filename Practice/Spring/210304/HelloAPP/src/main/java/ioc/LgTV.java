package ioc;

public class LgTV implements TV {

	private AppleSpeaker speaker;
	private int price;

	public LgTV() {
		System.out.println(">>>>>>>> LgTV 객체 생성");
	}

	public LgTV(AppleSpeaker speaker, int price) {
		System.out.println(">>>>>>>> LgTV 객체 생성(2)");
		this.speaker = speaker;
		this.price = price;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		System.out.println(">>>setSpeaker() 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println(">>>setPrice() 호출");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("LgTV.....전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV.....전원 끈다.");
	}

	public void volumeUp() {
		speaker.volumUp();
	}

	public void volumeDown() {
		speaker.volumDown();
	}

}
