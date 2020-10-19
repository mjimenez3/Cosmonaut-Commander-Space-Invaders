package SpaceInvaders.ui;

import SpaceInvaders.constants.Constants;
import SpaceInvaders.image.Image;
import SpaceInvaders.image.ImageFactory;

import javax.swing.*;

public class GameMainFrame extends JFrame {

    public GameMainFrame() {
        initializeLayout();
    }

    private void initializeLayout() {

        add(new GamePanel());

        setTitle(Constants.Title);  // from Constants Class

        pack();  // makes frame same size and layout as subcomponents

        //setting Icon as spaceship image through image enum and getting image from the imagefactory
        setIconImage(ImageFactory.createImage(Image.SPACESHIP).getImage());


        setDefaultCloseOperation(EXIT_ON_CLOSE); //close when x is clicked
        setLocationRelativeTo(null);  //  centered in middle of screen
        setResizable(false);  // user can't resize screen
        setVisible(true);  // frame is visible to user
    }


}
