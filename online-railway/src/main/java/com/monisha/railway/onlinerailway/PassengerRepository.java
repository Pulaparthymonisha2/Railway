package com.monisha.railway.onlinerailway;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PassengerRepository extends MongoRepository<Passengers, String> {
	
}
