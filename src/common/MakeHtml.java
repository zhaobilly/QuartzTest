package common;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MakeHtml {
	public void execute() {
		System.out.println("----excute job---" + getCurTime());
	}

	public static void main(String[] args) {
		System.out.println("----begin---");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.getBean("startQuertz");
		System.out.print("----end---");
	}
	
	public static String getCurTime() {
		String time = "";
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		time = sf.format(date);
		return time;
	}
}

