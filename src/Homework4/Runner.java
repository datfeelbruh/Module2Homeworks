package Homework4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        UserMeta userMeta = new UserMeta("Dmitriy", 10);
        getClassAnnotation(userMeta);
        getFieldAnnotation(userMeta);
        getMethodAnnotation(userMeta);
    }

    public static void getClassAnnotation(UserMeta userMeta) {
        if (userMeta.getClass().isAnnotationPresent(GetMetaData.class)) {
            Arrays.stream(userMeta.getClass().getDeclaredFields()).forEach(e -> System.out.println(e.getName()));
        }
    }

    public static void getFieldAnnotation(UserMeta userMeta) throws IllegalAccessException {
        for (Field field : userMeta.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(GetMetaData.class)) {
                field.setAccessible(true);
                System.out.println(field.get(userMeta));
            }
        }
    }
    public static void getMethodAnnotation(UserMeta userMeta) throws InvocationTargetException, IllegalAccessException {
        for (Method method : userMeta.getClass().getMethods()) {
            if (method.isAnnotationPresent(GetMetaData.class)) {
                long start = System.currentTimeMillis();
                method.invoke(userMeta, "some prefix");
                long end = System.currentTimeMillis();
                System.out.println(end - start);
            }
        }
    }
}
