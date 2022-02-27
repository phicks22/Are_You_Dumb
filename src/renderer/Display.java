package renderer;

import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import java.awt.*;

public class Display extends Canvas implements Runnable {
    private static final long serialVersionUID = 1L;

    private JFrame frame;
    private static String title = "My first Java program";
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public Display() {
        this.frame = new JFrame();

        Dimension size = new Dimension(WIDTH, HEIGHT);
        this.setPreferredSize(size);

    }

    @Override
    public void run() {

    }
}
