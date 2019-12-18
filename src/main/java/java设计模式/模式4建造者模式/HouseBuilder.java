package java设计模式.模式4建造者模式;

/*
 * 房屋建筑者
 */
public interface HouseBuilder {
	//建筑地板
	public void makeFloor();
	//建筑墙
	public void makeWall();
	//建筑屋顶
	public void makeHousetop();
	public House getHouse();
}
