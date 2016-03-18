/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Generated by Agitar build: AgitarOne Version 5.3.0.000022 (Build date: Jan 04, 2012) [5.3.0.000022]
 * JDK Version: 1.6.0_14
 *
 * Generated on 29 Jul, 2013 4:57:37 PM
 * Time to generate: 02:12.167 seconds
 *
 */

package com.huawei.unibi.molap.engine.mondrian.extensions;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.iweb.platform.logging.LogService;
import com.huawei.unibi.molap.engine.datasource.MolapDataSourceImpl;
import com.huawei.unibi.molap.engine.datastorage.InMemoryCubeStore;
import com.huawei.unibi.molap.engine.datastorage.QueryMapper;
import com.huawei.unibi.molap.engine.util.MolapEngineLogEvent;
import java.sql.Connection;
import java.util.HashMap;
import java.util.concurrent.Callable;
import javax.sql.DataSource;
import mondrian.olap.MondrianServer;
import mondrian.olap.Result;
import mondrian.olap.Util;
import mondrian.rolap.RolapConnection;
import mondrian.rolap.RolapSchema;
import mondrian.server.Execution;
import mondrian.server.StringRepositoryContentFinder;
import mondrian.spi.Dialect;
import mondrian.spi.DialectManager;

public class InMemoryOlapConnectionAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return InMemoryOlapConnection.class;
    }
    
    public void testCallableExecutionConstructor() throws Throwable {
        Util.PropertyList propertyList = new Util.PropertyList();
        Util.PropertyList connectInfo = new Util.PropertyList();
        MondrianServer server = MondrianServer.createWithRepository(new StringRepositoryContentFinder("testCallableExecutionContent"), null);
        DataSource dataSource = (DataSource) Mockingbird.getProxyObject(DataSource.class);
        Mockingbird.enterRecordingMode();
        Connection connection = (Connection) Mockingbird.getProxyObject(Connection.class);
        Mockingbird.setReturnValue(dataSource.getConnection(), connection);
        Dialect jdbcDialectImpl = (Dialect) Mockingbird.getProxyObject(Dialect.class);
        Mockingbird.setReturnValue(DialectManager.createDialect(dataSource, connection), jdbcDialectImpl);
        Mockingbird.setReturnValue(jdbcDialectImpl.getDatabaseProduct(), Dialect.DatabaseProduct.UNKNOWN);
        connection.close();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(Class.forName("com.huawei.unibi.molap.engine.mondrian.extensions.InMemoryOlapConnection$CallableExecution"));
        RolapSchema schema = (RolapSchema) callPrivateMethod("mondrian.rolap.RolapSchema", "<init>", new Class[] {String.class, Util.PropertyList.class, DataSource.class, String.class}, null, new Object[] {"testCallableExecutionKey", propertyList, dataSource, "testCallableExecutionMd5Bytes"});
        InMemoryOlapConnection inMemoryOlapConnection = new InMemoryOlapConnection(server, connectInfo, schema, (DataSource) Mockingbird.getProxyObject(DataSource.class));
        callPrivateMethod("com.huawei.unibi.molap.engine.mondrian.extensions.InMemoryOlapConnection$CallableExecution", "<init>", new Class[] {InMemoryOlapConnection.class, Execution.class, String.class, String.class, long.class}, null, new Object[] {inMemoryOlapConnection, Execution.NONE, "testCallableExecutionSchemaName", "testCallableExecutionCubeName", new Long(100L)});
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testCallableExecutionCallWithAggressiveMocks() throws Throwable {
        storeStaticField(RolapConnection.class, "THREAD_LOCAL");
        Callable callable = (Callable) Mockingbird.getProxyObject(Class.forName("com.huawei.unibi.molap.engine.mondrian.extensions.InMemoryOlapConnection$CallableExecution"), true);
        InMemoryOlapConnection inMemoryOlapConnection = (InMemoryOlapConnection) Mockingbird.getProxyObject(InMemoryOlapConnection.class);
        ThreadLocal threadLocal = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        setPrivateField(callable, "parentThreadId", new Long(0L));
        setPrivateField(callable, "execution", null);
        setPrivateField(callable, "cubeUniqueName", "");
        setPrivateField(callable, "this$0", inMemoryOlapConnection);
        setPrivateField(callable, "schemaName", "");
        setPrivateField(callable, "cubeName", "");
        setPrivateField(callable, "queryId", new Long(0L));
        setPrivateField(RolapConnection.class, "THREAD_LOCAL", threadLocal);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, hashMap, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(MolapConnection.class, "queryStart", "(java.lang.String,java.lang.String,long)void", null, 1);
        Mockingbird.setReturnValue(true, QueryMapper.class, "queryStart", "(java.lang.String,long,long)void", null, 1);
        Result internal = (Result) callPrivateMethod("mondrian.rolap.RolapConnection", "executeInternal", new Class[] {Execution.class}, inMemoryOlapConnection, new Object[] {null});
        Mockingbird.setReturnValue(internal, null);
        Mockingbird.setReturnValue(true, QueryMapper.class, "queryEnd", "(java.lang.String,long,boolean)void", null, 1);
        Mockingbird.setReturnValue(MolapConnection.class, "queryEnd", "(java.lang.String,java.lang.String,long)void", null, 1);
        Mockingbird.enterTestMode(Class.forName("com.huawei.unibi.molap.engine.mondrian.extensions.InMemoryOlapConnection$CallableExecution"));
        Result result = (Result) callPrivateMethod("com.huawei.unibi.molap.engine.mondrian.extensions.InMemoryOlapConnection$CallableExecution", "call", new Class[] {}, callable, new Object[] {});
        assertNull("result", result);
    }
    
    public void testGetcallableExecutionWithAggressiveMocks() throws Throwable {
        InMemoryOlapConnection inMemoryOlapConnection = (InMemoryOlapConnection) Mockingbird.getProxyObject(InMemoryOlapConnection.class, true);
        Mockingbird.enterRecordingMode();
        Callable callable = (Callable) Mockingbird.getProxyObject(Class.forName("com.huawei.unibi.molap.engine.mondrian.extensions.InMemoryOlapConnection$CallableExecution"));
        Mockingbird.replaceObjectForRecording(Class.forName("com.huawei.unibi.molap.engine.mondrian.extensions.InMemoryOlapConnection$CallableExecution"), "<init>(com.huawei.unibi.molap.engine.mondrian.extensions.InMemoryOlapConnection,mondrian.server.Execution,java.lang.String,java.lang.String,long)", callable);
        Mockingbird.enterTestMode(InMemoryOlapConnection.class);
        Callable result = inMemoryOlapConnection.getcallableExecution(null, "", "", 0L);
        assertNotNull("result", result);
    }
    
    public void testQueryEndWithAggressiveMocks() throws Throwable {
        storeStaticField(RolapConnection.class, "THREAD_LOCAL");
        InMemoryOlapConnection inMemoryOlapConnection = (InMemoryOlapConnection) Mockingbird.getProxyObject(InMemoryOlapConnection.class, true);
        ThreadLocal threadLocal = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        HashMap hashMap2 = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        setPrivateField(RolapConnection.class, "THREAD_LOCAL", threadLocal);
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, hashMap, 1);
        Mockingbird.setReturnValue(false, hashMap, "remove", "(java.lang.Object)java.lang.Object", new Object[] {"SCHEMA_NAME"}, null, 1);
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, hashMap2, 1);
        Mockingbird.setReturnValue(false, hashMap2, "remove", "(java.lang.Object)java.lang.Object", new Object[] {"CUBENAME"}, null, 1);
        Mockingbird.setReturnValue(true, QueryMapper.class, "queryEnd", "(java.lang.String,long)void", null, 1);
        Mockingbird.enterTestMode(InMemoryOlapConnection.class);
        inMemoryOlapConnection.queryEnd("", "", 0L);
        assertNotNull("inMemoryOlapConnectionRolapConnection.THREAD_LOCAL", RolapConnection.THREAD_LOCAL);
    }
    
    public void testQueryStartWithAggressiveMocks() throws Throwable {
        storeStaticField(InMemoryCubeStore.class, "instance");
        storeStaticField(RolapConnection.class, "THREAD_LOCAL");
        storeStaticField(MolapConnection.class, "THREAD_LOCAL");
        InMemoryOlapConnection inMemoryOlapConnection = (InMemoryOlapConnection) Mockingbird.getProxyObject(InMemoryOlapConnection.class, true);
        InMemoryCubeStore inMemoryCubeStore = (InMemoryCubeStore) Mockingbird.getProxyObject(InMemoryCubeStore.class);
        ThreadLocal threadLocal = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        ThreadLocal threadLocal2 = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        HashMap hashMap2 = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        HashMap hashMap3 = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        setPrivateField(InMemoryCubeStore.class, "instance", inMemoryCubeStore);
        setPrivateField(MolapConnection.class, "THREAD_LOCAL", threadLocal);
        setPrivateField(RolapConnection.class, "THREAD_LOCAL", threadLocal2);
        Boolean boolean2 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryWaiting", "(java.lang.String)boolean", boolean2, 1);
        Boolean boolean3 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryBlock", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(true, Thread.class, "sleep", "(long)void", new Object[] {new Long(10L)}, null, 1);
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryWaiting", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryBlock", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(true, Thread.class, "sleep", "(long)void", new Object[] {new Long(10L)}, null, 1);
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryWaiting", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(inMemoryCubeStore.isQueryBlock(""), false);
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, hashMap, 1);
        Mockingbird.setReturnValue(true, System.class, "currentTimeMillis", "()long", new Object[] {}, new Long(0L), 1);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, threadLocal2, "get", "()java.lang.Object", new Object[] {}, hashMap2, 1);
        Mockingbird.setReturnValue(false, hashMap2, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, threadLocal2, "get", "()java.lang.Object", new Object[] {}, hashMap3, 1);
        Mockingbird.setReturnValue(false, hashMap3, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, QueryMapper.class, "queryStart", "(java.lang.String,long)void", null, 1);
        Mockingbird.enterTestMode(InMemoryOlapConnection.class);
        inMemoryOlapConnection.queryStart("", "", 0L);
        boolean actual = ((LogService) getPrivateField(InMemoryOlapConnection.class, "LOGGER")).isDebugEnabled();
        assertTrue("inMemoryOlapConnectionInMemoryOlapConnection.LOGGER.isDebugEnabled()", actual);
    }
    
    public void testQueryStartWithAggressiveMocks1() throws Throwable {
        storeStaticField(InMemoryOlapConnection.class, "LOGGER");
        storeStaticField(MolapEngineLogEvent.class, "UNIBI_MOLAPENGINE_MSG");
        storeStaticField(InMemoryCubeStore.class, "instance");
        storeStaticField(RolapConnection.class, "THREAD_LOCAL");
        storeStaticField(MolapConnection.class, "THREAD_LOCAL");
        InMemoryOlapConnection inMemoryOlapConnection = (InMemoryOlapConnection) Mockingbird.getProxyObject(InMemoryOlapConnection.class, true);
        InMemoryCubeStore inMemoryCubeStore = (InMemoryCubeStore) Mockingbird.getProxyObject(InMemoryCubeStore.class);
        InterruptedException interruptedException = (InterruptedException) Mockingbird.getProxyObject(InterruptedException.class);
        LogService logService = (LogService) Mockingbird.getProxyObject(LogService.class);
        ThreadLocal threadLocal = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        ThreadLocal threadLocal2 = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        HashMap hashMap2 = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        HashMap hashMap3 = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        setPrivateField(InMemoryCubeStore.class, "instance", inMemoryCubeStore);
        setPrivateField(InMemoryOlapConnection.class, "LOGGER", logService);
        setPrivateField(MolapEngineLogEvent.class, "UNIBI_MOLAPENGINE_MSG", null);
        setPrivateField(MolapConnection.class, "THREAD_LOCAL", threadLocal);
        setPrivateField(RolapConnection.class, "THREAD_LOCAL", threadLocal2);
        Mockingbird.setReturnValue(inMemoryCubeStore.isQueryWaiting(""), true);
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryBlock", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(true, Thread.class, "sleep", "(long)void", new Object[] {new Long(10L)}, null, 1);
        Boolean boolean3 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryWaiting", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryBlock", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(true, Thread.class, "sleep", "(long)void", new Object[] {new Long(10L)}, null, 1);
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryWaiting", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryBlock", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setException(true, Thread.class, "sleep", "(long)void", new Object[] {new Long(10L)}, interruptedException, 1);
        Mockingbird.setReturnValue(false, logService, "error", "(com.huawei.iweb.platform.logging.LogEvent,java.lang.Throwable,java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, hashMap, 1);
        Mockingbird.setReturnValue(true, System.class, "currentTimeMillis", "()long", new Object[] {}, new Long(0L), 1);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, threadLocal2, "get", "()java.lang.Object", new Object[] {}, hashMap2, 1);
        Mockingbird.setReturnValue(false, hashMap2, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, threadLocal2, "get", "()java.lang.Object", new Object[] {}, hashMap3, 1);
        Mockingbird.setReturnValue(false, hashMap3, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, QueryMapper.class, "queryStart", "(java.lang.String,long)void", null, 1);
        Mockingbird.enterTestMode(InMemoryOlapConnection.class);
        inMemoryOlapConnection.queryStart("", "", 0L);
        assertNotNull("inMemoryOlapConnectionInMemoryOlapConnection.LOGGER", getPrivateField(InMemoryOlapConnection.class, "LOGGER"));
    }
    
    public void testConstructorThrowsAssertionError() throws Throwable {
        Util.PropertyList connectInfo = new Util.PropertyList();
        DataSource dataSource = (DataSource) Mockingbird.getProxyObject(DataSource.class);
        Mockingbird.enterTestMode(InMemoryOlapConnection.class);
        try {
            new InMemoryOlapConnection(null, connectInfo, dataSource);
            fail("Expected AssertionError to be thrown");
        } catch (AssertionError ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RolapConnection.class, ex);
            assertNotNull("RolapConnection.LOGGER", getPrivateField(RolapConnection.class, "LOGGER"));
        }
    }
    
    public void testConstructorThrowsAssertionError1() throws Throwable {
        Util.PropertyList propertyList = new Util.PropertyList();
        DataSource dataSource = (DataSource) Mockingbird.getProxyObject(DataSource.class);
        Mockingbird.enterRecordingMode();
        Connection connection = (Connection) Mockingbird.getProxyObject(Connection.class);
        Mockingbird.setReturnValue(dataSource.getConnection(), connection);
        Dialect jdbcDialectImpl = (Dialect) Mockingbird.getProxyObject(Dialect.class);
        Mockingbird.setReturnValue(DialectManager.createDialect(dataSource, connection), jdbcDialectImpl);
        Mockingbird.setReturnValue(jdbcDialectImpl.getDatabaseProduct(), Dialect.DatabaseProduct.UNKNOWN);
        connection.close();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(InMemoryOlapConnection.class);
        RolapSchema schema = (RolapSchema) callPrivateMethod("mondrian.rolap.RolapSchema", "<init>", new Class[] {String.class, Util.PropertyList.class, DataSource.class, String.class}, null, new Object[] {"testInMemoryOlapConnectionKey", propertyList, dataSource, "testInMemoryOlapConnectionMd5Bytes"});
        Util.PropertyList connectInfo = new Util.PropertyList();
        try {
            new InMemoryOlapConnection(null, connectInfo, schema, (DataSource) Mockingbird.getProxyObject(DataSource.class));
            fail("Expected AssertionError to be thrown");
        } catch (AssertionError ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RolapConnection.class, ex);
            assertNotNull("RolapConnection.LOGGER", getPrivateField(RolapConnection.class, "LOGGER"));
        }
    }
    
    public void testCreateMolapDatasourceThrowsNullPointerException() throws Throwable {
        Util.PropertyList propertyList = new Util.PropertyList();
        MondrianServer server = MondrianServer.createWithRepository(new StringRepositoryContentFinder("testInMemoryOlapConnectionContent"), null);
        DataSource dataSource = (DataSource) Mockingbird.getProxyObject(DataSource.class);
        Mockingbird.enterRecordingMode();
        Connection connection = (Connection) Mockingbird.getProxyObject(Connection.class);
        Mockingbird.setReturnValue(dataSource.getConnection(), connection);
        Dialect jdbcDialectImpl = (Dialect) Mockingbird.getProxyObject(Dialect.class);
        Mockingbird.setReturnValue(DialectManager.createDialect(dataSource, connection), jdbcDialectImpl);
        Mockingbird.setReturnValue(jdbcDialectImpl.getDatabaseProduct(), Dialect.DatabaseProduct.UNKNOWN);
        connection.close();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(InMemoryOlapConnection.class);
        RolapSchema schema = (RolapSchema) callPrivateMethod("mondrian.rolap.RolapSchema", "<init>", new Class[] {String.class, Util.PropertyList.class, DataSource.class, String.class}, null, new Object[] {"testInMemoryOlapConnectionKey", propertyList, dataSource, "testInMemoryOlapConnectionMd5Bytes"});
        Util.PropertyList connectInfo = new Util.PropertyList();
        DataSource dataSource2 = (DataSource) Mockingbird.getProxyObject(DataSource.class);
        Mockingbird.enterRecordingMode();
        callPrivateMethod("com.huawei.unibi.molap.engine.mondrian.extensions.MolapConnection", "appendKeyValue", new Class[] {StringBuilder.class, String.class, Object.class}, null, new Object[] {null, "testInMemoryOlapConnectionParam2", dataSource2});
        Mockingbird.setNormalReturnForVoid(true);
        Mockingbird.enterTestMode(InMemoryOlapConnection.class);
        InMemoryOlapConnection inMemoryOlapConnection = new InMemoryOlapConnection(server, connectInfo, schema, dataSource2);
        try {
            inMemoryOlapConnection.createMolapDatasource(new Util.PropertyList());
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapDataSourceImpl.class, ex);
        }
    }
    
    public void testQueryStartThrowsRuntimeExceptionWithAggressiveMocks() throws Throwable {
        storeStaticField(InMemoryCubeStore.class, "instance");
        InMemoryOlapConnection inMemoryOlapConnection = (InMemoryOlapConnection) Mockingbird.getProxyObject(InMemoryOlapConnection.class, true);
        InMemoryCubeStore inMemoryCubeStore = (InMemoryCubeStore) Mockingbird.getProxyObject(InMemoryCubeStore.class);
        RuntimeException runtimeException = (RuntimeException) Mockingbird.getProxyObject(RuntimeException.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        setPrivateField(InMemoryCubeStore.class, "instance", inMemoryCubeStore);
        Boolean boolean2 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryWaiting", "(java.lang.String)boolean", boolean2, 1);
        Boolean boolean3 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryBlock", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(true, Thread.class, "sleep", "(long)void", new Object[] {new Long(10L)}, null, 1);
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryWaiting", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryBlock", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(true, Thread.class, "sleep", "(long)void", new Object[] {new Long(10L)}, null, 1);
        Mockingbird.setReturnValue(inMemoryCubeStore.isQueryWaiting(""), true);
        Mockingbird.setReturnValue(false, inMemoryCubeStore, "isQueryBlock", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(Util.newInternal("Restructuring of schema is in progess!"), runtimeException);
        Mockingbird.enterTestMode(InMemoryOlapConnection.class);
        try {
            inMemoryOlapConnection.queryStart("", "", 0L);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            boolean actual = ((LogService) getPrivateField(InMemoryOlapConnection.class, "LOGGER")).isDebugEnabled();
            assertTrue("inMemoryOlapConnectionInMemoryOlapConnection.LOGGER.isDebugEnabled()", actual);
        }
    }
}
