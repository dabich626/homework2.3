public abstract class MotorTransport extends WheelsTransport {


    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void sercvice() {
        checkEngine();
    }

     public void checkEngine()  {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
