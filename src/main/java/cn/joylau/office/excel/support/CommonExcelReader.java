/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel.support;


import cn.joylau.office.excel.ExcelReaderWrapper;

/**
 * 通用的excel读取器,使用指定的包装器，将excel数据包装为对象，因此必须指定一个包装器。
 */
public class CommonExcelReader<T> extends AbstractExcelReader<T> {

    protected ExcelReaderWrapper<T> wrapper = null;

    @Override
    public ExcelReaderWrapper<T> getWrapper() {
        return wrapper;
    }

    public void setWrapper(ExcelReaderWrapper<T> wrapper) {
        this.wrapper = wrapper;
    }
}
