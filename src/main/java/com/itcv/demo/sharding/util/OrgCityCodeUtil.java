package com.itcv.demo.sharding.util;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class OrgCityCodeUtil {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();

		List<String> list  = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("2");
		list.add("");
		list.add("1");
		list.add("1");
		list.forEach(item ->{
			if(item.equals("1")){
				System.out.println(item);
			}

		});

	}
	
	public static Map<String,String> orgCodeMap;
	
	/**
	 * 系统所有分公司的map 
	 * key为orgCode,val为cityCode
	 */
	
	public static Map<String,String> getCityCodeMap() {
		if (orgCodeMap == null) {
			orgCodeMap = new HashMap<String,String>();
			orgCodeMap.put("001", "group");
			orgCodeMap.put("002", "wuhan");
			orgCodeMap.put("003", "chongqing");
			//orgCodeMap.put("004", "hefei");
			orgCodeMap.put("005", "hangzhou");
			orgCodeMap.put("006", "zhengzhou");
			orgCodeMap.put("007", "changsha");
			orgCodeMap.put("008", "jinan");
			orgCodeMap.put("009", "xiamen");
			orgCodeMap.put("014", "taiyuan");
			orgCodeMap.put("010", "taiyuan");
			orgCodeMap.put("011", "nanchang");
			orgCodeMap.put("012", "yunnan");
			orgCodeMap.put("013", "nanjing");
			orgCodeMap.put("020", "yuyuanji");
//
			orgCodeMap.put("016", "xian"); //陕西西安
			orgCodeMap.put("017", "sichuan"); //四川
			orgCodeMap.put("019", "liaoning"); //辽宁
			orgCodeMap.put("021", "wuhu"); //芜湖
			orgCodeMap.put("022", "jilin"); //吉林
			orgCodeMap.put("015", "beijing"); //北京
		}
		return orgCodeMap;
	}
}
