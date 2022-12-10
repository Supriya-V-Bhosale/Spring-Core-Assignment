package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.services.Vehicle;
@Component
public class Benz implements Vehicle{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Benz";
	}

	@Override
	public String getColors() {
		// TODO Auto-generated method stub
		return "Silver";
	}

	@Override
	public boolean isSunRoof() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isBlutooth() {
		// TODO Auto-generated method stub
		return true;
	}

}
