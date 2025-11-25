package com.poc.atf.validations;

import static org.testng.Assert.assertEquals;

import org.testng.asserts.SoftAssert;

import com.poc.atf.data.AllScreenData;
import com.poc.atf.data.CreateDOData;
import com.poc.atf.data.DBPLDataConfig;
import com.poc.atf.data.DeliveredData;
import com.poc.atf.data.LoginData;
import com.poc.atf.services.ActiveScreenService;
import com.poc.atf.services.AllScreenService;
import com.poc.atf.services.CreateDOService;
import com.poc.atf.services.DeliveredService;
import com.poc.atf.services.LoginService;
import com.poc.atf.services.MenuNamesandRespectiveScreenNamesServices;

public class ActiveScreenValidations {
	
	LoginData logindata = new DBPLDataConfig().getLoginData();
	ActiveScreenService activeScreenService = new ActiveScreenService();
	DeliveredData deliveredData = new DBPLDataConfig().getDeliveredData();
	DeliveredService deliveredService = new DeliveredService();
	AllScreenData allScreenData = new DBPLDataConfig().getAllScreenData();
	AllScreenService allScreenService = new AllScreenService();
	MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices = new MenuNamesandRespectiveScreenNamesServices();
	CreateDOService createDOService = new CreateDOService();
	CreateDOData createDOData = new DBPLDataConfig().getCreateDOData();
	
	
	//Active
	public void  validateGridData(ActiveScreenService activescreenservice) {
		assertEquals(activeScreenService.gridText(), logindata.getTruckNo());
	}
	
	public void slabcount(ActiveScreenService activescreenservice) {
		assertEquals(activeScreenService.Slabtext(), activeScreenService.gridSlabText());
	}
	
	public void tdSlabCount(ActiveScreenService activescreenservice) {
		assertEquals(activeScreenService.TDSlabtext(), activeScreenService.TDgridSlabText());
	}
	
	public void osSlabCount(ActiveScreenService activescreenservice) {
		assertEquals(activeScreenService.OSSlabtext(), activeScreenService.OSgridSlabText());
	}
	
	public void StoppageSlabCount(ActiveScreenService activescreenservice) {
		assertEquals(activeScreenService.StoppagesSlabtext(), activeScreenService.StoppagesgridSlabText());
	}
	
	public void deviSlabCount(ActiveScreenService activescreenservice) {
		assertEquals(activeScreenService.DeviationSlabtext(), activeScreenService.DevigridSlabText());
	}
	
	//Delivered
	public void  validateGridData(DeliveredService deliveredService) {
		assertEquals(deliveredService.gridText(), deliveredData.getConsignmentNo());
	}
	
	public void slabcount(DeliveredService deliveredService) {
		assertEquals(deliveredService.Slabtext(), deliveredService.gridSlabText());
	}
	
	public void tdSlabCount(DeliveredService deliveredService) {
		assertEquals(deliveredService.TDSlabtext(), deliveredService.TDgridSlabText());
	}
	
	public void osSlabCount(DeliveredService deliveredService) {
		assertEquals(deliveredService.OSSlabtext(), deliveredService.OSgridSlabText());
	}
	
	public void StoppageSlabCount(DeliveredService deliveredService) {
		assertEquals(deliveredService.StoppagesSlabtext(), deliveredService.StoppagesgridSlabText());
	}
	
	public void deviSlabCount(DeliveredService deliveredService) {
		assertEquals(deliveredService.DeviationSlabtext(), deliveredService.DevigridSlabText());
	}
	
	//All
	public void  validateGridData(AllScreenService allScreenService) {
		assertEquals(allScreenService.gridText(), allScreenData.getConsignmentNo());
	}
	
	public void slabcount(AllScreenService allScreenService) {
		assertEquals(allScreenService.Slabtext(), allScreenService.gridSlabText());
	}
	
	public void tdSlabCount(AllScreenService allScreenService) {
		assertEquals(allScreenService.TDSlabtext(), allScreenService.TDgridSlabText());
	}
	
