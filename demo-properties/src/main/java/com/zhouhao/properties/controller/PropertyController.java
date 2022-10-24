package com.zhouhao.properties.controller;

import cn.hutool.core.lang.Dict;
import com.zhouhao.properties.property.ApplicationProperty;
import com.zhouhao.properties.property.DeveloperProperty;
import com.zhouhao.properties.property.TestProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:49
 */
@RestController
public class PropertyController {
    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;
    private final TestProperty testProperty;

    @Autowired
    public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty, TestProperty testProperty) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
        this.testProperty = testProperty;
    }

    @GetMapping("/property")
    public Dict index() {
        return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty)
            .set("zhouhaoTestProperty", testProperty);
    }

    @GetMapping("/property2")
    public Dict index2() {
        return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty)
            .set("zhouhaoTestProperty", testProperty);
    }
}
