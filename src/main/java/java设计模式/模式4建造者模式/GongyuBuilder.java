package java设计模式.模式4建造者模式;

public class GongyuBuilder implements HouseBuilder{
	House house = new House();
	
	public House getHouse() {
		return house;
	}

	public void makeFloor() {
		house.setFloor("��Ԣ-->�ذ�");
	}

	public void makeHousetop() {
		house.setHousetop("��Ԣ-->����");
	}

	public void makeWall() {
		house.setWall("��Ԣ-->ǽ");
	}
	
}
