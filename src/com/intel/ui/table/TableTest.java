package com.intel.ui.table;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class TableTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableTest window = new TableTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TableTest() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(new GridLayout(1, 1, 0, 0));
		frame.setBounds(100, 100, 1244, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);

		String[][] cellDatas = {
				{"M00001", "P001", "红色", "1000", "2月5日", "还原工段", "1000", "0",
						"1#", "10", "24", "240", "24"},
				{"M00001", "P001", "红色", "1000", "2月5日", "还原工段", "1000", "0",
							"1#", "10", "24", "240", "24"},
				{"M00001", "P001", "红色", "1000", "2月5日", "还原工段", "1000", "0",
								"1#", "10", "24", "240", "24"  },
				{"M00002", "P002", "黄色", "1000", "2月6日", "还原工段", "2000", "2",
						"1#", "10", "24", "240", "24"},
				{"M00002", "P002", "黄色", "1000", "2月6日", "还原工段", "2000", "2",
							"1#", "10", "24", "240", "24"},
				{"M00002", "P002", "黄色", "1000", "2月6日", "还原工段", "2000", "2",
								"1#", "10", "24", "240", "24"},
				{"M00003", "P003", "蓝色", "1000", "2月6日", "还原工段", "3000", "3",
						"1#", "10", "24", "240", "24"},
				{"M00003", "P003", "蓝色", "1000", "2月6日", "还原工段", "3000", "3",
							"1#", "10", "24", "240", "24" },
				{"M00003", "P003", "蓝色", "1000", "2月6日", "还原工段", "3000", "3",
								"1#", "10", "24", "240", "24" } };
		
		String[][] cellData = {
				{"M00001", "8", "8", "8"},
				{"M00001", "8", "8", "8"},
				{"M00001", "8", "8", "8"},
				{"M00001", "8", "8", "8"},
				{"M00001", "8", "8", "8"}
		};
		String[] columnNames = {"","","",""};
//		String[] columnNames2 = { "生产订单", "产品", "规格", "计划数量", "完工日期", "工段",
//				"已排程数量", "未排程数量", "可用机台", "产品生产能力", "排程时间", "排程数量","拆分表头"};		
		panel.setLayout(new BorderLayout(0, 0));
		
//		JTable table = new JTable(9,4);
		JTable table = new JTable(cellData, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        GroupableTableHeader tableHeader = new GroupableTableHeader();
        table.setTableHeader(tableHeader);

        DefaultGroup group = new DefaultGroup();
        group.setRow(0);
        group.setRowSpan(2);      //设定占用两行
        group.setColumn(0);
        group.setHeaderValue("生产订单");
        tableHeader.addGroup(group);
        
        group = new DefaultGroup();
        group.setRow(0);
        group.setColumn(1);
        group.setColumnSpan(3);
        group.setHeaderValue("日期排量");
        tableHeader.addGroup(group);

        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(1);
        group.setHeaderValue("2.5");
        tableHeader.addGroup(group);

        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(2);
        group.setHeaderValue("2.6");
        tableHeader.addGroup(group);
        
        group = new DefaultGroup();
        group.setRow(1);
        group.setColumn(3);
        group.setHeaderValue("2.7");
        tableHeader.addGroup(group);
        
//        //CPU
//        group = new DefaultGroup();
//        group.setRow(0);
//        group.setColumn(7);
//        group.setColumnSpan(1);
//        group.setHeaderValue("CPU Occupancy");
//        tableHeader.addGroup(group);
//
//        group = new DefaultGroup();
//        group.setRow(1);
//        group.setColumn(7);
//        group.setHeaderValue("Average");
//        tableHeader.addGroup(group);
//        
//        //Memory
//        group = new DefaultGroup();
//        group.setRow(0);
//        group.setColumn(8);
//        group.setColumnSpan(1);
//        group.setHeaderValue("Memory Occupancy");
//        tableHeader.addGroup(group);
//
//        group = new DefaultGroup();
//        group.setRow(1);
//        group.setColumn(8);
//        group.setHeaderValue("Average");
//        tableHeader.addGroup(group);
//        
//        //FPS
//        group = new DefaultGroup();
//        group.setRow(0);
//        group.setColumn(9);
//        group.setColumnSpan(1);
//        group.setHeaderValue("FPS");
//        tableHeader.addGroup(group);
//
//        group = new DefaultGroup();
//        group.setRow(1);
//        group.setColumn(9);
//        group.setHeaderValue("Average");
//        tableHeader.addGroup(group);

		panel.add(new JScrollPane(table));
		
		initHeader(table);
		
        
	}
	private void initHeader(JTable table)
    {
		TableColumn firsetColumn = table.getColumnModel().getColumn(0);
		firsetColumn.setPreferredWidth(30);
		firsetColumn.setMaxWidth(120);
		firsetColumn.setMinWidth(120);
		table.setRowHeight(20);
    }
}
	
