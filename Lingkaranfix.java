package lingkaran;

import java.io.*; 
public class Lingkaranfix{

private double radius;
public Lingkaranfix(double radius){
this.radius=radius;
}
public void Luas(){
double luas= 3.14*radius*radius;
System.out.print("luas lingkaran= "+luas);
}
public void Keliling ( ){
double keliling=2.0*3.14*radius;
System.out.println("Keliling Lingkaran= "+keliling);
}
public static void main (String []args)throws Exception{
DataInputStream  dis=new DataInputStream(System.in);
System.out.print ("input radius: "); 
String input=dis.readLine();
double i= Double.parseDouble(input);
Lingkaranfix A=new Lingkaranfix(i);
A.Luas();
A.Keliling();
    }
}