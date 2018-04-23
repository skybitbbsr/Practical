package javalabexp;

	public class Rectangle{
		double width,height;
	    public Rectangle(double width,double height){
	        this.width=width;
	        this.height=height;
	    }
	    public double area(){
	        return width*height;
	    }
	    public double perimeter(){
	        return 2*(width+height);
	    }
	}


