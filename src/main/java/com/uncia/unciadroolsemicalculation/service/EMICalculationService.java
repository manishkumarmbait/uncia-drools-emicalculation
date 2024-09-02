package com.uncia.unciadroolsemicalculation.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncia.unciadroolsemicalculation.model.EMICalculation;
import com.uncia.unciadroolsemicalculation.model.Participant;
import com.uncia.unciadroolsemicalculation.model.Rate;
import com.uncia.unciadroolsemicalculation.model.RejectionData;
import com.uncia.unciadroolsemicalculation.model.ResponseEMIAndEli;
import com.uncia.unciadroolsemicalculation.model.ResponseRejection;
import com.uncia.unciadroolsemicalculation.model.ResponseScore;
import com.uncia.unciadroolsemicalculation.model.ScoreData;

@Service
public class EMICalculationService {

	@Autowired
	private KieContainer kieContainer;

	public ResponseEMIAndEli getEMI(EMICalculation eMICalculation) {
		ResponseEMIAndEli responseEMIAndEli = new ResponseEMIAndEli();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(responseEMIAndEli);
		kieSession.insert(eMICalculation);
		kieSession.fireAllRules();
		kieSession.dispose();
		return responseEMIAndEli;
	}

	public ResponseRejection getRejection(RejectionData applicantRequest) {
		ResponseRejection responseRejection = new ResponseRejection();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(responseRejection);
		kieSession.insert(applicantRequest);
		kieSession.fireAllRules();
		kieSession.dispose();
		return responseRejection;
	}
	
	public ResponseScore getScoreData(ScoreData applicantRequest) {
		ResponseScore responseScore = new ResponseScore();
		KieSession kieSession = kieContainer.newKieSession();
		//kieSession.setGlobal("rate", rate);
		kieSession.insert(responseScore);
		kieSession.insert(applicantRequest);
		kieSession.fireAllRules();
		kieSession.dispose();
		return responseScore;
	}
	
	public Rate getRate(Participant applicantRequest) {
		Rate rate = new Rate();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.setGlobal("rate", rate);
		kieSession.insert(applicantRequest);
		kieSession.fireAllRules();
		kieSession.dispose();
		return rate;
	}
	
	
}
