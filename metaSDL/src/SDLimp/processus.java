package SDLimp;

import java.util.ArrayList;
import java.util.List;

public class processus {
	
	String id;
    List<state> states;

    public processus(String id){
        this.id = id;
        states = new ArrayList<state>();
    }

    public state getState(String id){
        for(state st : states)
            if(st.getid().equals(id))
                return st;
        return null;
    }

    public boolean issetState(String id){
        for(state st : states)
            if(st.getid().equals(id))
                return true;
        return false;
    }
    // Getters and Setters
    public void setid(String id) {
        this.id = id;
    }

    public String getid() {
        return id;
    }

    public List<state> getStates() {
        return states;
    }


}
