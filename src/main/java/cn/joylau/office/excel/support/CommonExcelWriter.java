/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel.support;


import cn.joylau.office.excel.ExcelApi;
import cn.joylau.office.excel.ExcelWriter;
import cn.joylau.office.excel.api.poi.POIExcelApi;
import cn.joylau.office.excel.api.poi.callback.CommonExcelWriterCallBack;
import cn.joylau.office.excel.config.ExcelWriterConfig;

import java.io.OutputStream;

public class CommonExcelWriter implements ExcelWriter {
    private ExcelApi api = POIExcelApi.getInstance();

    public ExcelApi getApi() {
        return api;
    }

    public void setApi(ExcelApi api) {
        this.api = api;
    }

    @Override
    public void write(OutputStream outputStream, ExcelWriterConfig config, ExcelWriterConfig... moreSheet) throws Exception {
        CommonExcelWriterCallBack call = new CommonExcelWriterCallBack(config);
        CommonExcelWriterCallBack[] callBackArr = new CommonExcelWriterCallBack[moreSheet.length];
        for (int i = 0; i < moreSheet.length; i++) {
            callBackArr[i] = new CommonExcelWriterCallBack(moreSheet[i]);
        }
        getApi().write(outputStream, call, callBackArr);
    }
}
