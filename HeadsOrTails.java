import java.util.Random;


public class HeadsOrTails{
    public static String sideup;
    private static void tossing(){
	int n = 0;
	Random rand = new Random();
        n = rand.nextInt(2);	
	if(n ==0){
	    sideup = "Heads";
	}else{
	    sideup = "Tails";
	}	
    }
    public static String getSideup(){
	System.out.println(sideup);
	return sideup;
    }


    public static void main(String[] args){
	int h = 0;
	int t = 0;

	System.out.println("Tossing a coin...");
    
	for(int i = 1; i <= 3; i ++){
	    tossing();
	    System.out.print("Round" + i+ ":");
	    if(getSideup().equals("Heads")){
		h ++;
	    }else{
		t++;
	    }
	}
	System.out.println("Heads: " + h+", Tails: " + t);


    }
}
