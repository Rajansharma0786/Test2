package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.Entity.BillingEntity;
import com.Repository.TblBillingRepo;
import com.Service.BillingService;

@Component
public class BillingRENScheduler 

{
	@Autowired
	TblBillingRepo billingRepo;
	
	@Autowired
	BillingService billingService;

	
	@Scheduled(fixedDelay = 1000L)
	public void billingThread22() {
		
		try {
			String status="21";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 21::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay = 1000L)
	public void billingThread23() {
		
		try {
			String status="22";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 22:::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	
	@Scheduled(fixedDelay = 1000L)
	public void billingThread24() {
		
		try {
			String status="23";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 23::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay = 1000L)
	public void billingThread25() {
		
		try {
			String status="24";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 24::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}
	
	@Scheduled(fixedDelay = 1000L)
	public void billingThread26() {
		
		try {
			String status="25";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 25::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}
	@Scheduled(fixedDelay = 1000L)
	public void billingThread27() {
		
		try {
			String status="26";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 26::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}
	
	@Scheduled(fixedDelay = 1000L)
	public void billingThread28() {
		
		try {
			String status="27";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 27::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}
	
	@Scheduled(fixedDelay = 1000L)
	public void billingThread29() {
		
		try {
			String status="28";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 28::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}
	
	@Scheduled(fixedDelay = 1000L)
	public void billingThread30() {
		
		try {
			String status="29";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 29::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}
	
	@Scheduled(fixedDelay = 1000L)
	public void billingThread31() {
		
		try {
			String status="30";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 30::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}
}
