package com.zhouhao.properties.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 项目配置
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:50
 */
@Data
@Component
@ConfigurationProperties(prefix = "application")
public class ApplicationProperty {
    //    @Value("${application.name}")
    private String name;
    //    @Value("${application.version}")
    private String version;
}
