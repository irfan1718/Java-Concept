package abstraction;

public class Sample extends Scanner {

    @Override
    void onText(String text) {
        // TODO Auto-generated method stub
        System.out.println(text);
    }

    Sample(){
        TextScanner ts=new TextScanner(this);
        ts.scan();
    }

    public static void main(String[] args) {
        Sample s=new Sample();
    }

}
