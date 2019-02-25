package com.example.demo;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaAssistTest {

    @Test
    public void testGenerate() throws CannotCompileException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassPool pool = ClassPool.getDefault();

        CtClass cc = pool.makeClass("com.orgdown.dapei.Hello");

        cc.addMethod(CtMethod.make("public static void say() {System.out.println(\"hello\");}", cc));


        Class<?> aClass = cc.toClass();
        Object instance = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("say");
        method.invoke(instance);
    }

    @Test
    public void test(){

    }
}
