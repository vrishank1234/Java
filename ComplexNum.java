class Complex {
    private double real, imag;
    public Complex(double real, double imag) {
        this.real=real;
        this.imag=imag;
    }
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void setReal(double real) {
        this.real=real;
    }
    public void setImag(double imag) {
        this.imag=imag;
    }
    public Complex add(Complex n) {
        Complex res=new Complex(real, imag);
        res.real=n.real+this.real;
        res.imag=n.imag+this.imag;
        return res;
    }
    public Complex sub(Complex n) {
        Complex res=new Complex(real, imag);
        res.real=this.real-n.real;
        res.imag=this.imag-n.imag;
        return res;
    }

    @Override
    public String toString() {
        return this.real+" "+this.imag+"i";
    }
}

public class ComplexNum {
    public static void main(String[] args) {
        Complex data1=new Complex(12, 9);
        Complex data2=new Complex(9, 1);
        data1.add(data2);
        System.out.println("complex number: "+data1.toString());
    }
}