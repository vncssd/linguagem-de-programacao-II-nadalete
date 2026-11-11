package converter;

public class DolarToEuroConverter implements Convertible{

    @Override
    public Double execute(Double value) {
        return value*0.9;
    }
}