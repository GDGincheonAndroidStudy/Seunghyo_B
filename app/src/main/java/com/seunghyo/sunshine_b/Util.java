package com.seunghyo.sunshine_b;

import android.util.Log;

/**
 * Created by SeungHyo on 2015-07-25. // 로그를 찍는데 사용하면 편함. 릴리즈할때 로그관리에 매우 편리
 */
public class Util {

    private static Util m_instance;
    private static Boolean DEBUG = true; // 디버그 모드에서 그 클래스에 로그를 보고싶을때 true 설정.
    private static String TAG = "Util"; // 일일이 클래스마다 태그를 설정해 주어야함.
    private static final Boolean DEBUGMODE = true;

    //TODO : 릴리즈 할때 false로 바꾸어야 로그가 안보여요!

    private Util() {
        printLog(DEBUG, TAG, "[Util]");
    }

    public static Util getInstance() {
        if (m_instance == null) {
            m_instance = new Util();
        }
        return m_instance;
    }

    public void printLog(boolean bPrint, String tag, String msg) {
        if (DEBUGMODE) {
            if (bPrint) {
                Log.d(tag, msg);
            }
        }
    }
}
