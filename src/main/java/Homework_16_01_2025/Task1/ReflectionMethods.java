package Homework_16_01_2025.Task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.lang.reflect.Field;

public class ReflectionMethods {
    public void reflectionPush(MyStack stack,String argum) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends MyStack> stackClass = stack.getClass();
        System.out.println(Arrays.toString(stackClass.getDeclaredMethods()));
        Method method = stackClass.getDeclaredMethod("push", String.class);
        method.setAccessible(true);
        method.invoke(stack, argum);
    }
    public String reflectionPop(MyStack stack) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends MyStack> stackClass = stack.getClass();
        System.out.println(Arrays.toString(stackClass.getDeclaredMethods()));
        Method method = stackClass.getDeclaredMethod("pop");
        method.setAccessible(true);
        String popResult = (String) method.invoke(stack);
        return popResult;
    }
    public MyStack reflectionConstructor( int capacity) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> forName = Class.forName("Homework_16_01_2025.Task1.MyStack");
         Constructor<?> refConstructor = forName.getConstructor(int.class);
        MyStack refStack = (MyStack) refConstructor.newInstance(capacity);
        return refStack;
    }
    public void reflectionChangeInitialCapacity(MyStack stack,int capacity) throws NoSuchFieldException, IllegalAccessException {
        Class<? extends MyStack> stackClass = stack.getClass();
        Field stackLength = stackClass.getDeclaredField("data");
        stackLength.setAccessible(true);
        String[] s = (String[]) stackLength.get(stack);
        System.out.println("Lenght befor changing is: "+s.length);
        String[] reflectionDate = Arrays.copyOf(s,capacity);
                stackLength.set(stack,reflectionDate);
        s = (String[]) stackLength.get(stack);
        System.out.println("Lenght after changing is: "+s.length);
    }

}
