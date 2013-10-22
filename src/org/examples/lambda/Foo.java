package org.examples.lambda;

public class Foo {

    private int i;
    private Operation2 o = i -> i + 2;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void operate() {
        i = o.operate(i);
    }

    public void otherOperate() {
        int k = 0;
        Operation2 o2 = j -> k *3;
    }
}
