package ACM;
public class Student {
    
    private double ch;
    private double ma;
    private double en;
    private double sy;
    public double sum;
    public Student(){
        
    }
    public Student(double ch, double ma, double en, double sy) {
        this.ch = ch;
        this.ma = ma;
        this.en = en;
        this.sy = sy;
    }
    public double getCh() {
        return ch;
    }
    public void setCh(double ch) {
        this.ch = ch;
    }
    public double getMa() {
        return ma;
    }
    public void setMa(double ma) {
        this.ma = ma;
    }
    public double getEn() {
        return en;
    }
    public void setEn(double en) {
        this.en = en;
    }
    public double getSy() {
        return sy;
    }
    public void setSy(double sy) {
        this.sy = sy;
    }
    public void sum(){
      sum = ch + ma + en + sy;
    }
}
