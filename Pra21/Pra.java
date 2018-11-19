class Pra
{
	public static void main(String args[])
	{
		float l,b,h;
		l=b=h=10;
		float ans=0;
		
		Demo obj=new Demo(l,b,h,ans);
		obj.volume(obj);
		System.out.println("Volume is:"+obj.ans);
	}
}
class Demo
{	
	float ans,length,width,height;
	Demo(float l,float w,float h,float a)
	{
		length=l;
		width=w;
		height=h;
		ans=a;
		
	}
	void volume(Demo ob)
	{
		 ob.ans=ob.height*ob.width*ob.length;  
	}
}