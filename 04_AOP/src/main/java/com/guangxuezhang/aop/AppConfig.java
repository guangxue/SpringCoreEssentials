package com.guangxuezhang.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
/**
 * @ComponentScan without arguments
 *    tells Spring to scan
 *    the current package
 *    and all of its sub-packages.
 */
@ComponentScan
public class AppConfig {
}
