package com.nissan.app;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nissan.services.Vehicle;

public class DemoVehicle {
	public static void main(String args[]) {
		 ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("Context.xml");
		 Vehicle nissan=con.getBean("nissan",Vehicle.class);
		 Vehicle benz=con.getBean("benz",Vehicle.class);
		 System.out.println("--------------------------Vehicles Details-----------------------------\n");
		 System.out.printf(String.format("%-10s%20s%20s\n", "Name","Color" ,"Blutooth"));
		
		 System.out.printf(String.format("%-10s%19s %21s\n", nissan.name(),nissan.getColors(),nissan.isBlutooth()));
		System.out.printf(String.format("%-10s%20s %20s",benz.name(),benz.getColors(),benz.isBlutooth()));
	 

}
}
