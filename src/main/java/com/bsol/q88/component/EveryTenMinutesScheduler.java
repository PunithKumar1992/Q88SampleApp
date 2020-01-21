package com.bsol.q88.component;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class EveryTenMinutesScheduler {
	
	@Autowired
	private Q88GetTcOutListAPI tcoutListApi;
	
	@Autowired
	private Q88GetTcOutDetailAPI tcoutDtlApi;
	
	
	@Autowired
	private Q88VoyLstChangedAPI voyLstChangedApi;
	
	@Autowired
	private Q88VoyObjAPI voyObjApi;
	
	 Logger logger = Logger.getLogger(this.getClass());
	
	
	@Scheduled(cron = "0 */10 * ? * *")
	public void run() throws Exception {
	logger.info("Ten minute scheduler is Started ");
		tcoutListApi.checkTokenExpires();
		tcoutDtlApi.checkTokenExpires();
		voyLstChangedApi.checkTokenExpires();
		voyObjApi.checkTokenExpires();
		logger.info("Ten minute scheduler is ended ");
		
	}

}
