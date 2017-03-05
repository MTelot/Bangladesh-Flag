package flag;

import java.util.Random;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class Line implements GLEventListener{
   
    static GLProfile profile = GLProfile.get(GLProfile.GL2);
    static GLCapabilities capabilities = new GLCapabilities(profile);
    // The canvas
    static GLCanvas glcanvas = new GLCanvas(capabilities);
   
   public static void main(String[] args) {
          //getting the capabilities object of GL2 profile
             double[] lne = new double[12*4];
         
          Line l = new Line();
          //creating frame
          glcanvas.addGLEventListener(l);
          glcanvas.setSize(800, 800);
         
          final JFrame frame = new JFrame ("straight Line");
          //adding canvas to frame
          frame.getContentPane().add(glcanvas);
          frame.setSize(frame.getContentPane().getPreferredSize());
          frame.setVisible(true);
         
       }
   public void display(GLAutoDrawable drawable) {
      final GL2 gl = drawable.getGL().getGL2();
            
      
      
      
      
      
      
                
      int x0 = 0;
      int y0 = 1;
      int x1 = 2;
      int y1 = 3;
     
      double line1[] = new double[4];
         line1[x0] = 0;
         line1[y0] = 0;
         line1[x1] = 0.3;
         line1[y1] = 0;
        
    
      
     
     
      //line2
      line1[x0] = 0;
      line1[y0] = 0;
      line1[x1] = 0;
      line1[y1] = 0.3;
     
      gl.glBegin(GL2.GL_LINES);
      //gl.glVertex3f(0,0f,0);
      //gl.glVertex3f(0f,0.6f,0);
      gl.glEnd();
     
  
     
    
     
      line1[x0] = 0;
      line1[y0] = 0.3;
      line1[x1] = 0.3;
      line1[y1] = 0.3;
     
     
     
     
  
      ////////////////////////////
          //left line
         
          line1[x0] = -0.4;
          line1[y0] = -0.2;
          line1[x1] = -0.4;
          line1[y1] = 0.2;
         
          gl.glBegin(GL2.GL_LINES);
          gl.glColor3f(0f, 1f, 0f);
          gl.glVertex3f((float)line1[x0],(float)line1[y0],0);
          gl.glVertex3f((float)line1[x1],(float)line1[y1],0);
          gl.glEnd();
         
          
          //upper line
          line1[x0] = -0.4;
          line1[y0] = 0.2;
          line1[x1] = 0.4;
          line1[y1] = 0.2;
         
          gl.glBegin(GL2.GL_LINES);
          gl.glColor3f(0f, 1f, 0f);
         gl.glVertex3f((float)line1[x0],(float)line1[y0],0);
          gl.glVertex3f((float)line1[x1],(float)line1[y1],0);
          gl.glEnd();
         
         
         
          //right line
         
          line1[x0] = 0.4;
          line1[y0] = -0.2;
          line1[x1] = 0.4;
          line1[y1] = 0.2;
         
          gl.glBegin(GL2.GL_LINES);
          gl.glColor3f(0f, 1f, 0f);
          gl.glVertex3f((float)line1[x0],(float)line1[y0],0);
          gl.glVertex3f((float)line1[x1],(float)line1[y1],0);
          gl.glEnd();
         
         
//        brown dondo
        line1[x0] = -0.4;
        line1[y0] = -0.8;
        line1[x1] = -0.35;
        line1[y1] = -0.8;
       
        while(line1[y0]<-0.2){
        gl.glBegin(GL2.GL_LINES);
        gl.glColor3f(0.7f, 0.3f, 0.2f);
        gl.glVertex3f((float)line1[x0],(float)line1[y0],0);
        gl.glVertex3f((float)line1[x1],(float)line1[y0],0);
        
        gl.glEnd();
        line1[y0]+=0.001;
        }
        
          //bottom line
         
          line1[x0] = -0.4;
          line1[y0] = -0.2;
          line1[x1] = 0.4;
          line1[y1] = -0.2;
         
          while(line1[y0]<0.2){
          gl.glBegin(GL2.GL_LINES);
          gl.glColor3f(0f, 1f, 0f);
          gl.glVertex3f((float)line1[x0],(float)line1[y0],0);
          gl.glVertex3f((float)line1[x1],(float)line1[y0],0);
          
          gl.glEnd();
          line1[y0]+=0.001;
          }
          

          
          //gl.glEnd();
          gl.glBegin (GL2.GL_POINTS);//static field
          
          
          /////////////////////////////////////////////////
           
          
          double r, x, y, p;

        r=0.15;

        for(double u=0.15;u>=0;u-=0.001){
            r=u;
                x = 0;
            y = r;
            p = (5.0 / 4.0) - r;
	        while (x < y) {
	            if (p < 0) {
	                p += (2.0 * x) + .001;
	            } else {
	                p += -(2.0 * y) + (2.0 * x) + .001;
	                y = y - .001;
	            }
	            x = x + .001;
	
	            gl.glVertex2d(x, y);
	            gl.glVertex2d(y, x);
	
	            gl.glColor3f(1f, 0f, 0f);
	            gl.glVertex2d(-x, y);
	            gl.glVertex2d(y, -x);
	
	//            gl.glColor3f(0f, 1f, 1f);
	            gl.glVertex2d(-x, -y);
	            gl.glVertex2d(-y, -x);
	
	//            gl.glColor3f(0f, 1f, 0f);
	            gl.glVertex2d(x, -y);
	            gl.glVertex2d(-y, x);
	
	//            System.out.println(x + " " + y);
	        }
        }
        gl.glEnd(); 
          
          /////////////////////////////////////////////////
          
         
         
     
   }
  

  
   public void dispose(GLAutoDrawable arg0) {
      //method body
   }

  
   public void init(GLAutoDrawable drawable) {
      // method body
       //4. drive the display() in a loop
        }
  
   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
      // method body
   }
   //end of main
}//