package FireSensor;

import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		ArrayList<Situation> SensorON = new ArrayList<Situation>();
		//random 객체 생성하고 경보가 울릴 때만 리스트 저장

		for (int i=0;i<100000;i++) {
				Situation CurrentStatus = new Situation();
				CurrentStatus.setTmp((int)(Math.random()*131)-10);
				CurrentStatus.setSmog((int)(Math.random()*41));
				CurrentStatus.setHumi((int)(Math.random()*171)-20);
				
				// 위험한 상황인지 확인
				boolean danger = Sensor.Warnning (CurrentStatus.getTmp(), CurrentStatus.getSmog(), CurrentStatus.getHumi());
				
				if (danger==true) {
					SensorON.add(CurrentStatus);
				}
		}

		for(Situation i : SensorON) { //for문을 통한 전체출력
		    System.out.println(i.toString());
		    
		}
		System.out.println(SensorON.size());
		
	}


}
