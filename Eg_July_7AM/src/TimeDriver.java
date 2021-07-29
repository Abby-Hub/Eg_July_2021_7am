
public class TimeDriver {

	public static void main(String[] args) {
		Time t1 = new Time(10, 33, 46);
		Time t2 = new Time(7, 32, 15);
		Time t3 = new Time();
		
		t3 = Time.addTime(t1, t2);
		
		
		// display time results
		t1.showTime();
		t2.showTime();
		t3.showTime();
		
	}

}
