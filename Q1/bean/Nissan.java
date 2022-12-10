package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.services.Vehicle;
@Component
public  class Nissan implements Vehicle {

	@Override
	public String getColors() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public boolean isSunRoof() {
		// TODO Auto-generated method stub
		return false;
	}

		@Override
	public boolean isBlutooth() {
		// TODO Auto-generated method stub
		return true;
	}

		@Override
		public String name() {
			// TODO Auto-generated method stub
			return "Nissan";
		}


}
