package org.geekpower.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("模板接口")
@Controller
@RequestMapping("template")
public class TemplateController {

    @ApiOperation("跳转一级页面")
    @GetMapping("{rootPath}")
    public String toRootPage(@PathVariable String rootPath) {
        return rootPath;
    }

    @ApiOperation("跳转二级页面")
    @GetMapping("{module}/{page}")
    public String toModulePage(@PathVariable String module, @PathVariable String page) {
        return module + "/" + page;
    }

    @ApiOperation("跳转三级页面")
    @GetMapping("{module}/{subModule}/{page}")
    public String toModulePage(@PathVariable String module, @PathVariable String subModule, @PathVariable String page) {
        return module + "/" + subModule + "/" + page;
    }

}
