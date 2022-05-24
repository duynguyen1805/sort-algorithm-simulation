/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author duyng
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private boolean isIncrease = true;
    private int[] array, array1;
    public int num, num1;
    private JLabel[] lbArrays, lbArrays1;
    private int curT = -1;
    private int curTT = 0;
    private int curTTT = 1;
    private int curTTT2 = 2;
    private Thread[] threads = new Thread[1000000];
    private int time = 50;
    private Color processingColor = new Color(252,83,44);//(255, 153, 153);
    private int step = 0;
    private int step1 = 0;
    //private File file = new File ("C:\\Users\\duyng\\Documents\\NetBeansProjects\\test\\src\\main\\java\\com\\mycompany\\test\\array.txt");
    private File file = new File ("src/main/java/com/mycompany/test/array.txt");
    private File file1 = new File ("src/main/java/com/mycompany/test/writearray.txt");
    private int[] lbI = new int[50];
    private int[] lbJ = new int[50];
    private int[] lbL = new int[50];
    private int[] lbR = new int[50];
    private int[] lbI1 = new int[50];
    private int[] lbJ1 = new int[50];
    private int[] lbL1 = new int[50];
    private int[] lbR1 = new int[50];
    private Color selectedGreen = new Color(153, 255, 153);
    private Color selectedYellow = new Color(254,145,0);
    private int[] oriLocat = new int[15];
    private int[] oriLocat1 = new int[15];
    

    private JLabel lbPoint1 = new JLabel();
    private JLabel lbPoint2 = new JLabel();
    private JLabel lbPointM = new JLabel();
    private JLabel lbPoint1_2 = new JLabel();
    private JLabel lbPoint2_2 = new JLabel();
    private JLabel lbPointM_2 = new JLabel();
    private JLabel lbStep = new JLabel();
    private JLabel lbStep_2 = new JLabel();
    private JLabel name = new JLabel();
    private JLabel name2 = new JLabel();
    
    public Main() {
        initComponents();
        //setSize(1380,840);
        setLocationRelativeTo(null);
        lbPoint1.setSize(60, 25);
        lbPoint1.setOpaque(true);
        lbPoint1.setLocation(50, 50);
        lbPoint1.setFont(new Font("Helvetica", Font.BOLD, 20));
        lbPoint1.setHorizontalAlignment(SwingConstants.CENTER);
        lbPoint1.setVerticalAlignment(SwingConstants.CENTER);
        
        lbPoint2.setSize(60, 25);
        lbPoint2.setOpaque(true);
        lbPoint2.setLocation(50, 50);
        lbPoint2.setFont(new Font("Helvetica", Font.BOLD, 20));
        lbPoint2.setHorizontalAlignment(SwingConstants.CENTER);
        lbPoint2.setVerticalAlignment(SwingConstants.CENTER);
        
        lbPointM.setSize(60, 25);
        lbPointM.setOpaque(true);
        lbPointM.setLocation(50, 50);
        lbPointM.setFont(new Font("Helvetica", Font.BOLD, 20));
        lbPointM.setHorizontalAlignment(SwingConstants.CENTER);
        lbPointM.setVerticalAlignment(SwingConstants.CENTER);
        
        lbPoint1_2.setSize(60, 25);
        lbPoint1_2.setOpaque(true);
        lbPoint1_2.setLocation(50, 50);
        lbPoint1_2.setFont(new Font("Helvetica", Font.BOLD, 20));
        lbPoint1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lbPoint1_2.setVerticalAlignment(SwingConstants.CENTER);
        
        lbPoint2_2.setSize(60, 25);
        lbPoint2_2.setOpaque(true);
        lbPoint2_2.setLocation(50, 50);
        lbPoint2_2.setFont(new Font("Helvetica", Font.BOLD, 20));
        lbPoint2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lbPoint2_2.setVerticalAlignment(SwingConstants.CENTER);
        
        lbPointM_2.setSize(60, 25);
        lbPointM_2.setOpaque(true);
        lbPointM_2.setLocation(50, 50);
        lbPointM_2.setFont(new Font("Helvetica", Font.BOLD, 20));
        lbPointM_2.setHorizontalAlignment(SwingConstants.CENTER);
        lbPointM_2.setVerticalAlignment(SwingConstants.CENTER);
        
        lbStep.setSize(200, 25);
        lbStep.setOpaque(true);
        lbStep.setLocation(50, 50);
        lbStep.setFont(new Font("Helvetica", Font.BOLD, 20));
        lbStep.setHorizontalAlignment(SwingConstants.CENTER);
        lbStep.setVerticalAlignment(SwingConstants.CENTER);
        
        lbStep_2.setSize(200, 25);
        lbStep_2.setOpaque(true);
        lbStep_2.setLocation(50, 50);
        lbStep_2.setFont(new Font("Helvetica", Font.BOLD, 20));
        lbStep_2.setHorizontalAlignment(SwingConstants.CENTER);
        lbStep_2.setVerticalAlignment(SwingConstants.CENTER);
        
        name.setSize(250, 35);
        name.setOpaque(true);
        name.setLocation(50, 50);
        name.setFont(new Font("Helvetica", Font.BOLD, 30));
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setVerticalAlignment(SwingConstants.CENTER);
        
        name2.setSize(250, 35);
        name2.setOpaque(true);
        name2.setLocation(50, 50);
        name2.setFont(new Font("Helvetica", Font.BOLD, 30));
        name2.setHorizontalAlignment(SwingConstants.CENTER);
        name2.setVerticalAlignment(SwingConstants.CENTER);
        setState(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        contentPane = new javax.swing.JPanel();
        TitleMoPhong = new javax.swing.JLabel();
        jPanel_Chongiaithuat = new javax.swing.JPanel();
        rdInterchangeSort = new javax.swing.JRadioButton();
        rdSelectionSort = new javax.swing.JRadioButton();
        rdBubbleSort = new javax.swing.JRadioButton();
        rdInsertionSort = new javax.swing.JRadioButton();
        rdShellSort = new javax.swing.JRadioButton();
        rdHeapSort = new javax.swing.JRadioButton();
        rdQuickSort = new javax.swing.JRadioButton();
        rdMergeSort = new javax.swing.JRadioButton();
        jPanel_Dieukhien = new javax.swing.JPanel();
        rdSapxeptang = new javax.swing.JRadioButton();
        rdSapxepgiam = new javax.swing.JRadioButton();
        btSapxep = new javax.swing.JButton();
        bt_quaylai = new javax.swing.JButton();
        bt_sosanh = new javax.swing.JButton();
        jPanel_Chaymophong = new javax.swing.JPanel();
        jPanel_khoitaomang = new javax.swing.JPanel();
        lbNum = new javax.swing.JLabel();
        spNum = new javax.swing.JSpinner();
        btTaomang = new javax.swing.JButton();
        btXoamang = new javax.swing.JButton();
        jPanel_taodulieumang = new javax.swing.JPanel();
        btRandom = new javax.swing.JButton();
        btBangtay = new javax.swing.JButton();
        btMofile = new javax.swing.JButton();
        btDocfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleMoPhong.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TitleMoPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleMoPhong.setText("Mô Phỏng Thuật Toán");
        TitleMoPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel_Chongiaithuat.setPreferredSize(new java.awt.Dimension(192, 200));

        buttonGroup1.add(rdInterchangeSort);
        rdInterchangeSort.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdInterchangeSort.setText("Interchange Sort");
        rdInterchangeSort.setSelected(true);

        buttonGroup1.add(rdSelectionSort);
        rdSelectionSort.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdSelectionSort.setText("Selection Sort");

        buttonGroup1.add(rdBubbleSort);
        rdBubbleSort.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdBubbleSort.setText("Bubble Sort");

        buttonGroup1.add(rdInsertionSort);
        rdInsertionSort.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdInsertionSort.setText("Insertion Sort");

        buttonGroup1.add(rdShellSort);
        rdShellSort.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdShellSort.setText("Shell Sort");

        buttonGroup1.add(rdHeapSort);
        rdHeapSort.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdHeapSort.setText("Heap Sort");
        rdHeapSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdHeapSortActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdQuickSort);
        rdQuickSort.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdQuickSort.setText("Quick Sort");

        buttonGroup1.add(rdMergeSort);
        rdMergeSort.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdMergeSort.setText("Merge Sort");

        jPanel_Chongiaithuat.setBorder(BorderFactory.createTitledBorder(null, "Chọn giải thuật", 0, 0, new Font("Tahoma", Font.PLAIN, 20)));

        javax.swing.GroupLayout jPanel_ChongiaithuatLayout = new javax.swing.GroupLayout(jPanel_Chongiaithuat);
        jPanel_Chongiaithuat.setLayout(jPanel_ChongiaithuatLayout);
        jPanel_ChongiaithuatLayout.setHorizontalGroup(
            jPanel_ChongiaithuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChongiaithuatLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel_ChongiaithuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdInterchangeSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdSelectionSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdBubbleSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdInsertionSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel_ChongiaithuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdHeapSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdShellSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdQuickSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdMergeSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        jPanel_ChongiaithuatLayout.setVerticalGroup(
            jPanel_ChongiaithuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChongiaithuatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ChongiaithuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdShellSort)
                    .addComponent(rdInterchangeSort, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ChongiaithuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdSelectionSort)
                    .addComponent(rdHeapSort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ChongiaithuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBubbleSort)
                    .addComponent(rdQuickSort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ChongiaithuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdInsertionSort)
                    .addComponent(rdMergeSort))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel_Dieukhien.setPreferredSize(new java.awt.Dimension(192, 200));

        buttonGroup2.add(rdSapxeptang);
        rdSapxeptang.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdSapxeptang.setText("Sắp xếp tăng dần");
        rdSapxeptang.setSelected(true);
        rdSapxeptang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSapxeptangActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdSapxepgiam);
        rdSapxepgiam.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdSapxepgiam.setText("Sắp xếp giảm dần");
        rdSapxepgiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSapxepgiamActionPerformed(evt);
            }
        });

        btSapxep.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btSapxep.setText("Sắp xếp");
        btSapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSapxepActionPerformed(evt);
            }
        });

        bt_quaylai.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_quaylai.setText("Quay lại");
        bt_quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quaylaiActionPerformed(evt);
            }
        });

        bt_sosanh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_sosanh.setText("So Sánh");
        bt_sosanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sosanhActionPerformed(evt);
            }
        });

        jPanel_Dieukhien.setBorder(BorderFactory.createTitledBorder(null, "Điều khiển", 0, 0, new Font("Tahoma", Font.PLAIN, 20)));

        javax.swing.GroupLayout jPanel_DieukhienLayout = new javax.swing.GroupLayout(jPanel_Dieukhien);
        jPanel_Dieukhien.setLayout(jPanel_DieukhienLayout);
        jPanel_DieukhienLayout.setHorizontalGroup(
            jPanel_DieukhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DieukhienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DieukhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdSapxeptang)
                    .addComponent(rdSapxepgiam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_DieukhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_sosanh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_quaylai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSapxep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel_DieukhienLayout.setVerticalGroup(
            jPanel_DieukhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DieukhienLayout.createSequentialGroup()
                .addGroup(jPanel_DieukhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DieukhienLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(rdSapxeptang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdSapxepgiam))
                    .addGroup(jPanel_DieukhienLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btSapxep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_sosanh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        //jPanel_Chaymophong.setBorder(BorderFactory.createTitledBorder("Khung mô phỏng"));

        javax.swing.GroupLayout jPanel_ChaymophongLayout = new javax.swing.GroupLayout(jPanel_Chaymophong);
        jPanel_Chaymophong.setLayout(jPanel_ChaymophongLayout);
        jPanel_ChaymophongLayout.setHorizontalGroup(
            jPanel_ChaymophongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_ChaymophongLayout.setVerticalGroup(
            jPanel_ChaymophongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jPanel_Chaymophong.setBorder(BorderFactory.createTitledBorder(null, "Khung mô phỏng", 0, 0, new Font("Tahoma", Font.PLAIN, 24)));

        jPanel_khoitaomang.setPreferredSize(new java.awt.Dimension(192, 200));

        lbNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNum.setText("Số phần tử mảng: (<= 15)");

        spNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spNum.setModel(new javax.swing.SpinnerNumberModel(2, 0, 15, 1));

        btTaomang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btTaomang.setText("Tạo mảng");
        btTaomang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTaomangActionPerformed(evt);
            }
        });

        btXoamang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btXoamang.setText("Xóa mảng");
        btXoamang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoamangActionPerformed(evt);
            }
        });

        jPanel_khoitaomang.setBorder(BorderFactory.createTitledBorder(null, "Tạo mảng", 0, 0, new Font("Tahoma", Font.PLAIN, 20)));

        javax.swing.GroupLayout jPanel_khoitaomangLayout = new javax.swing.GroupLayout(jPanel_khoitaomang);
        jPanel_khoitaomang.setLayout(jPanel_khoitaomangLayout);
        jPanel_khoitaomangLayout.setHorizontalGroup(
            jPanel_khoitaomangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_khoitaomangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_khoitaomangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btXoamang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTaomang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spNum)
                    .addComponent(lbNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_khoitaomangLayout.setVerticalGroup(
            jPanel_khoitaomangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_khoitaomangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spNum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTaomang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btXoamang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JFormattedTextField txt = ((JSpinner.NumberEditor) spNum.getEditor()).getTextField();
        ((NumberFormatter) txt.getFormatter()).setAllowsInvalid(false);
        spNum.setValue(Integer.valueOf("2"));

        jPanel_taodulieumang.setPreferredSize(new java.awt.Dimension(192, 200));

        btRandom.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btRandom.setText("Ngẫu nhiên");
        btRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRandomActionPerformed(evt);
            }
        });

        btBangtay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btBangtay.setText("Bằng tay");
        btBangtay.setPreferredSize(new java.awt.Dimension(87, 23));
        btBangtay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBangtayActionPerformed(evt);
            }
        });

        btMofile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btMofile.setText("Mở file");
        btMofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMofileActionPerformed(evt);
            }
        });

        btDocfile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btDocfile.setText("Đọc file");
        btDocfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDocfileActionPerformed(evt);
            }
        });

        jPanel_taodulieumang.setBorder(BorderFactory.createTitledBorder(null, "Tạo dữ liệu", 0, 0, new Font("Tahoma", Font.PLAIN, 20)));

        javax.swing.GroupLayout jPanel_taodulieumangLayout = new javax.swing.GroupLayout(jPanel_taodulieumang);
        jPanel_taodulieumang.setLayout(jPanel_taodulieumangLayout);
        jPanel_taodulieumangLayout.setHorizontalGroup(
            jPanel_taodulieumangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_taodulieumangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_taodulieumangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btBangtay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDocfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRandom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_taodulieumangLayout.setVerticalGroup(
            jPanel_taodulieumangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_taodulieumangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBangtay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMofile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDocfile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setTitle("Mô phỏng thuật toán");

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TitleMoPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Chaymophong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jPanel_khoitaomang, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_taodulieumang, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Chongiaithuat, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Dieukhien, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleMoPhong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Chaymophong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Dieukhien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Chongiaithuat, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_taodulieumang, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_khoitaomang, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdHeapSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdHeapSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdHeapSortActionPerformed

    private void btSapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSapxepActionPerformed
        // TODO add your handling code here:
        if(num1!=0){
            deleteArrays_2();
        }
        Docfileghi();
        isSorted_writearray();
        if (!isSorted()) {
		setState(3);
		for (int i = 0; i < num; i++) 
			lbArrays[i].setForeground(Color.BLUE);
					
		if (rdInterchangeSort.isSelected())
                {
			InterchangeSort();
                }
		if (rdSelectionSort.isSelected())
                {
			SelectionSort();
                }
		if (rdBubbleSort.isSelected())
                {
                        BubbleSort();
                }
		if (rdInsertionSort.isSelected())
                {
			InsertionSort();
                }
		if (rdShellSort.isSelected())
			ShellSort();
		if (rdHeapSort.isSelected()) {
			HeapSort();
			threadReLocate();
					}
					
		if (rdQuickSort.isSelected())
			QuickSort();
                if (rdMergeSort.isSelected())
			MergeSort();
                waitEnd();
	}
    }//GEN-LAST:event_btSapxepActionPerformed

    private void btRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRandomActionPerformed
        // TODO add your handling code here:
        createRandom();
    }//GEN-LAST:event_btRandomActionPerformed

    private void btMofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMofileActionPerformed
        // TODO add your handling code here:
        try {
					Desktop desktop = null;
				    if (Desktop.isDesktopSupported()) {
				    	desktop = Desktop.getDesktop();
				    }
				    desktop.open(file);
				} catch (IOException ioe) {
					//file isn't existed
				    ioe.printStackTrace();				   
				}
    }//GEN-LAST:event_btMofileActionPerformed

    private void btDocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDocfileActionPerformed
        // TODO add your handling code here:
        deleteArrays();
	try {
            Scanner in = new Scanner(file);
            num = Integer.parseInt(in.next());
            array = new int[num];
            int pos = 0;
            if(in.hasNext()){
                while (in.hasNext()) {
                    array[pos] = Integer.parseInt(in.next());
                    pos++;
                }
            }else{
                while (in.hasNextLine()){
                    array[pos] = Integer.parseInt(in.nextLine());
                    pos++;
                }
            }
            in.close();
            lbArrays = new JLabel[num];
            Filewriter(array, num);
            for (int i = 0; i < num; i++) {
		//tao label, settext "0"		
		lbArrays[i] = new JLabel(String.valueOf(array[i]));
		jPanel_Chaymophong.add(lbArrays[i]);			
		//setsize label
		lbArrays[i].setSize(50,50);
		lbArrays[i].setOpaque(true);
		lbArrays[i].setForeground(Color.BLUE);				
		//setLocation label
		if (i == 0)
			lbArrays[i].setLocation(((int) ((18 - num) * 0.5) * 70) + 100, 150);
		else
			lbArrays[i].setLocation(lbArrays[i-1].getX() + 70, 150);			

		lbArrays[i].setFont(new Font("Tahoma", Font.PLAIN, 30));			
		lbArrays[i].setBackground(SystemColor.inactiveCaption);			
		lbArrays[i].setHorizontalAlignment(SwingConstants.CENTER); 
		lbArrays[i].setVerticalAlignment(SwingConstants.CENTER);
            }
            jPanel_Chaymophong.add(lbPoint1);
            jPanel_Chaymophong.add(lbPoint2);
            jPanel_Chaymophong.add(lbPointM);
            jPanel_Chaymophong.add(lbStep);
            jPanel_Chaymophong.add(lbStep_2);
            
            jPanel_Chaymophong.setVisible(true);
            jPanel_Chaymophong.validate();
            jPanel_Chaymophong.repaint();
            setState(2);
            } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
		e.printStackTrace();
	}
    }//GEN-LAST:event_btDocfileActionPerformed

    private void btTaomangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaomangActionPerformed
        // TODO add your handling code here:
        deleteArrays();
        deleteArrays_2();
        createArrays();
    }//GEN-LAST:event_btTaomangActionPerformed

    private void btXoamangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoamangActionPerformed
        // TODO add your handling code here:
        deleteArrays();
        deleteArrays_2();
        setState(0);
    }//GEN-LAST:event_btXoamangActionPerformed

    private void btBangtayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBangtayActionPerformed
        // TODO add your handling code here:
        input input_byhand = new input();
        input_byhand.setVisible(true);
        
    }//GEN-LAST:event_btBangtayActionPerformed

    private void rdSapxeptangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSapxeptangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSapxeptangActionPerformed

    private void rdSapxepgiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSapxepgiamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSapxepgiamActionPerformed

    private void bt_sosanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sosanhActionPerformed
        // TODO add your handling code here:
        stopAllThreads();
        stopAllThreads_2();
        deleteArrays();
        deleteArrays_2();
        compare cp = new compare();
        cp.setVisible(true);
    }//GEN-LAST:event_bt_sosanhActionPerformed

    private void bt_quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quaylaiActionPerformed
        // TODO add your handling code here:
        //if(num!=0 && num1!=0){
            Docfileghi();
        //}
    }//GEN-LAST:event_bt_quaylaiActionPerformed
