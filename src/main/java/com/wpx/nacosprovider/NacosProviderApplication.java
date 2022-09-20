package com.wpx.nacosprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication // 启动一个Spring Boot应用。
public class NacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication.class, args);
    }


    @RestController // 定义一个EchoController。
    class EchoController{

        @GetMapping("/echo") // /echo是EchoController对外暴露的访问路径。
        public String echo(HttpServletRequest request){
            return  "echo:" + request.getParameter("name"); // echo返回“echo：#{name 参数}”。
        }

    }

}
