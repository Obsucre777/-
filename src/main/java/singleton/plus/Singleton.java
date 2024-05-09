package singleton.plus;

/**
 * @author kerwin
 * @create 2024-05-09 20:57
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        //减慢创建实例的速度
        slowDown();
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;

    }

    public static void slowDown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
