package javalabexp;


	public class Triangle{
		double width,height;

	    public Triangle(double width,double height){
	        this.width=width;
	        this.height=height;
	    }
	    public double area(){
	        return 0.5*width*height;
	    }
	    public double perimeter(){
	        return width+height+Math.sqrt((width*width)+(height*height));
	    }
	}


