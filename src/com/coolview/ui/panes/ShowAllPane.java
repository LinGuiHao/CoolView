package com.coolview.ui.panes;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ShowAllPane extends JPanel{
    public ShowAllPane(){
        super();
        FlowLayout flow = new FlowLayout();
        flow.setAlignment(FlowLayout.LEFT);
        setLayout(flow);
        setBackground(new Color(255,255,255));
        setSize(this.getSize());
        setOpaque(true);
        setVisible(true);
        validate();
   }

}
