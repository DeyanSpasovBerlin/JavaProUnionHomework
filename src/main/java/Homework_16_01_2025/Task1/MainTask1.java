package Homework_16_01_2025.Task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainTask1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchFieldException {
        MyStack stack = new MyStack(2);
        ReflectionMethods ref = new ReflectionMethods();
        System.out.println(stack);
        System.out.println("Input A and B with reflection:");
        ref.reflectionPush(stack,"A");
        System.out.println(stack);
        ref.reflectionPush(stack,"B");
        System.out.println(stack);
        System.out.println("------------------------");
        System.out.println("Pop  B with reflection:");
        System.out.println(ref.reflectionPop(stack));
        System.out.println(stack);
        System.out.println("------------------------");
        System.out.println("Make new instance of Stack initial capacity = 5 with reflection:");
        MyStack reflectionStack = ref.reflectionConstructor(5);
        System.out.println(reflectionStack);
        System.out.println("------------------------");
        System.out.println("Add  A,B,C,D,E with reflection:");
        ref.reflectionPush(reflectionStack,"A");
        ref.reflectionPush(reflectionStack,"B");
        ref.reflectionPush(reflectionStack,"C");
        ref.reflectionPush(reflectionStack,"D");
        ref.reflectionPush(reflectionStack,"E");
        System.out.println(reflectionStack);
        System.out.println("------------------------");
        System.out.println("Change stack length with reflection:");
        ref.reflectionChangeInitialCapacity(reflectionStack,6);
        System.out.println("------------------------");
        System.out.println(reflectionStack);
        System.out.println("Add  F with reflection:");
        ref.reflectionPush(reflectionStack,"F");
        System.out.println(reflectionStack);
    }
}



/*
1 уровень сложности: 1. Имеется класс summary20241108.MyStack (см. код в репозитории). Через рефлексию:
вызвать методы push() и pop() на существующем объекте,
создать экземпляр класса,
добавить шестой элемент "F" в уже заполненный стек из пяти элементов:
MyStack stack = new MyStack(5);
stack.push("A");
stack.push("B");
stack.push("C");
stack.push("D");
stack.push("E");
 */