import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {	
    try{	
			File f = new File("Movies.txt");
			f.createNewFile();	
			Scanner scan = new Scanner(f);
			ArrayList<Movies> movielist = new ArrayList<Movies>(); 
			
			while(scan.hasNextLine())
            {
            	movielist.add(new Movies(scan.next(), scan.next(), scan.next(), scan.next(), scan.nextInt()));   
            }
			
		Scanner sc = new Scanner(System.in); 
		Menu.startMsg(); 
		do
		{
			Menu.enterUsername();
		}while(!sc.nextLine().equals("Liam"));
		
		Menu.enterPassword(); 

		while (!sc.nextLine().equals("1234"))
    	{
			Menu.pwWrong();
		}


	PrintStream file = new PrintStream(f);
	boolean menuloop = true;
		do{     
		

		Menu.mainMenu();
		
		int in = 0; 
		in = Integer.parseInt(sc.next());
		
			switch (in) 
			{
				case 1:
			
			Menu.movieOptions();
			
			String inputChoice = System.console().readLine();  

				//--------------------------------- create movie------------------------------------------------------------------------------------------------------------------------
			if(inputChoice.equalsIgnoreCase("c"))
				{

					Scanner input = new Scanner(System.in);
					System.out.println("type the name of the movie");
					String inputTitle = input.next();
					
					System.out.println("type the name of the actor1 in the movie");
					String inputActor1 = input.next();
					 
					System.out.println("type the name of the actor2 in the movie");
					String inputActor2 = input.next();
					
					System.out.println("type the name of the actor3 in the movie");
					String inputActor3 = input.next();
				
					System.out.println("type the  movie year");
					int inputYear = input.nextInt();
				    
					
					
					movielist.add(new Movies(inputTitle, inputActor1, inputActor2, inputActor3, inputYear));
				
				}else if(inputChoice.equalsIgnoreCase("s")){

				//----------------------------- search --------------------------------------------------------------------------------------------------------------------------
					Scanner inputSearch = new Scanner(System.in);
					System.out.print("what do you want to search for? ");
					String result = inputSearch.nextLine();

					for(int i = 0; i < movielist.size(); i++)
					{
					
						if(movielist.get(i).toString().contains(result))
						{
							System.out.println(i + " " + movielist.get(i));
						} 
					}
				// ----------------------------------search over ------------------------------------------------------------------------------------------------------------------
					break;
				}else if(inputChoice.equalsIgnoreCase("d")){
					Scanner inputDelete = new Scanner(System.in);
					for(int i = 0; i < movielist.size(); i++)
					{
							System.out.println(i + " " + movielist.get(i));  
					}
					System.out.println("enter the fist index of the movie you want deleted");
					int deleteNumb = inputDelete.nextInt();
					movielist.remove(deleteNumb);			
					System.out.println("--------------------------------movie deleted.. -----------------------------------------------------");
					
				}else if(inputChoice.equalsIgnoreCase("b")){
					break;
				}else if(inputChoice.equalsIgnoreCase("w")){


						Scanner inputMovieChoice = new Scanner(System.in);
						for(int i = 0; i < movielist.size(); i++)
							{
								System.out.println(i + movielist.get(i).getMovieTitle()); 
								
							}	
							
				}else{

				}

				break; 
				case 2:
						System.out.println("Favourites");
				break;
				case 3:
						System.out.println("---------------------------History------------------------------------");
						System.out.println("Movies watched in the past:");

				break;

				case 4:
						System.out.println("statistics");
				break;

				case 5:
						for(int i = 0; i < movielist.size(); i++)
					{
						
						file.print(movielist.get(i).getMovieTitle() + " " + movielist.get(i).getMovieActor() + " " + movielist.get(i).getMovieYear());
						
						if(i != movielist.size() -1)
						{
							file.println();
						}
						
					}
						System.out.println("---------------bye------------------");
						System.exit(0);
				break;

				default:
					
				break;
				}

			


		}while(menuloop==true);

 


	//sc.close();	
	} catch(Exception e)
        {
            System.out.println(e);
        }

		}
	}
