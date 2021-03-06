package org.apache.camel.component.file;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.camel.spi.annotations.SubServiceFactory;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.TYPE })
@SubServiceFactory("strategy.factory")
public @interface FileProcessStrategy {

    Class value();

}
