package java设计模式.模式4建造者模式;/*
 * ƽ�����̶�
 */

public class PingFangBuilder implements HouseBuilder {
	House house = new House();
	
	public void makeFloor() {
		house.setFloor("平房-->地板");
	}

	public void makeHousetop() {
		house.setHousetop("平房-->房顶");
	}

	public void makeWall() {
		house.setWall("平房-->墙");
	}

	public House getHouse() {
		return house;
	}

}
