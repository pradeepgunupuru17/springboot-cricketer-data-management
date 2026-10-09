package com.pradeep.CricketerData.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.CricketerData.Repository.CricketRepo;
import com.pradeep.CricketerData.model.Cricketer;

// how to do --. Business Logic 
@Service
public class CricketerServiceImpl implements CricketerService {

	@Autowired
	CricketRepo cricketRepo;

	@Override
	public Cricketer createCricketer(Cricketer c) {

		return cricketRepo.save(c);
	}

	@Override
	public List<Cricketer> getAllCricketers() {
		return cricketRepo.findAll();
	}

	@Override
	public Cricketer getCricketerById(Integer id) {
		return cricketRepo.findById(id).orElseThrow();
	}

	@Override
	public Cricketer updateCricketer(Cricketer c, Integer id) {
		Cricketer cricketinfofromDb = getCricketerById(id);
		cricketinfofromDb.setName(c.getName());
		cricketinfofromDb.setCenturies(c.getCenturies());
		cricketinfofromDb.setCountry(c.getCountry());
		cricketinfofromDb.setStrikeRate(c.getStrikeRate());
		return cricketRepo.save(cricketinfofromDb);

	}

	@Override
	public void  deleteCricketerById(Integer id) {
        cricketRepo.deleteById(id);
		
	}

	@Override
	public Cricketer findByName(String name) {

		return cricketRepo.findByName(name);
	}

	@Override
	public Cricketer patchCricketer(Cricketer c, Integer cid) {
		Cricketer data = getCricketerById(cid);
		if (c.getName() != null) {
			data.setName(c.getName());
		}

		if (c.getCenturies() != null) {
			data.setCenturies(c.getCenturies());
		}
		if (c.getCountry() != null) {
			data.setCountry(c.getCountry());
		}
		if (c.getStrikeRate() != null) {
			data.setStrikeRate(c.getStrikeRate());
		}

		return cricketRepo.save(data);
	}

}
