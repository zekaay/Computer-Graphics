import java.applet.*;

import java.awt.*;

public class GhanaFlag extends Applet

{

public void paint(Graphics g)

{

g.setColor(Color.black);

g.fillRect(187,125,10,500);


g.setColor(Color.red);

g.fillRect(187,58,350,88);



g.setColor(Color.yellow);


g.fillRect(187,146,350,88);


g.setColor(Color.green);

g.fillRect(187,224,350,88);


g.setColor(Color.black);

// x coordinates of vertices
int x[] = { 359, 370, 401, 376, 384, 359, 333, 340, 316, 347};

// y coordinates of vertices
int y[] = { 160, 184, 183, 196, 215, 204, 216, 196, 184,  183 };


// number of vertices
int numberofpoints = 10;

// set the color of line drawn to blue
g.setColor(Color.black);


// draw the polygon using drawPolygon function
g.fillPolygon(x, y, numberofpoints);

}

}


