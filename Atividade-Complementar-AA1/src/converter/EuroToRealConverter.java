package converter;

public class EuroToRealConverter implements Convertible{

    @Override
    public Double execute(Double value) {
        return value*5.97;
    }
}
