
public class Item {
	private String assetTag;
	private String description;
	private String dueDate;
	private boolean isAvailable;

	public Item(String assetTag, String description) {
		this.assetTag = assetTag;
		this.description = description;
		this.dueDate = "";
		this.isAvailable = true;
	}
	
	public static String showAvailablility(boolean isAvailable) {
        String avai;
       
        if (isAvailable == true) {
            avai =  "Yes";
        } else {
            avai = "No";
        }
        return avai;
    }
	
	public String toString() {
		
		output += String.format("%-10s %-30s %-10s %-10s %-20d\n", camcorderList.get(i).getAssetTag(),
				camcorderList.get(i).getDescription(), 
				ResourceCentre.showAvailability(camcorderList.get(i).getIsAvailable()),
				camcorderList.get(i).getDueDate(),camcorderList.get(i).getOpticalZoom());
		
		return null;
	}
	
	public String getAssetTag() {
		return assetTag;
	}

	public String getDescription() {
		return description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}

