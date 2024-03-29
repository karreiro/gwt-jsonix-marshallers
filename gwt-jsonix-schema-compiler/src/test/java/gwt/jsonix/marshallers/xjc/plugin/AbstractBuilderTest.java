/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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
package gwt.jsonix.marshallers.xjc.plugin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import com.sun.codemodel.CodeWriter;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JPackage;
import org.junit.Before;

public abstract class AbstractBuilderTest {

    protected JCodeModel jCodeModel;

    @Before
    public void setup() {
        jCodeModel = new JCodeModel();
    }

    protected String printJCodeModel() throws IOException {
        final Map<String, ByteArrayOutputStream> streams = new HashMap<>();
        CodeWriter codeWriter = getCodeWriter(streams);
        jCodeModel.build(codeWriter);
        StringBuilder stringBuilder = new StringBuilder();
        streams.values().forEach(byteArrayOutputStream -> stringBuilder.append(byteArrayOutputStream.toString()));
        String toReturn = stringBuilder.toString();
        System.out.println(toReturn);
        return toReturn;
    }

    protected String printJDefinedClass(JDefinedClass toPrint) throws IOException {
        String packageName = toPrint.getPackage().name().replace(".", "/");
        String className = toPrint.name() + ".java";
        String key = packageName.isEmpty() ? className : packageName + "/" + className;
        final Map<String, ByteArrayOutputStream> streams = new HashMap<>();
        CodeWriter codeWriter = getCodeWriter(streams);
        jCodeModel.build(codeWriter);
        String toReturn = streams.get(key).toString();
        System.out.println(toReturn);
        return toReturn;
    }

    protected CodeWriter getCodeWriter(Map<String, ByteArrayOutputStream> streams) {
        return new CodeWriter() {
            @Override
            public OutputStream openBinary(JPackage jPackage, String name) {
                String fullyQualifiedName = jPackage.name().length() == 0 ? name : jPackage.name().replace(".", "/") + "/" + name;

                if (!streams.containsKey(fullyQualifiedName)) {
                    streams.put(fullyQualifiedName, new ByteArrayOutputStream());
                }
                return streams.get(fullyQualifiedName);
            }

            @Override
            public void close() throws IOException {
                for (OutputStream outputStream : streams.values()) {
                    outputStream.flush();
                    outputStream.close();
                }
            }
        };
    }
}
