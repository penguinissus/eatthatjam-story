import javax.swing.*; //jswing
import java.awt.event.*; //action listener
import java.awt.*; //other stuff?
import java.io.File; //file io
import java.io.IOException; //more file io
import javax.imageio.ImageIO; //jswing image stuff

public class Gui extends JFrame implements ActionListener{
    static JFrame frame1;
    static JButton nextButton;
    static JButton scene13button, scene8button, scene24button, scene44button; //tbd
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

        nextButton = new JButton();
        scene8button = new JButton();
        scene13button = new JButton();
        scene24button = new JButton();
        scene44button = new JButton();

        nextButton.addActionListener(this);
        scene8button.addActionListener(this);
        scene13button.addActionListener(this);
        scene24button.addActionListener(this);
        scene44button.addActionListener(this);

        frame1.setLayout(null);

        //set bounds for components
        //(x,y,width,height)
        nextButton.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        scene8button.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        scene13button.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        scene24button.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        scene44button.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        openingImage.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        scene2Image.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        //add components to frame
        frame1.add(nextButton);
        frame1.add(scene8button);
        frame1.add(scene13button);
        frame1.add(scene24button);
        frame1.add(scene44button);
        frame1.add(openingImage);
        frame1.add(scene2Image);

        //hide buttons
        hideButton(nextButton);
        nextButton.setVisible(true);
        hideButton(scene8button);
        scene8button.setVisible(false);
        hideButton(scene13button);
        scene13button.setVisible(false);
        hideButton(scene24button);
        scene24button.setVisible(false);
        hideButton(scene44button);
        scene44button.setVisible(false);

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

    public void hideButton(JButton button){
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
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