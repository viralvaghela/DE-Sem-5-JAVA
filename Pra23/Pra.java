// filename: Main.java
 
class Complex {
 
    private int a,b;
     
    public Complex(int x, int y) {
        a = x;
        b = y;
    }
    Complex(Complex v)
    {
        a=v.a;
        b=v.b;
    }
    void show()
    {
        System.out.println("A:"+a);
        System.out.println("B:"+b);

    }

}
 public class Pra {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(c1);  
        c2.show();

/*        Complex c3=c1; this will copy c1 --> c3 constructor...
        c3.show();*/

    }
}
