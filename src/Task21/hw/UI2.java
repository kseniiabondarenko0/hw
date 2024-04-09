package Task21.hw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

class UI2 extends JFrame implements MouseListener {
    private Random random = new Random();
    ArrayList<CostomButton> buttons = new ArrayList<>();

    UI2() {
        setSize(800, 600);
        setLayout(null);

        setVisible(true);
        addMouseListener(this);

    }

    private Color getRandomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    private boolean isColliding(CostomButton button) {
        int x1 = button.getX();
        int y1 = button.getY();
        int width1 = button.getWidth();
        int height1 = button.getHeight();

        int x2 = buttons.getLast().getX();
        int y2 = buttons.getLast().getY();
        int width2 = buttons.getLast().getWidth();
        int height2 = buttons.getLast().getHeight();

        return (x1 < x2 + width2 && x1 + width1 > x2 && y1 < y2 + height2 && y1 + height1 > y2);
    }

    private void moveButton(CostomButton button) {
        int x = button.getX();
        int y = button.getY();
        int width = button.getWidth();
        int height = button.getHeight();

        int stepx = button.getStepX();
        int stepy = button.getStepY();


        while (true) {

            if (x < 0 || x>800-width)
                stepx*=-1;

            if (y < 0 || y>600-height)
                stepy*=-1;
            x+=stepx;
            y+=stepy;

            button.setBounds(x, y, button.getWidth(), button.getHeight());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        buttons.add(new CostomButton(random.nextInt(10)-5,random.nextInt(10)-5));
        buttons.getLast().setBounds(e.getX(),e.getY(),50,50);
        buttons.getLast().setBackground(getRandomColor());
        add(buttons.getLast());


        Thread thread = new Thread(() ->

                moveButton(buttons.getLast()));
        thread.start();


//        CostomButton sButton = new CostomButton(5,5);
//        sButton.setBounds(50, 50, 150, 50);
//        add(sButton);
//        sButton.setBackground(Color.RED);
//        sButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Thread thread = new Thread(() -> moveButton(sButton));
//                thread.start();
//            }
//        });
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}





