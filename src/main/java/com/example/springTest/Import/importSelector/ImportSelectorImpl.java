package com.example.springTest.Import.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
public class ImportSelectorImpl implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.example.springTest.Import.configuration.ImportService"};
    }
}
