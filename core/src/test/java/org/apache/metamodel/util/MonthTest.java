/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.metamodel.util;

import junit.framework.TestCase;

@SuppressWarnings("deprecation")
public class MonthTest extends TestCase {

    public void testGetName() throws Exception {
        assertEquals("December", Month.DECEMBER.getName());
    }
    
    public void testNext() throws Exception {
        assertEquals(Month.APRIL, Month.MARCH.next());
        assertEquals(Month.JANUARY, Month.DECEMBER.next());
    }
    
    public void testPrevious() throws Exception {
        assertEquals(Month.FEBRUARY, Month.MARCH.previous());
        assertEquals(Month.DECEMBER, Month.JANUARY.previous());
    }
}
