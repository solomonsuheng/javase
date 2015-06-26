import Demo.IFcuntion;
import Demo.ReturnTrue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Suheng on 15/5/3.
 */
public class Hello {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Map<String, IFcuntion> map = new HashMap<String, IFcuntion>();
        map.put("h", new ReturnTrue());
        System.out.println(map.get("h").call());


    }

}
