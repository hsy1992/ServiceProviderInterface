package com.endless.serviceproviderinterface;

import com.endless.aninterface.Display;

/**
 * @author haosiyuan
 * @date 2019-08-30 13:55
 * info :
 */
public class DisplayImpl implements Display {
    @Override
    public String display() {
        return "这是DisplayImpl";
    }
}
