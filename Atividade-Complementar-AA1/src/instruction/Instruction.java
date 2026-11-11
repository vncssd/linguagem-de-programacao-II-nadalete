package instruction;

public class Instruction {

    private String instruction;
    private Double value;

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Instruction(String instruction, Double value) {
        this.instruction = instruction;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "instruction='" + instruction + '\'' +
                ", value=" + value +
                '}';
    }
}
