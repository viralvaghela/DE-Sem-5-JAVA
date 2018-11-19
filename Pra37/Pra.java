class Rectangle
{
	double height,width;
	Rectangle(double h,double w)
	{
		height=h;
		width=w;
	}
	void Area()
	{
		System.out.println("Area Of Rectangle :"+height*+width);
	}
	void Perimeter()
	{
		System.out.println("Perimeter of Rectangle :"+2*(+height + +width));
	}
}
class Square extends Rectangle
{
	double d;
	Square(double h,double w,double d)
	{
		super(h,w);
		this.d=d;
	}
		void Area()
		{
			super.Area();
			System.out.println("Area of Square is:"+d * +d);
		}

		void Perimeter()
		{	
			super.Perimeter();
			int a=4;
			System.out.println("Perimeter of Square is:"+a * +d);
		}
}


class Pra
{
	public static void main(String[] args) {
	
		Square s=new Square(5,10,15);
		s.Area();
		s.Perimeter();	

	}
}	