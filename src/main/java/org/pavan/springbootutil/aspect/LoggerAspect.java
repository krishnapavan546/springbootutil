package org.pavan.springbootutil.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.apache.log4j.*;

@Aspect
public class LoggerAspect {
	
	@Pointcut("org.pavan.springbootutil.*")
	private Logger getLoggerInfo()
	{
		Logger log=Logger.getLogger(LoggerAspect.class);
		log.info("Statr of the each method");
		return Logger.getLogger(LoggerAspect.class);
	}

}
