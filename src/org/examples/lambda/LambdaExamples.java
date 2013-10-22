package org.examples.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExamples {

    public static void main(String[] args) {
        functionalInterface_WithNoArguments_And_VoidReturnType();
        functionalInterface_WithArgument_And_VoidReturnType();
        functionalInterface_WithArgument_And_ReturnType();
        classWithLambdaWorkingOffInstanceVariable();
        staticMethodReferenceWithSameTypeSignature();
        staticMethodReference();
        instanceMethodReference();
    }

    private static void functionalInterface_WithNoArguments_And_VoidReturnType() {
        Runnable r = () -> {
            System.out.println("hello");
        };
        new Thread(r).start();
    }

    private static void functionalInterface_WithArgument_And_VoidReturnType() {
        Operation1 o = i -> System.out.println(i + 2);
        o.operate(5);
    }

    private static void functionalInterface_WithArgument_And_ReturnType() {
        Operation2 o = i -> i + 2;
        System.out.println(o.operate(5));
    }

    private static void classWithLambdaWorkingOffInstanceVariable() {
        Foo foo = new Foo();
        foo.setI(5);
        foo.operate();
        System.out.println(foo.getI());
    }

    private static void staticMethodReferenceWithSameTypeSignature() {
        Integer[] numbers = {3, 2, 8};
        Arrays.sort(numbers, Integer::compare);
    }

    private static void staticMethodReference() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.forEach(System.out::println);
    }

    private static void instanceMethodReference() {
        List<Integer> numbers = Arrays.asList(4, 5, 6);
        numbers.forEach(Integer::longValue);
    }
}