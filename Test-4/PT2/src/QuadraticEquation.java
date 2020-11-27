public class QuadraticEquation{
    double a,b,c;

    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getDiscriminant(){
            return Math.pow(b,2) -4 *a*c;
    }

    public double getRoot1(){
        double n1=(-b+Math.sqrt(getDiscriminant()))/(2*a);
        return n1;
    }
    public double getRoot2() {
        double n2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        return n2;
    }



}