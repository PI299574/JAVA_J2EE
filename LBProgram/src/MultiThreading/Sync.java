package MultiThreading;

public class Sync {
    public synchronized void m1() {
    }
    public synchronized void m2() {
        m1();
    }
    public static void main(String[] args) {
        Sync s = new Sync();
        s.m2();
       System.out.println("Done");
       
       //System.out.println(“Done”);
    }
}