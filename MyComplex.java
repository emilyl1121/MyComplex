public class MyComplex{
    private double real;
    private double img;
    public MyComplex(){
        real = 0;
        img = 0;
    }
    public MyComplex(double a, double b){
        real = a;
        img = b;
    }
    public void setReal(double value){
        real = value;
    }
    public void setImg(double value){
        img = value;
    }
    public double getReal(){
        return real;
    }
    public double getImg(){
        return img;
    }
    public String toString(){
        if(getImg()>0){
            return real + "+" + img +"i";
        }else{
            return real + img +"i";
        }
    }
    public boolean isReal(){
        return getImg() == 0;
    }
    public boolean isImg(){
        return getReal() == 0;
    }
    public void add(MyComplex c){
        real = real + c.getReal();
        img = img + c.getImg();
    }
    public void multiply(MyComplex c){
        real = real * c.getReal() - img * c.getImg();
        img = real * c.getImg() + img * c.getReal();
    }
    public void conjugate(){
        if(img>0){
            img = img-2*img;
        }else{
            img = img+2*img;
        }
    }
    public double argument(){
        return Math.atan2(real, img);
    }
    public double magnitude(){
        return Math.sqrt(real*real+img*img);
    }
    public static MyComplex addNew(MyComplex a, MyComplex b){
        double newReal = a.getReal() + b.getReal();
        double newImg = a.getImg() + b.getImg();
        return new MyComplex(newReal, newImg);
    }
    public static MyComplex multiplyNew(MyComplex a, MyComplex b){
        double newReal = (a.getReal() * b.getReal()) - (a.getImg() * b.getImg());
        double newImg = (a.getReal() * b.getImg()) + (a.getImg() * b.getReal());
        return new MyComplex(newReal, newImg);
    }
}