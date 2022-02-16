import java.util.*;
class PythagoreanTriplet{
    int a, b, c;
    List<PythagoreanTriplet> list;
    PythagoreanTriplet(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    };
    static PythagoreanTriplet makeTripletsList(){
        PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet(0,0,0);
        pythagoreanTriplet.list = new ArrayList<PythagoreanTriplet>();
        return pythagoreanTriplet;
    }
    PythagoreanTriplet withFactorsLessThanOrEqualTo(int n){
        return this;
    }
    PythagoreanTriplet thatSumTo(int n){
        for(int a = 0; a < n/3; a++){
            for(int b = a+1; b < n/2; b++) {
                int c = n-a-b;
                if(c<=b)
                    break;
                if(a*a + b*b == c*c)
                    this.list.add(new PythagoreanTriplet(a,b,c));
            }
        }

        return this;

    }
    List<PythagoreanTriplet> build(){
        if(this.list.size()==1)
            return Collections.singletonList(this.list.get(0));
        return this.list;
    }

    public boolean equals(Object p){
        PythagoreanTriplet pt = (PythagoreanTriplet) p;
        return (pt.a==this.a && pt.b==this.b && pt.c==this.c);
    }

}