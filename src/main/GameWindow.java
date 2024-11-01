package main;

import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

// TODO: double check this file.  Sometimes I just give you improvements :)
public class GameWindow {
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {

        jframe = new JFrame();

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setVisible(true);

        // TODO: we need to add a WindowFocusListener.
        // this will determine what the focus of keyboard and mouse events should be.
        // WindowFocusListener is an interface so normally we would make a class named
        // MyWindowFocusListener or something like that
        // and implement its methods (it has 2)
        // But that's a bit wasteful.
        // So Java provides what is called an anonymous class.
        // TODO: note we can basically create our own single use class right here in the method
        // TODO: see below.  after new WindowFocusListener() we have curly's ???
        // TODO: yes because we need to implement the methods right here and right now.
        // TODO: the upsides is that I don't need a new file
        // TODO: the downsides are that I can't reuse this exact implementation.
        // TODO: anonymous class don't have constructors (cause they don't have names), cause they are
        // anonymous.
        // TODO: they don't have fields but since they are scoped in a method in a class they have access
        // to method local variables and class fields.
        // The variables they can access must be final or effectively final.
        // but that is okay since we only need one at the moment anyways.
        var windowFocusListener = new WindowFocusListener(){

            @Override
            public void windowGainedFocus(WindowEvent e) {
                gamePanel.getGame().windowFocusLost();
            }

            @Override
            public void windowLostFocus(WindowEvent e) {

            }
        };  // TODO: note yes a semi colon cause we are finishing a variable declaration

        jframe.addWindowFocusListener(windowFocusListener);

    }

}