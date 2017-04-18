/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.office.word.api.poi;


import cn.joylau.office.word.WordApi;

public class POIWordApi {
    public static final WordApi getDocxInstance() {
        return POIWordApi4Docx.getInstance();
    }
}
