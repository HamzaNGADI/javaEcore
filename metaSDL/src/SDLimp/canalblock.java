package SDLimp;

public class canalblock {
	
	String id;
    processus process;
    signal signal;

    public canalblock(String id){
        this.id = id;
    }

    // Getters and Setters
    public String getid() {
        return id;
    }

    public signal getSignal() {
        return signal;
    }

    public void setid(String id) {
        this.id = id;
    }

    public processus getProcess() {
        return process;
    }

    public void setProcess(processus process) {
        this.process = process;
    }

    public void setSignal(signal signal) {
        this.signal = signal;
    }

}
