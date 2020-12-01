package main;

import javax.swing.*;
import java.awt.*;

public class OMSAdmin extends JFrame {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 550;

    public OMSAdmin(OMSAdminController controller) {
        JPanel rootPanel = new JPanel();
        setContentPane(rootPanel);
        BorderLayout layout = new BorderLayout();
        rootPanel.setLayout(layout);

        JTabbedPane tabbedPane = new JTabbedPane();
        rootPanel.add(tabbedPane, BorderLayout.CENTER);

        JPanel bookPage = controller.getBookPage();
        tabbedPane.addTab("Books", null, bookPage, "Books");

        tabbedPane.addTab("Compact Discs", null, new JPanel(), "Compact Discs");
        tabbedPane.addTab("Digital Video Discs", null, new JPanel(), "Digital Video Discs");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Online Media System for User - Cám Văn Phong 20173298");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OMSAdmin(new OMSAdminController());
    }
}
