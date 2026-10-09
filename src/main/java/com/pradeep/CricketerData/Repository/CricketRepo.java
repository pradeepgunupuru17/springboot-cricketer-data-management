package com.pradeep.CricketerData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.CricketerData.model.Cricketer;

@Repository
public interface CricketRepo extends JpaRepository<Cricketer, Integer> {

	Cricketer findByName(String name);

}
