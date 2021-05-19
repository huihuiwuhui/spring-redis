package com.itcv.demo.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Persion implements BeanNameAware,InitializingBean, DisposableBean, BeanClassLoaderAware, BeanPostProcessor, BeanFactoryPostProcessor {

    public Persion(){
        System.out.println("这是一个初始化类");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("initMethod");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("destroyMethod");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁当前实例");
    }



    @Override
    public void afterPropertiesSet() throws Exception {
          System.out.println("afterPropertiesSet");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName"+s);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization"+beanName);
        return bean;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory什么时候执行呢？");
    }
}
