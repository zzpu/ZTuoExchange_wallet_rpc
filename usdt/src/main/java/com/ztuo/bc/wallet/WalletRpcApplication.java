package com.ztuo.bc.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WalletRpcApplication {
    public static void main(String[] args){
        SpringApplication.run(WalletRpcApplication.class,args);
    }
}
