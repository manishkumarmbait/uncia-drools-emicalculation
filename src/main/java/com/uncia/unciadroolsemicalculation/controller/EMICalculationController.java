package com.uncia.unciadroolsemicalculation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncia.unciadroolsemicalculation.model.EMICalculation;
import com.uncia.unciadroolsemicalculation.model.Participant;
import com.uncia.unciadroolsemicalculation.model.Rate;
import com.uncia.unciadroolsemicalculation.model.RejectionData;
import com.uncia.unciadroolsemicalculation.model.ResponseEMIAndEli;
import com.uncia.unciadroolsemicalculation.model.ResponseRejection;
import com.uncia.unciadroolsemicalculation.model.ResponseScore;
import com.uncia.unciadroolsemicalculation.model.ScoreData;
import com.uncia.unciadroolsemicalculation.service.EMICalculationService;

@RestController()
@RequestMapping("/ruleservice")
public class EMICalculationController {

	@Autowired
	private EMICalculationService eMICalculationService;

	@PostMapping("/getEMI")
	public ResponseEntity<ResponseEMIAndEli> getEMI(@RequestBody EMICalculation request) {
		ResponseEMIAndEli emi = eMICalculationService.getEMI(request);
		return new ResponseEntity<>(emi, HttpStatus.OK);
	}

	@PostMapping("/getRejection")
	public ResponseEntity<ResponseRejection> getRejection(@RequestBody RejectionData request) {
		ResponseRejection rejection = eMICalculationService.getRejection(request);
		return new ResponseEntity<>(rejection, HttpStatus.OK);
	}
	
	@PostMapping("/getScoreData")
	public ResponseEntity<ResponseScore> getScoreData(@RequestBody ScoreData request) {
		ResponseScore scoreData = eMICalculationService.getScoreData(request);
		return new ResponseEntity<>(scoreData, HttpStatus.OK);
	}
	
	 @PostMapping("/getrate")
	 public ResponseEntity<Rate> getRate(@RequestBody Participant request){
	  Rate rate = eMICalculationService.getRate(request);
	  return new ResponseEntity<>(rate, HttpStatus.OK);
	 }
}
