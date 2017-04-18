/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel.wrapper;


import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapWrapper extends AbstractWrapper<Map<String, Object>> {

    private int nullHeaderSize = 1;

    @Override
    public Map<String, Object> newInstance() {
        return new LinkedHashMap();
    }

    @Override
    public void wrapper(Map<String, Object> instance, String header, Object value) {
        if (header == null || "".equals(header)) {
            header = "null." + nullHeaderSize++;
        }
        header=header.trim();
        instance.put(headerMapper(header), value);
    }

}
