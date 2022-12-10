package com.nissan.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.nissan.services.Fortune;
@Component
public class DemoFortune implements Fortune{

	@Override
	public float fortune() {
		float[] arr= {(float) 456354.67,(float) 5462334.5,(float) 755586.34};
		Random ran=new Random();
		int i=ran.nextInt(3);
		return arr[i];
	}
	
}
