public class Main
{
	public static void main(String[] args) {
		Random random=new Random();
		Dobit [] D=new Dobit[20];
		int izbor_kandidata;
		int statusi_izbor;
		for(int i=0;i<20;i++)
		{
		    izbor_kandidata=random.nextInt(3)+1;
		    statusi_izbor=random.nextInt(5);
		    switch(izbor_kandidata)
		    {
		        case 1:
		            {
		            D[i]=new Tanki(Dobit.statusi[statusi_izbor],"Klijent_"+(i+1));
		            break;
		            }
		        case 2:
		            {
		            D[i]=new Srednji(Dobit.statusi[statusi_izbor],"Klijent_"+(i+1));
		            break;
		            }
		        case 3:
		            {
		            D[i]=new Debeli(Dobit.statusi[statusi_izbor],"Klijent_"+(i+1));
		            break;
		            }
		    }
	}
	for(int j=0;j<20;j++)
	{
	    System.out.println(D[j]);
	    System.out.println("----------------------");
	    for(int z=0;z<20;z++)
	    {
	        int id=random.nextInt(2);
	        if(id==0)
	        {
	            System.out.println(D[z]);
	            System.out.println("Dekrament");
	            if(D[z] instanceof Tanki)
	            ((Tanki) D[z]).dekrement();
	            else if(D[z] instanceof Srednji)
	            ((Srednji) D[z]).dekrement();
	            else
	            ((Debeli) D[z]).dekrement();
	            System.out.println(D[z]);
	            System.out.println("----------------------");
	            
	        }
	        else
	        {
	            System.out.println(D[z]);
	            System.out.println("inkrement");
	            if(D[z] instanceof Tanki)
	            ((Tanki) D[z]).inkrement();
	            else if(D[z] instanceof Srednji)
	            ((Srednji) D[z]).inkrement();
	            else
	            ((Debeli) D[z]).inkrement();
	            System.out.println(D[z]);
	            System.out.println("----------------------");
	        }
	    }
	    
	}
}
}