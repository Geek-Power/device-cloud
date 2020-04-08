package org.geekpower.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 模板页面启动器
 * 
 * @author songyz
 * @createTime 2020-04-08 16:17:47
 */
@Controller
@SpringBootApplication
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }

    @GetMapping("/{rootPath}")
    public String getPage(@PathVariable String rootPath) {
        return rootPath;
    }

    @GetMapping("/{module}/{page}")
    public String getPage(@PathVariable String module, @PathVariable String page) {
        return module + "/" + page;
    }

    @GetMapping("/{module}/{subModule}/{page}")
    public String getPage(@PathVariable String module, @PathVariable String subModule, @PathVariable String page) {
        return module + "/" + subModule + "/" + page;
    }

}
