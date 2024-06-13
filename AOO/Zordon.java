


public class Zordon{
	private String Ranger;
	private int Num;
	
	
	public Zordon(String Ranger, int Num){
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
		 return getRanger() +" "+ getNum();

	}
	
	@Override
	public boolean equals(Object o){
		if(o == this){
			return true;
			
		}	
		
		if(o instanceof Zordon){
		    Zordon zordon = (Zordon) o;
			return zordon.getRanger().equalsIgnoreCase(this.getRanger()) && zordon.getNum() == this.getNum();
					
			}
			
		return false;
		
		}
	
	}

