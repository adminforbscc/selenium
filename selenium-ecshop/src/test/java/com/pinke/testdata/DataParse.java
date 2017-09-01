package com.pinke.testdata;

public class DataParse {
	public static Object double2int(double from) {
		if(from - (int)from == 0) {
			return (int)from;
		}else {
			return from;
		}
	}
}
