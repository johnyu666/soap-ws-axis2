package service;

import java.util.Date;

public class TimeCenter {
	public String currentTime() {
		return System.currentTimeMillis()+"";
	}
	public String currentTimeWithLocal() {
		return new Date().toLocaleString();
	}
}
