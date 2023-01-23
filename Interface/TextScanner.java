package Interface;

public class TextScanner implements Scanner {

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Scanned Text");
    }
    
    public static void main(String[] args) {
        TextScanner ts=new TextScanner();
        ts.display();
    }
}
