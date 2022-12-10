package com.nissan.bean;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.nissan.services.Patient;
@Component
public class PatientInfo implements Patient {
	Scanner scanner=new Scanner(System.in);

	@Override
	public String getName() {
		System.out.println("Eneter Patient Name");
		String name=scanner.nextLine();
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getMedicine() {
		// TODO Auto-generated method stub
		String[] arr= {"Paracitomol","Syrup"};
		String str="";
		for(int i=0;i<arr.length;i++) {
			str+=arr[i]+" ";
		}
		return str;
	}

	@Override
	public float getTotalbill() {
		System.out.println("Enetr Total Bill");
		float totalBill=scanner.nextFloat();
		// TODO Auto-generated method stub
		return totalBill;
	}

}
