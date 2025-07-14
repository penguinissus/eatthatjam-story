import javax.swing.*; //jswing
import java.awt.event.*; //action listener
import java.awt.*; //other stuff?
import java.io.File; //file io
import java.io.IOException; //more file io
import javax.imageio.ImageIO; //jswing image stuff

public class Gui extends JFrame implements ActionListener{
    static JFrame frame1;
    static JButton nextButton;
    static JButton scene13button, scene8button, scene24button, scene44button;
    static JButton scene7a, scene7b, scene7c;
    static JButton scene14a, scene14b, scene14c;
    static JButton scene25a, scene25b, scene25c;
    static JButton scene27a, scene27b, scene27c;
    static JButton option1a, option1b, option1c;
    static JButton option2a, option2b, option2c;
    static JButton option3a, option3b, option3c;
    static JButton option4a, option4b, option4c;
    static JButton option5a, option5b, option5c;
    static JButton option6a, option6b, option6c;
    static JButton finalNext;
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
    int health;

    public Gui(){
        super("EATTHATJAM");
        frameSizeMultiplier = 70;
        FRAME_WIDTH = 16*frameSizeMultiplier;
        FRAME_HEIGHT = 9*frameSizeMultiplier;
        BACKGROUND_WIDTH = FRAME_WIDTH-20;
        BACKGROUND_HEIGHT = FRAME_HEIGHT-40;
        sceneCounter = 1;
        health = 5;
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
        finalNext = new JButton();
        scene8button = new JButton();
        scene13button = new JButton();
        scene24button = new JButton();
        scene44button = new JButton();
        scene7a = new JButton();
        scene7b = new JButton();
        scene7c = new JButton();
        scene 14a = new JButton();
        scene14b = new JButton();
        scene14c = new JButton();
        scene25a = new JButton();
        scene25b = new JButton();
        scene25c = new JButton();
        scene27a = new JButton();
        scene27b = new JButton();
        scene27c = new JButton();
        option1a = new JButton();
        option1b = new JButton();
        option1c = new JButton();
        option2a = new JButton();
        option2b = new JButton();
        option2c = new JButton();
        option3a = new JButton();
        option3b = new JButton();
        option3c = new JButton();
        option4a = new JButton();
        option4b = new JButton();
        option4c = new JButton();
        option5a = new JButton();
        option5b = new JButton();
        option5c = new JButton();
        option6a = new JButton();
        option6b = new JButton();
        option6c = new JButton();

        nextButton.addActionListener(this);
        finalNext.addActionListener(this);
        scene8button.addActionListener(this);
        scene13button.addActionListener(this);
        scene24button.addActionListener(this);
        scene44button.addActionListener(this);
        scene7a.addActionListener(this);
        scene7b.addActionListener(this);
        scene7c.addActionListener(this);
        scene14a.addActionListener(this);
        scene14b.addActionListener(this);
        scene14c.addActionListener(this);
        scene25a.addActionListener(this);
        scene25b.addActionListener(this);
        scene25c.addActionListener(this);
        scene27a.addActionListener(this);
        scene27b.addActionListener(this);
        scene27c.addActionListener(this);
        option1a.addActionListener(this);
        option1b.addActionListener(this);
        option1c.addActionListener(this);
        option2a.addActionListener(this);
        option2b.addActionListener(this);
        option2c.addActionListener(this);
        option3a.addActionListener(this);
        option3b.addActionListener(this);
        option3c.addActionListener(this);
        option4a.addActionListener(this);
        option4b.addActionListener(this);
        option4c.addActionListener(this);
        option5a.addActionListener(this);
        option5b.addActionListener(this);
        option5c.addActionListener(this);
        option6a.addActionListener(this);
        option6b.addActionListener(this);
        option6c.addActionListener(this);

        frame1.setLayout(null);

        //set bounds for components
        //(x,y,width,height)
        nextButton.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        finalNext.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
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

        scene7a.setBounds(0,0,100,100);
        scene7b.setBounds(100,100,100,100);
        scene7c.setBounds(200,200,100,100);
        scene14a.setBounds(0,0,100,100);
        scene14b.setBounds(100,100,100,100);
        scene14c.setBounds(200,200,100,100);
        scene25a.setBounds(0,0,100,100);
        scene25b.setBounds(100,100,100,100);
        scene25c.setBounds(200,200,100,100);
        scene27a.setBounds(0,0,100,100);
        scene27b.setBounds(100,100,100,100);
        scene27c.setBounds(200,200,100,100);
        option1a.setBounds(0,0,100,100);
        option1b.setBounds(100,100,100,100);
        option1c.setBounds(200,200,100,100);
        option2a.setBounds(0,0,100,100);
        option2b.setBounds(100,100,100,100);
        option2c.setBounds(200,200,100,100);
        option3a.setBounds(0,0,100,100);
        option3b.setBounds(100,100,100,100);
        option3c.setBounds(200,200,100,100);
        option4a.setBounds(0,0,100,100);
        option4b.setBounds(100,100,100,100);
        option4c.setBounds(200,200,100,100);
        option5a.setBounds(0,0,100,100);
        option5b.setBounds(100,100,100,100);
        option5c.setBounds(200,200,100,100);
        option6a.setBounds(0,0,100,100);
        option6b.setBounds(100,100,100,100);
        option6c.setBounds(200,200,100,100);

        //add components to frame
        frame1.add(nextButton);
        frame1.add(finalNext);
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
        frame1.add(scene7a);
        frame1.add(scene7b);
        frame1.add(scene7c);
        frame1.add(scene14a);
        frame1.add(scene14b);
        frame1.add(scene14c);
        frame1.add(scene25a);
        frame1.add(scene25b);
        frame1.add(scene25c);
        frame1.add(scene27a);
        frame1.add(scene27b);
        frame1.add(scene27c);
        frame1.add(option1a);
        frame1.add(option1b);
        frame1.add(option1c);
        frame1.add(option2a);
        frame1.add(option2b);
        frame1.add(option2c);
        frame1.add(option3a);
        frame1.add(option3b);
        frame1.add(option3c);
        frame1.add(option4a);
        frame1.add(option4b);
        frame1.add(option4c);
        frame1.add(option5a);
        frame1.add(option5b);
        frame1.add(option5c);
        frame1.add(option6a);
        frame1.add(option6b);
        frame1.add(option6c);

        //hide buttons
        hideButton(nextButton);
        nextButton.setVisible(true);
        hudeButton(finalNext);
        finalNext.setVisible(false);
        hideButton(scene8button);
        scene8button.setVisible(false);
        hideButton(scene13button);
        scene13button.setVisible(false);
        hideButton(scene24button);
        scene24button.setVisible(false);
        hideButton(scene44button);
        scene44button.setVisible(false);
        scene7a.setVisible(false);
        scene7b.setVisible(false);
        scene7c.setVisible(false);
        scene14a.setVisible(false);
        scene14b.setVisible(false);
        scene14c.setVisible(false);
        scene25a.setVisible(false);
        scene25b.setVisible(false);
        scene25c.setVisible(false);
        scene27a.setVisible(false);
        scene27b.setVisible(false);
        scene27c.setVisible(false);
        option1a.setVisible(false);
        option1b.setVisible(false);
        option1c.setVisible(false);
        option2a.setVisible(false);
        option2b.setVisible(false);
        option2c.setVisible(false);
        option3a.setVisible(false);
        option3b.setVisible(false);
        option3c.setVisible(false);
        option4a.setVisible(false);
        option4b.setVisible(false);
        option4c.setVisible(false);
        option5a.setVisible(false);
        option5b.setVisible(false);
        option5c.setVisible(false);
        option6a.setVisible(false);
        option6b.setVisible(false);
        option6c.setVisible(false);

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
        if(e.getSource() == scene8button){
            sceneCounter = 8;
        }
        if(e.getSource() == scene13button){
            sceneCounter = 13;
        }
        if(e.getSource() == scene24button){
            sceneCounter = 24;
        }
        if(e.getSource() == scene44button){
            sceneCounter = 44;
        }
        if(e.getSource() == scene7a){
            counter=8;
        }
        if(e.getSource() == scene7b){
            counter=9;
            health--;
        }
        if(e.getSource() == scene7c){
            counter=11;
            health++;
        }
        if(e.getSource() == scene14a){
            counter=15;
        }
        if(e.getSource() == scene14b){
            counter=19;
            health--;
        }
        if(e.getSource() == scene14c){
            counter=21;
            health++;
        }
        if(e.getSource() == scene25a || e.getSource() == scene25b || e.getSource() == scene25c){
            counter++;
            health++;
        }
        if(e.getSource() == scene27a || e.getSource() == scene27b || e.getSource() == scene27c){
            counter++;
            health--;
        }
        if(e.getSource() == option1a || e.getSource() == option2a || e.getSource() == option3a || e.getSource() == option4a || e.getSource() == option5a || e.getSource() == option6a){
            counter++;
            health--;
        }
        if(e.getSource() == option1b || e.getSource() == option2b || e.getSource() == option3b || e.getSource() == option4b || e.getSource() == option5b || e.getSource() == option6b){
            counter++;
        }
        if(e.getSource() == option1c || e.getSource() == option2c || e.getSource() == option3c || e.getSource() == option4c || e.getSource() == option5c || e.getSource() == option6c){
            counter++;
            health++;
        }
        if(e.getSource() == finalNext){
            if(health==0){
                counter=43;
                health=5;
            } else if(health==10){
                counter=41;
                health=5;
            } else {
                counter=42;
                health=5;
            }
        }

        if(health==0||health==10){
            counter=40;
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
                nextButton.setVisible(false);
                scene7a.setVisible(true);
                scene7b.setVisible(true);
                scene7c.setVisible(true);
                scene6Image.setVisible(false);
                scene7Image.setVisible(true);
                break;
            case 8:
                scene7a.setVisible(false);
                scene7b.setVisible(false);
                scene7c.setVisible(false);
                scene13button.setVisible(true);
                nextButton.setVisible(false);
                scene8button.setVisible(false);
                scene7Image.setVisible(false);
                scene8Image.setVisible(true);
                break;
            case 9:
                scene7a.setVisible(false);
                scene7b.setVisible(false);
                scene7c.setVisible(false);
                nextButton.setVisible(true);
                scene8Image.setVisible(false);
                scene9Image.setVisible(true);
                break;
            case 10:
                nextButton.setVisible(false);
                scene13button.setVisible(true);
                scene9Image.setVisible(false);
                scene10Image.setVisible(true);
                break;
            case 11:
                scene7a.setVisible(false);
                scene7b.setVisible(false);
                scene7c.setVisible(false);
                nextButton.setVisible(true);
                scene10Image.setVisible(false);
                scene11Image.setVisible(true);
                break;
            case 12:
                nextButton.setVisible(false);
                scene8button.setVisible(true);
                scene11Image.setVisible(false);
                scene12Image.setVisible(true);
                break;
            case 13:
                scene13button.setVisible(false);
                nextButton.setVisible(true);
                scene12Image.setVisible(false);
                scene13Image.setVisible(true);
                break;
            case 14:
                nextButton.setVisible(false);
                scene14a.setVisible(true);
                scene14b.setVisible(true);
                scene14c.setVisible(true);
                scene13Image.setVisible(false);
                scene14Image.setVisible(true);
                break;
            case 15:
                scene14a.setVisible(false);
                scene14b.setVisible(false);
                scene14c.setVisible(false);
                nextButton.setVisible(true);
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
                nextButton.setVisible(false);
                scene24button.setVisible(true);
                scene17Image.setVisible(false);
                scene18Image.setVisible(true);
                break;
            case 19:
                scene14a.setVisible(false);
                scene14b.setVisible(false);
                scene14c.setVisible(false);
                nextButton.setVisible(true);
                scene18Image.setVisible(false);
                scene19Image.setVisible(true);
                break;
            case 20:
                nextButton.setVisible(false);
                scene24button.setVisible(true);
                scene19Image.setVisible(false);
                scene20Image.setVisible(true);
                break;
            case 21:
                scene14a.setVisible(false);
                scene14b.setVisible(false);
                scene14c.setVisible(false);
                nextButton.setVisible(true);
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
                scene24button.setVisible(false);
                nextButton.setVisible(true);
                scene23Image.setVisible(false);
                scene24Image.setVisible(true);
                break;
            case 25:
                nextButton.setVisible(false);
                scene25a.setVisible(true);
                scene25b.setVisible(true);
                scene25c.setVisible(true);
                scene24Image.setVisible(false);
                scene25Image.setVisible(true);
                break;
            case 26:
                scene25a.setVisible(false);
                scene25b.setVisible(false);
                scene25c.setVisible(false);
                nextButton.setVisible(true);
                scene25Image.setVisible(false);
                scene26Image.setVisible(true);
                break;
            case 27:
                nextButton.setVisible(false);
                scene27a.setVisible(true);
                scene27b.setVisible(true);
                scene27c.setVisible(true);
                scene26Image.setVisible(false);
                scene27Image.setVisible(true);
                break;
            case 28:
                scene27a.setVisible(false);
                scene27b.setVisible(false);
                scene27c.setVisible(false);
                nextButton.setVisible(true);
                scene27Image.setVisible(false);
                scene28Image.setVisible(true);
                break;
            case 29:
                nextButton.setVisible(false);
                option1a.setVisible(true);
                option1b.setVisible(true);
                option1c.setVisible(true);
                scene28Image.setVisible(false);
                scene29Image.setVisible(true);
                break;
            case 30:
                option1a.setVisible(false);
                option1b.setVisible(false);
                option1c.setVisible(false);
                nextButton.setVisible(true);
                scene29Image.setVisible(false);
                scene30Image.setVisible(true);
                break;
            case 31:
                nextButton.setVisible(false);
                option2a.setVisible(true);
                option2b.setVisible(true);
                option2c.setVisible(true);
                scene30Image.setVisible(false);
                scene31Image.setVisible(true);
                break;
            case 32:
                option2a.setVisible(false);
                option2b.setVisible(false);
                option2c.setVisible(false);
                nextButton.setVisible(true);
                scene31Image.setVisible(false);
                scene32Image.setVisible(true);
                break;
            case 33:
                nextButton.setVisible(false);
                option3a.setVisible(true);
                option3b.setVisible(true);
                option3c.setVisible(true);
                scene32Image.setVisible(false);
                scene33Image.setVisible(true);
                break;
            case 34:
                option3a.setVisible(false);
                option3b.setVisible(false);
                option3c.setVisible(false);
                nextButton.setVisible(true);
                scene33Image.setVisible(false);
                scene34Image.setVisible(true);
                break;
            case 35:
                nextButton.setVisible(false);
                option4a.setVisible(true);
                option4b.setVisible(true);
                option4c.setVisible(true);
                scene34Image.setVisible(false);
                scene35Image.setVisible(true);
                break;
            case 36:
                option4a.setVisible(false);
                option4b.setVisible(false);
                option4c.setVisible(false);
                nextButton.setVisible(true);
                scene35Image.setVisible(false);
                scene36Image.setVisible(true);
                break;
            case 37:
                nextButton.setVisible(false);
                option5a.setVisible(true);
                option5b.setVisible(true);
                option5c.setVisible(true);
                scene36Image.setVisible(false);
                scene37Image.setVisible(true);
                break;
            case 38:
                option5a.setVisible(false);
                option5b.setVisible(false);
                option5c.setVisible(false);
                nextButton.setVisible(true);
                scene37Image.setVisible(false);
                scene38Image.setVisible(true);
                break;
            case 39:
                nextButton.setVisible(false);
                option6a.setVisible(true);
                option6b.setVisible(true);
                option6c.setVisible(true);
                scene38Image.setVisible(false);
                scene39Image.setVisible(true);
                break;
            case 40:
                option6a.setVisible(false);
                option6b.setVisible(false);
                option6c.setVisible(false);
                nextButton.setVisible(false);
                finalNext.setVisible(true);
                scene39Image.setVisible(false);
                scene40Image.setVisible(true);
                break;
            case 41:
                finalNext.setVisible(false);
                scene44button.setVisible(true);
                scene40Image.setVisible(false);
                scene41Image.setVisible(true);
                break;
            case 42:
                finalNext.setVisible(false);
                scene44button.setVisible(true);
                scene41Image.setVisible(false);
                scene42Image.setVisible(true);
                break;
            case 43:
                finalNext.setVisible(false);
                scene44button.setVisible(true);
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