package ui;

import entity.WrdReport_60;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The main form of the application
 */
public class MainApp extends JFrame {
    // Logger initialization
    private static final Logger log = Logger.getLogger(MainApp.class);

    private static final String TITLE = "ПротоколКрейтор 1.0";

    public MainApp() {
        super(TITLE);
        log.warn("Создан диалог " + TITLE);
        final Container container = getContentPane();
        JButton run = new JButton("создать отчет 60");
        run.addActionListener(new ActionListener() {
            // Создание отчета 60
            public void actionPerformed(ActionEvent e) {
                // todo: multipleThread
                WrdReport_60 wrdReport60 = new WrdReport_60("User 1");
                WrdReport_60 wrdReport60_1 = new WrdReport_60("User 2");
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        container.add(run);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) screenSize.getWidth() / 2 - 250, (int) screenSize.getHeight() / 2  - 150, 500, 300);
        setVisible(true);
    }

}
