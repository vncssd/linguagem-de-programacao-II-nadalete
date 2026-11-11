package instruction;

import converter.CelsiusToFahrenheitConverter;
import converter.DolarToEuroConverter;
import converter.EuroToRealConverter;
import converter.KilogramsToStoneConverter;

import java.util.LinkedList;
import java.util.List;

public class ReadBatchInstructions {

    private CelsiusToFahrenheitConverter celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();
    private DolarToEuroConverter dolarToEuroConverter = new DolarToEuroConverter();
    private KilogramsToStoneConverter kilogramsToStoneConverter = new KilogramsToStoneConverter();
    private EuroToRealConverter euroToRealConverter = new EuroToRealConverter();

    public ReadBatchInstructions(String instruction, Double value, CelsiusToFahrenheitConverter celsiusToFahrenheitConverter, DolarToEuroConverter dolarToEuroConverter, KilogramsToStoneConverter kilogramsToStoneConverter, EuroToRealConverter euroToRealConverter) {
        this.celsiusToFahrenheitConverter = celsiusToFahrenheitConverter;
        this.dolarToEuroConverter = dolarToEuroConverter;
        this.kilogramsToStoneConverter = kilogramsToStoneConverter;
        this.euroToRealConverter = euroToRealConverter;
    }

    public ReadBatchInstructions() {
    }

    public List<Double> executeBatchConversion(List<Instruction> instructions){

        List<Double> results = new LinkedList<>();

        for(Instruction i: instructions){
            if(i.getInstruction().toLowerCase().trim().equals("celsius to fahrenheit")){
                results.add(celsiusToFahrenheitConverter.execute(i.getValue()));
            }
            if(i.getInstruction().toLowerCase().trim().equals("dolar to euro")){
                results.add(dolarToEuroConverter.execute(i.getValue()));
            }
            if(i.getInstruction().toLowerCase().trim().equals("euro to real")){
                results.add(euroToRealConverter.execute(i.getValue()));
            }
            if(i.getInstruction().toLowerCase().trim().equals("kilograms to stone")){
                results.add(kilogramsToStoneConverter.execute(i.getValue()));
            }
        }

        return results;
    }

}
