package org.joonseok.comset;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for describing parameters
 * 
 * @author Joon-Seok Kim (jkim258 at gmu.edu)
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ParameterGroup {
	public String group();
	public String description();
	public String lower();
	public String upper();
}
