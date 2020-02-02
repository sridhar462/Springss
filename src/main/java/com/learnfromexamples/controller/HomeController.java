package com.learnfromexamples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learnfromexamples.bo.IMobService;
import com.learnfromexamples.modal.Mobile;

@RestController
public class HomeController {

	@Autowired
	IMobService mobService;

	@GetMapping("/mobiles")
	public List<Mobile> getMobiles() {
		return mobService.getMobiles();
	}

	@GetMapping("/mobiles/{modelNumber}")
	public Mobile getMobile(@PathVariable("modelNumber") String modelNumber) {
		return mobService.getMobile(modelNumber);
	}

	@PostMapping("/mobiles")
	public Mobile addMobile(@RequestBody Mobile mobile) {
		return mobService.addMobile(mobile);
	}

	@PutMapping("/mobiles/{modelNumber}")
	public Mobile updateMobile(@RequestBody Mobile mobile, @PathVariable String modelNumber) {
		return mobService.updateMobile(mobile, modelNumber);
	}

	@DeleteMapping("/mobiles/{id:[a-z1-9]}")
	public void deleteMobile(@PathVariable String id) {
		mobService.deleteMobile(id);
	}

}
