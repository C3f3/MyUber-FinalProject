

public class Picture {
	private Square[][] cuadras;
    private Square window;
    private Triangle roof;
    private Circle persona;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
    	Square[][] cuadras=new Square[12][12];
    	int distanciax=0;
    	int distanciay=0;
    	 
    	for(int i=0;i<12;i++){
    		for(int j=0;j<12;j++){
    			cuadras[i][j]=new Square();
    			cuadras[i][j].moveVertical(distanciay);
    			cuadras[i][j].moveHorizontal(distanciax);
    			cuadras[i][j].changeSize(20);
    			
    			cuadras[i][j].changeColor("green");
    			cuadras[i][j].makeVisible();
    			distanciax=distanciax+40;
    			
    		}
    		distanciay=distanciay+40;
    		distanciax=0;
    	}
    	 persona=new Circle();
    	 persona.changeColor("red");
         persona.moveHorizontal(50);
         persona.moveVertical(50);
         persona.changeSize(10);
         persona.makeVisible();
    		
    		
        
    }
    /**
     * Change this picture to black/white display
     */
    //public void setBlackAndWhite()
    //{
        //if(wall != null)   // only if it's painted already...
        //{
            //wall.changeColor("black");
            //window.changeColor("white");
            //roof.changeColor("black");
            //sun.changeColor("black");
        //}
    //}

    /**
     * Change this picture to use color display
     */
    //public void setColor()
    //{
        //if(wall != null)   // only if it's painted already...
        //{
//		            wall.changeColor("red");
//		            window.changeColor("black");
//		            roof.changeColor("green");
//		            sun.changeColor("yellow");
//		        }
//		    }

    /**
     * Genera un efecto atardecer haciendo bajar el sol
     */
    public void moverPersona()
    {
        if(cuadras != null)   // only if it's painted already...
        {
            persona.slowMoveHorizontal(10);
            persona.slowMoveVertical(40);
        }
    } 
}
