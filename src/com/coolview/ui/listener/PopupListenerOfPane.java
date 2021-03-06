package com.coolview.ui.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;

import com.coolview.ui.MainWindow;


public class PopupListenerOfPane extends MouseAdapter {
    JPopupMenu popup;

    public PopupListenerOfPane(JPopupMenu popupMenu) {
        popup = popupMenu;

    }

    public void mousePress(MouseEvent e) {
        if (MainWindow.choosedImg != null) {
            MainWindow.choosedImg.setOpaque(false);
            MainWindow.choosedImg.repaint();
        }
        maybeShowPopup(e);
    }

    public void mouseReleased(MouseEvent e) {
        if (MainWindow.choosedImg != null) {
            MainWindow.choosedImg.setOpaque(false);
            MainWindow.choosedImg.repaint();
        }
        maybeShowPopup(e);
    }

    private void maybeShowPopup(MouseEvent e) {
        // editFile = MainWindow.choosedImgFile;

        if (e.isPopupTrigger()) { // 右键
            System.out.println("panel上的右键");
            System.out.println(MainWindow.curNodePath);
            popup.show(e.getComponent(), e.getX(), e.getY());
        }
    }
}
