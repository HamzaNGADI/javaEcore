package SDLimp;

public class state {
	String id;
    signal input, output;
    state nextState;

    public state(String id){
        this.id = id;
    }

    // Getters and Setters
    public String getid() {
        return id;
    }

    public signal getInput() {
        return input;
    }

    public signal getOutput() {
        return output;
    }

    public state getNextState() {
        return nextState;
    }

    public void setid(String id) {
        this.id = id;
    }

    public void setInput(signal input) {
        this.input = input;
    }

    public void setOutput(signal output) {
        this.output = output;
    }

    public void setNextState(state nextState) {
        this.nextState = nextState;
    }
}
