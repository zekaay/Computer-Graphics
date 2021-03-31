
import java.applet.*;

import java.awt.*;

public class flag extends Applet{

public void paint(Graphics g)

{

	g.setColor(Color.black);

	g.fillRect(200,125,10,500);

g.setColor(Color.blue);

g.fillRect(200,77,350,69);

g.setColor(Color.yellow);

//x coordinates of vertices
int x[] = { 257, 266, 291, 271,280 ,255, 235, 241, 220, 248};

//y coordinates of vertices
int y[] = { 92, 115, 114, 126, 147,132, 143, 124, 115, 112 };


//number of vertices
int numberofpoints = 10;

//set the color of line drawn to blue
g.setColor(Color.yellow);


//draw the polygon using drawPolygon function
g.fillPolygon(x, y, numberofpoints);


g.setColor(Color.white);


g.fillRect(200,146,350,72);


g.setColor(Color.green);

g.fillRect(200,218,350,85);

g.setColor(Color.yellow);

g.fillRect(200,303,350,95);





g.setColor(Color.red);

g.fillRect(343,77,82,320);

}

}




