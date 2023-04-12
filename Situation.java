package FireSensor;

public class Situation {
	
	// 필드 선언
	private int tmp; // 온도
	private int smog;// 연기농도
	private int humi;// 습도

	//tmp 필드의 Getter/Setter 선언
	public int getTmp() {
		return tmp;
	}
	public void setTmp(int tmp) {
		if (tmp < -10 && 120 < tmp) { // 온도가 범위 밖일 때
			this.tmp = 18; // 초기값으로 지정
		} else {
			this.tmp=tmp; //현재 값으로 지정
		}
	}
	public int getSmog() {
		return smog;
	}
	public void setSmog(int smog) {
		if (smog < 0 && 40 < smog) { // 온도가 범위 밖일 때
			this.smog = 0; // 초기값으로 지정
		} else {
			this.smog=smog; //현재 값으로 지정
		}
	}
	public int getHumi() {
		return humi;
	}
	public void setHumi(int humi) {
		if (humi < -20 && 150 < humi) { // 온도가 범위 밖일 때
			this.humi = 55; // 초기값으로 지정
		} else {
			this.humi=humi; //현재 값으로 지정
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "온도 : " + tmp + " \t연기 농도 : " + smog + " \t습도 : " + humi;
	}

}
