package phuongtrinhbac2;

import phuongtrinhbac2.QuadraticEquation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("a=");
        double a=scanner.nextInt();
        System.out.print("b=");
        double b=scanner.nextInt();
        System.out.print("c=");
        double c=scanner.nextInt();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("Nghiem thu nhat:"+quadraticEquation.getRoot1());
            System.out.println("Nghiem thu hai:"+quadraticEquation.getRoott2());
        }
        else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("co nghiem kep:"+quadraticEquation.getRoot1());
        }else {
            System.out.println("vo nghiem");
        }
    }
}
