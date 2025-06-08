package view.game;

import model.MapModel;
import view.FrameUtil;

import javax.swing.*;
import java.awt.*;

public class MovementPanel extends JPanel {
    private JButton btnUp, btnDown, btnLeft, btnRight;
    private JPanel empty1, empty2, empty3, empty4, empty5;
    private MapModel mapmodel;
    private final static int GRID_SIZE = 100;

    // constructor
    public MovementPanel(GamePanel gamePanel)
    {
        this.setVisible(true);
        this.setSize(3 * GRID_SIZE, 3 * GRID_SIZE);
        this.setLayout(new GridLayout(3, 3));

        empty1 = new JPanel();
        empty1.setBackground(Color.DARK_GRAY);
        this.add(empty1);
//        ImageIcon up = new ImageIcon("/resources/icons/up.png");
//        Image scalesUp = up.getImage().getScaledInstance(GRID_SIZE, GRID_SIZE, Image.SCALE_SMOOTH);
//        ImageIcon scaleUp = new ImageIcon(scalesUp);
        ImageIcon icon1 = FrameUtil.setImageIcon("up.png");
        btnUp = new JButton(icon1);
        btnUp.setBackground(Color.DARK_GRAY);
        this.add(btnUp);
        empty2 = new JPanel();
        empty2.setBackground(Color.DARK_GRAY);
        this.add(empty2);
        ImageIcon icon2 = FrameUtil.setImageIcon("left.png");
        btnLeft = new JButton(icon2);
        btnLeft.setBackground(Color.DARK_GRAY);
        this.add(btnLeft);
        empty3 = new JPanel();
        empty3.setBackground(Color.DARK_GRAY);
        this.add(empty3);
        ImageIcon icon3 = FrameUtil.setImageIcon("right.png");
        btnRight = new JButton(icon3);
        btnRight.setBackground(Color.DARK_GRAY);
        this.add(btnRight);
        empty4 = new JPanel();
        empty4.setBackground(Color.DARK_GRAY);
        this.add(empty4);
        ImageIcon icon4 = FrameUtil.setImageIcon("down.png");
        btnDown = new JButton(icon4);
        btnDown.setBackground(Color.DARK_GRAY);
        this.add(btnDown);
        empty5 = new JPanel();
        empty5.setBackground(Color.DARK_GRAY);
        this.add(empty5);

        btnUp.addActionListener(e -> {
            gamePanel.doMoveUp();
        });
        btnDown.addActionListener(e -> {
            gamePanel.doMoveDown();
        });
        btnLeft.addActionListener(e -> {
            gamePanel.doMoveLeft();
        });
        btnRight.addActionListener(e -> {
            gamePanel.doMoveRight();
        });
    }

    public JButton getBtnRight() {
        return btnRight;
    }
}
