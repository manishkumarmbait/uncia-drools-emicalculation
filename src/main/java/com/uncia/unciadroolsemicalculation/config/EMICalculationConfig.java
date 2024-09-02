package com.uncia.unciadroolsemicalculation.config;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

@Configuration
public class EMICalculationConfig {

//	private static final KieServices kieServices = KieServices.Factory.get();
//	private static final String RULES_CUSTOMER_RULES_DRL = "rules/emicalculation.drl";
//	 
//	   @Bean
//	     public KieContainer kieContainer() {
//	         KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//	         kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_CUSTOMER_RULES_DRL));
//	         KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
//	         kb.buildAll();
//	         KieModule kieModule = kb.getKieModule();
//	         KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//	         return kieContainer;
//	     }
	
	private static final KieServices kieServices = KieServices.Factory.get();
	private static final String RULES_CUSTOMER_EMI_CALCULATION = "src/main/resources/rules/emicalculation.drl";
	private static final String RULES_CUSTOMER_REJECTION = "src/main/resources/rules/rejection.drl";
	private static final String RULES_CUSTOMER_SCORE_DATA = "src/main/resources/rules/score-data.drl";
	private static final String RULES_CUSTOMER_RULES_DRL = "src/main/resources/rules/loan_rate.drl";

	@Bean
	public KieContainer kieContainer() throws IOException {
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		kieFileSystem.write(RULES_CUSTOMER_EMI_CALCULATION, getDrlFileContent("rules/emicalculation.drl"));
		kieFileSystem.write(RULES_CUSTOMER_REJECTION, getDrlFileContent("rules/rejection.drl"));
		kieFileSystem.write(RULES_CUSTOMER_SCORE_DATA, getDrlFileContent("rules/score-data.drl"));
		kieFileSystem.write(RULES_CUSTOMER_RULES_DRL, getDrlFileContent("rules/loan_rate.drl"));
		KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
		kb.buildAll();
		KieModule kieModule = kb.getKieModule();
		KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
		return kieContainer;
	}

	private String getDrlFileContent(String fileName) throws IOException {
		Resource resource = new ClassPathResource(fileName);
		InputStream inputStream;
		inputStream = resource.getInputStream();

		byte[] bytes = FileCopyUtils.copyToByteArray(inputStream);
		String fileContent = new String(bytes, StandardCharsets.UTF_8);
		return fileContent;
	}
	
	//=========================================
	
//	private static final KieServices kieServices = KieServices.Factory.get();
//	private static final String RULES_CUSTOMER_RULES_DRL = "rules/loan_rate.drl";
//	 
//	   @Bean
//	     public KieContainer kieContainer() {
//	         KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//	         kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_CUSTOMER_RULES_DRL));
//	         KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
//	         kb.buildAll();
//	         KieModule kieModule = kb.getKieModule();
//	         KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//	         return kieContainer;
//	     }
//	   
}
