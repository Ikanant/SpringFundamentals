import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service = appContext.getBean(CustomerServiceImpl.class);
		System.out.println(service); // Print the address of service
		
		CustomerService service2 = appContext.getBean(CustomerServiceImpl.class);
		System.out.println(service2); // Print the address of service2
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
