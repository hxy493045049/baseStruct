/*
 * Copyright (c) 2016 shawn <shawn0729@foxmail.com>
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
 *
 */
package com.msy.globalaccess.di.module;

import android.app.Service;
import android.content.Context;

import com.msy.globalaccess.di.qualifier.ContextLife;
import com.msy.globalaccess.di.scope.PerService;

import dagger.Module;
import dagger.Provides;

/**
 * @author shawn
 * @version 1.0 2016/6/24
 */
@Module
public class ServiceModule {
    private Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }

    @Provides
    @PerService
    @ContextLife("Service")
    public Context ProvideServiceContext() {
        return mService;
    }
}
