package com.pradeep.CricketerData.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pradeep.CricketerData.model.Cricketer;

@Service
public interface CricketerService {

	Cricketer createCricketer(Cricketer c);

	List<Cricketer> getAllCricketers();

	Cricketer getCricketerById(Integer id);

	Cricketer updateCricketer(Cricketer cricketer,Integer id);

	void deleteCricketerById(Integer id);
	
	Cricketer findByName(String name);

	Cricketer patchCricketer(Cricketer c, Integer cid);

	
}
