package com.google.appinventor.components.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface UsesLibraries
{
  public abstract String libraries();
}

/* Location:           C:\Users\ANGELES\Desktop\BUAP\6_Primavera_2018\TEC_EMERGENTES\APP_FUNCIONAL\lobopark_dex2jar.jar
 * Qualified Name:     com.google.appinventor.components.annotations.UsesLibraries
 * JD-Core Version:    0.6.2
 */