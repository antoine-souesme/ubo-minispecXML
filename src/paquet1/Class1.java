package paquet1;

import java.util.*;


public class Class1 {
	protected String att1 = "Attribut 1";
	protected int att2 = 3;
	protected String[] tab = new String[2];
	protected ArrayList<ArrayList<String>> listeDeListeDeString;
	protected ArrayList<String> listeDeString;

	public Class1(String[] tab, ArrayList<ArrayList<String>> listeDeListeDeString, ArrayList<String> listeDeString) { 
		this.tab = tab;
		this.listeDeListeDeString = listeDeListeDeString;
		this.listeDeString = listeDeString;
	} 





	public void add(String o) {
		int max = 4;
		if(this.listeDeString.size() < max){
			this.listeDeString.add(o);
		}
	}
	public void remove(String o) {
		int min = 2;
		if(this.listeDeString.size() >= min){
			this.listeDeString.remove(o);
		}
	}

	public String getAtt1() { 
		return this.att1; 
	}

	public void setAtt1(String att1) { 
		this.att1 = att1; 
	} 


	public int getAtt2() { 
		return this.att2; 
	}

	public void setAtt2(int att2) { 
		this.att2 = att2; 
	} 


	public String[] getTab() { 
		return this.tab; 
	}

	public void setTab(String[] tab) { 
		this.tab = tab; 
	} 


	public ArrayList<ArrayList<String>> getListeDeListeDeString() { 
		return this.listeDeListeDeString; 
	}

	public void setListeDeListeDeString(ArrayList<ArrayList<String>> listeDeListeDeString) { 
		this.listeDeListeDeString = listeDeListeDeString; 
	} 


	public ArrayList<String> getListeDeString() { 
		return this.listeDeString; 
	}

	public void setListeDeString(ArrayList<String> listeDeString) { 
		this.listeDeString = listeDeString; 
	} 

}
