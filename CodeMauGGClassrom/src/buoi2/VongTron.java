package buoi2;

public class VongTron {
    private double r,dienTich; 
    public void setR(int r) {
        this.r = r;
    } 
    double tinhCV()
    {
        return Math.PI*2*r;
    }    
     void inHinhTron(){
        System.out.println(
                "ban kinh r=" + r + 
               " chu vi="+tinhCV());
       }

    @Override
    public String toString() {
        return "VongTron{" +
                "r=" + r +
                ", dienTich=" + dienTich +
                '}';
    }
}
