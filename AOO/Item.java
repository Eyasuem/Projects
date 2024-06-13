// Author: Eyasue Mengesha
// Project: Array of Objects 
// Date: 6/05/24


public class item{
	private String Ranger;
	private int Num;
	
	
	public item(String Ranger, int Num){
		this.Ranger = Ranger;
		this.Num = Num;
	
	}
	
	
	public void setRanger(String Ranger){
		this.Ranger = Ranger;
	
	}
	
	public String getRanger(){
		return this.Ranger;
	
	
	}
	
	
	public void setNum(int Num){
		this.Num = Num;
	
	}
	
	public int getNum(){
	
		return this.Num;
	
	}
	
	@Override
	public String toString(){
		String output = getNum() +" "+ getRanger();
		return output;
	}
	
	public boolean equals(String one, String two){
		return one.equalsIgnoreCase(two);
	
	}

}