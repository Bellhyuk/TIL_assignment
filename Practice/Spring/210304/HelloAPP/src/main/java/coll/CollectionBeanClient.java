package coll;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		//1.Spring Container를 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("app-context2.xml");
		
		//2.Spring Container로부터 필요한 객체를 요청(Lookup)한다.
		CollectionBean coll = (CollectionBean)factory.getBean("coll");
		List<String> list = coll.getList();
		Map<String,String> map = coll.getMap();
		Properties proper = coll.getProper();
		
		for(String li:list) System.out.println(li);
		System.out.println(map.entrySet());
		System.out.println(proper);
		
		//3.Spring Container 종료
		factory.close();
	}

}
