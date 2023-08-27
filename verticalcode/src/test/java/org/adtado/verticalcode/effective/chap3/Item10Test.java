package org.adtado.verticalcode.effective.chap3;

import org.adtado.verticalcode.effective.chap3.item10.MyNumber1;
import org.adtado.verticalcode.effective.chap3.item10.MyNumber2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Item10Test {

    @Test
    public void equals_Test() throws Exception {
        List<Object> myList1 = new ArrayList<>();
        List<Object> myList2 = new ArrayList<>();

        MyNumber1 myNumber1 = new MyNumber1();
        myNumber1.setX((Double) 4.5);
        myList1.add(myNumber1);
        MyNumber2 myNumber2 = new MyNumber2();
        myNumber2.setX((Float) 3.4f);
        myList2.add(myNumber2);

        MyNumber1 myNumber1_2 = new MyNumber1();
        myNumber1_2.setX((Double) 4.5);
        MyNumber2 myNumber2_2 = new MyNumber2();
        myNumber2_2.setX((Float) 3.4f);
        // Equals가 재정의 되지 않은 경우에는 false
        Assertions.assertThat(myList1.contains(myNumber1_2)).isEqualTo(false);

        //Equals가 재정의 된 경우에는 true
        Assertions.assertThat(myList2.contains(myNumber2_2)).isEqualTo(true);
    }
}
