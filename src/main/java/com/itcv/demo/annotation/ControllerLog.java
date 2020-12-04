package com.itcv.demo.annotation;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ControllerLog {

    /**
     * 操作描述 业务名称business
     *
     * @return
     */
    String description() default "";

    /**
     * 功能页面
     *
     * @return
     */
    String module();

    /**
     * 操作类型
     *
     * @return
     */
    String opType();
}
