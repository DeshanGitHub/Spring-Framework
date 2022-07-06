package bean;

import org.springframework.beans.factory.DisposableBean;

public class MyConnection implements DisposableBean {
    public MyConnection() {
        System.out.println("My Connection");
    }

    @Override
    public void destroy(){
        System.out.println("My Connection Destroyed..!!");
    }
}
