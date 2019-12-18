package java设计模式.模式4建造者模式;

public class HouseDirector {
	
	public void makeHouse(HouseBuilder builder) {
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
	}
	
}
