/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel.config;

/**
 * 自定义行样式
 */
public class CustomRowStyle {
    /**
     * 行高度
     */
    private double height = 20;

    public CustomRowStyle() {
    }

    public CustomRowStyle(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
