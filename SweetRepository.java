package bridgelabz.sweetshop;
import java.util.HashSet;
import java.util.Set;

public class SweetRepository {
	//private List sweetList = new ArrayList();
	private Set<Sweet> sweetList = new HashSet();
	
	public Set<Sweet> getSweetList() {
		return sweetList;
	}
	
	public void add(Sweet sweet) {
		 sweetList.add(sweet);
	 }
	 
	 public void delete(Sweet sweet) {
		 sweetList.remove(sweet);
	 }
}

 


