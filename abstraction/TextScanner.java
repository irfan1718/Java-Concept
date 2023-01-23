package abstraction;

public class TextScanner {
    Scanner obj;
    public TextScanner(Scanner obj){
        this.obj=obj;
    }

    
    void scan(){
        String text="Scanned Text is Printed";
        obj.onText(text);
    }
}
