package SDLimp;

import java.util.ArrayList;
import java.util.List;

public class block {
    String id;
    List<canalblock> canneaux;
    List<connection> connects;

    public block(String idd){
        this.id = idd;
        canneaux = new ArrayList<canalblock>();
        connects = new ArrayList<connection>();
    }

    public boolean issetCanalBlock(String id){
        for(canalblock cs : canneaux)
            if(cs.getid().equals(id))
                return true;
        return false;
    }

    public canalblock getCanalBlock(String id){
        for(canalblock b : canneaux)
            if(b.getid().equals(id))
                return b;
        return null;
    }

    public boolean refProcess(String id){
        for(canalblock cs : canneaux)
            if(cs.getProcess().getid().equals(id))
                return true;
        return false;
    }
    //Getters and Setters
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public List<canalblock> getCanneaux() {
        return canneaux;
    }

    public List<connection> getConnects() {
        return connects;
    }

}
