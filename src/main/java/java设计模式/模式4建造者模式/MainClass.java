package java设计模式.模式4建造者模式;

public class MainClass {

	public static void main(String[] args) {
//		//客户直接造房子
//		House house = new House();
//		house.setFloor("�ذ�");
//		house.setWall("ǽ");
//		house.setHousetop("�ݶ�");
		
		
		//�ɹ��̶�����
		HouseBuilder builder = new GongyuBuilder();
		//���������
		HouseDirector director = new HouseDirector();
		director.makeHouse(builder);
		
		House house = builder.getHouse();
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
		System.out.println(house.getHousetop());
	}

}
