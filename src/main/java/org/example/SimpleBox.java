package org.example;


public class SimpleBox {
    private Object myObject;


    public SimpleBox(Object myObject) {
        this.myObject = myObject;
    }

    public Object getMyObject() {
        return myObject;
    }

    public void setMyObject(Object myObject) {
        this.myObject = myObject;
    }
}
