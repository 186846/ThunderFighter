package ThunderFighter.bjsxt;

import java.awt.*;
import java.awt.event.KeyEvent;

//飞机类
public class Plane extends GameObject {
    boolean left,up,right,down;
    boolean live = true;
    @Override
    public void drawMySelf(Graphics g) {
        if(!live){
            return;
        }

        super.drawMySelf(g);

        if(left){
            x -=speed;
        }
        if(right){
            x +=speed;
        }
        if(up){
            y -=speed;
        }
        if(down){
            y +=speed;
        }


    }

    public void addDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
        }
    }

    public void minusDirection(KeyEvent e){
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> left = false;
            case KeyEvent.VK_RIGHT -> right = false;
            case KeyEvent.VK_UP -> up = false;
            case KeyEvent.VK_DOWN -> down = false;
        }
    }




    public Plane(Image img, int x, int y, int speed) {
        super(img, x, y, speed);
    }
}
