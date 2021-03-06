package com.coolview.ui;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;

import com.coolview.logic.FileHelper;
import com.coolview.ui.frames.ManagerFrame;
import com.coolview.ui.frames.ViewFrame;
import com.coolview.ui.panes.ImageLabel;
import com.coolview.ui.panes.ShowAllPane;


public class MainWindow {
    
    public static ArrayList<File> imagesList;
    //图标设置大小
    public static final int BIGLABEL_WIDTH = 216,BIGLABEL_HEIGHT = 162,
                      MIDDLELABEL_WIDTH = 120,MIDDLELABEL_HEIGHT = 90,
                      SMALLLABEL_WIDTH = 60,SMALLLABEL_HEIGHT = 45;
    public static int curImgWidth = 120,curImgHeight = 90;
    public static ShowAllPane curShowAllPane = null;
    public static ImageLabel choosedImg = null;
    public static JScrollPane sp;
    public static DefaultMutableTreeNode currentNode = null;
    public static File choosedImgFile = null;
    public static File curNodePath = null;
    public static boolean increase = true;
    public static String curSortType = "name";
    public static int tipInPaint = 1;
    public static JLabel statusbar;
    public static boolean needDeleted = false; 
    public static HashMap<File,File> renameFile;
    public static String sortCmd = "name";
    public static String showType = "middle";
    public static boolean sortIncrease = true;
    public static boolean ishasEctype = false;
    
    public static void main(String[] args) {
        try {
            FileHelper.createFile("./", "data");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               
                createAndShowGUI();
            }
        });

    }
    
    //这里开始调度 UI事件调度线程(EDT)
    public static void createAndShowGUI() {
        
        // 初始化主题
        Initialize.initTheme();
        Initialize.initGlobalFont();
        ManagerFrame managerFrame;
        managerFrame = new ManagerFrame("coolview");
        managerFrame.setFrame();
       
        managerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        renameFile = new HashMap<File, File>();
    }
    public static void createViewFrame(File imgfile){
        ViewFrame frame = new ViewFrame(imgfile);
//        frame.setFrame();
    }
}