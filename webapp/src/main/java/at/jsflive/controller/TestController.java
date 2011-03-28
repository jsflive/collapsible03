package at.jsflive.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestController {
    private boolean collapsed = false;
    private int intValue;

    public boolean isCollapsed() {
        return collapsed;
    }

    public void setCollapsed(boolean collapsed) {
        this.collapsed = collapsed;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
