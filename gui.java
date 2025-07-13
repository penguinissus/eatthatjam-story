import javax.swing.*; //jswing
import java.awt.event.*; //action listener
import java.awt.*; //other stuff?
import java.io.File; //file io
import java.io.IOException; //more file io
import javax.imageio.ImageIO; //jswing image stuff

public class Gui extends JFrame implements ActionListener{
    static JFrame frame1;
    static JButton nextButton;
    static JLabel openingImage, scene2Image;
    static String openingImagePath, scene2ImagePath;

    int frameSizeMultiplier = 70;
    int FRAME_WIDTH;
    int FRAME_HEIGHT;

    int sceneCounter;

    public Gui(){
        super("EATTHATJAM");
        frameSizeMultiplier = 70;
        FRAME_WIDTH = 16*frameSizeMultiplier;
        FRAME_HEIGHT = 9*frameSizeMultiplier;
        sceneCounter = 1;
        openFrame1();
    }

    public void openFrame1(){
        frame1 = new JFrame("EATTHATJAM");
        openingImagePath = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/opening scene.png";
        scene2ImagePath = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 2.png";
        openingImage = importImage(FRAME_WIDTH, FRAME_HEIGHT, openingImagePath);
        scene2Image = importImage(FRAME_WIDTH, FRAME_HEIGHT, scene2ImagePath);

        nextButton = new JButton("Next event");

        nextButton.addActionListener(this);

        frame1.setLayout(null);

        //set bounds for components
        //(x,y,width,height)
        nextButton.setBounds(100, 100, 100, 100);
        openingImage.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        scene2Image.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        //add components to frame
        frame1.add(nextButton);
        frame1.add(openingImage);
        frame1.add(scene2Image);

        //frame settings
        frame1.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setVisible(true);
    }

    public JLabel importImage(int width, int height, String filepath){
        JLabel finishedImage;
        try{
            Image image = ImageIO.read(new File(filepath));
            Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon imageicon = new ImageIcon(resizedImage);
            finishedImage = new JLabel(imageicon);
            return finishedImage;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == nextButton){
            sceneCounter++;
            System.out.println(sceneCounter);
        }
        switch (sceneCounter) {
            case 1:
                System.out.println("Case 1");
                openingImage.setVisible(true);
                scene2Image.setVisible(false);
                break;
            case 2:
                System.out.println("Case 2");
                openingImage.setVisible(false);
                scene2Image.setVisible(true);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args){
        new Gui();
    }
}