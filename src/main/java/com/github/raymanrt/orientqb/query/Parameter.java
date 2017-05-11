/*
 * Copyright 2015 Riccardo Tasso
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

package com.github.raymanrt.orientqb.query;

import static com.github.raymanrt.orientqb.util.Joiner.j;

public class Parameter extends Projection {

    private final String name;

    public Parameter(String name) {
        this.name = name;
    }

    public static final Parameter PARAMETER = new Parameter("?");

    public static Parameter parameter(String name) {
        return new Parameter(j.join(":", name));
    }

    public String toString() {
        return name;
    }

    @Override
    public String getAssignment() {
        return toString();
    }
}