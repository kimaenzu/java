package FireSensor;

public class Situation {
	
	// 필드 선언
	private int tmp = 18; // 온도
	private int smog = 0;// 연기농도
	private int humi = 55;// 습도

	//필드의 Getter/Setter 선언

	public int getTmp() {
		return tmp;
	}
	public void setTmp(int tmp) {
		this.tmp = tmp;
	}


	public int getSmog() {
		return smog;
	}
	public void setSmog(int smog) {
		this.smog = smog;
	}


	public int getHumi() {
		return humi;
	}
	public void setHumi(int humi) {
		this.humi = humi;
	}


	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "온도 : " + tmp + "도 \t연기 농도 : " + smog + "% \t습도 : " + humi+"%";
	}

}
