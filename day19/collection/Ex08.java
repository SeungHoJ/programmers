package collection;

import java.io.IOException;
import java.util.HashMap;

public class Ex08 {
	public static void main(String[] args) throws IOException {
		String url = "https://search.naver.com/search.naver";
		url += "?";
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("query","아이유");
		param.put("where","image");
		
		for(String key : param.keySet()) {
			String value = param.get(key);
			url += key + "=" + value + "&";
		}
		
		Runtime rt = Runtime.getRuntime();
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		rt.exec(chromePath + " "+ url);
	}
}
