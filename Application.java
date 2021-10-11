package bridgelabz.sweetshop;

import java.util.List;

public class Application extends Sweet {
	
	public static void main(String args[]) {
		System.out.println("Welcome to Sweet shop Management System");
		GulabJamun objGulabJamun = new GulabJamun();
		objGulabJamun.id = "g001";
		objGulabJamun.price = 200;
		Laddu objLaddu = new Laddu();
		objLaddu.id = "l1002";
		objLaddu.price = 250;
		Modak objModak = new Modak();
		objModak.id = "m1003";
		objModak.price = 150;
		Rasagulla objRasagulla= new Rasagulla();
		objRasagulla.id = "r1004";
		objRasagulla.price = 250;
		Rasmalai objRasamalai= new Rasmalai();
		objRasamalai.id= "r1005";
		objRasamalai.price = 300;
		
		SweetRepository sweetRepository = new SweetRepository();
		sweetRepository.add(objGulabJamun);
		sweetRepository.add(objLaddu);
		sweetRepository.add(objModak);
		sweetRepository.add(objRasagulla);
		sweetRepository.add(objRasamalai);
		
		List sweetList = sweetRepository.getSweetList();
		UserInterface ui = new UserInterface();
		
		ui.print(sweetList);
		
	
	}
}
