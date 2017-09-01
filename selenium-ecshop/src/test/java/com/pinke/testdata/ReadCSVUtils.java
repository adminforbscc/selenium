package com.pinke.testdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVUtils {
	public static void main(String[] args) {
		Object[][] o = getPlainCSVData("ecshopLoginTestData.csv");
		for(int i = 0; i < o.length; i++) {
			for(int j = 0; j < o[i].length; j++) {
				System.out.print(o[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static Object[][] getPlainCSVData(String filename){
		Object[][] objs = null;
		InputStream is = ReadCSVUtils.class.getClassLoader().getResourceAsStream(filename);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line = null;
		try {
			line = br.readLine();
			List<Object[]> list = new ArrayList<>();
			while((line=br.readLine()) != null) {
				list.add(parseData(line.split(",")));
			}
			int size = list.size();
			objs = new Object[size][];
			for(int i = 0; i < size; i++) {
				objs[i] = list.get(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return objs;
	}
	
	private static Object[] parseData(String[] strData) {
		Object[] objs = new Object[strData.length];
		for(int i = 0; i < objs.length; i++) {
			try {
				double tmp = Double.parseDouble(strData[i]);
				objs[i] = DataParse.double2int(tmp);
			} catch(NumberFormatException e) {
				if(strData[i].equalsIgnoreCase("true") || strData[i].equalsIgnoreCase("false")) {
					objs[i] = Boolean.parseBoolean(strData[i]);
				}else {
					objs[i] = strData[i];
				}
			}
		}
		
		return objs;
	}
}
