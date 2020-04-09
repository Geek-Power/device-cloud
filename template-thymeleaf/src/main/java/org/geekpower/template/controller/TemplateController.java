package org.geekpower.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("template")
public class TemplateController {

    @GetMapping("{rootPath}")
    public String getPage(@PathVariable String rootPath) {
        return rootPath;
    }

    @GetMapping("{module}/{page}")
    public String getPage(@PathVariable String module, @PathVariable String page) {
        return module + "/" + page;
    }

    @GetMapping("{module}/{subModule}/{page}")
    public String getPage(@PathVariable String module, @PathVariable String subModule, @PathVariable String page) {
        return module + "/" + subModule + "/" + page;
    }

}
