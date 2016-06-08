/*
 * Copyright 2016 Alireza Eskandarpour Shoferi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.meness.easyintro.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import io.github.meness.easyintro.R;
import io.github.meness.easyintro.listeners.OnToggleIndicatorsClickListener;

public class RightToggleIndicator extends AbstractToggleIndicator {
    private OnToggleIndicatorsClickListener mListener;

    public RightToggleIndicator(Context context) {
        super(context);
    }

    public RightToggleIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RightToggleIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RightToggleIndicator(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void setListener(OnToggleIndicatorsClickListener listener) {
        mListener = listener;
    }

    public void makeItDone() {
        setImageResource(R.drawable.ic_done_white_24dp);
    }

    public void makeItNext() {
        setImageResource(R.drawable.ic_keyboard_arrow_right_white_24dp);
    }

    @Override
    public void onClick(View v) {
        if (mListener != null) {
            mListener.onRightToggleClick();
        }
    }
}