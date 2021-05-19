package com.itcv.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Pointcut("execution(public * com.itcv..demo.aop.IndexController.index*(..))")
    public void addAdvice() {
    }

    @Around("addAdvice()")
    public Object Interceptor(ProceedingJoinPoint pjp) {
        Object result = null;
        Object[] args = pjp.getArgs();
        if (args != null && args.length > 0) {
            String param = (String) args[0];
            if (null == param || param.trim() == "") {
                return "no parameter";
            }
        }
        try {
            result = pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }

}
