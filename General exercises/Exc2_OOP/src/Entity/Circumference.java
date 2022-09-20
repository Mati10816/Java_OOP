package Entity;

public class Circumference {
    
    private float radius;

    public Circumference(float radius) {
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    
    //Another way to do it aou of the class Service
    public float getPerimetro(){
        float perimetro;
        perimetro =  (float) (2 * Math.PI * this.radius);
        
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circumference{" + "Radius: " + radius + '}';
    }
    
    
    

    
   
    
    
    
    

}
