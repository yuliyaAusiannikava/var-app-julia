package by.itstep.oop.patterns.factorymethod;

public abstract class Logistics {
    abstract void planDelivery();
    abstract Transport createTransport();
}
class SeaLogistics extends Logistics {

    @Override
    void planDelivery() {
        System.out.println("Sea delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
class FlyLogistics extends Logistics {

    @Override
    void planDelivery() {
        System.out.println("Fly delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Plane();
    }
}
class RoadLogistics extends Logistics{

    @Override
    void planDelivery() {
        System.out.println("Road delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Truck();
    }
}

class LogisticProvider {
    public static Logistics chooseLogistics(String type) {
        switch (type) {
            case "Air":
                return new FlyLogistics();
            case "Sea":
                return new SeaLogistics();
            case "Road":
                return new RoadLogistics();
            default:
                System.out.println("Wrong type");
                return new RoadLogistics();
        }
    }
}

class LogisticClient {
    public static void main(String[] args) {
        Logistics logi = LogisticProvider.chooseLogistics("Air");

        logi.planDelivery();
        logi.createTransport().deliver();
    }
}


