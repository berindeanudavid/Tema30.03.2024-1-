public class PunctColorat extends Punct
{
    public String c;
    //Clasa "Punct" are un constructor explicit si este mostenita de
    //"PunctColorat". In consecinta, "PunctColorat" trebuie sa includa
    //constructorul clasei generale in propriul constructor prin functia
    //"super()", care preia functionalitatea constructorului clasei generale.
    public PunctColorat(double x, double y, String c)
    {
        super(x,y);
        this.c=c;
    }
}
