package com.dynasty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author dynasty
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DynastyApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DynastyApplication.class, args);
        System.out.println("==============================================================");
        System.out.println("(♥◠‿◠)ﾉﾞ  Dynasty 启动成功   ლ(´ڡ`ლ)ﾞ");
        System.out.println("==============================================================");
    }
}


