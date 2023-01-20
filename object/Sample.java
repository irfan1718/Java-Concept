public class Sample {
    public static void main(String[] args) {
        Sum obj1=new Sum();
        Sum obj2=new Sum();

        obj1.a=50;
        obj1.b=140;

        obj2.a=90;
        obj2.b=230;

        obj1.CalculateSum();
        obj2.CalculateSum();
        obj1.dislay();
        obj2.dislay();
    }      
}