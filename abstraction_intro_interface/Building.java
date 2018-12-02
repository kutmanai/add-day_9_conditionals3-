package abstraction_intro_interface;

public class Building {
	private String name;
	public Building(String name, String type, int floorCount) {
		super();
		this.name = name;
		this.type = type;
		this.floorCount = floorCount;
	}
	 @Override
	 public String toString() {
		 return "Building info:" +name + " " +type+"" +floorCount;
	 }

	private String type;
	private int floorCount;
	
	public Building() {
		System.out.println("no arg constructor");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFloorCount() {
		return floorCount;
	}

	public void setFloorCount(int floorCount) {
		this.floorCount = floorCount;
	}
	
	
	public void addFloor() {
		floorCount++;
		System.out.println("floor count increased");
		
		
	}
	  
	public void addDoor() {
		System.out.println("door count increased");
		
		
	}
	

}
