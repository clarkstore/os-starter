/*
 *
 *  * Copyright (c) 2021 os-parent Authors. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.onestop.common.core.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate客户端工具类
 * @author Clark
 * @version 2020-12-24
 */
//@Component
public class OsRestClientUtils {
    @Autowired
    private RestTemplate restTemplate;

    public String doGet(String url) {
        return restTemplate.getForObject(url, String.class);
    }

    public <T> T doGet(String url, Class<T> clasz) {
        return restTemplate.getForObject(url, clasz);
    }

    public <T> T doPost(String url, Object body, Class<T> clasz) {
        return restTemplate.postForObject(url, body, clasz);
    }
}
