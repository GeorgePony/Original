package com.example.springTest.Import.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
@Configuration
@Import(ImportService.class)
public class ImportConfig {
}
