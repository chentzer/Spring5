
import chentzer.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        Car swift = new Swift();
//        swift.chentzer.specs();
//        Car corolla = new Corolla();
//        corolla.chentzer.specs();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car myCar = context.getBean("corolla", Car.class);
        myCar.specs();
        context.close();
    }
}
