package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kamal implements DI {

    //    @Autowired
    GoodKamali kamali;

    public Kamal() {
        System.out.println("Kamal is in the context");
    }

    //constructor injection
//    @Autowired
//    public Kamal(GoodKamali k) {
//        this.kamali=k;
//        System.out.println("Kamal is in the context");
//    }

    //setter method injection
//    @Autowired
//    public void setKamali(GoodKamali kmli){
//        this.kamali=kmli;
//    }


    public void chattingWithKamali() {
        kamali.chat();
    }

    @Autowired
    @Override
    public void inject(GoodKamali kamali) {
        this.kamali = kamali;
    }
}


