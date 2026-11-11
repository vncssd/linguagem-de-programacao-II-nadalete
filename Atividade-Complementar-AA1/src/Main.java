import instruction.Instruction;
import instruction.ReadBatchInstructions;

import java.util.LinkedList;
import java.util.List;

public class Main {

    static void main(String[] args) {

        List<Instruction> instructions = new LinkedList<>();
        ReadBatchInstructions readBatchInstructions = new ReadBatchInstructions();

        instructions.add(new Instruction("celsius to fahrenheit", 0.0));
        instructions.add(new Instruction("dolar to euro", 1.0));
        instructions.add(new Instruction("euro to real", 1.0));
        instructions.add(new Instruction("kilograms to stone", 1.0));

        List<Double> results = readBatchInstructions.executeBatchConversion(instructions);

        for(Double d:results){
            System.out.println(d);
        }

    }

}
