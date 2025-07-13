import javax.swing.*; //jswing
import java.awt.event.*; //action listener
import java.awt.*; //other stuff?
import java.io.File; //file io
import java.io.IOException; //more file io
import javax.imageio.ImageIO; //jswing image stuff

public class Gui extends JFrame implements ActionListener{
    static JFrame frame1;
    static JButton nextButton;

    public Gui(){
        super("EATTHATJAM");
        openFrame1();
    }

    public void openFrame1(){
        //remove this if section if only 1 frame
        if(frame1==null){
            frame1 = new JFrame("EATTHATJAM");

            int frameSizeMultiplier = 25;
            int FRAME_WIDTH = 16*frameSizeMultiplier;
            int FRAME_HEIGHT = 9*frameSizeMultiplier;

            nextButton = new JButton("Next event");

            nextButton.addActionListener(this);

            frame1.setLayout(null);

            //set bounds for components
            //(x,y,width,height)
            nextButton.setBounds(100,100,100,100);

            //add components to frame
            frame1.add(nextButton);

            //frame settings
            frame1.setSize(FRAME_WIDTH, FRAME_HEIGHT);
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        frame1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == nextButton){
            //do something
        }
    }

    public static void main(String[] args){
        new Gui();
    }
}