package com.lf.tempcore.tempUtil.statusUtil;

import android.view.Window;

/**
 *
 *状态栏接口
 * @author msdx (msdx.android@qq.com)
 * @version 0.3
 * @since 0.3
 */

interface IStatusBar {
    void setStatusBarColor(Window window, int color);
     void translucentStatusBar(Window window);
}