/**/
    
    public boolean isSorted() {
    	if (rdSapxeptang.isSelected()) {
    		for (int i = 0; i < array.length - 1; i++)
    			if (array[i] > array[i+1])
    				return false;
    	}	
    	else {
    		for (int i = 0; i < array.length - 1; i++)
    			if (array[i] < array[i+1])
    				return false;
    	}
    	return true;
    }
    
    /*
    public boolean isSorted_writearray(){
        try {
            Scanner in = new Scanner(file1);
            num = Integer.parseInt(in.next());
            array = new int[num];
            int pos = 0;
            if(in.hasNext()){
                while (in.hasNext()) {
                    array[pos] = Integer.parseInt(in.next());
                    pos++;
                }
            }else{
                while (in.hasNextLine()){
                    array[pos] = Integer.parseInt(in.nextLine());
                    pos++;
                }
            }
            in.close();
            if (rdSapxeptang.isSelected()) {
    		for (int i = 0; i < array.length - 1; i++)
    			if (array[i] > array[i+1])
    				return false;
            }	
            else {
                    for (int i = 0; i < array.length - 1; i++)
                            if (array[i] < array[i+1])
                                    return false;
            }
            } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
		e.printStackTrace();
	}
        return true;
    }
    
    */
    public void isSorted_writearray(){
        try {
            Scanner in = new Scanner(file1);
            num = Integer.parseInt(in.next());
            array = new int[num];
            int pos = 0;
            if(in.hasNext()){
                while (in.hasNext()) {
                    array[pos] = Integer.parseInt(in.next());
                    pos++;
                }
            }else{
                while (in.hasNextLine()){
                    array[pos] = Integer.parseInt(in.nextLine());
                    pos++;
                }
            }
            in.close();
            } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    public void Docfileghi(){
        deleteArrays();
	try {
            Scanner in = new Scanner(file1);
            num = Integer.parseInt(in.next());
            array = new int[num];
            int pos = 0;
            if(in.hasNext()){
                while (in.hasNext()) {
                    array[pos] = Integer.parseInt(in.next());
                    pos++;
                }
            }else{
                while (in.hasNextLine()){
                    array[pos] = Integer.parseInt(in.nextLine());
                    pos++;
                }
            }
            in.close();
            lbArrays = new JLabel[num];
				
            for (int i = 0; i < num; i++) {
		//tao label, settext "0"		
		lbArrays[i] = new JLabel(String.valueOf(array[i]));
		jPanel_Chaymophong.add(lbArrays[i]);			
		//setsize label
		lbArrays[i].setSize(50,50);
		lbArrays[i].setOpaque(true);
		lbArrays[i].setForeground(Color.BLUE);				
		//setLocation label
		if (i == 0)
			lbArrays[i].setLocation(((int) ((18 - num) * 0.5) * 70) + 100, 150);
		else
			lbArrays[i].setLocation(lbArrays[i-1].getX() + 70, 150);			

		lbArrays[i].setFont(new Font("Tahoma", Font.PLAIN, 30));			
		lbArrays[i].setBackground(SystemColor.inactiveCaption);			
		lbArrays[i].setHorizontalAlignment(SwingConstants.CENTER); 
		lbArrays[i].setVerticalAlignment(SwingConstants.CENTER);
            }
            jPanel_Chaymophong.add(lbPoint1);
            jPanel_Chaymophong.add(lbPoint2);
            jPanel_Chaymophong.add(lbPointM);
            jPanel_Chaymophong.add(name);
            jPanel_Chaymophong.add(name2);
            
            jPanel_Chaymophong.setVisible(true);
            jPanel_Chaymophong.validate();
            jPanel_Chaymophong.repaint();
            setState(2);
            } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    
    public void Filewriter(int[] array,int num){
        this.array = array;
        this.num = num;
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("src/main/java/com/mycompany/test/writearray.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            fw.write(String.valueOf(num));
            for(int i=0 ; i<num; i++){
                fw.write(" " + String.valueOf(array[i]));
            }
            //Bước 3: Đóng luồng
            fw.close();
          } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
    
    public void Filewriter_sosanh(int[] array,int num){
        this.array = array;
        this.num = num;
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("src/main/java/com/mycompany/test/writearray_sosanh.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            fw.write(String.valueOf(num));
            for(int i=0 ; i<num; i++){
                fw.write(" " + String.valueOf(array[i]));
            }
            //Bước 3: Đóng luồng
            fw.close();
          } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
    
    public void createArrays() {
		
		deleteArrays();
		num = (Integer)spNum.getValue();
		
		lbArrays = new JLabel[num];
		array = new int[num];
		
		for (int i = 0; i < num; i++) {
			lbArrays[i] = new JLabel("0");
			array[i] = 0;
			jPanel_Chaymophong.add(lbArrays[i]);
			lbArrays[i].setText(String.valueOf(array[i]));
			//setsize label
			lbArrays[i].setSize(50,50);
			lbArrays[i].setOpaque(true);
			lbArrays[i].setForeground(Color.blue);
			//setLocation label
			if (i == 0)
				lbArrays[i].setLocation(((int) ((18 - num) * 0.5) * 70) + 100, 150);
			else
				lbArrays[i].setLocation(lbArrays[i-1].getX() + 70, 150);

			lbArrays[i].setFont(new Font("Tahoma", Font.PLAIN, 30));
			lbArrays[i].setBackground(SystemColor.inactiveCaption);
			lbArrays[i].setHorizontalAlignment(SwingConstants.CENTER); 
			lbArrays[i].setVerticalAlignment(SwingConstants.CENTER);
		}
                
                jPanel_Chaymophong.add(lbPoint1);
                jPanel_Chaymophong.add(lbPoint2);
                jPanel_Chaymophong.add(lbPointM);
                jPanel_Chaymophong.add(lbStep);
                jPanel_Chaymophong.add(lbStep_2);
                jPanel_Chaymophong.add(name);
                jPanel_Chaymophong.add(name2);
                
		jPanel_Chaymophong.setVisible(true);
		jPanel_Chaymophong.validate();
		jPanel_Chaymophong.repaint();
		setState(1);
	}
    
    public void setArray(int[] array) {
    	spNum.setValue(array.length);
    	deleteArrays();
		num = (Integer)spNum.getValue();
		
		lbArrays = new JLabel[num];
		this.array = array;
		
		for (int i = 0; i < num; i++) {
			
			//create label, set text "0"
			lbArrays[i] = new JLabel(String.valueOf(array[i]));
			jPanel_Chaymophong.add(lbArrays[i]);
			
			//set size label
			lbArrays[i].setSize(50,50);
			lbArrays[i].setOpaque(true);
			lbArrays[i].setForeground(Color.BLUE);
			
			//set location label
			if (i == 0)
				lbArrays[i].setLocation(((int) ((18 - num) * 0.5) * 70) + 100, 150);
			else
				lbArrays[i].setLocation(lbArrays[i-1].getX() + 70, 150);
			
			//set fonts
			lbArrays[i].setFont(new Font("Tahoma", Font.PLAIN, 30));
			
			//set background color
			lbArrays[i].setBackground(SystemColor.inactiveCaption);
			
			//set text alignment center
			lbArrays[i].setHorizontalAlignment(SwingConstants.CENTER); 
			lbArrays[i].setVerticalAlignment(SwingConstants.CENTER);
		}
                jPanel_Chaymophong.add(lbPoint1);
                jPanel_Chaymophong.add(lbPoint2);
                jPanel_Chaymophong.add(lbPointM);
                jPanel_Chaymophong.add(name);
                jPanel_Chaymophong.add(name2);
                
		jPanel_Chaymophong.setVisible(true);
		jPanel_Chaymophong.validate();
		jPanel_Chaymophong.repaint();
		setState(2);
    }
    
    public void setArray_2(int[] array1) {
    	spNum.setValue(array1.length);
    	deleteArrays_2();
		num1 = (Integer)spNum.getValue();
		
		lbArrays1 = new JLabel[num1];
		this.array1 = array1;
		
		for (int i = 0; i < num1; i++) {
			
			//create label, set text "0"
			lbArrays1[i] = new JLabel(String.valueOf(array1[i]));
			jPanel_Chaymophong.add(lbArrays1[i]);
			
			//set size label
			lbArrays1[i].setSize(50,50);
			lbArrays1[i].setOpaque(true);
			lbArrays1[i].setForeground(Color.BLUE);
			
			//set location label
			if (i == 0)
				lbArrays1[i].setLocation(((int) ((18 - num1) * 0.5) * 70) + 100, 450);
			else
				lbArrays1[i].setLocation(lbArrays1[i-1].getX() + 70, 450);
			
			//set fonts
			lbArrays1[i].setFont(new Font("Tahoma", Font.PLAIN, 30));
			
			//set background color
			lbArrays1[i].setBackground(SystemColor.inactiveCaption);
			
			//set text alignment center
			lbArrays1[i].setHorizontalAlignment(SwingConstants.CENTER); 
			lbArrays1[i].setVerticalAlignment(SwingConstants.CENTER);
		}
                jPanel_Chaymophong.add(lbPoint1_2);
                jPanel_Chaymophong.add(lbPoint2_2);
                jPanel_Chaymophong.add(lbPointM_2);
                jPanel_Chaymophong.add(name);
                jPanel_Chaymophong.add(name2);
                
		jPanel_Chaymophong.setVisible(true);
		jPanel_Chaymophong.validate();
		jPanel_Chaymophong.repaint();
		setState(2);
    }
    
    public void createRandom() {
		Random rand = new Random();
                
                if((num!=0) && (num1!=0)) {
                    
                    for (int i = 0; i < num; i++) {
                            int ranNum = rand.nextInt(101);
                            lbArrays[i].setText(String.valueOf(ranNum));
                            lbArrays[i].setForeground(Color.BLUE);
                            array[i] = ranNum;
                            lbArrays1[i].setText(String.valueOf(ranNum));
                            lbArrays1[i].setForeground(Color.BLUE);
                            array1[i] = ranNum;
                    }
                }else{
                    for (int i = 0; i < num; i++) {
			int ranNum = rand.nextInt(101);
			lbArrays[i].setText(String.valueOf(ranNum));
			lbArrays[i].setForeground(Color.BLUE);
			array[i] = ranNum;
                    }
                }
                Filewriter(array, num);
                
		jPanel_Chaymophong.setVisible(true);
		jPanel_Chaymophong.validate();
		jPanel_Chaymophong.repaint();
		setState(2);
	}
    
    public void deleteArrays() {
		for (int i = 0; i < num; i++) {
			lbArrays[i].setText("0");
			array[i] = 0;
			lbArrays[i].setVisible(false);
			jPanel_Chaymophong.remove(lbArrays[i]);
		}
                
                lbPoint1.setText("");
                lbPoint2.setText("");
                lbPointM.setText("");
                jPanel_Chaymophong.remove(lbPoint1);
                jPanel_Chaymophong.remove(lbPoint2);
                jPanel_Chaymophong.remove(lbPointM);
                name.setText("");
                name2.setText("");
                jPanel_Chaymophong.remove(name);
                jPanel_Chaymophong.remove(name2);
		
		for (int i = 0; i < curT; i++) {
			try {
                            threads[i].interrupt();
			} 
			catch (Exception e) {	
			}
		}
		curT = -1;
		
		jPanel_Chaymophong.revalidate();
		jPanel_Chaymophong.repaint();
		setState(0);
	}
    
    public void deleteArrays_2() {
		for (int i = 0; i < num1; i++) {
			lbArrays1[i].setText("0");
			array1[i] = 0;
			lbArrays1[i].setVisible(false);
			jPanel_Chaymophong.remove(lbArrays1[i]);
		}
                
                lbPoint1_2.setText("");
                lbPoint2_2.setText("");
                lbPointM_2.setText("");
                jPanel_Chaymophong.remove(lbPoint1_2);
                jPanel_Chaymophong.remove(lbPoint2_2);
                jPanel_Chaymophong.remove(lbPointM_2);
                name.setText("");
                name2.setText("");
                jPanel_Chaymophong.remove(name);
                jPanel_Chaymophong.remove(name2);
		
		for (int i = 0; i < curT; i++) {
			try {
                            threads[i].interrupt();
			} 
			catch (Exception e) {	
			}
		}
		curT = -1;
		
		jPanel_Chaymophong.revalidate();
		jPanel_Chaymophong.repaint();
		setState(0);
	}
    
    
    
    public void InterchangeSort() {
		if (rdSapxeptang.isSelected()) {
			int i1, j1;
                        setlbname(name, "Interchange Sort");
			for (i1 = 0 ; i1 < num ; i1++) {
                                setlbPoint(lbPoint1, i1, "i = ");
				for (j1 = i1 + 1; j1 < num ; j1++) {
                                    setlbPoint(lbPoint2, j1, "j = ");
					if(array[j1] < array[i1]) {
						int temp1 = array[i1];
						array[i1] = array[j1];
						array[j1] = temp1;
						Swap(lbArrays[i1], lbArrays[j1]);
                                                
					}
				}
			}
		} else {
			int i1, j1;
                        setlbname(name, "Interchange Sort");
			for (i1 = 0 ; i1 < num ; i1++) {
                                setlbPoint(lbPoint1, i1, "i = ");
				for (j1 = i1 + 1; j1 < num ; j1++) {
                                    setlbPoint(lbPoint2, j1, "j = ");
					if(array[j1] > array[i1]) {
						int temp1 = array[i1];
						array[i1] = array[j1];
						array[j1] = temp1;
						Swap(lbArrays[i1], lbArrays[j1]);
					}
				}
			}
		}
	}
    
    public void InterchangeSort_2() {
		if (rdSapxeptang.isSelected()) {
			int i, j;
                        setlbname_2(name2, "Interchange Sort");
			for (i = 0 ; i < num1 ; i++) {
                                setlbPoint_2(lbPoint1_2, i, "i = ");
				for (j = i + 1; j < num1 ; j++) {
                                    setlbPoint_2(lbPoint2_2, j, "j = ");
					if(array1[j] < array1[i]) {
						int temp = array1[i];
						array1[i] = array1[j];
						array1[j] = temp;
						Swap_2(lbArrays1[i], lbArrays1[j]);
					}
				}
			}
		} else {
			int i, j;
                        setlbname_2(name2, "Interchange Sort");
			for (i = 0 ; i < num1 ; i++) {
                                setlbPoint_2(lbPoint1_2, i, "i = ");
				for (j = i + 1; j < num1 ; j++) {
                                    setlbPoint_2(lbPoint2_2, j, "j = ");
					if(array1[j] > array1[i]) {
						int temp = array1[i];
						array1[i] = array1[j];
						array1[j] = temp;
						Swap_2(lbArrays1[i], lbArrays1[j]);
					}
				}
			}
		}
	}
    
    
    public void SelectionSort() {
		if (rdSapxeptang.isSelected()) {
			int min,i,j;
                        setlbname(name, "Selection Sort");
			for (i = 0; i < num - 1; i++) {
                                setlbPoint(lbPoint1, i, "i = ");
				min = i;
                                setlbPoint(lbPointM, i, "min");
				for(j = i + 1; j < num; j++) {
                                        setlbPoint(lbPoint2, j, "j = ");
					if (array[j] < array[min]) {
						min = j;
                                                setlbPoint(lbPointM, j, "min");
					}
				}				
				if (min > i) {
					int temp = array[min];		
					array[min] = array[i];			
					array[i] = temp;
					Swap(lbArrays[i], lbArrays[min]);
				}
			}
		} else {
			int min,i,j; 
                        setlbname(name, "Selection Sort");
			for (i = 0; i < num - 1; i++) {
                                setlbPoint(lbPoint1, i, "i = ");
				min = i;
                                setlbPoint(lbPointM, i, "max");
				for(j = i + 1; j < num; j++) {
                                        setlbPoint(lbPoint2, j, "j = ");
					if (array[j] > array[min]) {
						min = j;
                                                setlbPoint(lbPointM, j, "max");
					}
				}				
				if (min > i) {
					int temp = array[min];		
					array[min] = array[i];			
					array[i] = temp;
					Swap(lbArrays[i], lbArrays[min]);
				}
			}
		}
	}
    
    public void SelectionSort_2() {
		if (rdSapxeptang.isSelected()) {
			int min,i,j; 
                        setlbname_2(name2, "Selection Sort");
			for (i = 0; i < num1 - 1; i++) {
                                setlbPoint_2(lbPoint1_2, i, "i = ");
				min = i;
                                setlbPoint_2(lbPointM_2, i, "min");
				for(j = i + 1; j < num1; j++) {
                                        setlbPoint_2(lbPoint2_2, j, "j = ");
					if (array1[j] < array1[min]) {
						min = j;
                                                setlbPoint_2(lbPointM_2, j, "min");
					}
				}				
				if (min > i) {
					int temp = array1[min];		
					array1[min] = array1[i];			
					array1[i] = temp;
					Swap_2(lbArrays1[i], lbArrays1[min]);
				}
			}
		} else {
			int min,i,j; 
                        setlbname_2(name2, "Selection Sort");
			for (i = 0; i < num1 - 1; i++) {
                                setlbPoint_2(lbPoint1_2, i, "i = ");
				min = i;
                                setlbPoint_2(lbPointM_2, i, "max");
				for(j = i + 1; j < num1; j++) {
                                        setlbPoint_2(lbPoint2_2, j, "j = ");
					if (array1[j] > array1[min]) {
						min = j;
                                                setlbPoint_2(lbPointM_2, j, "max");
					}
				}				
				if (min > i) {
					int temp = array1[min];		
					array1[min] = array1[i];			
					array1[i] = temp;
					Swap_2(lbArrays1[i], lbArrays1[min]);
				}
			}
		}
	}
    
    
    public void BubbleSort() {
		if (rdSapxeptang.isSelected()) {
			int i, j;
                        setlbname(name, "Bubble Sort");
			for (i = 0; i< num; i++) {
                                setlbPoint(lbPoint1, i, "i = ");
				for (j = num - 1; j > i; j--) {
                                        setlbPoint(lbPoint2, j, "j = ");
					if(array[j]< array[j-1]) {
						int temp = array[j];
						array[j] = array[j - 1];
						array[j - 1] = temp;
						Swap(lbArrays[j - 1], lbArrays[j]);
					}
				}
			}
		} else {
			int i, j;
                        setlbname(name, "Bubble Sort");
			for (i = 0; i< num; i++) {
                                setlbPoint(lbPoint1, i, "i = ");
				for (j = num - 1; j > i; j--) {
                                        setlbPoint(lbPoint2, j, "j = ");
					if(array[j] > array[j-1]) {
						int temp = array[j];
						array[j] = array[j - 1];
						array[j - 1] = temp;
						Swap(lbArrays[j - 1], lbArrays[j]);
					}
				}
			}
		}
	}
    
    public void BubbleSort_2() {
		if (rdSapxeptang.isSelected()) {
			int i, j;
                        setlbname_2(name2, "Bubble Sort");
			for (i = 0; i< num1; i++) {
                                setlbPoint_2(lbPoint1_2, i, "i = ");
				for (j = num1 - 1; j > i; j--) {
                                        setlbPoint_2(lbPoint2_2, j, "j = ");
					if(array1[j]< array1[j-1]) {
						int temp = array1[j];
						array1[j] = array1[j - 1];
						array1[j - 1] = temp;
						Swap_2(lbArrays1[j - 1], lbArrays1[j]);
					}
				}
			}
		} else {
			int i, j;
                        setlbname_2(name2, "Bubble Sort");
			for (i = 0; i< num1; i++) {
                                setlbPoint_2(lbPoint1_2, i, "i = ");
				for (j = num1 - 1; j > i; j--) {
                                        setlbPoint_2(lbPoint2_2, j, "j = ");
					if(array1[j] > array1[j-1]) {
						int temp = array1[j];
						array1[j] = array1[j - 1];
						array1[j - 1] = temp;
						Swap_2(lbArrays1[j - 1], lbArrays1[j]);
					}
				}
			}
		}
	}
    
    
    public void InsertionSort() {
    	if (rdSapxeptang.isSelected()) {
	        int pos, i;
	        int x;
                setlbname(name, "Insertion Sort");
	        for (i = 1; i < num; i++) {
                    setlbPoint(lbPoint1, i, "i = ");
	            x = array[i];
	            pos = i - 1;
	            while ((pos >= 0) && (array[pos] > x)) {
                        setlbPoint(lbPoint2, pos, "j = ");
	                array[pos + 1] = array[pos];
	                if (pos > 0 && array[pos - 1] <= x) {
	                    Move(lbArrays[pos + 1], lbArrays[pos], 0);
	                } else {
	                    Move(lbArrays[pos + 1], lbArrays[pos], pos);
	                }	              
	                pos--;
	            }
	            array[pos + 1] = x;
                    setlbPoint(lbPoint2, -1, null);
	        }
    	}
    	else {
    		int pos, i;
	        int x;
                setlbname(name, "Insertion Sort");
	        for (i = 1; i < num; i++) {
                    setlbPoint(lbPoint1, i, "i = ");
	            x = array[i];
	            pos = i - 1;
	            while ((pos >= 0) && (array[pos] < x)) {
                        setlbPoint(lbPoint2, pos, "j = ");
	                array[pos + 1] = array[pos];
	                if (pos > 0 && array[pos - 1] >= x) {
	                    Move(lbArrays[pos + 1], lbArrays[pos], 0);
	                } else {
	                    Move(lbArrays[pos + 1], lbArrays[pos], pos);
	                }
	                pos--;
	            }
	            array[pos + 1] = x;
                    setlbPoint(lbPoint2, -1, null);
	        }
    	}
    }
    
    public void InsertionSort_2() {
    	if (rdSapxeptang.isSelected()) {
	        int pos, i;
	        int x;
                setlbname_2(name2, "Insertion Sort");
	        for (i = 1; i < num1; i++) {
                    setlbPoint_2(lbPoint1_2, i, "i = ");
	            x = array1[i];
	            pos = i - 1;
	            while ((pos >= 0) && (array1[pos] > x)) {
                        setlbPoint_2(lbPoint2_2, pos, "j = ");
	                array1[pos + 1] = array1[pos];
	                if (pos > 0 && array1[pos - 1] <= x) {
	                    Move_2(lbArrays1[pos + 1], lbArrays1[pos], 0);
	                } else {
	                    Move_2(lbArrays1[pos + 1], lbArrays1[pos], pos);
	                }	              
	                pos--;
	            }
	            array1[pos + 1] = x;
                    setlbPoint_2(lbPoint2_2, -1, null);
	        }
    	}
    	else {
    		int pos, i;
	        int x;
                setlbname_2(name2, "Insertion Sort");
	        for (i = 1; i < num1; i++) {
                    setlbPoint_2(lbPoint1_2, i, "i = ");
	            x = array1[i];
	            pos = i - 1;
	            while ((pos >= 0) && (array1[pos] < x)) {
                        setlbPoint_2(lbPoint2_2, pos, "j = ");
	                array1[pos + 1] = array1[pos];
	                if (pos > 0 && array1[pos - 1] >= x) {
	                    Move_2(lbArrays1[pos + 1], lbArrays1[pos], 0);
	                } else {
	                    Move_2(lbArrays1[pos + 1], lbArrays1[pos], pos);
	                }
	                pos--;
	            }
	            array1[pos + 1] = x;
                    setlbPoint_2(lbPoint2_2, -1, null);
	        }
    	}
    }
    
    
    public void MoveShell(JLabel lb1, JLabel lb2,  int next) {
        int x1 = lb1.getX();
        int x2 = lb2.getX();
        curT ++;
       
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0) {
                        threads[cur - 1].join();
                    }
                    setBackgroundMoving(lb1, lb2);
                    while (lb2.getY() < 200) {
                        if (lb1.getY() > 100)
                            lb1.setLocation(lb1.getX(), lb1.getY() - 10);
                        lb2.setLocation(lb2.getX(), lb2.getY() + 10);
                        Thread.sleep(time);
                    }
                    while (lb1.getX() > x2) {
                        lb2.setLocation(lb2.getX() + 10, lb2.getY());
                        lb1.setLocation(lb1.getX() - 10, lb1.getY());
                        Thread.sleep(time);
                    }
                    while (lb2.getY() > 150) {
                        if (next == 0) {
                            lb1.setLocation(lb1.getX(), lb1.getY() + 10);
                        }
                        lb2.setLocation(lb2.getX(), lb2.getY() - 10);
                        Thread.sleep(time);
                    }
                    String txtLb1 = lb1.getText();
                    lb1.setText(lb2.getText());
                    lb2.setText(txtLb1);
                    int y1 = lb1.getY();
                    lb1.setLocation(x1, lb2.getY());
                    lb2.setLocation(x2, y1);
                    if (next == 0)
                        setBackgroundDone(lb1, lb2);
                    else
                        lb1.setBackground(SystemColor.inactiveCaption);
               } catch (Exception e) {
               }
           }
        });
        threads[cur].start();
    }
    
    public void ShellSort() {
        if (rdSapxeptang.isSelected()) {
            int len, i, j, x;
            setlbname(name, "Shell Sort");
            for (len = 11; len > 0; len /= 2) {
                for (i = len; i < num; i ++) {
                    setlbPoint(lbPoint1, i, "i = ");
                    x = array[i];
                    j = i - len;
                    while (j >= 0 && x < array[j]) {
                        setlbPoint(lbPoint2, j, "j = ");
                        array[j + len] = array[j];
                        if (len > 1) {
                            if (j < len) {
                                MoveShell(lbArrays[j + len], lbArrays[j], 0);
                            } else {
                                if (x >= array[j - len])
                                    MoveShell(lbArrays[j + len], lbArrays[j], 0);
                                else
                                    MoveShell(lbArrays[j + len], lbArrays[j], 1);
                            }
                        } else {
                            if (j < len) {
                                Move(lbArrays[j + len], lbArrays[j], 0);
                            } else {
                                if (x >= array[j - len])
                                    Move(lbArrays[j + len], lbArrays[j], 0);
                                else
                                    Move(lbArrays[j + len], lbArrays[j], 1);
                            }
                        }
                        j -= len;
                    }
                    array[j + len] = x;
                    setlbPoint(lbPoint2, -1, null);
                }
            }
        }
        else {
            int len, i, j, x;
            setlbname(name, "Shell Sort");
            for (len = 11; len > 0; len /= 2) {
                for (i = len; i < num; i ++) {
                    setlbPoint(lbPoint1, i, "i = ");
                    x = array[i];
                    j = i - len;
                    while (j >= 0 && x > array[j]) {
                        setlbPoint(lbPoint2, j, "j = ");
                        array[j + len] = array[j];
                        if (len > 1) {
                            if (j < len) {
                                MoveShell(lbArrays[j + len], lbArrays[j], 0);
                            } else {
                                if (x <= array[j - len])
                                    MoveShell(lbArrays[j + len], lbArrays[j], 0);
                                else
                                    MoveShell(lbArrays[j + len], lbArrays[j], 1);
                            }
                        } else {
                            if (j < len) {
                                Move(lbArrays[j + len], lbArrays[j], 0);
                            } else {
                                if (x <= array[j - len])
                                    Move(lbArrays[j + len], lbArrays[j], 0);
                                else
                                    Move(lbArrays[j + len], lbArrays[j], 1);
                            }
                        }
                        j -= len;
                    }
                    array[j + len] = x;
                    setlbPoint(lbPoint2, -1, null);
                }
            }
        }
    }
    
    public void MoveShell_2(JLabel lb1, JLabel lb2,  int next) {
        int x1 = lb1.getX();
        int x2 = lb2.getX();
        curTT ++;
       
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1) {
                        threads[cur - 1].join();
                    }
                    setBackgroundMoving(lb1, lb2);
                    while (lb2.getY() < 500) {
                        if (lb1.getY() > 400)
                            lb1.setLocation(lb1.getX(), lb1.getY() - 10);
                        lb2.setLocation(lb2.getX(), lb2.getY() + 10);
                        Thread.sleep(time);
                    }
                    while (lb1.getX() > x2) {
                        lb2.setLocation(lb2.getX() + 10, lb2.getY());
                        lb1.setLocation(lb1.getX() - 10, lb1.getY());
                        Thread.sleep(time);
                    }
                    while (lb2.getY() > 450) {
                        if (next == 0) {
                            lb1.setLocation(lb1.getX(), lb1.getY() + 10);
                        }
                        lb2.setLocation(lb2.getX(), lb2.getY() - 10);
                        Thread.sleep(time);
                    }
                    String txtLb1 = lb1.getText();
                    lb1.setText(lb2.getText());
                    lb2.setText(txtLb1);
                    int y1 = lb1.getY();
                    lb1.setLocation(x1, lb2.getY());
                    lb2.setLocation(x2, y1);
                    if (next == 0)
                        setBackgroundDone(lb1, lb2);
                    else
                        lb1.setBackground(SystemColor.inactiveCaption);
               } catch (Exception e) {
               }
           }
        });
        threads[cur].start();
    }
    
    public void ShellSort_2() {
        if (rdSapxeptang.isSelected()) {
            int len, i, j, x;
            setlbname_2(name2, "Shell Sort");
            for (len = 11; len > 0; len /= 2) {
                for (i = len; i < num1; i ++) {
                    setlbPoint_2(lbPoint1_2, i, "i = ");
                    x = array1[i];
                    j = i - len;
                    while (j >= 0 && x < array1[j]) {
                        setlbPoint_2(lbPoint2_2, j, "j = ");
                        array1[j + len] = array1[j];
                        if (len > 1) {
                            if (j < len) {
                                MoveShell_2(lbArrays1[j + len], lbArrays1[j], 0);
                            } else {
                                if (x >= array1[j - len])
                                    MoveShell_2(lbArrays1[j + len], lbArrays1[j], 0);
                                else
                                    MoveShell_2(lbArrays1[j + len], lbArrays1[j], 1);
                            }
                        } else {
                            if (j < len) {
                                Move_2(lbArrays1[j + len], lbArrays1[j], 0);
                            } else {
                                if (x >= array1[j - len])
                                    Move_2(lbArrays1[j + len], lbArrays1[j], 0);
                                else
                                    Move_2(lbArrays1[j + len], lbArrays1[j], 1);
                            }
                        }
                        j -= len;
                    }
                    array1[j + len] = x;
                    setlbPoint_2(lbPoint2_2, -1, null);
                }
            }
        }
        else {
            int len, i, j, x;
            setlbname_2(name2, "Shell Sort");
            for (len = 11; len > 0; len /= 2) {
                for (i = len; i < num1; i ++) {
                    setlbPoint_2(lbPoint1_2, i, "i = ");
                    x = array1[i];
                    j = i - len;
                    while (j >= 0 && x > array1[j]) {
                        setlbPoint_2(lbPoint2_2, j, "j = ");
                        array1[j + len] = array1[j];
                        if (len > 1) {
                            if (j < len) {
                                MoveShell_2(lbArrays1[j + len], lbArrays1[j], 0);
                            } else {
                                if (x <= array1[j - len])
                                    MoveShell_2(lbArrays1[j + len], lbArrays1[j], 0);
                                else
                                    MoveShell_2(lbArrays1[j + len], lbArrays1[j], 1);
                            }
                        } else {
                            if (j < len) {
                                Move_2(lbArrays1[j + len], lbArrays1[j], 0);
                            } else {
                                if (x <= array1[j - len])
                                    Move_2(lbArrays1[j + len], lbArrays1[j], 0);
                                else
                                    Move_2(lbArrays1[j + len], lbArrays1[j], 1);
                            }
                        }
                        j -= len;
                    }
                    array1[j + len] = x;
                    setlbPoint_2(lbPoint2_2, -1, null);
                }
            }
        }
    }
    
    
    
    public void MovetoLocation(JLabel lb1, int x, int y) {
        curT ++;
        
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0) {
                        threads[cur - 1].join();
                    }
                    lb1.setBackground(processingColor);
                    int x1 = lb1.getX();
                    int y1 = lb1.getY();
                    if (x1 < x && y1 < y) {
                        while (lb1.getX() < x) {
                            lb1.setLocation(lb1.getX() + 10, y1);
                            Thread.sleep(time);
                        }
                        while (lb1.getY() < y) {
                            lb1.setLocation(x, lb1.getY() + 10);
                            Thread.sleep(time);
                        }
                    } else if (x1 >= x && y1 < y) {
                        while (lb1.getX() > x) {
                            lb1.setLocation(lb1.getX() - 10, y1);
                            Thread.sleep(time);
                        }
                        while (lb1.getY() < y) {
                            lb1.setLocation(x, lb1.getY() + 10);
                            Thread.sleep(time);
                        }
                    } else if (x1 < x && y1 >= y) {
                        while (lb1.getY() > y) {
                            lb1.setLocation(x1, lb1.getY() - 10);
                            Thread.sleep(time);
                        }
                        while (lb1.getX() < x) {
                            lb1.setLocation(lb1.getX() + 10, y);
                            Thread.sleep(time);
                        }
                    } else if (x1 >= x && y1 >= y) {
                        while (lb1.getY() > y) {
                            lb1.setLocation(x1, lb1.getY() - 10);
                            Thread.sleep(time);
                        }
                        while (lb1.getX() > x) {
                            lb1.setLocation(lb1.getX() - 10, y);
                            Thread.sleep(time);
                        }
                    }
                    lb1.setBackground(SystemColor.inactiveCaption);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void MovetoLocation_2(JLabel lb1, int x, int y) {
        curTT ++;
        
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1) {
                        threads[cur - 1].join();
                    }
                    lb1.setBackground(processingColor);
                    int x1 = lb1.getX();
                    int y1 = lb1.getY();
                    if (x1 < x && y1 < y) {
                        while (lb1.getX() < x) {
                            lb1.setLocation(lb1.getX() + 10, y1);
                            Thread.sleep(time);
                        }
                        while (lb1.getY() < y) {
                            lb1.setLocation(x, lb1.getY() + 10);
                            Thread.sleep(time);
                        }
                    } else if (x1 >= x && y1 < y) {
                        while (lb1.getX() > x) {
                            lb1.setLocation(lb1.getX() - 10, y1);
                            Thread.sleep(time);
                        }
                        while (lb1.getY() < y) {
                            lb1.setLocation(x, lb1.getY() + 10);
                            Thread.sleep(time);
                        }
                    } else if (x1 < x && y1 >= y) {
                        while (lb1.getY() > y) {
                            lb1.setLocation(x1, lb1.getY() - 10);
                            Thread.sleep(time);
                        }
                        while (lb1.getX() < x) {
                            lb1.setLocation(lb1.getX() + 10, y);
                            Thread.sleep(time);
                        }
                    } else if (x1 >= x && y1 >= y) {
                        while (lb1.getY() > y) {
                            lb1.setLocation(x1, lb1.getY() - 10);
                            Thread.sleep(time);
                        }
                        while (lb1.getX() > x) {
                            lb1.setLocation(lb1.getX() - 10, y);
                            Thread.sleep(time);
                        }
                    }
                    lb1.setBackground(SystemColor.inactiveCaption);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void HeapLocationInit() {
        int i, j = 0;
        int row = 1;
        int maxirow = 0;
        int[] xi = {600, 480, 720, 420, 540, 660, 780, 390, 450, 510, 570, 630, 690, 750, 810};
        int[] yi = {60, 110, 160, 210};
        MovetoLocation(lbArrays[0], xi[0], yi[0]);
        for (i = 0; i <= (num - 1) / 2; i ++) {
            if (i > maxirow) {
                row ++;
                maxirow = maxirow * 2 + 2;
            }
            j = i * 2 + 1;
            while (j <= i * 2 + 2 && j < num) {
                if (j == i * 2 + 1) {
                    MovetoLocation(lbArrays[j], xi[j], yi[row]);
                } else {
                    MovetoLocation(lbArrays[j], xi[j], yi[row]);
                }
                j ++;
            }
        }
    }
    
    public void HeapLocationInit_2() {
        int i, j = 0;
        int row = 1;
        int maxirow = 0;
        int[] xi = {600, 480, 720, 420, 540, 660, 780, 390, 450, 510, 570, 630, 690, 750, 810};
        //int[] yi = {60, 110, 160, 210};
        int[] yi = {310, 360, 410, 460}; //+250
        MovetoLocation_2(lbArrays1[0], xi[0], yi[0]);
        for (i = 0; i <= (num1 - 1) / 2; i ++) {
            if (i > maxirow) {
                row ++;
                maxirow = maxirow * 2 + 2;
            }
            j = i * 2 + 1;
            while (j <= i * 2 + 2 && j < num1) {
                if (j == i * 2 + 1) {
                    MovetoLocation_2(lbArrays1[j], xi[j], yi[row]);
                } else {
                    MovetoLocation_2(lbArrays1[j], xi[j], yi[row]);
                }
                j ++;
            }
        }
    }
    
    public void SwapinHeap(JLabel lb1, JLabel lb2) {
        curT ++;
        System.out.println(curT);
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0) {
                        threads[cur-1].join();
                    }
                    setBackgroundMoving(lb1, lb2);
                    int x1 = lb1.getX();
                    int x2 = lb2.getX();
                    int y1 = lb1.getY();
                    int y2 = lb2.getY();
                    while (lb2.getY() > y1) {
                        if (lb1.getY() > y1 - 50)
                            lb1.setLocation(lb1.getX(), lb1.getY() - 10);
                        lb2.setLocation(lb2.getX(), lb2.getY() - 10);
                        Thread.sleep(time);
                    }
                    if (x2 < x1) {
                        while (lb2.getX() < x1) {
                            lb1.setLocation(lb1.getX() - 10, lb1.getY());
                            lb2.setLocation(lb2.getX() + 10, lb2.getY());
                            Thread.sleep(time);
                        }
                    } else {
                        while (lb2.getX() > x1) {
                            lb1.setLocation(lb1.getX() + 10, lb1.getY());
                            lb2.setLocation(lb2.getX() - 10, lb2.getY());
                            Thread.sleep(time);
                        }
                    }
                    while (lb1.getY() < y2) {
                        lb1.setLocation(lb1.getX(), lb1.getY() + 10);
                        Thread.sleep(time);
                    }
                    String txtLb1 = lb1.getText();
                    lb1.setText(lb2.getText());
                    lb2.setText(txtLb1);
                    lb1.setLocation(x1, y1);
                    lb2.setLocation(x2, y2);
                    setBackgroundDone(lb1, lb2);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void SwapinHeap_2(JLabel lb1, JLabel lb2) {
        curTT ++;
        System.out.println(curTT);
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1) {
                        threads[cur-1].join();
                    }
                    setBackgroundMoving(lb1, lb2);
                    int x1 = lb1.getX();
                    int x2 = lb2.getX();
                    int y1 = lb1.getY();
                    int y2 = lb2.getY();
                    while (lb2.getY() > y1) {
                        if (lb1.getY() > y1 - 50)
                            lb1.setLocation(lb1.getX(), lb1.getY() - 10);
                        lb2.setLocation(lb2.getX(), lb2.getY() - 10);
                        Thread.sleep(time);
                    }
                    if (x2 < x1) {
                        while (lb2.getX() < x1) {
                            lb1.setLocation(lb1.getX() - 10, lb1.getY());
                            lb2.setLocation(lb2.getX() + 10, lb2.getY());
                            Thread.sleep(time);
                        }
                    } else {
                        while (lb2.getX() > x1) {
                            lb1.setLocation(lb1.getX() + 10, lb1.getY());
                            lb2.setLocation(lb2.getX() - 10, lb2.getY());
                            Thread.sleep(time);
                        }
                    }
                    while (lb1.getY() < y2) {
                        lb1.setLocation(lb1.getX(), lb1.getY() + 10);
                        Thread.sleep(time);
                    }
                    String txtLb1 = lb1.getText();
                    lb1.setText(lb2.getText());
                    lb2.setText(txtLb1);
                    lb1.setLocation(x1, y1);
                    lb2.setLocation(x2, y2);
                    setBackgroundDone(lb1, lb2);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void SwapHeapEnd(JLabel lb1, JLabel lb2, int xend) {
                    //MovetoLocation(lb1, xend, 260);
                    //MovetoLocation(lb2, 600, 60);
                    MovetoLocation(lb1, xend, 230);
                    MovetoLocation(lb2, 600, 60);
                    SwapwithoutMoving(lb1, lb2);
    }
    
    public void SwapHeapEnd_2(JLabel lb1, JLabel lb2, int xend) {
                    //MovetoLocation(lb1, xend, 260);
                    //MovetoLocation(lb2, 600, 60);
                    MovetoLocation_2(lb1, xend, 530);
                    MovetoLocation_2(lb2, 600, 310);
                    SwapwithoutMoving_2(lb1, lb2);
    }
    
    public void SwapwithoutMoving(JLabel lb1, JLabel lb2) {
        curT ++;
        System.out.println(curT);
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0) {
                        threads[cur - 1].join();
                    }
                    String txtLb1 = lb1.getText();
                    lb1.setText(lb2.getText());
                    lb2.setText(txtLb1);
                    int x = lb1.getX();
                    int y = lb1.getY();
                    lb1.setLocation(lb2.getX(), lb2.getY());
                    lb2.setLocation(x, y);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void SwapwithoutMoving_2(JLabel lb1, JLabel lb2) {
        curTT ++;
        System.out.println(curTT);
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1) {
                        threads[cur - 1].join();
                    }
                    String txtLb1 = lb1.getText();
                    lb1.setText(lb2.getText());
                    lb2.setText(txtLb1);
                    int x = lb1.getX();
                    int y = lb1.getY();
                    lb1.setLocation(lb2.getX(), lb2.getY());
                    lb2.setLocation(x, y);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void Shift(int l, int r) {
        int x, i ,j;
        i = l;
        j = i * 2 + 1;
        x = array[i];
        if (rdSapxeptang.isSelected()) {
            while (j <= r) {
                if (j < r) {
                    if (array[j] < array[j + 1]) {
                        j++;
                    }
                }
                if (array[j] <= x) {
                    return;
                } else {
                    array[i] = array[j];
                    array[j] = x;
                    SwapinHeap(lbArrays[i], lbArrays[j]);
                    i = j;
                    j = i * 2 + 1;
                    x = array[i];
                }
            }
        } else {
            while (j <= r) {
                if (j < r) {
                    if (array[j] > array[j + 1]) {
                        j ++;
                    }
                }
                if (array[j] >= x) {
                    return;
                } else {
                    array[i] = array[j];
                    array[j] = x;
                    SwapinHeap(lbArrays[i], lbArrays[j]);
                    i = j;
                    j = i * 2 + 1;
                    x = array[i];
                }
            }
        }
    }
    
    public void Shift_2(int l, int r) {
        int x, i ,j;
        i = l;
        j = i * 2 + 1;
        x = array1[i];
        if (rdSapxeptang.isSelected()) {
            while (j <= r) {
                if (j < r) {
                    if (array1[j] < array1[j + 1]) {
                        j++;
                    }
                }
                if (array1[j] <= x) {
                    return;
                } else {
                    array1[i] = array1[j];
                    array1[j] = x;
                    SwapinHeap_2(lbArrays1[i], lbArrays1[j]);
                    i = j;
                    j = i * 2 + 1;
                    x = array1[i];
                }
            }
        } else {
            while (j <= r) {
                if (j < r) {
                    if (array1[j] > array1[j + 1]) {
                        j ++;
                    }
                }
                if (array1[j] >= x) {
                    return;
                } else {
                    array1[i] = array1[j];
                    array1[j] = x;
                    SwapinHeap_2(lbArrays1[i], lbArrays1[j]);
                    i = j;
                    j = i * 2 + 1;
                    x = array1[i];
                }
            }
        }
    }
    
    public void CreateHeap() {
        int l;
        l = num / 2 - 1;
        while (l >= 0) {
            Shift(l, num - 1);
            l --;
        }
    }
    
    public void CreateHeap_2() {
        int l;
        l = num1 / 2 - 1;
        while (l >= 0) {
            Shift_2(l, num1 - 1);
            l --;
        }
    }
    
    public void HeapSort() {
        int r;
        int xend = ((int) ((18 - num) * 0.5) * 70) + 100 + (num - 1) * 70;
        HeapLocationInit();
        CreateHeap();
        r = num - 1;
        setlbname(name, "Heap Sort");
        while (r > 0) {
            int x = array[0];
            array[0] = array[r];
            array[r] = x;
            SwapHeapEnd(lbArrays[0], lbArrays[r], xend);
            xend -= 70;
            r --;
            if (r > 0) {
                Shift(0, r);
            }
        }
        SwapHeapEnd(lbArrays[0], null, xend);
    }
    
    public void HeapSort_2() {
        int r;
        int xend = ((int) ((18 - num1) * 0.5) * 70) + 100 + (num1 - 1) * 70;
        HeapLocationInit_2();
        CreateHeap_2();
        r = num1 - 1;
        setlbname_2(name2, "Heap Sort");
        while (r > 0) {
            int x = array1[0];
            array1[0] = array1[r];
            array1[r] = x;
            SwapHeapEnd_2(lbArrays1[0], lbArrays1[r], xend);
            xend -= 70;
            r --;
            if (r > 0) {
                Shift_2(0, r);
            }
        }
        SwapHeapEnd_2(lbArrays1[0], null, xend);
    }
    
    
    
    public void QuickSort() {
        setlbname(name, "Quick Sort");
        QuickSortAl(0, num - 1);
        QuickSortAnimation();
        step = 0;
    }
  
    public void QuickSort_2() {
        setlbname_2(name2, "Quick Sort");
        QuickSortAl_2(0, num1 - 1);
        QuickSortAnimation_2();
        step1 = 0;
    }
    
    public void Coloring(JLabel lb1, Color c) {
        curT ++;
        System.out.println(curT);
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0)
                        threads[cur - 1].join();
                    lb1.setBackground(c);
                    Thread.sleep(time);
                } catch (Exception e) {}
            }
        });
        threads[cur].start();
    }
    
    public void Coloring_2(JLabel lb1, Color c) {
        curTT ++;
        System.out.println(curTT);
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1)
                        threads[cur - 1].join();
                    lb1.setBackground(c);
                    Thread.sleep(time);
                } catch (Exception e) {}
            }
        });
        threads[cur].start();
    }
    
    public void Coloring(int left, int right, Color c) {
        curT ++;
        System.out.println(curT);
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0)
                        threads[cur - 1].join();
                    int i = left;
                    while (i <= right) {
                        if (i != (left + right) / 2)
                            lbArrays[i].setBackground(c);
                        i ++;
                    }
                    Thread.sleep(time);
                } catch (Exception e) {}
            }
        });
        threads[cur].start();
    }

    public void Coloring_2(int left, int right, Color c) {
        curTT ++;
        System.out.println(curTT);
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1)
                        threads[cur - 1].join();
                    int i = left;
                    while (i <= right) {
                        if (i != (left + right) / 2)
                            lbArrays1[i].setBackground(c);
                        i ++;
                    }
                    Thread.sleep(time);
                } catch (Exception e) {}
            }
        });
        threads[cur].start();
    }
    
    public void QuickSortAnimation() {
        int s, i, j;
        for (s = 0; s < step; s ++) {
            i = lbI[s];
            j = lbJ[s];
            setlbPoint(lbPoint1, i, "i = ");
            setlbPoint(lbPoint2, j, "j = ");
            if (i != j) {
                Coloring(lbArrays[(lbL[s] + lbR[s]) / 2], selectedGreen);
                Coloring(lbL[s], lbR[s], selectedYellow);
                Swap(lbArrays[i], lbArrays[j]);
            }
            if (lbL[s + 1] + lbR[s + 1] != lbL[s] + lbR[s]) {
                Coloring(lbArrays[(lbL[s] + lbR[s]) / 2], SystemColor.inactiveCaption);
                Coloring(lbL[s], lbR[s], SystemColor.inactiveCaption);
            }
        }
    }
    
    public void QuickSortAnimation_2() {
        int s, i, j;
        for (s = 0; s < step1; s ++) {
            i = lbI1[s];
            j = lbJ1[s];
            setlbPoint_2(lbPoint1_2, i, "i = ");
            setlbPoint_2(lbPoint2_2, j, "j = ");
            if (i != j) {
                Coloring_2(lbArrays1[(lbL1[s] + lbR1[s]) / 2], selectedGreen);
                Coloring_2(lbL1[s], lbR1[s], selectedYellow);
                Swap_2(lbArrays1[i], lbArrays1[j]);
            }
            if (lbL1[s + 1] + lbR1[s + 1] != lbL1[s] + lbR1[s]) {
                Coloring_2(lbArrays1[(lbL1[s] + lbR1[s]) / 2], SystemColor.inactiveCaption);
                Coloring_2(lbL1[s], lbR1[s], SystemColor.inactiveCaption);
            }
        }
    }
    
    public void QuickSortAl(int left, int right) {
        if (rdSapxeptang.isSelected()) {
	    	int i, j, x;
	        x = array[(left + right) / 2];
	        i = left; j = right;
	        while (i < j) {
	            while (array[i] < x) {
                        i ++;
                    }
	            while (array[j] > x) {
                        j --;
                    }
	            if (i <= j) {
                        if (array[i] != array[j]) {
	                    int temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                    if (i != j) {
                                lbL[step] = left; lbR[step] = right;
	                        lbI[step] = i; lbJ[step] = j;
	                        step ++;
	                    }
                        }
	                i ++; j --;
	            }
	        }
	        if (left < j)
	            QuickSortAl(left, j);
	        if (i < right)
	            QuickSortAl(i, right);
        }
        else {
        	int i, j, x;
	        x = array[(left + right) / 2];
	        i = left; j = right;
	        while (i < j) {
	            while (array[i] > x) {
                        i ++;
                    }
	            while (array[j] < x) {
                        j --;
                    }
	            if (i <= j) {
                        if (array[i] != array[j]) {
	                    int temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                    if (i != j) {
                                lbL[step] = left; lbR[step] = right;
	                        lbI[step] = i; lbJ[step] = j;
	                        step ++;
	                    }
                        }
	                i ++; j --;
	            }
	        }
	        if (left < j)
	            QuickSortAl(left, j);
	        if (i < right)
	            QuickSortAl(i, right);
        }
    }
    
    public void QuickSortAl_2(int left, int right) {
        if (rdSapxeptang.isSelected()) {
	    	int i, j, x;
	        x = array1[(left + right) / 2];
	        i = left; j = right;
	        while (i < j) {
	            while (array1[i] < x) {
                        i ++;
                    }
	            while (array1[j] > x) {
                        j --;
                    }
	            if (i <= j) {
                        if (array1[i] != array1[j]) {
	                    int temp = array1[i];
	                    array1[i] = array1[j];
	                    array1[j] = temp;
	                    if (i != j) {
                                lbL1[step1] = left; lbR1[step1] = right;
	                        lbI1[step1] = i; lbJ1[step1] = j;
	                        step1 ++;
	                    }
                        }
	                i ++; j --;
	            }
	        }
	        if (left < j)
	            QuickSortAl_2(left, j);
	        if (i < right)
	            QuickSortAl_2(i, right);
        }
        else {
        	int i, j, x;
	        x = array1[(left + right) / 2];
	        i = left; j = right;
	        while (i < j) {
	            while (array1[i] > x) {
                        i ++;
                    }
	            while (array1[j] < x) {
                        j --;
                    }
	            if (i <= j) {
                        if (array1[i] != array1[j]) {
	                    int temp = array1[i];
	                    array1[i] = array1[j];
	                    array1[j] = temp;
	                    if (i != j) {
                                lbL1[step1] = left; lbR1[step1] = right;
	                        lbI1[step1] = i; lbJ1[step1] = j;
	                        step1 ++;
	                    }
                        }
	                i ++; j --;
	            }
	        }
	        if (left < j)
	            QuickSortAl_2(left, j);
	        if (i < right)
	            QuickSortAl_2(i, right);
        }
    }
    
    
    
    public void PutUp(int left, int right) {
        curT ++;
        System.out.println(curT);
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0)
                        threads[cur - 1].join();
                    int mid = (left + right) / 2;
                    for (int i = left; i <= right; i ++) {
                        if (i < mid + 1)
                            lbArrays[i].setBackground(selectedGreen);
                        else
                            lbArrays[i].setBackground(selectedYellow);
                    }
                    while (lbArrays[right].getY() > 50) {
                        for (int i = left; i <= right; i ++) {
                            if (lbArrays[i].getY() > 50)
                                lbArrays[i].setLocation(lbArrays[i].getX(), lbArrays[i].getY() - 10);
                        }
                        Thread.sleep(time);
                    }
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void PutDown(JLabel lb1, int x, int y) {
        curT ++;
        System.out.println(curT);
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0) {
                        threads[cur - 1].join();
                    }
                    int x1 = lb1.getX();
                    lb1.setBackground(processingColor);
                    while (lb1.getY() < 100) {
                        lb1.setLocation(x1, lb1.getY() + 10);
                        Thread.sleep(time);
                    }
                    int y1 = lb1.getY();
                    if (x1 < x) {
                        while (lb1.getX() < x) {
                            lb1.setLocation(lb1.getX() + 10, y1);
                            Thread.sleep(time);
                        }
                        while (lb1.getY() < y) {
                            lb1.setLocation(x, lb1.getY() + 10);
                            Thread.sleep(time);
                        }
                    } else {
                        while (lb1.getX() > x) {
                            lb1.setLocation(lb1.getX() - 10, y1);
                            Thread.sleep(time);
                        }
                        while (lb1.getY() < y) {
                            lb1.setLocation(x, lb1.getY() + 10);
                            Thread.sleep(time);
                        }
                    }
                    lb1.setBackground(SystemColor.inactiveCaption);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void Relocat(int left, int right, int[] T) {
        curT ++;
        System.out.println(curT);
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0)
                        threads[cur - 1].join();
                    for (int i = left; i <= right; i ++) {
                        if (lbArrays[i].getX() != oriLocat[i]) {
                            lbArrays[i].setLocation(oriLocat[i], 150);
                            lbArrays[i].setText(T[i - left] + "");
                        }
                    }
                    Thread.sleep(time);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void Merge(int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] T = new int[n1 + n2];
        int[] L = new int[n1];
        int[] R = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i ++)
            L[i] = array[left + i];
        for (j = 0; j < n2; j ++)
            R[j] = array[mid + 1 + j];
        setlbPoint(lbPoint1, left, "i = ");
        setlbPoint(lbPoint2, mid + 1, "j = ");
        PutUp(left, right);
        if (rdSapxeptang.isSelected()) {
            i = 0; j = 0;
            k = left;
            while (i < n1 && j < n2) {
                setlbPoint(lbPointM, k, "k = ");
                if (L[i] <= R[j]) {
                    setlbPoint(lbPoint1, left + i, "i = ");
                    array[k] = L[i];
                    PutDown(lbArrays[left + i], oriLocat[k], 150);
                    i ++;
                } else {
                    setlbPoint(lbPoint2, mid + 1 + j, "j = ");
                    array[k] = R[j];
                    PutDown(lbArrays[mid + 1 + j], oriLocat[k], 150);
                    j ++;
                }
                k ++;
            }
            while (i < n1) {
                setlbPoint(lbPointM, k, "k = ");
                setlbPoint(lbPoint1, left + i, "i = ");
                array[k] = L[i];
                PutDown(lbArrays[left + i], oriLocat[k], 150);
                i ++;
                k ++;
            }
            while (j < n2) {
                setlbPoint(lbPointM, k, "k = ");
                setlbPoint(lbPoint2, mid + 1 + j, "j = ");
                array[k] = R[j];
                PutDown(lbArrays[mid + 1 + j], oriLocat[k], 150);
                j ++;
                k ++;
            }
        } else {
            i = 0; j = 0;
            k = left;
            while (i < n1 && j < n2) {
                setlbPoint(lbPointM, k, "k = ");
                if (L[i] >= R[j]) {
                    setlbPoint(lbPoint1, left + i, "i = ");
                    array[k] = L[i];
                    PutDown(lbArrays[left + i], oriLocat[k], 150);
                    i ++;
                } else {
                    setlbPoint(lbPoint2, mid + 1 + j, "j = ");
                    array[k] = R[j];
                    PutDown(lbArrays[mid + 1 + j], oriLocat[k], 150);
                    j ++;
                }
                k ++;
            }
            while (i < n1) {
                setlbPoint(lbPointM, k, "k = ");
                setlbPoint(lbPoint1, left + i, "i = ");
                array[k] = L[i];
                PutDown(lbArrays[left + i], oriLocat[k], 150);
                i ++;
                k ++;
            }
            while (j < n2) {
                setlbPoint(lbPointM, k, "k = ");
                setlbPoint(lbPoint2, mid + 1 + j, "j = ");
                array[k] = R[j];
                PutDown(lbArrays[mid + 1 + j], oriLocat[k], 150);
                j ++;
                k ++;
            }
        }
        for (i = 0; i < n1 + n2; i ++)
            T[i] = array[left + i];
        Relocat(left, right, T);
    }
    
    public void MergeSort_Middle(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            MergeSort_Middle(left, mid);
            MergeSort_Middle(mid + 1, right);
            Merge(left, mid, right);
        }
    }
    
    public void MergeSort() {
        setlbname(name, "Merge Sort");
        for (int i = 0; i < num; i ++)
            oriLocat[i] = lbArrays[i].getX();
        MergeSort_Middle(0, num - 1);
    }
    
    public void PutUp_2(int left, int right) {
        curTT ++;
        System.out.println(curTT);
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1)
                        threads[cur - 1].join();
                    int mid = (left + right) / 2;
                    for (int i = left; i <= right; i ++) {
                        if (i < mid + 1)
                            lbArrays1[i].setBackground(selectedGreen);
                        else
                            lbArrays1[i].setBackground(selectedYellow);
                    }
                    while (lbArrays1[right].getY() > 350) {
                        for (int i = left; i <= right; i ++) {
                            if (lbArrays1[i].getY() > 350)
                                lbArrays1[i].setLocation(lbArrays1[i].getX(), lbArrays1[i].getY() - 10);
                        }
                        Thread.sleep(time);
                    }
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void PutDown_2(JLabel lb1, int x, int y) {
        curTT ++;
        System.out.println(curTT);
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1) {
                        threads[cur - 1].join();
                    }
                    int x1 = lb1.getX();
                    lb1.setBackground(processingColor);
                    while (lb1.getY() < 400) {
                        lb1.setLocation(x1, lb1.getY() + 10);
                        Thread.sleep(time);
                    }
                    int y1 = lb1.getY();
                    if (x1 < x) {
                        while (lb1.getX() < x) {
                            lb1.setLocation(lb1.getX() + 10, y1);
                            Thread.sleep(time);
                        }
                        while (lb1.getY() < y) {
                            lb1.setLocation(x, lb1.getY() + 10);
                            Thread.sleep(time);
                        }
                    } else {
                        while (lb1.getX() > x) {
                            lb1.setLocation(lb1.getX() - 10, y1);
                            Thread.sleep(time);
                        }
                        while (lb1.getY() < y) {
                            lb1.setLocation(x, lb1.getY() + 10);
                            Thread.sleep(time);
                        }
                    }
                    lb1.setBackground(SystemColor.inactiveCaption);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void Relocat_2(int left, int right, int[] T) {
        curTT ++;
        System.out.println(curTT);
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1)
                        threads[cur - 1].join();
                    for (int i = left; i <= right; i ++) {
                        if (lbArrays1[i].getX() != oriLocat1[i]) {
                            lbArrays1[i].setLocation(oriLocat1[i], 450);
                            lbArrays1[i].setText(T[i - left] + "");
                        }
                    }
                    Thread.sleep(time);
                } catch (Exception e) {
                }
            }
        });
        threads[cur].start();
    }
    
    public void Merge_2(int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] T = new int[n1 + n2];
        int[] L = new int[n1];
        int[] R = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i ++)
            L[i] = array1[left + i];
        for (j = 0; j < n2; j ++)
            R[j] = array1[mid + 1 + j];
        setlbPoint_2(lbPoint1_2, left, "i = ");
        setlbPoint_2(lbPoint2_2, mid + 1, "j = ");
        PutUp_2(left, right);
        if (rdSapxeptang.isSelected()) {
            i = 0; j = 0;
            k = left;
            while (i < n1 && j < n2) {
                setlbPoint_2(lbPointM_2, k, "k = ");
                if (L[i] <= R[j]) {
                    setlbPoint_2(lbPoint1_2, left + i, "i = ");
                    array1[k] = L[i];
                    PutDown_2(lbArrays1[left + i], oriLocat1[k], 450);
                    i ++;
                } else {
                    setlbPoint_2(lbPoint2_2, mid + 1 + j, "j = ");
                    array1[k] = R[j];
                    PutDown_2(lbArrays1[mid + 1 + j], oriLocat1[k], 450);
                    j ++;
                }
                k ++;
            }
            while (i < n1) {
                setlbPoint_2(lbPointM_2, k, "k = ");
                setlbPoint_2(lbPoint1_2, left + i, "i = ");
                array1[k] = L[i];
                PutDown_2(lbArrays1[left + i], oriLocat1[k], 450);
                i ++;
                k ++;
            }
            while (j < n2) {
                setlbPoint_2(lbPointM_2, k, "k = ");
                setlbPoint_2(lbPoint2_2, mid + 1 + j, "j = ");
                array1[k] = R[j];
                PutDown_2(lbArrays1[mid + 1 + j], oriLocat1[k], 450);
                j ++;
                k ++;
            }
        } else {
            i = 0; j = 0;
            k = left;
            while (i < n1 && j < n2) {
                setlbPoint_2(lbPointM_2, k, "k = ");
                if (L[i] >= R[j]) {
                    setlbPoint_2(lbPoint1_2, left + i, "i = ");
                    array1[k] = L[i];
                    PutDown_2(lbArrays1[left + i], oriLocat1[k], 450);
                    i ++;
                } else {
                    setlbPoint_2(lbPoint2_2, mid + 1 + j, "j = ");
                    array1[k] = R[j];
                    PutDown_2(lbArrays1[mid + 1 + j], oriLocat1[k], 450);
                    j ++;
                }
                k ++;
            }
            while (i < n1) {
                setlbPoint_2(lbPointM_2, k, "k = ");
                setlbPoint_2(lbPoint1_2, left + i, "i = ");
                array1[k] = L[i];
                PutDown_2(lbArrays1[left + i], oriLocat1[k], 450);
                i ++;
                k ++;
            }
            while (j < n2) {
                setlbPoint_2(lbPointM_2, k, "k = ");
                setlbPoint_2(lbPoint2_2, mid + 1 + j, "j = ");
                array1[k] = R[j];
                PutDown_2(lbArrays1[mid + 1 + j], oriLocat1[k], 450);
                j ++;
                k ++;
            }
        }
        for (i = 0; i < n1 + n2; i ++)
            T[i] = array1[left + i];
        Relocat_2(left, right, T);
    }
    
    public void MergeSort_Middle_2(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            MergeSort_Middle_2(left, mid);
            MergeSort_Middle_2(mid + 1, right);
            Merge_2(left, mid, right);
        }
    }
    
    public void MergeSort_2() {
        setlbname_2(name2, "Merge Sort");
        for (int i = 0; i < num1; i ++)
            oriLocat1[i] = lbArrays1[i].getX();
        MergeSort_Middle_2(0, num1 - 1);
    }
    
    
    public void stopAllThreads() {
    	for (int i = 0; i < curT; i++) {
			try {
			threads[i].interrupt();
			} catch (Exception e) {
				
			}
		}
		curT = -1;
    }
    
    public void stopAllThreads_2() {
    	for (int i = 0; i < curTT; i++) {
			try {
			threads[i].interrupt();
			} catch (Exception e) {
				
			}
		}
		curTT = 0;
    }
    
    public void threadReLocate() {
    	curT++;
		
		int cur = curT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 0) {
			    		threads[cur-1].join();
			    	}
		    		reLocate();
		    	} catch (Exception e) {
		    		
		    	}
		    }
		});
		threads[cur].start();
    }
    
    public void threadReLocate_2() {
    	curTT++;
		
		int cur = curTT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 1) {
			    		threads[cur-1].join();
			    	}
		    		reLocate_2();
		    	} catch (Exception e) {
		    		
		    	}
		    }
		});
		threads[cur].start();
    }
    
    public void waitEnd() {
    	curT++;
		
		int cur = curT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 0) {
			    		threads[cur-1].join();
			    	}
		    		setState(4);
		    		for (int i = 0; i < num; i++) {
		    			lbArrays[i].setForeground(Color.darkGray);
		    		}
                                
                                lbPoint1.setText("");
                                lbPoint2.setText("");
                                lbPointM.setText("");
                                /*
		    		FormCompleteSorted form = new FormCompleteSorted();
		    		form.setVisible(true);
                                */                   
		    	} catch (Exception e) {
		    		
		    	}
		    }
		});
		threads[cur].start();
    }
    
    public void waitEnd_2() {
    	curTT++;
		
		int cur = curTT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 1) {
			    		threads[cur-1].join();
			    	}
		    		setState(4);
		    		for (int i = 0; i < num1; i++) {
		    			lbArrays1[i].setForeground(Color.darkGray);
		    		}
                                
                                lbPoint1_2.setText("");
                                lbPoint2_2.setText("");
                                lbPointM_2.setText("");
                                /*
		    		FormCompleteSorted form = new FormCompleteSorted();
		    		form.setVisible(true);
                                */                   
		    	} catch (Exception e) {
		    		
		    	}
		    }
		});
		threads[cur].start();
    }
    
    public void reLocate() {
    	for (int i = 0; i < num; i++) {
			//setLocation label
			if (i == 0)
				lbArrays[i].setLocation(((int) ((18 - num) * 0.5) * 70) + 100, 150);
			else
				lbArrays[i].setLocation(lbArrays[i-1].getX() + 70, 150);
    	}
    }
    
    public void reLocate_2() {
    	for (int i = 0; i < num1; i++) {
			//setLocation label
			if (i == 0)
				lbArrays1[i].setLocation(((int) ((18 - num1) * 0.5) * 70) + 100, 450);
			else
				lbArrays1[i].setLocation(lbArrays1[i-1].getX() + 70, 450);
    	}
    }
    
    public void setBackgroundMoving(JLabel lb1, JLabel lb2) {
    	lb1.setOpaque(true);
    	lb2.setOpaque(true);
    	
    	lb1.setBackground(processingColor);
    	lb2.setBackground(processingColor);
    }
    
    public void setBackgroundDone(JLabel lb1, JLabel lb2) {
    	lb1.setOpaque(true);
    	lb2.setOpaque(true);
    	
    	lb1.setBackground(SystemColor.inactiveCaption);
    	lb2.setBackground(SystemColor.inactiveCaption);
    }

    
    public void Swap(JLabel lb1, JLabel lb2) {
		int x1 = lb1.getX();
		int x2 = lb2.getX();
		curT ++;
		
		int cur = curT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 0) {
			    		threads[cur-1].join();
			    	}
		    		
		    		lb1.setBackground(processingColor);
		    		lb2.setBackground(processingColor);
			        while (lb1.getY() > 100) {
			        	lb1.setLocation(lb1.getX(), lb1.getY() - 10);
			        	lb2.setLocation(lb2.getX(), lb2.getY() + 10);
                                        lbPointM.setLocation(x2, lbPointM.getY() + 10);
			        	Thread.sleep(time);
			        }
			        while (lb1.getX() < x2) {
			        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
			        	lb2.setLocation(lb2.getX() - 10, lb2.getY());
                                        lbPointM.setLocation(lb2.getX(), 250);
			        	Thread.sleep(time);
			        }
			        while (lb1.getY() < 140) {
			        	lb1.setLocation(lb1.getX(), lb1.getY() + 10);
			        	lb2.setLocation(lb2.getX(), lb2.getY() - 10);
                                        lbPointM.setLocation(x1, lbPointM.getY() - 10);
			        	Thread.sleep(time);
			        }
                             
			        String txtLb1 = lb1.getText();
			        lb1.setText(lb2.getText());
			        lb2.setText(txtLb1);
			        lb1.setLocation(x1, 150);
		        	lb2.setLocation(x2, 150);
		        	lb1.setBackground(SystemColor.inactiveCaption);
		        	lb2.setBackground(SystemColor.inactiveCaption);
		    	} catch (Exception e) {
		    	}
		    }
		});
		threads[cur].start();
	}
    
    
    public void Swap_2(JLabel lb1, JLabel lb2) {
		int x1 = lb1.getX();
		int x2 = lb2.getX();
		curTT ++;
		
		int cur = curTT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 1) {
			    		threads[cur-1].join();
			    	}
		    		
		    		lb1.setBackground(processingColor);
		    		lb2.setBackground(processingColor);
			        while (lb1.getY() > 400) {
			        	lb1.setLocation(lb1.getX(), lb1.getY() - 10);
			        	lb2.setLocation(lb2.getX(), lb2.getY() + 10);
                                        lbPointM_2.setLocation(x2, lbPointM_2.getY() + 10);
			        	Thread.sleep(time);
			        }
			        while (lb1.getX() < x2) {
			        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
			        	lb2.setLocation(lb2.getX() - 10, lb2.getY());
                                        lbPointM_2.setLocation(lb2.getX(), 550);
			        	Thread.sleep(time);
			        }
			        while (lb1.getY() < 440) {
			        	lb1.setLocation(lb1.getX(), lb1.getY() + 10);
			        	lb2.setLocation(lb2.getX(), lb2.getY() - 10);
                                        lbPointM_2.setLocation(x1, lbPointM_2.getY() - 10);
			        	Thread.sleep(time);
			        }
			        String txtLb1 = lb1.getText();
			        lb1.setText(lb2.getText());
			        lb2.setText(txtLb1);
			        lb1.setLocation(x1, 450);
		        	lb2.setLocation(x2, 450);
		        	lb1.setBackground(SystemColor.inactiveCaption);
		        	lb2.setBackground(SystemColor.inactiveCaption);
		    	} catch (Exception e) {
		    	}
		    }
		});
		threads[cur].start();
        }
    
    
    public void setZero() {
		for (int i = 0; i < num; i++) {
			lbArrays[i].setText("0");
			array[i] = 0;
		}
		createArrays();
		jPanel_Chaymophong.revalidate();
		jPanel_Chaymophong.repaint();
		setState(1);
	}
    
   
    public void setState(int state) {
		switch (state) {
		case 0: 
			btTaomang.setEnabled(true);
			btXoamang.setEnabled(false);
			//btDatve0.setEnabled(false);

			btRandom.setEnabled(false);
			btBangtay.setEnabled(true);
			btMofile.setEnabled(true);
			btDocfile.setEnabled(true);
			
			rdInterchangeSort.setEnabled(true);
			rdSelectionSort.setEnabled(true);
			rdBubbleSort.setEnabled(true);
			rdInsertionSort.setEnabled(true);
			rdShellSort.setEnabled(true);
			rdHeapSort.setEnabled(true);
			rdQuickSort.setEnabled(true);
			rdMergeSort.setEnabled(true);
			
			rdSapxeptang.setEnabled(true);
			rdSapxepgiam.setEnabled(true);
			
			btSapxep.setEnabled(false);
                        bt_quaylai.setEnabled(false);
			//btnNext.setEnabled(false);
			//btnNext2.setEnabled(false);
			//btnStop.setEnabled(false);
			break;
			
		case 1: //tao mang.
			btXoamang.setEnabled(true);
			//btDatve0.setEnabled(true);
			
			btRandom.setEnabled(true);
			btBangtay.setEnabled(true);
			btMofile.setEnabled(true);
			btDocfile.setEnabled(true);
			
			rdInterchangeSort.setEnabled(true);
			rdSelectionSort.setEnabled(true);
			rdBubbleSort.setEnabled(true);
			rdInsertionSort.setEnabled(true);
			rdShellSort.setEnabled(true);
			rdHeapSort.setEnabled(true);
			rdQuickSort.setEnabled(true);
			rdMergeSort.setEnabled(true);
			
			rdSapxeptang.setEnabled(true);
			rdSapxepgiam.setEnabled(true);	
			break;
			
		case 2: //tao du lieu
			btXoamang.setEnabled(true);
			//btDatve0.setEnabled(true);

			btRandom.setEnabled(true);
			
			rdInterchangeSort.setEnabled(true);
			rdSelectionSort.setEnabled(true);
			rdBubbleSort.setEnabled(true);
			rdInsertionSort.setEnabled(true);
			rdShellSort.setEnabled(true);
			rdHeapSort.setEnabled(true);
			rdQuickSort.setEnabled(true);
			rdMergeSort.setEnabled(true);
			
			rdSapxeptang.setEnabled(true);
			rdSapxepgiam.setEnabled(true);
			
			btSapxep.setEnabled(true);
                        bt_quaylai.setEnabled(true);
			break;
			
		case 3: //sap xep
			btTaomang.setEnabled(true);
			btXoamang.setEnabled(true);
			//btDatve0.setEnabled(false);
			
			btRandom.setEnabled(false);
			btBangtay.setEnabled(false);
			btMofile.setEnabled(false);
			btDocfile.setEnabled(false);
			
			rdSapxeptang.setEnabled(false);
			rdSapxepgiam.setEnabled(false);
			
			rdInterchangeSort.setEnabled(false);
			rdSelectionSort.setEnabled(false);
			rdBubbleSort.setEnabled(false);
			rdInsertionSort.setEnabled(false);
			rdShellSort.setEnabled(false);
			rdHeapSort.setEnabled(false);
			rdQuickSort.setEnabled(false);
			rdMergeSort.setEnabled(false);
			
			btSapxep.setEnabled(false);
                        bt_quaylai.setEnabled(true);
			break;
			
		case 4: //sap xep xong
			btTaomang.setEnabled(true);
			btXoamang.setEnabled(true);
			//btDatve0.setEnabled(true);
			
			btRandom.setEnabled(true);
			btBangtay.setEnabled(true);
			btMofile.setEnabled(true);
			btDocfile.setEnabled(true);
			
			rdInterchangeSort.setEnabled(true);
			rdSelectionSort.setEnabled(true);
			rdBubbleSort.setEnabled(true);
			rdInsertionSort.setEnabled(true);
			rdShellSort.setEnabled(true);
			rdHeapSort.setEnabled(true);
			rdQuickSort.setEnabled(true);
			rdMergeSort.setEnabled(true);
			
			rdSapxeptang.setEnabled(true);
			rdSapxepgiam.setEnabled(true);
			
			btSapxep.setEnabled(true);
                        bt_quaylai.setEnabled(true);
			break;
			default:
				btTaomang.setEnabled(true);
				btXoamang.setEnabled(false);
				//btDatve0.setEnabled(false);

				btRandom.setEnabled(false);
				btBangtay.setEnabled(true);
				btMofile.setEnabled(true);
				btDocfile.setEnabled(true);
				
				rdInterchangeSort.setEnabled(true);
				rdSelectionSort.setEnabled(true);
				rdBubbleSort.setEnabled(true);
				rdInsertionSort.setEnabled(true);
				rdShellSort.setEnabled(true);
				rdHeapSort.setEnabled(true);
				rdQuickSort.setEnabled(true);
				rdMergeSort.setEnabled(true);
				
				rdSapxeptang.setEnabled(true);
				rdSapxepgiam.setEnabled(true);
				
				btSapxep.setEnabled(false);
		}
	}
    
    
    public static void setLockAndFeel() {
		try {
		    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    
		}
	}

    
    public void setlbPoint(JLabel lbPoint, int i, String s) {
            curT ++;
            System.out.println(curT);
            int cur = curT;
            threads[cur] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        if (cur != 0)
                            threads[cur - 1].join();
                        if (i == -1) {
                            lbPoint.setText("");
                            return;
                        }
                        if (s.charAt(0) == 'm') {
                            lbPoint.setLocation(lbArrays[i].getX(), 200);
                            lbPoint.setText(s);
                        } else if (s.charAt(0) == 'k') {
                            lbPoint.setLocation(oriLocat[i], 200);
                            lbPoint.setText(s + i);
                        } else {
                            lbPoint.setLocation(lbArrays[i].getX(), 275);
                            lbPoint.setText(s + i);
                        }
                    } catch (Exception e){}
                }
            });
            threads[cur].start();
        }
    
    public void setlbname(JLabel lbPoint, String s) {
            curTTT ++;
            System.out.println(curTTT);
            int cur = curTTT;
            threads[cur] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        if (cur != 2)
                            threads[cur - 1].join();
                        if (num == -1) {
                            lbPoint.setText("");
                            return;
                        }else{
                        name.setLocation(20, 70);
                        name.setText(s);
                        }
                    } catch (Exception e){}
                }
            });
            threads[cur].start();
        }
    
    public void setlbname_2(JLabel lbPoint, String s) {
            curTTT2 ++;
            System.out.println(curTTT2);
            int cur = curTTT2;
            threads[cur] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        if (cur != 3)
                            threads[cur - 1].join();
                        if (num1 == -1) {
                            lbPoint.setText("");
                            return;
                        }else{
                        name2.setLocation(20, 350);
                        name2.setText(s);
                        }
                    } catch (Exception e){}
                }
            });
            threads[cur].start();
        }
    
    public void setlbPoint_2(JLabel lbPoint, int i, String s) {
            curTT ++;
            System.out.println(curTT);
            int cur = curTT;
            threads[cur] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        if (cur != 1)
                            threads[cur - 1].join();
                        if (i == -1) {
                            lbPoint.setText("");
                            return;
                        }
                        if (s.charAt(0) == 'm') {
                            lbPoint.setLocation(lbArrays1[i].getX(), 500);
                            lbPoint.setText(s);
                        } else if (s.charAt(0) == 'k') {
                            lbPoint.setLocation(oriLocat1[i], 500);
                            lbPoint.setText(s + i);
                        } else {
                            lbPoint.setLocation(lbArrays1[i].getX(), 575);
                            lbPoint.setText(s + i);
                        }
                    } catch (Exception e){}
                }
            });
            threads[cur].start();
        }
    
    public void Move(JLabel lb1, JLabel lb2, int pos) {
        int x1 = lb1.getX();
        int x2 = lb2.getX();
        curT ++;
        
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0) {
                        threads[cur - 1].join();
                    }
                    lb1.setOpaque(true);
                    lb2.setOpaque(true);
                    lb1.setBackground(processingColor);
                    lb2.setBackground(processingColor);
                    while (lb1.getY() > 100) {
                        lb1.setLocation(lb1.getX(), lb1.getY() - 10);
                        Thread.sleep(time);
                    }
                    while (lb1.getX() > x2) {
                        lb2.setLocation(lb2.getX() + 10, lb2.getY());
                        lb1.setLocation(lb1.getX() - 10, lb1.getY());
                        Thread.sleep(time);
                    }
                    while (pos == 0 && lb1.getY() < 150) {
                        lb1.setLocation(lb1.getX(), lb1.getY() + 10);
                        Thread.sleep(time);
                    }
                    String txtLb1 = lb1.getText();
                    lb1.setText(lb2.getText());
                    lb2.setText(txtLb1);
                    int y1 = lb1.getY();
                    lb1.setLocation(x1, lb2.getY());
                    lb2.setLocation(x2, y1);
                    lb1.setBackground(SystemColor.inactiveCaption);
                    if (pos == 0)
                        lb2.setBackground(SystemColor.inactiveCaption);
               } catch (Exception e) {
               }
           }
        });
        threads[cur].start();
    }
    
    public void Move_2(JLabel lb1, JLabel lb2, int pos) {
        int x1 = lb1.getX();
        int x2 = lb2.getX();
        curTT ++;
        
        int cur = curTT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 1) {
                        threads[cur - 1].join();
                    }
                    lb1.setOpaque(true);
                    lb2.setOpaque(true);
                    lb1.setBackground(processingColor);
                    lb2.setBackground(processingColor);
                    while (lb1.getY() > 400) {
                        lb1.setLocation(lb1.getX(), lb1.getY() - 10);
                        Thread.sleep(time);
                    }
                    while (lb1.getX() > x2) {
                        lb2.setLocation(lb2.getX() + 10, lb2.getY());
                        lb1.setLocation(lb1.getX() - 10, lb1.getY());
                        Thread.sleep(time);
                    }
                    while (pos == 0 && lb1.getY() < 450) {
                        lb1.setLocation(lb1.getX(), lb1.getY() + 10);
                        Thread.sleep(time);
                    }
                    String txtLb1 = lb1.getText();
                    lb1.setText(lb2.getText());
                    lb2.setText(txtLb1);
                    int y1 = lb1.getY();
                    lb1.setLocation(x1, lb2.getY());
                    lb2.setLocation(x2, y1);
                    lb1.setBackground(SystemColor.inactiveCaption);
                    if (pos == 0)
                        lb2.setBackground(SystemColor.inactiveCaption);
               } catch (Exception e) {
               }
           }
        });
        threads[cur].start();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleMoPhong;
    private javax.swing.JButton btBangtay;
    private javax.swing.JButton btDocfile;
    private javax.swing.JButton btMofile;
    private javax.swing.JButton btRandom;
    private javax.swing.JButton btSapxep;
    private javax.swing.JButton btTaomang;
    private javax.swing.JButton btXoamang;
    private javax.swing.JButton bt_quaylai;
    private javax.swing.JButton bt_sosanh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel contentPane;
    private javax.swing.JPanel jPanel_Chaymophong;
    private javax.swing.JPanel jPanel_Chongiaithuat;
    private javax.swing.JPanel jPanel_Dieukhien;
    private javax.swing.JPanel jPanel_khoitaomang;
    private javax.swing.JPanel jPanel_taodulieumang;
    private javax.swing.JLabel lbNum;
    private javax.swing.JRadioButton rdBubbleSort;
    private javax.swing.JRadioButton rdHeapSort;
    private javax.swing.JRadioButton rdInsertionSort;
    private javax.swing.JRadioButton rdInterchangeSort;
    private javax.swing.JRadioButton rdMergeSort;
    private javax.swing.JRadioButton rdQuickSort;
    private javax.swing.JRadioButton rdSapxepgiam;
    private javax.swing.JRadioButton rdSapxeptang;
    private javax.swing.JRadioButton rdSelectionSort;
    private javax.swing.JRadioButton rdShellSort;
    public javax.swing.JSpinner spNum;
    // End of variables declaration//GEN-END:variables

}
