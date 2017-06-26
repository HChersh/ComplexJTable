package com.intel.ui.table;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 * 合并列头测试
 * @author Brad.Wu
 * @version 1.0
 */
@SuppressWarnings("serial")
public class GroupableTableHeaderTest extends JFrame {

    /**
     * @param args
     */
    public static void main(String[] args) {
        GroupableTableHeaderTest test = new GroupableTableHeaderTest();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(1000, 600);
        test.setVisible(true);
    }

    private DefaultTableModel tableModel = new DefaultTableModel() {

        @Override
        public int getColumnCount() {
            return 10;
        }

        @Override
        public int getRowCount() {
            return 10;
        }
    };

    private JTable table = new JTable(tableModel);

    /**
     * @throws HeadlessException
     */
    public GroupableTableHeaderTest() throws HeadlessException {
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        GroupableTableHeader tableHeader = new GroupableTableHeader();
        table.setTableHeader(tableHeader);

        DefaultGroup group = new DefaultGroup();
        group.setRow(0);
        group.setRowSpan(2);
        group.setColumn(0);
        group.setHeaderValue("App Name");
        tableHeader.addGroup(group);

        group = new DefaultGroup();
        group.setRow(0);
        group.setColumn(1);
        group.setColumnSpan(6);
        group.setHeaderValue("Launch Time");
        tableHeader.addGroup(group);

        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(1);
        group.setHeaderValue("No.1");
        tableHeader.addGroup(group);

        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(2);
        group.setHeaderValue("No.2");
        tableHeader.addGroup(group);
        
        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(3);
        group.setHeaderValue("No.3");
        tableHeader.addGroup(group);
        
        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(4);
        group.setHeaderValue("No.4");
        tableHeader.addGroup(group);
        
        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(5);
        group.setHeaderValue("No.5");
        tableHeader.addGroup(group);
        
        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(6);
        group.setHeaderValue("Average");
        tableHeader.addGroup(group);
        
        //CPU
        group = new DefaultGroup();
        group.setRow(0);
        group.setColumn(7);
        group.setColumnSpan(1);
        group.setHeaderValue("CPU Occupancy");
        tableHeader.addGroup(group);

        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(7);
        group.setHeaderValue("Average");
        tableHeader.addGroup(group);
        
        //Memory
        group = new DefaultGroup();
        group.setRow(0);
        group.setColumn(8);
        group.setColumnSpan(1);
        group.setHeaderValue("Memory Occupancy");
        tableHeader.addGroup(group);

        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(8);
        group.setHeaderValue("Average");
        tableHeader.addGroup(group);
        
        //FPS
        group = new DefaultGroup();
        group.setRow(0);
        group.setColumn(9);
        group.setColumnSpan(1);
        group.setHeaderValue("FPS");
        tableHeader.addGroup(group);

        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(9);
        group.setHeaderValue("Average");
        tableHeader.addGroup(group);

        this.setLayout(new GridLayout(1, 1));
        this.add(new JScrollPane(table));
        
        initHeader();
    }

	private void initHeader()
    {
		TableColumn firsetColumn = table.getColumnModel().getColumn(0);
		firsetColumn.setPreferredWidth(30);
		firsetColumn.setMaxWidth(120);
		firsetColumn.setMinWidth(120);
		table.setRowHeight(20);
    }
}