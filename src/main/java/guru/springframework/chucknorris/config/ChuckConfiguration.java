package guru.springframework.chucknorris.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckConfiguration {
//commenting out to do an XML configuration - see resources/chuck-config.xml and ChucknorrisApplication.java:@ImportResource("classpath:chuck-config.xml")
//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
