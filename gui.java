import javax.swing.*; //jswing
import java.awt.event.*; //action listener
import java.awt.*; //other stuff?
import java.io.File; //file io
import java.io.IOException; //more file io
import javax.imageio.ImageIO; //jswing image stuff

public class Gui extends JFrame implements ActionListener{
    static JFrame frame1;
    static JButton nextButton;
    static JLabel openingImage;
    static String openingImagePath;

    int frameSizeMultiplier = 70;
    int FRAME_WIDTH = 16*frameSizeMultiplier;
    int FRAME_HEIGHT = 9*frameSizeMultiplier;

    public Gui(){
        super("EATTHATJAM");
        openFrame1();
    }

    public void openFrame1(){
        frame1 = new JFrame("EATTHATJAM");
        openingImagePath = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/opening scene.png";
        try{
            Image image1 = ImageIO.read(new File(openingImagePath));
            Image resizedImage1 = image1.getScaledInstance(FRAME_WIDTH, FRAME_HEIGHT, Image.SCALE_SMOOTH);
            ImageIcon imageicon = new ImageIcon(resizedImage1);
            openingImage = new JLabel(imageicon);
        } catch (IOException e){
            e.printStackTrace();
        }

        nextButton = new JButton("Next event");

        nextButton.addActionListener(this);

        frame1.setLayout(null);

        //set bounds for components
        //(x,y,width,height)
        nextButton.setBounds(100, 100, 100, 100);
        openingImage.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        //add components to frame
        frame1.add(nextButton);
        frame1.add(openingImage);

        //frame settings
        frame1.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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