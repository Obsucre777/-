package singleton.plus;

/**
 * @author kerwin
 * @create 2024-05-08 17:46
 */
public class Main2 {
    public static void main(String[] args) {
        Triple instance0_1 = Triple.getInstance(0);
        Triple instance0_2 =  Triple.getInstance(0);
        if(instance0_1==instance0_2){
            System.out.println("相同");
        }
        Triple instance1_1 = Triple.getInstance(1);
        Triple instance1_2 =  Triple.getInstance(1);
        if(instance1_1==instance1_2){
            System.out.println("相同");
        }
    }
}
