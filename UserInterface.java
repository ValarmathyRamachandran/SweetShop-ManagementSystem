package bridgelabz.sweetshop;

import java.util.Set;

public class UserInterface {
	public void print(Set<Sweet> set) {
		for(Sweet sweet:set) {
			System.out.println(sweet);
		}	
	}
	public void printIdiet(Set<Sweet> set) {
		for(Sweet sweet:set) {
			if(sweet instanceof IDiet)
			System.out.println(sweet);
		}
	}
	public void printNormal(Set<Sweet> set) {
		for(Sweet sweet:set) {
			if(sweet instanceof INormal)
			System.out.println(sweet);
		}
	}
}

