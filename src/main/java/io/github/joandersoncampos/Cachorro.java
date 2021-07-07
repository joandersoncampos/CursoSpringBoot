package io.github.joandersoncampos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Autowired
@Qualifier("cachorro")
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cachorro {
}
