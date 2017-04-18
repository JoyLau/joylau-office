/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel.config;

/**
 * 抽象回掉，实现手动结束读取的功能
 */
public abstract class AbstractExcelReaderCallBack implements ExcelReaderCallBack {

    protected boolean shutdown;

    @Override
    public boolean isShutdown() {
        return shutdown;
    }

    @Override
    public void shutdown() {
        shutdown = true;
    }

    @Override
    public void done(Object workBook) {

    }

    @Override
    public void sheetDone(Object sheet) throws Exception {

    }
}
