package SpaceInvaders.app;

import SpaceInvaders.ui.GameMainFrame;

import java.awt.EventQueue;

public class App {

    public static void main(String[] args) {

        //allows for the gui not to be bogged down while processing sounds and inputs
        EventQueue.invokeLater( () -> {
            new GameMainFrame();
        });
    }
}
