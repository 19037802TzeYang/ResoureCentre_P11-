
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
		public String toString(){
	        String output = "";
	        Object chromebookList;
	     
	        
	        String info = super.toString();
	        return String.format("%-63s %-20d", info, getOs());
	        
	    }

	}



