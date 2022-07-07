package di;

import org.springframework.stereotype.Component;


@Component
public class Kamali implements GoodKamali {
    public Kamali() {
        System.out.println("Kamali is in the context");
    }

    @Override
    public void chat() {
        System.out.println("Chatting");
    }
}


