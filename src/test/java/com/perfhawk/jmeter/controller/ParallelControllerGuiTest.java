package com.perfhawk.jmeter.controller;

import kg.apc.emulators.TestJMeterUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import com.perfhawk.jmeter.controller.ParallelControllerGui;

import javax.swing.*;
import java.awt.*;


public class ParallelControllerGuiTest {

    @BeforeClass
    public static void setUpClass()
            throws Exception {
        TestJMeterUtils.createJmeterEnv();
    }


    @Test
    public void showGui() throws Exception {
        if (!GraphicsEnvironment.getLocalGraphicsEnvironment().isHeadlessInstance()) {
            ParallelControllerGui gui = new ParallelControllerGui();
            JDialog frame = new JDialog();
            frame.add(gui);

            frame.setPreferredSize(new Dimension(800, 600));
            frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            while (frame.isVisible()) {
                Thread.sleep(100);
            }
        }
    }

}