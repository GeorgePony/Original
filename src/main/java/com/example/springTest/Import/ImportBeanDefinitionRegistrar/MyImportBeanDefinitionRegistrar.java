package com.example.springTest.Import.ImportBeanDefinitionRegistrar;

import com.example.springTest.Import.configuration.ImportService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(ImportService.class);
        beanDefinitionRegistry.registerBeanDefinition("importService" , rootBeanDefinition);

    }
}
