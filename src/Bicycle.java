public class  Bicycle extends WheelsTransport {

    public Bicycle(String modelName, int wheelsCount){
        super(modelName,wheelsCount);
    }


    @Override
    public void sercvice() {
        updateTyre();

    }
}
