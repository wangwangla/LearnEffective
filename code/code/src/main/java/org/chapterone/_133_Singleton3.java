package org.chapterone;

public class _132_Singleton2 {
    private static final _132_Singleton2 INSTANCE = new _132_Singleton2();
    private _132_Singleton2(){

    }

    /**
     * 共有域 清楚表达这是一个单例，   第二个 更简单
     * @return
     */
    public static _132_Singleton2 getInstance(){
        return INSTANCE;
    }
}
