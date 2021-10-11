package bridgelabz.sweetshop;

import java.util.ArrayList;
import java.util.List;

public class SweetRepository extends Sweet {
	private List sweetList = new ArrayList();
	
	public List getSweetList() {
		return sweetList;
	}
 
 public void add(GulabJamun objGulabJamun) {
	 sweetList.add(objGulabJamun);
	 
 }
 public void add (Laddu objLaddu) {
 	sweetList.add(objLaddu);
}
 
 public void add (Modak objModak) {
	 sweetList.add(objModak);
 }
 
 public void add (Rasagulla objRasagulla) {
	 sweetList.add(objRasagulla);
 }
 
 public void add (Rasmalai objRasmalai) {
	 sweetList.add(objRasmalai);
 }
 
 
 }
 