	public void osSlabCount(AllScreenService allScreenService) {
		assertEquals(allScreenService.OSSlabtext(), allScreenService.OSgridSlabText());
	}
	
	public void StoppageSlabCount(AllScreenService allScreenService) {
		assertEquals(allScreenService.StoppagesSlabtext(), allScreenService.StoppagesgridSlabText());
	}
	
	public void deviSlabCount(AllScreenService allScreenService) {
		assertEquals(allScreenService.DeviationSlabtext(), allScreenService.DevigridSlabText());
	}
	
	public void createDODataValidation(CreateDOService createDOService) {
		assertEquals(createDOService.gridCellData(), createDOData.getDoNumber());
	}
	
	//Menu and Respective screen names validations
	public void validatemenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
		assertEquals(menuNamesandRespectiveScreenNamesServices.menuconsignmnettext(), menuNamesandRespectiveScreenNamesServices.screenconsignmnettext());
	}
	
	public void validatecreatedomenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
		assertEquals(menuNamesandRespectiveScreenNamesServices.menuCreateDOtext(), menuNamesandRespectiveScreenNamesServices.screenCreateDOtext());
	}
	
	public void validateTWGmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
		assertEquals(menuNamesandRespectiveScreenNamesServices.screenTruckWithGeotext(), menuNamesandRespectiveScreenNamesServices.menuTruckWithGeotext());
	}
	
	public void validateVCRmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
		assertEquals(menuNamesandRespectiveScreenNamesServices.screenViewCarrierText(), menuNamesandRespectiveScreenNamesServices.menuViewCarriertext());
	}
	
//	public void validateTLmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
//		assertEquals(menuNamesandRespectiveScreenNamesServices.screenTruckLocationText(), menuNamesandRespectiveScreenNamesServices.menutruckLocationtext());
//	}
	
	SoftAssert softAssert = new SoftAssert();
	public void validateTLmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
        // Perform assertions using the SoftAssert object
        softAssert.assertEquals(menuNamesandRespectiveScreenNamesServices.screenTruckLocationText(), menuNamesandRespectiveScreenNamesServices.menutruckLocationtext(), "Screen and menu names are not equal");
	}
	
	public void validateManageTruckmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
        softAssert.assertEquals(menuNamesandRespectiveScreenNamesServices.screenTruckText(), menuNamesandRespectiveScreenNamesServices.menuTrucktext(), "Screen and menu names are not equal");
	}
	
	public void validateManageCbrmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
        softAssert.assertEquals(menuNamesandRespectiveScreenNamesServices.screenCBRText(), menuNamesandRespectiveScreenNamesServices.menuCBRtext(), "Screen and menu names are not equal");
	}
	
	public void validateManageTransmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
        softAssert.assertEquals(menuNamesandRespectiveScreenNamesServices.screenTransText(), menuNamesandRespectiveScreenNamesServices.menuTranstext(), "Screen and menu names are not equal");
	}
	
	public void validateManageGFmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
        softAssert.assertEquals(menuNamesandRespectiveScreenNamesServices.screenGFText(), menuNamesandRespectiveScreenNamesServices.menuGFtext(), "Screen and menu names are not equal");
	}
	
	public void validateManageCMmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
        softAssert.assertEquals(menuNamesandRespectiveScreenNamesServices.screenCMText(), menuNamesandRespectiveScreenNamesServices.menuCMtext(), "Screen and menu names are not equal");
	}
	
	public void validateDashboardmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
        softAssert.assertEquals(menuNamesandRespectiveScreenNamesServices.screenGWDText(), menuNamesandRespectiveScreenNamesServices.menuGWDtext(), "Screen and menu names are not equal");
	}
	
	public void validateTicketMSmenuandscreennames(MenuNamesandRespectiveScreenNamesServices menuNamesandRespectiveScreenNamesServices) {
        softAssert.assertEquals(menuNamesandRespectiveScreenNamesServices.screenTMSText(), menuNamesandRespectiveScreenNamesServices.menuTMStext(), "Screen and menu names are not equal");
	}
	
	public void tearDown() {
        softAssert.assertAll();
    }
}
