package com.pradeep.CricketerData.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.CricketerData.Service.CricketerService;
import com.pradeep.CricketerData.model.Cricketer;

//http:localhost:8888/cricket
@RestController
@RequestMapping("/cricket")
public class CricketerController {

	@Autowired
	CricketerService cricketService;

	@GetMapping("/wel")
	String Welcome() {
		return "method from welcome";
	}

	@PostMapping("/cric")
	Cricketer createCricketer(@RequestBody Cricketer c) {
		return cricketService.createCricketer(c);

	}

	// http:localhost:8888/cricket/getAllCricketers
	@GetMapping("/getAllCricketers")
	List<Cricketer> getAllCricketers() {
		return cricketService.getAllCricketers();
	}

	// http:localhost:8888/cricket//GetCricketerById/2
	@GetMapping("/GetCricketerById/{cid}")
	Cricketer getCricketer(@PathVariable Integer cid) {
		return cricketService.getCricketerById(cid);
	}

	// http:localhost:8888/cricket//GetCricketerByName/name
	@GetMapping("/GetCricketerByName/{name}")
	Cricketer getCricketer(@PathVariable String name) {
		return cricketService.findByName(name);
	}

	// http:localhost:8888/cricket//UpdateCrickterid/id
	@PutMapping("/UpdateCrickterid/{cid}")
	Cricketer updateCricketer(@RequestBody Cricketer c, @PathVariable Integer cid) {
		return cricketService.updateCricketer(c, cid);
	}

	@PatchMapping("/UpdateCrickterid/{cid}")
	Cricketer PatchCricketer(@RequestBody Cricketer c, @PathVariable Integer cid) {
		return cricketService.patchCricketer(c, cid);
	}

	// http:localhost:8888/cricket//DeleteCrickterid/{cid}

	@DeleteMapping("/DeleteCrickterid/{cid}")

	String deleteCricketer(@PathVariable Integer cid) {
		cricketService.deleteCricketerById(cid);
		return "Deleted Cricketer " + cid + "successfully";
	}

}
