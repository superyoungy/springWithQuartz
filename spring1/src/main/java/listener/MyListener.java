package listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {
    @EventListener(value = {ApplicationEvent.class})
    public void myListenerMethod(ApplicationEvent event) {
        System.out.println("监听...");
    }
}
