package prog6;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

     int getRamSize() {
        return ramSize;
    }

     double getProcessorSpeed() {
        return processorSpeed;
    }

    double computePower(){
        return ramSize * processorSpeed;
    }

    public String toString(){
        return "Manufacturer: "+manufacturer+" "+"Processor: "+processor+" "+"Ram Size:"+ramSize;
    }

    public boolean equals(Object aComputer){
        if(aComputer == null) return false;
        if(!(aComputer instanceof Computer)) return false;
        Computer comp = (Computer) aComputer;
        boolean isTrue = this.manufacturer.equals(comp.manufacturer) &&
                         this.processor.equals(comp.processor) &&
                         this.ramSize == comp.ramSize &&
                         this.processorSpeed == comp.processorSpeed;
        return isTrue;
    }
}
