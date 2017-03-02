/*
 * Copyright 1999-2101 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.sql.ast.expr;

import com.google.common.base.Strings;

public class SQLNCharExpr extends SQLTextLiteralExpr {
    
    public SQLNCharExpr(final String text) {
        super(text);
    }
    
    @Override
    public void output(final StringBuffer buffer) {
        if (Strings.isNullOrEmpty(getText())) {
            buffer.append("NULL");
            return;
        }
        buffer.append("N'");
        buffer.append(getText().replaceAll("'", "''"));
        buffer.append("'");
    }
}