/*
 * (C) 2007-2012 Alibaba Group Holding Limited.
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
 * Authors:
 *   dogun (yuexuqiang at gmail.com)
 */
package com.taobao.common.store.journal;

import java.io.IOException;


/**
 * ��־��ʽ�洢��MBean
 * 
 * @author dogun (yuexuqiang at gmail.com)
 */
public interface JournalStoreMBean {

    /**
     * ���������Ч�����ļ�����Ϣ
     * 
     * @return ������Ч�����ļ�����Ϣ
     */
    String getDataFilesInfo();


    /**
     * ���������Ч��־�ļ�����Ϣ
     * 
     * @return ������Ч��־�ļ�����Ϣ
     */
    String getLogFilesInfo();


    /**
     * ��ȡ��ǰ���ļ����
     * 
     * @return ��ǰ���ļ����
     */
    int getNumber();


    /**
     * ��ȡ�洢��·��
     * 
     * @return the path
     */
    String getPath();


    /**
     * ��ȡ�洢������
     * 
     * @return the name
     */
    String getName();


    /**
     * ��ȡ��ǰ�����ļ���Ϣ
     * 
     * @return ��ǰ�����ļ���Ϣ
     */
    String getDataFileInfo();


    /**
     * ��ȡ��ǰ��־�ļ���Ϣ
     * 
     * @return ��ǰ��־�ļ���Ϣ
     */
    String getLogFileInfo();


    /**
     * �鿴��������Ϣ��<b>ע��:</b>�ò������ܻ�ű��ڴ�
     * 
     * @return ���е�������Ϣ
     */
    String viewIndexMap();


    /**
     * ������ݵĸ���
     * 
     * @return ���ݵĸ���
     * @throws IOException
     */
    long getSize() throws IOException;


    /**
     * �������ļ����м�飬��������Ӧ�Ĵ���
     * 
     * @throws IOException
     */
    void check() throws IOException;


    long getIntervalForRemove();


    void setIntervalForRemove(long interval);


    long getIntervalForCompact();


    void setIntervalForCompact(long interval);
}