public class TwoDLIne {
    //Attributes
    private double xO, xE, yO,yE; //These are the x & y coordinates of the origin and of the Endpoint

    //Constructor
    public TwoDLIne(double xO, double yE, double xE, double yO) {
        this.xO = xO;
        this.yO = yO;
        this.xE = xE;
        this.yE = yE;
        if(xO == xE && yO == yE) {
            System.out.print("Invalid points");
        } else {
            System.out.println("The points are not identical");
        }
    }

    public void setXo(double xO) {
        this.xO = xO;
    }
    public void setYo(double yO) {
        this.yO = yO;
    }
    public void setXe(double xE) {
        this.xE =xE;
    }
    public void setYe(double yE) {
        this.yE = yE;
    }//Method to calculate length of a line
    public double calcLength() {
        System.out.print("The Length of a line is:");
        double Length = Math.sqrt(Math.pow(xE - xO,2.0) + Math.pow(yE - yO,2.0));
        return Length;
    }
}
