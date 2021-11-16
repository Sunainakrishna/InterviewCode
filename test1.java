package Test;

import Base.methods;
import Pages.Home;

public class test1 extends methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		openBrowser();
		openUrl("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		
		Home h=new Home(methods.driver);
		
		h.loginButton();
		Thread.sleep(2000);
		h.addcust();
		
		h.firstname("Sunaina");
		h.lastname("K");
		h.postalcode("566009");
		h.submitButton();
		h.alert1();
		h.opeenacc();
		
		Thread.sleep(2000);
		h.custDrop();
		h.curDrop();
		h.proButton();
		h.alert1();
		
				
		

	}

}
