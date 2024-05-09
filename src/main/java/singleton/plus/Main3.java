package singleton.plus;

/**
 * @author kerwin
 * @create 2024-05-09 20:52
 */
public class Main3{
    public static void main(String[] args) {
        System.out.println("Start.");

        new MyThread("A").start();
        new MyThread("B").start();
        new MyThread("C").start();

        System.out.println("end");
    }
}
