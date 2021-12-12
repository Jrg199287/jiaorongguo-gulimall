package com.firenay.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @className: TestValueConstraintValidator
 * @description: TODO 类描述
 * @author: niaonao
 * @date: 2021/12/4 0004
 * 身无彩凤双飞翼 心有灵犀一点通
 **/
public class TestValueConstraintValidator implements ConstraintValidator<TestValue,Integer>     {
    /**
     * set 里面就是使用注解时规定的值, 例如: @ListValue(vals = {0,1})  set= {0,1}
     */
    private Set<Integer> set = new HashSet<>();
    @Override
    public void initialize(TestValue constraintAnnotation) {
        int[] var = constraintAnnotation.vals();
        for (int val : var) {
            set.add(val);
        }
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(integer);
    }
}
