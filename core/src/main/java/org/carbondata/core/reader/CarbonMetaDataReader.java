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

package org.carbondata.core.reader;

import java.io.IOException;

import org.carbondata.format.FileMeta;

import org.apache.thrift.TBase;

/**
 * Reads the metadata from fact file in org.carbondata.format.FileMeta thrift object
 */
public class CarbonMetaDataReader {

  //Fact file path
  private String filePath;

  //From which offset of file this metadata should be read
  private long offset;

  public CarbonMetaDataReader(String filePath, long offset) {

    this.filePath = filePath;
    this.offset = offset;
  }

  /**
   * It reads the metadata in FileMeta thrift object format.
   *
   * @return
   * @throws IOException
   */
  public FileMeta readMetaData() throws IOException {
    ThriftReader thriftReader = openThriftReader(filePath);
    thriftReader.open();
    //Set the offset from where it should read
    thriftReader.setReadOffset(offset);
    FileMeta fileMeta = (FileMeta) thriftReader.read();
    thriftReader.close();
    return fileMeta;
  }

  /**
   * Open the thrift reader
   *
   * @param filePath
   * @return
   * @throws IOException
   */
  private ThriftReader openThriftReader(String filePath) throws IOException {

    ThriftReader thriftReader = new ThriftReader(filePath, new ThriftReader.TBaseCreator() {
      @Override public TBase create() {
        return new FileMeta();
      }
    });
    return thriftReader;
  }

}