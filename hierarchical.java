class superhero{
	String name;
	String power;
	public superhero(String name,String power){
		this.name=name;
		this.power=power;
	}
	public void usepower(){
		System.out.println(name+ "uses" +power);
	}
}
class ironman extends superhero{
	public ironman(String name){
		super(name,"advanced technology");
	}
}
class spiderman extends superhero{
	public spiderman(String name){
		super(name,"web-slinging and spider- like abilities");
	}
}
public class hierarchical{
	public static void main(String[] args){
 		ironman iman =new ironman("iron man");
		spiderman sman=new spiderman("spider man");
		iman.usepower();
		sman.usepower();
	}
}