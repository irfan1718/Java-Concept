package inheritence;

public class E extends D {
    E(){
        System.out.println("Last One");
    }

    void display(){
        System.out.println("E:Show me First");
    }

    public static void main(String[] args) {
        E e=new E();
        e.display();
    }


}