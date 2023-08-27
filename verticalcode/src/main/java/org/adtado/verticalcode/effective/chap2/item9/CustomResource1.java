package org.adtado.verticalcode.effective.chap2.item9;

public class CustomResource1 implements AutoCloseable {
    public CustomResource1() {
        System.out.println("CustoResource1 Constructor");
    }

    public void doSomeThing() {
        System.out.println("Hello From CustomResource1");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close CustomResource1");
    }
}
