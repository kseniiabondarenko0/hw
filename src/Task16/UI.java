package Task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UI extends JFrame implements ActionListener, MouseMotionListener {

    private JButton colorButton;
    private JButton clearButton;

    private int oldX;
    private int oldY;
    private Color color = Color.BLACK;

    UI() {
        setSize(800, 600);
        setLayout(null);

        colorButton = new JButton("Change Color");
        colorButton.setBounds(50, 50, 150, 50);
        add(colorButton);
        colorButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.setBounds(220, 50, 100, 50);
        add(clearButton);
        clearButton.addActionListener(this);

        setVisible(true);

        addMouseMotionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {                 //ну це не ф-я - це шедевр, пххпхп
        if (e.getSource() == colorButton) {
            color = JColorChooser.showDialog(this, "Choose Color", color);
        } else if (e.getSource() == clearButton) {
            Graphics g = getGraphics();
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(color);
        if (oldX != 0 && oldY != 0) {
            g.drawLine(oldX, oldY, e.getX(), e.getY());
        }
        oldX = e.getX();
        oldY = e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        oldX = 0;
        oldY = 0;
    }


}
