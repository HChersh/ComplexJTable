package com.intel.ui.table;
public interface Group {
    /**
     * ��ȡ������
     * 
     * @return
     */
    public int getRow();

    /**
     * ��ȡ������
     * 
     * @return
     */
    public int getColumn();

    /**
     * ��ȡռ�и���
     * 
     * @return
     */
    public int getColumnSpan();

    /**
     * ��ȡռ�и���
     * 
     * @return
     */
    public int getRowSpan();

    /**
     * ��ȡ����
     * 
     * @return
     */
    public Object getHeaderValue();
}