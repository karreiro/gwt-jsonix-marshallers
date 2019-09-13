/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    public void testFiles() throws Exception {

        final Map<String, String> asserts = new HashMap<>();

        Files.walk(Paths.get("src", "main", "java")).filter(Files::isRegularFile).forEach(path -> {

            System.out.println(loadProductionResource(path));

        });

//        Files.walk(Paths.get("src", "test", "resources")).filter(Files::isRegularFile).forEach(path -> {
//
//            if (!isIgnored(path)) {
//
//                final String actual = loadProductionResource(path);
//                final String expected = loadTestResource(path);
//
//                System.out.println(actual);
//
//                System.out.println(expected);
//
//                assertEquals(expected, actual); // , "The file '" + path + " has an error.");
//            }
//        });
    }

    private boolean isIgnored(final Path path) {
        return path.toString().contains(".DS_Store");
    }

    private String loadTestResource(final Path path) {
        return loadResource(IntegrationTest.class, path.toString().substring(19));
    }

    private String loadProductionResource(final Path path) {
        return loadResource(Integration.class, path.toAbsolutePath().toString());
    }

    private String loadResource(final Class<?> klass,
                                final String resourceName) {
        System.out.println(resourceName);
        return loadResource(klass.getResourceAsStream(resourceName));
    }

    private String loadResource(final InputStream in) {
        try {
            return IOUtils.readLines(in, StandardCharsets.UTF_8).stream().collect(Collectors.joining(System.lineSeparator()));
        } catch (Exception e) {
            return "-";
        }
    }
}
