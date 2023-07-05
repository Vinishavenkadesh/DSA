public class Area {
    int length;
    int breadth;


    public Area(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void getArea(){
        int area = length*breadth;
        System.out.println(area);
    }

}
class Main{
    public static void main(String[] args) {
        Area a = new Area(5);
        a.setBreadth(5);
        a.getArea();
    }
}
