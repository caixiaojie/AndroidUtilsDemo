/**
 * Copyright 2015 bingoogolapple
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lf.tempcore.tempAdapter.cy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 创建时间:15/5/21 上午1:00
 * 描述:适用于AdapterView的item的ViewHolder
 */
public class CYAdapterViewHolder {
    protected View mConvertView;
    protected CYViewHolderHelper mViewHolderHelper;

    private CYAdapterViewHolder(ViewGroup parent, int layoutId) {
        mConvertView = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
        mConvertView.setTag(this);
        mViewHolderHelper = new CYViewHolderHelper(parent, mConvertView);
    }

    /**
     * 拿到一个可重用的ViewHolder对象
     *
     * @param convertView
     * @param parent
     * @param layoutId
     * @return
     */
    public static CYAdapterViewHolder dequeueReusableAdapterViewHolder(View convertView, ViewGroup parent, int layoutId) {
        if (convertView == null) {
            return new CYAdapterViewHolder(parent, layoutId);
        }
        return (CYAdapterViewHolder) convertView.getTag();
    }

    public CYViewHolderHelper getViewHolderHelper() {
        return mViewHolderHelper;
    }

    public View getConvertView() {
        return mConvertView;
    }

}