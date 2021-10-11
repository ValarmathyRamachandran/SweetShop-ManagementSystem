package bridgelabz.sweetshop;

public class Sweet {
	
	enum Color{
		BROWN, RED, GREEN, WHITE, BROWN_WHITE,YELLOW;
	}
	enum Category{
		MILK, SUGARLESS,JAGGERY,GHEE;
	}
	
	String id;
	Color color;
	int price;
	Category category;
	String name;
	@Override
	public String toString() {
		return "Sweet [id=" + id + ", color=" + color + ", price=" + price + ", category=" + category + ", name=" + name
				+ "]";
	}


	
	
	
	
	
	
	
	
	}
	

	
	
