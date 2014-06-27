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

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.klinker.android.theme_spotlight.AbstractSpotlightTest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;

public class ThemeListFragmentTest extends AbstractSpotlightTest {

    public ThemeListFragment fragment;

    @Mock
    private Bundle bundle;

    @Mock
    private LayoutInflater inflater;

    @Mock
    private ViewGroup viewGroup;

    @Before
    public void setup() {
        super.setup();
        fragment = ThemeListFragment.newInstance("EvolveSMS");
    }

    @Test
    public void testNewInstance() throws Exception {
        assertNotNull(fragment);
    }

    @Test
    public void testGetSearch() throws Exception {
        ThemeListFragment spy = Mockito.spy(fragment);
        doNothing().when(spy).superOnCreate(any(Bundle.class));
        spy.onCreate(bundle);

        assertEquals(spy.getSearch("theme"), "EvolveSMS theme");
    }

    @Test
    public void testGetThemes() throws Exception {
        // TODO need to figure out a test for this
    }
}