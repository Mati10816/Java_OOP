package Entity;

public class CoffeeMaker {
    
    final private float maxCapacity = 1000; //  as the variable is a constant, you can initialize it here as -final-.
    private float currentQuantity = 0;

    public CoffeeMaker() {
        
    }

//    public CoffeeMaker(float maxCapacity, float currentQuantity) {
//        this.maxCapacity = maxCapacity;
//        this.currentQuantity = currentQuantity;
//    }

    public float getMaxCapacity() {
        return maxCapacity;
    }

    //This SET it´s NO necesary because the Max Capacity it´s already initialized
//    public void setMaxCapacity(float maxCapacity) {
//        this.maxCapacity = maxCapacity;
//    }

    public float getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(float currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" + "maxCapacity=" + maxCapacity + ", currentQuantity=" + currentQuantity + '}';
    }
    
    

}
