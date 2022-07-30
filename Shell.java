package ThunderFighter.bjsxt;

import java.awt.*;

//炮弹
public class Shell extends GameObject {
    double degree;

    @Override
    public void drawMySelf(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.yellow);
        g.fillOval(x,y,width,height);

        //炮弹沿着任意角度飞行
        x += (int)(speed*Math.cos(degree));
        y += (int)(speed*Math.sin(degree));

        //实现边界碰撞回弹
        if(y>GameUtil.FRAME_HIGHT-width|| y<30){
            degree = -degree;
        }

        if(x<0||x>GameUtil.FRAME_WIDTH-height){
            degree = Math.PI-degree;
        }




        g.setColor(c);
    }

    public Shell() {
        degree = Math.random()*Math.PI*2;
        x = 100;
        y = 100;
        width=10;
        height=10;
        speed = 7;
    }
}
