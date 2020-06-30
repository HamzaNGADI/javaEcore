package SDLimp;

import java.util.ArrayList;
import java.util.List;

public class metasysSDL {
	 String sysName;
	    private List<signal> signaux;
	    private List<canalsys> canneaux;
	    private List<block> blocks;
	    private List<processus> process;

	    public metasysSDL() {
	        signaux = new ArrayList<signal>();
	        canneaux = new ArrayList<canalsys>();
	        blocks = new ArrayList<block>();
	        process = new ArrayList<processus>();
	    }

	    // Check functons
	    public boolean issetSignal(String id){
	        boolean result = false;
	        for(signal s : signaux){
	            if( s.getid().equals(id))
	                return true;
	        }
	        return result;
	    }

	    public boolean issetBlock(String id){
	        for(block b : blocks){
	            if( b.getid().equals(id))
	                return true;
	        }
	        return false;
	    }

	    public boolean issetProcess(String id){
	        for(processus p : process)
	            if( p.getid().equals(id))
	                return true;
	        return false;
	    }

	    public boolean issetCanalS(String id){
	        for(canalsys cs : canneaux)
	            if( cs.getid().equals(id))
	                return true;
	        return false;
	    }

	    public block getBlock(String id){
	        for(block b : blocks){
	            if(b.getid().equals(id))
	                return b;
	        }
	        return null;
	    }

	    public processus getProcess(String id){
	        for(processus p : process){
	            if(p.getid().equals(id))
	                return p;
	        }
	        return null;
	    }

	    public signal getSignal(String id){
	        for(signal s : signaux)
	            if(s.getid().equals(id))
	                return s;
	        return null;
	    }

	    public canalsys getCanalS(String id){
	        for(canalsys s : canneaux)
	            if(s.getid().equals(id))
	                return s;
	        return null;
	    }
	    // Getters and Setters
	    public void setName(String name) {
	        sysName = name;
	    }

	    public String getName() {
	        return sysName;
	    }

	    public void setSignaux(List<signal> signaux) {
	        this.signaux = signaux;
	    }

	    public void setCanneaux(List<canalsys> canneaux) {
	        this.canneaux = canneaux;
	    }

	    public void setBlocks(List<block> blocks) {
	        this.blocks = blocks;
	    }

	    public void setProcess(List<processus> process) {
	        this.process = process;
	    }

	    public List<signal> getSignaux() {

	        return signaux;
	    }

	    public List<canalsys> getCanneaux() {
	        return canneaux;
	    }

	    public List<block> getBlocks() {
	        return blocks;
	    }

	    public List<processus> getProcess() {
	        return process;
	    }
}
