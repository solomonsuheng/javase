package Demo;

/**
 * Created by Suheng on 6/13/15.
 */
public class CustomException extends Exception {    //或者继承任何标准异常类
    public CustomException()  {}                //用来创建无参数对象
    public CustomException(String message) {        //用来创建指定参数对象
        super(message);                             //调用超类构造器
    }
}