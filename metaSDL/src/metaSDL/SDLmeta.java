package metaSDL;

import java.util.ArrayList;
import java.util.List;

import metaSDL.util.MetaSDLSwitch;

public class SDLmeta extends MetaSDLSwitch<String>{
	
	List<String> lb = new ArrayList<String>();
	public static boolean valid=true;
	
	
	public String caseMetaSysSDL(MetaSysSDL object) {
		String result = "system " + object.getNameSys() + "\n" ; 
		for(  Signal sl : object.getSignal() ) {
        	result += caseSignal(sl);
		}
		for(  Block bl : object.getBlock() ) lb.add(bl.getId().toString());
		for(  Processus pr : object.getProcessus() ) lb.add(pr.getId().toString());
//		System.out.println(lb.toString());
		
		for(  Block bl : object.getBlock() ) {
        	result += bl.getId()+" referenced;\n";
		}
		for(  Processus pr : object.getProcessus() ) {
        	result = result+pr.getId()+" referenced;\n";
		}
		
		for(  Block blo : object.getBlock() ) {
        	result = result+ caseBlock(blo);
		}
		
		for( Processus pr : object.getProcessus() ) {
        	result = result+ caseProcessus(pr);
		}
		
		for(  CanalSys csys : object.getCanalsys() ) {
        	result = result+ caseCanalSys(csys);
		}

		result +="endsystem "+object.getNameSys()+"\n";
		return result;
	}
	public String caseBlock(Block object) {
		String result = "block " + object.getId() + "\n" ; 
		for(  Processus pr : object.getProcessus() ) {
        	result = result+pr.getId()+" referenced;\n";
		}
		for( Processus pr : object.getProcessus() ) {
        	result = result+ caseProcessus(pr);
		}
		for(  CanalBlock cbl : object.getCanalblock() ) {
        	result = result+ caseCanalBlock(cbl);
		}
		
		result +="endBlock "+object.getId()+"\n";
		return result;
	}
	
	public String caseProcessus(Processus object) {
		String result = "process " + object.getId() + "\n" ;
		result +="start;\n";

		for( State st : object.getState() ) {
			result+="nextstate "+st.getId();
        	result += caseState(st);
		}
		
		result +="endprocess "+object.getId()+"\n";
		return result;
	}
	
	public String caseState(State object) {
	
		String result = "state " + object.getId() + "\n" ;

		for( Connection cn : object.getConnection() ) {
        	result = result+ caseConnection(cn);
		}
		for(  Signal sl : object.getSignal() ) {
        	result += caseSignal(sl);
		}
		result +="endstate "+object.getId()+"\n";
		return result;
	}
	public String caseConnection(Connection object) {
		String result="";
		result+="input "+object.getInput()+"\n";
		result+="output "+object.getOutput()+"\n";
		return result;
	}

	public String caseCanalSys(CanalSys object) {
		String res="";
		for(  Signal sl : object.getSignal() ) {
        	res += caseSignal(sl);
		}
		return res;
	}

	public String caseCanalBlock(CanalBlock object) {
		String res="";
		
		for(  Signal sl : object.getSignal() ) {
        	res += caseSignal(sl);
		}
	    return res;
	}

	public String caseSignal(Signal object) {
		String res="";
	
		if(lb.contains(object.getFrom()) && lb.contains(object.getTo()) && !object.getFrom().equals(object.getTo()))
		{
			System.out.println("***********************************"+object.getId()+" f "+lb.contains(object.getFrom())+" "+ lb.contains(object.getTo()));
	    	res = res+ "channel "+object.getId()+" nodelay from "+object.getFrom()+" to "+object.getTo()+" with "+object.getWith()+"\n";
	    	return res;
		}else
		{
			System.out.println("***********************************"+object.getId()+lb.toString()+" f "+object.getFrom()+" "+ lb.contains(object.getTo()));
			 	
			valid= false;
	      return "-----channel "+object.getId()+" error-------\n";	}
	}	
}
