package SDLimp;

public class canalsys {
	
	String id;
    block block;
    signal signal;
    canalsys canalS;

    public canalsys(String id){
        this.id = id;
    }

    // Getters and Setters
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public  block getBlock() {
        return block;
    }

    public void setBlock(block block) {
        this.block = block;
    }

    public signal getSignal() {
        return signal;
    }

    public void setSignal(signal signal) {
        this.signal = signal;
    }

    public canalsys getCanalSystemEnd() {
        return canalS;
    }

    public void setCanalSys(canalsys canalSys) {
        this.canalS = canalSys;
    }

}
