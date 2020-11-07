package scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import entity.Sprite;
import manager.GameSceneManager;
import manager.KeyboardManager;
import util.Commons;

/**
 * 
 * @author
 */
public class Won extends BaseScene implements Commons {
    private Sprite sprite;
    private final String won = "/img/won.jpg";
    private int width;
    private Image image;

    /*
     * Constructor
     */
    public Won(GameSceneManager gsm) {
        super(gsm);
        sprite = new Sprite();
        ImageIcon ii = new ImageIcon(this.getClass().getResource(won));
        sprite.setImage(ii.getImage());

        width = ii.getImage().getWidth(null);

        sprite.setX(0);
        sprite.setY(0);
    }

    /*
     * Getters & Setters
     */
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(sprite.getImage(), 0, 0, gsm.panel);
    }

    @Override
    public void dispose() {
    }

    @Override
    public void input(KeyboardManager keyboardManager) {
        if (keyboardManager.escape.down) {
            gsm.ingame = false;
        }

    }
}