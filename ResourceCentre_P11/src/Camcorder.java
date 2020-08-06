
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
	       
	        Object camcorderList;
	        output += String.format("%-10s %-30s %-10s %-10s %-20d\n", camcorderList.get(i).getAssetTag(),
	                camcorderList.get(i).getDescription(),
	                ResourceCentre.showAvailability(camcorderList.get(i).getIsAvailable()),
	                camcorderList.get(i).getDueDate(),camcorderList.get(i).getOpticalZoom());
	        return output;
	    }
		
		return output;
	}
}

