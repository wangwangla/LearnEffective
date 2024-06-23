package org.chapterone;

import java.io.Serializable;

public class _133_Singleton3 implements Serializable {
    private static transient final _133_Singleton3 INSTANCE = new _133_Singleton3();
    private _133_Singleton3(){

    }

    /**
     * 共有域 清楚表达这是一个单例，   第二个 更简单
     * @return
     */
    public static _133_Singleton3 getInstance(){
        return INSTANCE;
    }

    public _133_Singleton3 readReslove(){
        return INSTANCE;
    }
}
