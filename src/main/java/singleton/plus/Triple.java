package singleton.plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kerwin
 * @create 2024-05-08 18:13
 */
public class Triple {

    private static List<Triple> list = Arrays.asList(new Triple(),new Triple(),new Triple());


    private Triple() {

    }

    public static Triple getInstance(int id) {
        return list.get(id);
    }
}
