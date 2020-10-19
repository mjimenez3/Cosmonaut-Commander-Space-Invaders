package SpaceInvaders.models;

import SpaceInvaders.constants.Constants;
import SpaceInvaders.image.Image;
import SpaceInvaders.image.ImageFactory;

import javax.swing.*;

public class Bomb extends Sprite{

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
        initialize();
    }

    private void initialize() {
        ImageIcon imageIcon = ImageFactory.createImage(Image.BOMB);
        setImage(imageIcon.getImage());
    }


    @Override
    public void move() {

        this.y++;
        //dies at bottom of frame
        if (y >= Constants.BOARD_HEIGHT - Constants.BOMB_HEIGHT) {
            die();
        }

    }
}
