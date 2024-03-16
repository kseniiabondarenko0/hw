package Task18;
                        //JavaRush + StackOverflow + BroCode + я = це<<<3. Головне, щоб працювало)))
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopwatch extends Thread {
    static JLabel hours = new JLabel("00:");
    static JLabel minutes = new JLabel("00:");
    static JLabel seconds = new JLabel("00:");
    static JLabel miliseconds = new JLabel("00");
    static JButton start = new JButton("START");
    static JButton stop = new JButton("STOP");
    static int mili=0, sec=0, min=0, hour=0, state=1;
    static JButton reset = new JButton("RESET");

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(275, 225);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        hours.setBounds(25,10,50,50);
        minutes.setBounds(80,10,50,50);
        seconds.setBounds(135,10,50,50);
        miliseconds.setBounds(190,10,250,50);
        start.setBounds(25,75,100,30);
        stop.setBounds(130,75,100,30);
        reset.setBounds(75,125,100,30);

        Font f = new Font("ibm plex sans",Font.PLAIN,30);
        hours.setFont(f);
        minutes.setFont(f);
        seconds.setFont(f);
        miliseconds.setFont(f);

        frame.add(hours);
        frame.add(minutes);
        frame.add(seconds);
        frame.add(miliseconds);
        frame.add(start);
        frame.add(stop);
        frame.add(reset);

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                state=1;
                Thread t = new Thread() {
                    public void run() {
                        try {
                            while(state == 1) {
                                sleep(1);               // щоб без фокусів із багатонитковістю, в туторі побачила
                                if(++mili > 1000) {
                                    mili=0;
                                    if(++sec > 60) {
                                        sec=0;
                                        if(++min > 60) {
                                            min=0;
                                            if(++hour > 23) hour=0;
                                        }
                                    }
                                }
                                miliseconds.setText(":"+mili);
                                seconds.setText(":"+sec);
                                minutes.setText(":"+min);
                                hours.setText(""+hour);
                            }
                        } catch(Exception e) { }
                    }
                };
                t.start();
            }
        });

        stop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                state = 2;
            }
        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                state = 3;
                mili = sec = min = hour = 0;
                miliseconds.setText(": 0");
                seconds.setText(": 0");
                minutes.setText(": 0");
                hours.setText("0");
            }
        });

        frame.setVisible(true);
    }
}
