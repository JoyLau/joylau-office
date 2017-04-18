/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel.config;

/**
 * 自定义列样式
 */
public class CustomColumnStyle {
    /**
     * 列宽度
     */
    private int width = 5000;

    public CustomColumnStyle() {
    }

    public CustomColumnStyle(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
