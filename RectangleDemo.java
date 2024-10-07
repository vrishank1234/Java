class Rectanle{
    public int length,breath, area;
    Rectanle(){
        length = 0;
        breath = 0;
        area = 0;
    }

    Rectanle(int length, int breath){
        this.length = length;
        this.breath = breath;
    }

    public int area(){
        area = length*breath;
        return area;
    }

    public String toString(){
        return "Area of rectangle is: "+area;
    } 
    
}
public class RectangleDemo {
    public static void main(String[] args) {
        Rectanle a = new Rectanle(2,3);
        a.area();
        System.out.println(a.toString());
    }
}