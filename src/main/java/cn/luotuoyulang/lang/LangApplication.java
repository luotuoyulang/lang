package cn.luotuoyulang.lang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class LangApplication {

    public static void main(String[] args) {
        SpringApplication.run(LangApplication.class, args);
    }

}
