class TestaData{
	public static void main(String[] args){
		try{
			Data dataErrada_1 = new Data(32,1,1970);
		}
		catch(IllegalArgumentException e){
			System.err.println(e);
		}
		
		try{
			Data dataErrada_1 = new Data(0,1,1970);
		}
		catch(IllegalArgumentException e){
			System.err.println(e);
		}
		
		try{
			Data dataErrada_1 = new Data(1,13,1970);
		}
		catch(IllegalArgumentException e){
			System.err.println(e);
		}
		
		try{
			Data dataErrada_1 = new Data(1,0,1970);
		}
		catch(IllegalArgumentException e){
			System.err.println(e);
		}
	}
}
