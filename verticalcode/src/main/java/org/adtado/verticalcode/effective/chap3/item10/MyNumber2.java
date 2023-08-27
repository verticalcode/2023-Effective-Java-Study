package org.adtado.verticalcode.effective.chap3.item10;

import java.util.Objects;

public class MyNumber2 {
    private Object x;

    public void setX(Object number) throws Exception {
        if(number instanceof Double) {
            x = (Double) number;
        } else if (number instanceof Float) {
            x = (Float) number;
        } else if (number == null) {
            x = null;
        } else {
            throw new Exception("가능한 입력이 아닙니다.");
        }
    }

    public Object getX() {
        return x;
    }

    public boolean equals(Object o) {
        if(!(o instanceof MyNumber2)) {
            return false;
        }

        MyNumber2 myNumber2 = (MyNumber2) o;
        return Objects.equals(myNumber2.getX(), this.x);
    }
}
