package com.training.cellstore.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.cellstore.domain.Cellphone;

public class CellPhoneServiceTest {
	
	
	@Test
	public void testAddCellPhone() throws Exception {
		
/*		BeanFactory factory = new ClassPathXmlApplicationContext("cellphone-config.xml");
		CellPhoneService service = factory.getBean(CellPhoneService.class);
		
		Cellphone cp = new Cellphone();
		
		cp.setCellCompanyname("Nokia");
		cp.setCellid(150);
		cp.setModel("N-91");
		cp.setPrice(421.23f);
		
		service.create(cp);
		
		Cellphone newlyCreatedCellPhone = service.getByCellPhoneId(150);
		
		Assert.assertNotNull("Newly created cell can't be null", newlyCreatedCellPhone);
		Assert.assertEquals(150, newlyCreatedCellPhone.getCellid());
		Assert.assertEquals("N-91", newlyCreatedCellPhone.getModel());
		Assert.assertEquals("Nokia", newlyCreatedCellPhone.getCellCompanyname());
*/	}

}
