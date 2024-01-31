package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Класс окна настроек
public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 230;
    private static final int WINDOW_WIDTH = 350;

    JButton btnStart = new JButton("Начать новую игру");

    public SettingsWindow(GameWindow gameWindow) {
        //setLocationRelativeTo(gameWindow); - Можно задать позиционирование окна настроек относительно главного окна
        setLocation(GameWindow.WINDOW_POSX+80, GameWindow.WINDOW_POSY+150);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        add(btnStart);
        btnStart.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(0, 3, 3, 3);
                setVisible(false);
            }
        });
    }
}
