package in.sca.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sca.beans.Car;



public class CarApp {

	public static void main(String[] args) {

		AbstractApplicationContext container = new ClassPathXmlApplicationContext("in/sca/resources/config.xml");
		 System.out.println("Container started");
		 
		 Car car = container.getBean("car1",Car.class);
		 System.out.println(car.getCarName());
		 
		 car.carDriving();
		 
		container.destroy();

		
	}

}
