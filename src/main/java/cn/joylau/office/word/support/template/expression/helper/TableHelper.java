/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.word.support.template.expression.helper;

import cn.joylau.commons.utils.StringUtils;
import cn.joylau.office.word.support.template.expression.WordHelper;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 * word表格渲染辅助器
 */
public class TableHelper implements WordHelper {

    /**
     * 第一行对象,表达式所在行，而非表头
     */
    private XWPFTableRow firstRow;

    /**
     * 当前渲染的行
     */
    private XWPFTableRow nowRow;

    private int rowIndex = 0;

    /**
     * 换行操作
     *
     * @param cell 触发此操作的单元格
     */
    public void nextRow(XWPFTableCell cell) {
        if (nowRow == null) {
            firstRow = nowRow = cell.getTableRow();
            rowIndex = firstRow.getTable().getRows().indexOf(firstRow);
        } else {
            nowRow = nowRow.getTable().insertNewTableRow(rowIndex++);
            nowRow.setHeight(firstRow.getHeight());
        }
    }

    /**
     * 渲染一列单元格操作
     *
     * @param cell   原始单元格(表达式所在的单元格)
     * @param params 单元格值
     */
    public void nextCell(XWPFTableCell cell, Object... params) {
        XWPFTableCell cell_tmp = nowRow.getCell(firstRow.getTableCells().indexOf(cell));
        if (params == null)
            params = new String[]{""};
        if (cell_tmp == null) {
            cell_tmp = nowRow.addNewTableCell();
            cell_tmp.addParagraph(cell.getParagraphArray(0));
        }
        for (int i = 0, len = cell.getParagraphs().size(); i < len; i++) {
            cell.removeParagraph(i);
        }
        cell_tmp.setText(StringUtils.concat(params));
    }


    @Override
    public void reset() {
        firstRow = null;
        nowRow = null;
    }
}
