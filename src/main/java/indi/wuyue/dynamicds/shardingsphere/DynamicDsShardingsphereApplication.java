package indi.wuyue.dynamicds.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@MapperScan("indi.wuyue.dynamicds.shardingsphere.dao")
@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class DynamicDsShardingsphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDsShardingsphereApplication.class, args);
    }

}
