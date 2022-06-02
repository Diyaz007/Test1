public class Circle {
    private int radius;
    private static int counter = 1;
    private final double p = 3.14;
    private static int counter_kraten3;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int Counter(){
        int counter2 = counter++;
        return counter2;
    }

    @Override
    public String toString() {
        kraten_3();
        return "\n------------"+Counter()+"-------------"+
                "\nradius:" + getRadius() +
                "\nS:"+getS();

    }
    public void kraten_3(){
        if(getS() % 3 == 0){
            System.out.println("------------///-------");
            System.out.println(getS() % 3);
            counter_kraten3++;
        }
    }
    public static void circle_kraten3(){
        System.out.println("--------------");
        System.out.println("Всего кругов у которых площядь кратна 3: "+ counter_kraten3);
    }
    public double getS(){
        double S = p*Math.pow(getRadius(),2);
        return S;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }



}
