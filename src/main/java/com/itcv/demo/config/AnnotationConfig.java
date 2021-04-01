package com.itcv.demo.config;

import com.itcv.demo.annotation.ControllerLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class AnnotationConfig {
    @Pointcut("@annotation(com.itcv.demo.annotation.ControllerLog)")
    private void pointcut() {
    }

    @Around("pointcut()")
    public Object round(ProceedingJoinPoint joinPoint) throws Throwable {

        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        Map<String, Object> map = new HashMap<>();
        //切面返回值
        Object returnValue = joinPoint.proceed();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] classes = method.getParameterTypes();
                if (classes.length == arguments.length) {
                    //取入参数据
                    String module = method.getAnnotation(ControllerLog.class).module();
                    String opType = method.getAnnotation(ControllerLog.class).opType();
                    map.put("module", module);
                    map.put("opType", opType);
                    break;
                }
            }
        }
        //切面返回值
       return  returnValue;
        }



}
