package com.bsol.q88.component;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class EveryFifteenMinuteScheduler {
	
	@Autowired
	private Q88GetPortListAPI portListApi;
	
	@Autowired
	private Q88GetVesselListApi vesselApi;
	
	@Autowired
	private Q88VslRegDtlApi vslRegDtlAPi;
	
	@Autowired
	private Q88VslHeadContractDtl vslHeadContrctDtlApi;
	
	
	 Logger logger = Logger.getLogger(this.getClass());
	
	
	@Scheduled(cron = "0 */12 * ? * *")
	public void run() throws Exception {
		logger.info("Vessel List and port list Apis Started ");
		portListApi.checkTokenExpires();
		vesselApi.checkTokenExpires();
		vslRegDtlAPi.checkTokenExpires();
		vslHeadContrctDtlApi.checkTokenExpires();
		logger.info("Vessel List and port list Apis ended ");
		
		
		
		
	}

}
