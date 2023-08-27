package org.adtado.verticalcode.effective.chap2.item9;

public class CustomResource2 implements AutoCloseable {

    public CustomResource2() {
        System.out.println("CustoResource2 Constructor");
    }

    public void doSomeThing() {
        System.out.println("Hello From CustomResource2");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close CustomResource2");
    }
}
