public class GettersAndSetters {
	public static void main(String[] args) {
		Pens p1 = new Pens();
		p1.setColor("BlackBrown");
		System.out.println(p1.getColor());
		p1.setTip(10);
		System.out.println(p1.getTip());
		p1.setColor("Red");
		System.out.println(p1.getColor());
	}
}

class Pens{
	String color;
	int tip;
	String getColor(){
	return  this.color;
	}

	int getTip(){
		return this.tip;
	}

	void setColor(String newColor) {
		color = newColor;
	}
	void setTip(int newTip) {
		tip = newTip;
	}
}