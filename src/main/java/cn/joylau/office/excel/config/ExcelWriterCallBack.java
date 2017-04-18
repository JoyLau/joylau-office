/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel.config;

/**
 * excel写出回掉,api在进行excel写出时,通过调用回掉来进行表格渲染
 */
public interface ExcelWriterCallBack {

    /**
     * 传入一个写出处理器进行渲染表格
     * 通过调用传入的处理器接口进行excel渲染
     *
     * @param processor excel写出处理器
     */
    void render(ExcelWriterProcessor processor);

}
