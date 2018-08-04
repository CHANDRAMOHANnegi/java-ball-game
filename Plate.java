
public class Plate implements Game1Constants{
	

	int platex=WIDTH1/2;
	int platey=HEIGHT1-100;
	int plateSpeed=0;


	  public void moveplate(  ){ 
		  
		  platex=platex+ plateSpeed;
		  
		  
		  if(platex==WIDTH1-PLATE_WIDTH1){
			  
			  plateSpeed=plateSpeed*-1;
			  
		  }
		  if(platex==0){
			  
			  
			  plateSpeed=plateSpeed*-1;
		  }
		  
		  
	  }
public int getPlatex() {
		return platex;
	}
	public void setPlatex(int platex) {
		this.platex = platex;
	}
	public int getPlatey() {
		return platey;
	}
	public void setPlatey(int platey) {
		this.platey = platey;
	}
	public int getPlateSpeed() {
		return plateSpeed;
	}
	public void setPlateSpeed(int plateSpeed) {
		this.plateSpeed = plateSpeed;
	}
  
	
}
