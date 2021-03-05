package ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// 1. Spring 컨테이너 구동한다.
		// Tomcat에서 제공해주는 Servelt Container와 비슷하다
		AbstractApplicationContext factory = new GenericXmlApplicationContext("META-INF/spring/app-context.xml");

		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다
		//TV tv = (TV) factory.getBean("tv");
		//TV tv = (TV) factory.getBean("tv2");
		TV tv = (TV) factory.getBean("tv"); //암묵적인 약속에 의해 Annotation이 실행된다
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

		// 3.Spring 컨테이너를 종료한다.
		factory.close();
	}

}
