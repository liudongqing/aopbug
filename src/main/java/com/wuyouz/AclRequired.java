package com.wuyouz;

import java.lang.annotation.*;

/**
 * Created by liudongqing on 16/7/19.
 */
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AclRequired {
}
