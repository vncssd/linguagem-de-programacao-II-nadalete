package converter;

public class CelsiusToFahrenheitConverter implements Convertible{


    @Override
    public Double execute(Double value) {
        return (value * 9/5) + 32;
    }
}
