/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.excel;


import cn.joylau.office.excel.config.ExcelWriterConfig;

import java.io.OutputStream;

public interface ExcelWriter {
    void write(OutputStream outputStream, ExcelWriterConfig config, ExcelWriterConfig... moreSheet) throws Exception;
}
