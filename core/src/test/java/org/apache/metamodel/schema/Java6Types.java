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
package org.apache.metamodel.schema;

/**
 * This is a copy of the content of Java 6.0's java.sql.Types
 */
class Java6Types {

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>BIT</code>.
     */
    public final static int BIT = -7;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>TINYINT</code>.
     */
    public final static int TINYINT = -6;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>SMALLINT</code>.
     */
    public final static int SMALLINT = 5;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>INTEGER</code>.
     */
    public final static int INTEGER = 4;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>BIGINT</code>.
     */
    public final static int BIGINT = -5;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>FLOAT</code>.
     */
    public final static int FLOAT = 6;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>REAL</code>.
     */
    public final static int REAL = 7;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>DOUBLE</code>.
     */
    public final static int DOUBLE = 8;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>NUMERIC</code>.
     */
    public final static int NUMERIC = 2;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>DECIMAL</code>.
     */
    public final static int DECIMAL = 3;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>CHAR</code>.
     */
    public final static int CHAR = 1;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>VARCHAR</code>.
     */
    public final static int VARCHAR = 12;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>LONGVARCHAR</code>.
     */
    public final static int LONGVARCHAR = -1;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>DATE</code>.
     */
    public final static int DATE = 91;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>TIME</code>.
     */
    public final static int TIME = 92;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>TIMESTAMP</code>.
     */
    public final static int TIMESTAMP = 93;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>BINARY</code>.
     */
    public final static int BINARY = -2;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>VARBINARY</code>.
     */
    public final static int VARBINARY = -3;

    /**
     * <P>
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>LONGVARBINARY</code>.
     */
    public final static int LONGVARBINARY = -4;

    /**
     * <P>
     * The constant in the Java programming language that identifies the generic SQL value <code>NULL</code>.
     */
    public final static int NULL = 0;

    /**
     * The constant in the Java programming language that indicates that the SQL type is database-specific and gets
     * mapped to a Java object that can be accessed via the methods <code>getObject</code> and <code>setObject</code>.
     */
    public final static int OTHER = 1111;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>JAVA_OBJECT</code>.
     * 
     * @since 1.2
     */
    public final static int JAVA_OBJECT = 2000;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>DISTINCT</code>.
     * 
     * @since 1.2
     */
    public final static int DISTINCT = 2001;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>STRUCT</code>.
     * 
     * @since 1.2
     */
    public final static int STRUCT = 2002;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>ARRAY</code>.
     * 
     * @since 1.2
     */
    public final static int ARRAY = 2003;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>BLOB</code>.
     * 
     * @since 1.2
     */
    public final static int BLOB = 2004;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>CLOB</code>.
     * 
     * @since 1.2
     */
    public final static int CLOB = 2005;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>REF</code>.
     * 
     * @since 1.2
     */
    public final static int REF = 2006;

    /**
     * The constant in the Java programming language, somtimes referred to as a type code, that identifies the generic
     * SQL type <code>DATALINK</code>.
     * 
     * @since 1.4
     */
    public final static int DATALINK = 70;

    /**
     * The constant in the Java programming language, somtimes referred to as a type code, that identifies the generic
     * SQL type <code>BOOLEAN</code>.
     * 
     * @since 1.4
     */
    public final static int BOOLEAN = 16;

    // ------------------------- JDBC 4.0 -----------------------------------

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>ROWID</code>
     * 
     * @since 1.6
     * 
     */
    public final static int ROWID = -8;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>NCHAR</code>
     * 
     * @since 1.6
     */
    public static final int NCHAR = -15;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>NVARCHAR</code>.
     * 
     * @since 1.6
     */
    public static final int NVARCHAR = -9;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>LONGNVARCHAR</code>.
     * 
     * @since 1.6
     */
    public static final int LONGNVARCHAR = -16;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>NCLOB</code>.
     * 
     * @since 1.6
     */
    public static final int NCLOB = 2011;

    /**
     * The constant in the Java programming language, sometimes referred to as a type code, that identifies the generic
     * SQL type <code>XML</code>.
     * 
     * @since 1.6
     */
    public static final int SQLXML = 2009;
}