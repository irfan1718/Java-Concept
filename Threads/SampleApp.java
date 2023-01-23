package Threads;

public class SampleApp {
    public static void main(String[] args) {
        SampleThread st=new SampleThread(1);
        SampleThread st1=new SampleThread(1);
        SampleThread st2=new SampleThread(1);
        st.start();
        st1.start();
        st2.start();
    }
}
