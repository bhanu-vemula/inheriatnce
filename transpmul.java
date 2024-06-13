class bicycle{
	void displayfeatures(){
		System.out.println("features:pedals,manual power");
	}
}
class motorbike extends bicycle{
	void displayfeatures(){
		super.displayfeatures();
		System.out.println("added features by motorbike:engine");
	}
}
class ebike extends motorbike{
	void displayfeatures(){
		super.displayfeatures();
		System.out.println("new features by ebike:electricmotor and battery");
	}
}
class transpmul{
	public static void main(String args[]){
		ebike myebike=new ebike();
		myebike.displayfeatures();
	}
}
	