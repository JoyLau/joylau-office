/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel.support.template.expression.keyword;

public class ForEach {
    private String data;

    private String as;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public ForEach fromString(String str) {
        String[] strs = str.trim().replaceAll("\\s{2,}", " ").split("[ ]");
        if (strs.length == 4) {
            setData(strs[1]);
            setAs(strs[3]);
        } else {
            return null;
        }
        return this;
    }

    @Override
    public String toString() {
        return "each " + data + " as " + as;
    }

    public static void main(String[] args) {
        System.out.println(new ForEach().fromString(" each    datas as aaa"));
    }
}
