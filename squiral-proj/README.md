### Squiral Project

What you're supposed to make: 

[Image of Squiral](./squiral.png)


Main.java code

```java
public class Main {
    public static void main(String[] args) {
        Squiral squiral = new Squiral();
        squiral.setDefaultCloseOperation(squiral.EXIT_ON_CLOSE);
        squiral.setVisible(true);
    }
}
```

Squiral.java code 

```java
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Squiral extends JFrame {
    private final int NUM_SQUIRALS = 10;
    private final int SEGMENT_LENGTH = 20;

    public Squiral() {
        init();
    }

    public void init() {
        setSize(800, 800);
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, 2000, 2000);
        g2d.setStroke(new BasicStroke(3));

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        g2d.setColor(Color.BLUE);

        // The first line segment goes from (xCenter, tCenter) to (xCenter + SEGMENT_LENGTH, yCenter)
        // The challenge is to build a squiral that starts at the center of the frame, using four g2d.drawLines
        //
        // You must use the variables xCenter, yCenter, n, and SEGMENT_LENGTH.
        // The only hard coded number you can use inside the loop is a 1, which you will need as there
        // will be the need for (n+1)s...

        for (int n = 0; n &lt; NUM_SQUIRALS; n++) {
            g2d.drawLine(?,
                    ?,
                    ?,
                    ?);
            g2d.drawLine(?,
                    ?,
                    ?,
                    ?);
            g2d.drawLine(?,
                    ?,
                    ?,
                    ?);
            g2d.drawLine(?,
                    ?,
                    ?,
                    ?);
        }
    }
}
```
