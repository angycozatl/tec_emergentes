package com.google.appinventor.components.annotations;

import com.google.appinventor.components.annotations.androidmanifest.ActivityElement;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface UsesActivities
{
  public abstract ActivityElement[] activities();
}

/* Location:           C:\Users\ANGELES\Desktop\BUAP\6_Primavera_2018\TEC_EMERGENTES\APP_FUNCIONAL\lobopark_dex2jar.jar
 * Qualified Name:     com.google.appinventor.components.annotations.UsesActivities
 * JD-Core Version:    0.6.2
 */