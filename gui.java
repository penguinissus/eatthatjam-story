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
    static JLabel scene1Image, scene2Image, scene3Image, scene4Image, scene5Image, scene6Image, scene7Image, scene8Image, scene9Image, scene10Image;
    static JLabel scene11Image, scene12Image, scene13Image, scene14Image, scene15Image, scene16Image, scene17Image, scene18Image, scene19Image, scene20Image;
    static JLabel scene21Image, scene22Image, scene23Image, scene24Image, scene25Image, scene26Image, scene27Image, scene28Image, scene29Image, scene30Image;
    static JLabel scene31Image, scene32Image, scene33Image, scene34Image, scene35Image, scene36Image, scene37Image, scene38Image, scene39Image, scene40Image;
    static JLabel scene41Image, scene42Image, scene43Image, scene44Image;
    static String scene1path, scene2path, scene3path, scene4path, scene5path, scene6path, scene7path, scene8path, scene9path, scene10path;
    static String scene11path, scene12path, scene13path, scene14path, scene15path, scene16path, scene17path, scene18path, scene19path, scene20path;
    static String scene21path, scene22path, scene23path, scene24path, scene25path, scene26path, scene27path, scene28path, scene29path, scene30path;
    static String scene31path, scene32path, scene33path, scene34path, scene35path, scene36path, scene37path, scene38path, scene39path, scene40path;
    static String scene41path, scene42path, scene43path, scene44path;

    int frameSizeMultiplier = 70;
    int FRAME_WIDTH;
    int FRAME_HEIGHT;
    int BACKGROUND_WIDTH;
    int BACKGROUND_HEIGHT;

    int sceneCounter;

    public Gui(){
        super("EATTHATJAM");
        frameSizeMultiplier = 70;
        FRAME_WIDTH = 16*frameSizeMultiplier;
        FRAME_HEIGHT = 9*frameSizeMultiplier;
        BACKGROUND_WIDTH = FRAME_WIDTH-40;
        BACKGROUND_HEIGHT = FRAME_HEIGHT-40;
        sceneCounter = 1;
        openFrame1();
    }

    public void openFrame1(){
        frame1 = new JFrame("EATTHATJAM");
        
        scene1path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 1.png";
        scene2path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 2.png";
        scene3path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 3.png";
        scene4path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 4.png";
        scene5path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 5.png";
        scene6path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 6.png";
        scene7path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 7.png";
        scene8path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 8.png";
        scene9path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 9.png";
        scene10path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 10.png";
        scene11path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 11.png";
        scene12path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 12.png";
        scene13path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 13.png";
        scene14path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 14.png";
        scene15path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 15.png";
        scene16path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 16.png";
        scene17path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 17.png";
        scene18path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 18.png";
        scene19path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 19.png";
        scene20path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 20.png";
        scene21path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 21.png";
        scene22path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 22.png";
        scene23path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 23.png";
        scene24path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 24.png";
        scene25path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 25.png";
        scene26path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 26.png";
        scene27path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 27.png";
        scene28path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 28.png";
        scene29path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 29.png";
        scene30path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 30.png";
        scene31path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 31.png";
        scene32path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 32.png";
        scene33path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 33.png";
        scene34path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 34.png";
        scene35path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 35.png";
        scene36path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 36.png";
        scene37path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 37.png";
        scene38path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 38.png";
        scene39path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 39.png";
        scene40path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 40.png";
        scene41path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 41.png";
        scene42path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 42.png";
        scene43path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 43.png";
        scene44path = "C:/Users/Jocelyn/Documents/Software related/storyboard/images/scene 44.png";

        scene1Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene1path);
        scene2Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene2path);
        scene3Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene3path);
        scene4Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene4path);
        scene5Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene5path);
        scene6Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene6path);
        scene7Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene7path);
        scene8Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene8path);
        scene9Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene9path);
        scene10Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene10path);
        scene11Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene11path);
        scene12Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene12path);
        scene13Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene13path);
        scene14Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene14path);
        scene15Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene15path);
        scene16Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene16path);
        scene17Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene17path);
        scene18Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene18path);
        scene19Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene19path);
        scene20Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene20path);
        scene21Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene21path);
        scene22Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene22path);
        scene23Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene23path);
        scene24Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene24path);
        scene25Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene25path);
        scene26Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene26path);
        scene27Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene27path);
        scene28Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene28path);
        scene29Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene29path);
        scene30Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene30path);
        scene31Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene31path);
        scene32Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene32path);
        scene33Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene33path);
        scene34Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene34path);
        scene35Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene35path);
        scene36Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene36path);
        scene37Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene37path);
        scene38Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene38path);
        scene39Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene39path);
        scene40Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene40path);
        scene41Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene41path);
        scene42Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene42path);
        scene43Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene43path);
        scene44Image = importImage(BACKGROUND_WIDTH, BACKGROUND_HEIGHT, scene44path);

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
        scene1Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene2Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene3Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene4Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene5Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene6Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene7Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene8Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene9Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene10Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene11Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene12Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene13Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene14Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene15Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene16Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene17Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene18Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene19Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene20Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene21Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene22Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene23Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene24Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene25Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene26Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene27Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene28Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene29Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene30Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene31Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene32Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene33Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene34Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene35Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene36Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene37Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene38Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene39Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene40Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene41Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene42Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene43Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        scene44Image.setBounds(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);

        //add components to frame
        frame1.add(nextButton);
        frame1.add(scene8button);
        frame1.add(scene13button);
        frame1.add(scene24button);
        frame1.add(scene44button);
        frame1.add(scene1Image);
        frame1.add(scene2Image);
        frame1.add(scene3Image);
        frame1.add(scene4Image);
        frame1.add(scene5Image);
        frame1.add(scene6Image);
        frame1.add(scene7Image);
        frame1.add(scene8Image);
        frame1.add(scene9Image);
        frame1.add(scene10Image);
        frame1.add(scene11Image);
        frame1.add(scene12Image);
        frame1.add(scene13Image);
        frame1.add(scene14Image);
        frame1.add(scene15Image);
        frame1.add(scene16Image);
        frame1.add(scene17Image);
        frame1.add(scene18Image);
        frame1.add(scene19Image);
        frame1.add(scene20Image);
        frame1.add(scene21Image);
        frame1.add(scene22Image);
        frame1.add(scene23Image);
        frame1.add(scene24Image);
        frame1.add(scene25Image);
        frame1.add(scene26Image);
        frame1.add(scene27Image);
        frame1.add(scene28Image);
        frame1.add(scene29Image);
        frame1.add(scene30Image);
        frame1.add(scene31Image);
        frame1.add(scene32Image);
        frame1.add(scene33Image);
        frame1.add(scene34Image);
        frame1.add(scene35Image);
        frame1.add(scene36Image);
        frame1.add(scene37Image);
        frame1.add(scene38Image);
        frame1.add(scene39Image);
        frame1.add(scene40Image);
        frame1.add(scene41Image);
        frame1.add(scene42Image);
        frame1.add(scene43Image);
        frame1.add(scene44Image);

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

        //hide scenes
        scene1Image.setVisible(true);
        scene2Image.setVisible(false);
        scene3Image.setVisible(false);
        scene4Image.setVisible(false);
        scene5Image.setVisible(false);
        scene6Image.setVisible(false);
        scene7Image.setVisible(false);
        scene8Image.setVisible(false);
        scene9Image.setVisible(false);
        scene10Image.setVisible(false);
        scene11Image.setVisible(false);
        scene12Image.setVisible(false);
        scene13Image.setVisible(false);
        scene14Image.setVisible(false);
        scene15Image.setVisible(false);
        scene16Image.setVisible(false);
        scene17Image.setVisible(false);
        scene18Image.setVisible(false);
        scene19Image.setVisible(false);
        scene20Image.setVisible(false);
        scene21Image.setVisible(false);
        scene22Image.setVisible(false);
        scene23Image.setVisible(false);
        scene24Image.setVisible(false);
        scene25Image.setVisible(false);
        scene26Image.setVisible(false);
        scene27Image.setVisible(false);
        scene28Image.setVisible(false);
        scene29Image.setVisible(false);
        scene30Image.setVisible(false);
        scene31Image.setVisible(false);
        scene32Image.setVisible(false);
        scene33Image.setVisible(false);
        scene34Image.setVisible(false);
        scene35Image.setVisible(false);
        scene36Image.setVisible(false);
        scene37Image.setVisible(false);
        scene38Image.setVisible(false);
        scene39Image.setVisible(false);
        scene40Image.setVisible(false);
        scene41Image.setVisible(false);
        scene42Image.setVisible(false);
        scene43Image.setVisible(false);
        scene44Image.setVisible(false);

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
        }
        switch (sceneCounter) {
            case 1:
                scene1Image.setVisible(true);
                break;
            case 2:
                scene1Image.setVisible(false);
                scene2Image.setVisible(true);
                break;
            case 3:
                scene2Image.setVisible(false);
                scene3Image.setVisible(true);
                break;
            case 4:
                scene3Image.setVisible(false);
                scene4Image.setVisible(true);
                break;
            case 5:
                scene4Image.setVisible(false);
                scene5Image.setVisible(true);
                break;
            case 6:
                scene5Image.setVisible(false);
                scene6Image.setVisible(true);
                break;
            case 7:
                scene6Image.setVisible(false);
                scene7Image.setVisible(true);
                break;
            case 8:
                scene7Image.setVisible(false);
                scene8Image.setVisible(true);
                break;
            case 9:
                scene8Image.setVisible(false);
                scene9Image.setVisible(true);
                break;
            case 10:
                scene9Image.setVisible(false);
                scene10Image.setVisible(true);
                break;
            case 11:
                scene10Image.setVisible(false);
                scene11Image.setVisible(true);
                break;
            case 12:
                scene11Image.setVisible(false);
                scene12Image.setVisible(true);
                break;
            case 13:
                scene12Image.setVisible(false);
                scene13Image.setVisible(true);
                break;
            case 14:
                scene13Image.setVisible(false);
                scene14Image.setVisible(true);
                break;
            case 15:
                scene14Image.setVisible(false);
                scene15Image.setVisible(true);
                break;
            case 16:
                scene15Image.setVisible(false);
                scene16Image.setVisible(true);
                break;
            case 17:
                scene16Image.setVisible(false);
                scene17Image.setVisible(true);
                break;
            case 18:
                scene17Image.setVisible(false);
                scene18Image.setVisible(true);
                break;
            case 19:
                scene18Image.setVisible(false);
                scene19Image.setVisible(true);
                break;
            case 20:
                scene19Image.setVisible(false);
                scene20Image.setVisible(true);
                break;
            case 21:
                scene20Image.setVisible(false);
                scene21Image.setVisible(true);
                break;
            case 22:
                scene21Image.setVisible(false);
                scene22Image.setVisible(true);
                break;
            case 23:
                scene22Image.setVisible(false);
                scene23Image.setVisible(true);
                break;
            case 24:
                scene23Image.setVisible(false);
                scene24Image.setVisible(true);
                break;
            case 25:
                scene24Image.setVisible(false);
                scene25Image.setVisible(true);
                break;
            case 26:
                scene25Image.setVisible(false);
                scene26Image.setVisible(true);
                break;
            case 27:
                scene26Image.setVisible(false);
                scene27Image.setVisible(true);
                break;
            case 28:
                scene27Image.setVisible(false);
                scene28Image.setVisible(true);
                break;
            case 29:
                scene28Image.setVisible(false);
                scene29Image.setVisible(true);
                break;
            case 30:
                scene29Image.setVisible(false);
                scene30Image.setVisible(true);
                break;
            case 31:
                scene30Image.setVisible(false);
                scene31Image.setVisible(true);
                break;
            case 32:
                scene31Image.setVisible(false);
                scene32Image.setVisible(true);
                break;
            case 33:
                scene32Image.setVisible(false);
                scene33Image.setVisible(true);
                break;
            case 34:
                scene33Image.setVisible(false);
                scene34Image.setVisible(true);
                break;
            case 35:
                scene34Image.setVisible(false);
                scene35Image.setVisible(true);
                break;
            case 36:
                scene35Image.setVisible(false);
                scene36Image.setVisible(true);
                break;
            case 37:
                scene36Image.setVisible(false);
                scene37Image.setVisible(true);
                break;
            case 38:
                scene37Image.setVisible(false);
                scene38Image.setVisible(true);
                break;
            case 39:
                scene38Image.setVisible(false);
                scene39Image.setVisible(true);
                break;
            case 40:
                scene39Image.setVisible(false);
                scene40Image.setVisible(true);
                break;
            case 41:
                scene40Image.setVisible(false);
                scene41Image.setVisible(true);
                break;
            case 42:
                scene41Image.setVisible(false);
                scene42Image.setVisible(true);
                break;
            case 43:
                scene42Image.setVisible(false);
                scene43Image.setVisible(true);
                break;
            case 44:
                scene43Image.setVisible(false);
                scene44Image.setVisible(true);
                break;    
            default:
                break;
        }
    }

    public static void main(String[] args){
        new Gui();
    }
}