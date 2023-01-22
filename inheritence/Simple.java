package inheritence;

public class Simple extends Sample {
    int a;
    void display(){
        super.display();
        System.out.println("Its a Simple class");
        a=40;
        super.a=60;
        int c=a+super.a;
        System.out.println(c);
    }


public static void main(String[] args) {
    Simple s=new Simple();
    s.display();
    
}

}

