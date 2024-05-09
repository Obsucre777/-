package singleton.plus;

/**
 * @author kerwin
 * @create 2024-05-09 20:44
 */
public class Main1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(TicketMaker.getInstance().getNextTicketNumber());
        }
    }
}
