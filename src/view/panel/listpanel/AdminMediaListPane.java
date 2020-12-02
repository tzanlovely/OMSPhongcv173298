package view.panel.listpanel;

import controller.ADataPageController;
import view.panel.singlepanel.ADataSinglePane;

import com.oms.bean.Media;
import view.dialog.editdialog.BookEditDialog;
import controller.EditBookController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMediaListPane extends ADataListPane<Media> {

    public AdminMediaListPane(ADataPageController<Media> controller) {
        this.controller = controller;
    }

    @Override
    public void decorateSinglePane(ADataSinglePane<Media> singlePane) {
        JButton btnEdit = new JButton("Edit this book");
        singlePane.addDataHandlingComponent(btnEdit);

        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookEditDialog(singlePane.getData(),(EditBookController) controller);
            }
        });
    }
}
