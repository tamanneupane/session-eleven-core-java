package day21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

public class Clock {

    public static void main(String[] args) {

//        ActionListener listener = new TimerListener();

//        Timer timer = new Timer(5000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("This is getting called from lambda");
//            }
//        });

        Timer timer = new Timer(5000, e -> {
            System.out.println("This is getting called from lambda");
        });
        timer.start();

        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

    public class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("This is being called");
        }
    }


}
