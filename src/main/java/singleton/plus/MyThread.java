package singleton.plus;

/**
 * @author kerwin
 * @create 2024-05-09 21:20
 */
public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }
    public void run(){
        Singleton obj = Singleton.getInstance();
        System.out.println(getName()+": obj = "+obj);
    }
}
