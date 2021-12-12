package com.firenay.common.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @className: TestValue
 * @description: TODO 类描述
 * @author: niaonao
 * @date: 2021/12/4 0004
 * 身无彩凤双飞翼 心有灵犀一点通
 **/
@Documented
// 指定校验器   这里可以指定多个不同的校验器
@Constraint(validatedBy = {TestValueConstraintValidator.class})
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface TestValue {
    String message() default "{com.firenay.common.valid.ListValue.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int[] vals() default { };
}
