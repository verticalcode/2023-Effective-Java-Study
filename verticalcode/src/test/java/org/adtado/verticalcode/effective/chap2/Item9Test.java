package org.adtado.verticalcode.effective.chap2;

import org.adtado.verticalcode.effective.chap2.item9.CustomResource1;
import org.adtado.verticalcode.effective.chap2.item9.CustomResource2;
import org.junit.jupiter.api.Test;

public class Item9Test {

    @Test
    public void try_with_resource_자원회수_테스트() throws Exception {

        try(CustomResource1 cr1 = new CustomResource1(); CustomResource2 cr2 = new CustomResource2()) {
            cr1.doSomeThing();
            cr2.doSomeThing();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
