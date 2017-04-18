/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.word.config;

/**
 * word读取回掉
 */
public interface WordReaderCallBack {

    /**
     * 当读取到一个段落时调用此方法,并传入段落实例
     *
     * @param par 段落实例
     */
    void onParagraph(Object par);

    /**
     * 当读取到一个表格时调用此方法,并传入表格实例
     *
     * @param table 表格实例
     */
    void onTable(Object table);

    /**
     * 当一个文档全部读取完成时,调用此方法,并传入文档的实例
     *
     * @param document 文档实例
     * @throws Exception
     */
    void done(Object document) throws Exception;
}
