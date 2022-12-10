
package com.nissan.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.services.Patient;

public class PatientAppTesting {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("Context.xml");
		Patient patient=con.getBean("patientInfo",Patient.class);
		String name=patient.getName();
		String str=patient.getMedicine();
		float bills=patient.getTotalbill();
		System.out.println("--------------------Details----------------------------------------\n");
		System.out.printf(String.format("%-10s%20s%30s\n", "Name","Medicine","Total Bills"));
		System.out.printf(String.format("%-10s%30s%20s",name,str,bills));
		
		
	}

}
