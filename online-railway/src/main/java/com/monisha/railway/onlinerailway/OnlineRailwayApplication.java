package com.monisha.railway.onlinerailway;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineRailwayApplication implements CommandLineRunner {
	
	@Autowired
	private PassengerRepository passengerRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnlineRailwayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		
		Passengers p1 = new Passengers("Abdul", "Abdul@gmail.com", "Peshawar", "7395194569", "Abdul12");
		
		passengerRepository.save(p1);
		
		System.out.println("*********");
		List<Passengers> passengers = passengerRepository.findAll();
		
		for (Passengers p : passengers) {
			System.out.println(p.toString());
		}
		
	}

}
