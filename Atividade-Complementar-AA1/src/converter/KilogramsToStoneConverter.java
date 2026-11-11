package converter;

public class KilogramsToStoneConverter implements Convertible{

    @Override
    public Double execute(Double value) {
        return value*6.35;
    }

}
