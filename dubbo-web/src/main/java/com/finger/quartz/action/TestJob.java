package com.finger.quartz.action;

import java.lang.invoke.MethodHandles;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class TestJob implements Job{
	
	private Logger log = Logger.getLogger(MethodHandles.lookup().getClass());

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		log.info("======进入quartz测试定时服务类TestJob======");
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
			System.out.println("This is my First quartz class!"+sdf.format(calendar.getTime()));
		} catch (Exception e) {
			System.out.println("======测试定时服务类TestJob出现异常======");
			e.printStackTrace();
		}
		log.info("======结束quartz测试定时服务类TestJob======");
		
	}

}
