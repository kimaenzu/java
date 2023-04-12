package FireSensor;

public class Sensor {

	// 메소드 선언부
	public static boolean Warnning(int tmp, int smog, int humi) {
		boolean danger;
		if (tmp > 70 && smog > 15 && 10 < humi && humi < 90 ) danger = true;
		else danger = false;
		return danger;
		

	}


}
