/*
 * Copyright (C) 2014 Klinker Apps, Inc.
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

package com.klinker.android.theme_spotlight.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import com.klinker.android.theme_spotlight.data.AuthToken;

public abstract class AbstractThemeFragment extends Fragment {

    private static final String TAG = "AbstractThemeFragment";

    public static final String AUTH_TOKEN = "auth_token";
    public static final String ANDROID_ID = "android_id";

    public static void setArguements(AbstractThemeFragment frag, AuthToken token) {
        Bundle args = new Bundle();
        args.putString(AUTH_TOKEN, token.getToken());
        args.putString(ANDROID_ID, token.getAndroidId());
        frag.setArguments(args);

        Log.v(TAG, "token: " + token.getToken() + ", androidId: " + token.getAndroidId());
    }
}