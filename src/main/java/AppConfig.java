import chentzer.car.Corolla;
import chentzer.car.Swift;
import chentzer.specs.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"chentzer"})
public class AppConfig {

    @Bean("corolla")
    public Corolla corolla(){
        return new Corolla();
    }

    @Bean("swift")
    public Swift swift(){
        return new Swift();
    }

    @Bean("UnknownEngine")
    public EngineType type(){
        return new EngineType();
    }

    @Bean("V6Engine")
    public EngineType V6type(){
        return new EngineType("V6 Engine");
    }
}
