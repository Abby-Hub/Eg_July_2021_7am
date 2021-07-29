
public class Time {
	int hours;
	int mins;
	int seconds;
	
	public Time() {
		// TODO Auto-generated constructor stub
	}

	public Time(int hours, int mins, int seconds) {
		this.hours = hours;
		this.mins = mins;
		this.seconds = seconds;
	}
	
	
	
	
	public void showTime() {
		System.out.println(hours+":"+mins+":"+seconds);
	}
	
	
	public static Time addTime(Time t1, Time t2) {
		// logic to add t1 & t2 
		int totHours = t1.hours + t2.hours;
		int totMins = t1.mins + t2.mins;
		int totSeconds = t1.seconds + t2.seconds;
		
		if(totSeconds > 59) {
			totMins += 1;
			totSeconds = totSeconds - 60;
		}
		
		if(totMins > 59) {
			totHours += 1;
			totMins = totMins - 60;
		}
		
		//System.out.println(totHours+":"+totMins+":"+totSeconds);
		Time t = new Time(totHours, totMins, totSeconds);
		return t;
		
	}
	
	

}
