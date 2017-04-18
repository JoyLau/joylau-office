/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel.wrapper;


import cn.joylau.office.excel.ExcelReaderWrapper;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractWrapper<T> implements ExcelReaderWrapper<T> {
    protected boolean shutdown;
    protected Map<String, String> headerNameMapper = new HashMap<>();

    @Override
    public boolean isShutdown() {
        return shutdown;
    }

    @Override
    public void shutdown() {
        shutdown = true;
    }


    @Override
    public void wrapperDone(T instance) {

    }

    protected String headerMapper(String old) {
        String newHeader = headerNameMapper.get(old);
        if (newHeader == null) return old;
        else return newHeader;
    }

    public Map<String, String> getHeaderNameMapper() {
        return headerNameMapper;
    }

    public void setHeaderNameMapper(Map<String, String> headerNameMapper) {
        this.headerNameMapper = headerNameMapper;
    }
}
