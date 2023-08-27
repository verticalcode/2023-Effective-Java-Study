package org.adtado.verticalcode.effective.chap3.item10;

public class MyNumber1 {
    private Number x;

    public void setX(Number number) throws Exception {
        if(number instanceof Double) {
            x = number;
        } else if (number instanceof Float) {
            x = number;
        } else if (number == null) {
            x = null;
        } else {
            throw new Exception("가능한 입력이 아닙니다");
        }
    }

    public Number getX() {
        return x;
    }
}
