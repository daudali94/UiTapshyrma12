package peaksoft;

public class Treugolnik {
    int a;
    int b;
    int c;
    void area(int a, int b, int c){
        int s = (a+b+c)/2;
        System.out.println("Площадь треугольника "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}
