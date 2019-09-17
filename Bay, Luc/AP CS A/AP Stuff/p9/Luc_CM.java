package p9;

public class Luc_CM implements CharacterMaker
{
	char[] supported = {'L', 'u', 'c', 'B', '!', ' ', 'A', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X'};
	
	String L = " _        | |       | |       | |       | |___    |_____|   ";
	String u = "                     _   _    | | | |   | |_| |   \\___,_|   ";
	String c = "                      ____     /  __|   |  (__     \\____|   ";
	String B = " ____     |  _ \\    | |_) |   |  _ <    | |_| |   \\____/    ";
	String ex = " _        | |       | |       | |       |_|       (_)       ";
	String sp = "                                                            ";
	String A = "              /\\       /  \\     / /\\ \\   / ____ \\ /_/    \\_\\";
	String C = "  _____    / ____|  | |       | |       | |____    \\_____|  ";
	String D = " _____    |  __ \\   | |  | |  | |  | |  | |__| |  |_____/   ";
	String E = " ______   |  ____|  | |__     |  __|    | |____   |______|  ";
	String F = " ______   |  ____|  | |__     |  __|    | |       |_|       ";
	String G = "  _____    / ____|  | |  __   | | |_ |  | |__| |   \\_____|  ";
	String H = " _    _   | |  | |  | |__| |  |  __  |  | |  | |  |_|  |_|  ";
	String I = " _____    |_   _|     | |       | |      _| |_    |_____|   ";
	String J = "      _        | |       | |   _   | |  | |__| |   \\____/   ";
	String K = " _  __    | |/ /    | ' /     |  <      | . \\     |_|\\_\\    ";
	String M = " __  __   |  \\/  |  | \\  / |  | |\\/| |  | |  | |  |_|  |_|  ";
	String N = " _   _    | \\ | |   |  \\| |   | . ` |   | |\\  |   |_| \\_|   ";
	String O = "  ____     / __ \\   | |  | |  | |  | |  | |__| |   \\____/   ";
	String P = " _____    |  __ \\   | |__) |  |  ___/   | |       |_|       ";
	String Q = "  ____     / __ \\   | |  | |  | |  | |  | |__| |   \\___\\_\\  ";
	String R = " _____    |  __ \\   | |__) |  |  _  /   | | \\ \\   |_|  \\_\\  ";
	String S = "  _____    / ____|  | (___     \\___ \\    ____) |  |_____/   ";
	String T = " _______  |__   __|    | |       | |       | |       |_|     ";
	String U = " _    _   | |  | |  | |  | |  | |  | |  | |__| |   \\____/   ";
	String V = "__      __\\ \\    / / \\ \\  / /   \\ \\/ /     \\  /       \\/    ";
	String W = " _    _   | |  | |  | |  | |  | |/\\| |  \\  /\\  /   \\/  \\/   ";
	String X = " __   __    \\ \\ / /   \\ V /     > <     / . \\    /_/ \\_\\    ";
	

	public char[][] characterToAscii(char character)          
	{
		if(characterSupported(character))
		{
			char[][] alet = new char[6][10];
			int strct = 0;
			String str = "";
		
			switch(character)
			{
				case 'L' : str = L; break;
				case 'u' : str = u; break;
				case 'c' : str = c; break;
				case 'B' : str = B; break;
				case '!' : str = ex; break;
				case ' ' : str = sp; break;
				case 'A' : str = A; break;
				case 'C' : str = C; break;
				case 'D' : str = D; break;
				case 'E' : str = E; break;
				case 'F' : str = F; break;
				case 'G' : str = G; break;
				case 'H' : str = H; break;
				case 'I' : str = I; break;
				case 'J' : str = J; break;
				case 'K' : str = K; break;
				case 'M' : str = M; break;
				case 'N' : str = N; break;
				case 'O' : str = O; break;
				case 'P' : str = P; break;
				case 'Q' : str = Q; break;
				case 'R' : str = R; break;
				case 'S' : str = S; break;
				case 'T' : str = T; break;
				case 'U' : str = U; break;
				case 'V' : str = V; break;
				case 'W' : str = W; break;
				case 'X' : str = X; break;
				default  : str = sp; break;
			}
		
			for(int row=0; row<alet.length; row++)
				for(int col=0; col<alet[0].length; col++, strct++)
					alet[row][col] = str.charAt(strct);
		
			return alet;
		}
		
		return null;
	}
	
	public boolean characterSupported(char character)
	{
		for(int i=0; i<supported.length; i++)
			if(character == supported[i])
				return true;
		
		return false;
	}
	
	public char[] supportedCharacters()
	{
		return supported;
	}
	
	public void print(char character)
	{
		char[][] let = characterToAscii(character);
		
		for(int row=0; row<let.length; row++)
		{
			for(int col=0; col<let[0].length; col++)
				System.out.print(let[row][col]);
			System.out.println();
		}
	}
	
	public void print(String string)
	{
		char[][] let = stringToAscii(string);
		
		for(int row=0; row<let.length; row++)
		{
			for(int col=0; col<let[0].length; col++)
				System.out.print(let[row][col]);
			System.out.println();
		}
	}
	
	public char[][] stringToAscii(String string)
	{
		char[][]  astr = new char[6][string.length()*10];
		
		for(int index = 0; index < string.length(); index++)
		{
			char[][] temp = characterToAscii(string.charAt(index));
		
			for(int row = 0; row<temp.length; row++)
				for(int col = 0; col < temp[0].length; col++)
					astr[row][col+(index*10)] = temp[row][col];
		}
		
		return astr;
	}
}

/*
 _        
| |       
| |       
| |       
| |___    
|_____|   



 _   _    
| | | |   
| |_| |
|___,_|



  ____    
 /  __|   
|  (__    
|_____|  

 ____     
|  _ \    
| |_) |   
|  _ <    
| |_| |   
|____/    

 _        
| |       
| |       
| |       
|_|       
(_)       

          
    /\    
   /  \   
  / /\ \  
 / ____ \ 
/_/    \_\
  
  _____   
 / ____|  
| |       
| |       
| |____   
 \_____|  
         
 _____    
|  __ \   
| |  | |  
| |  | |  
| |__| |  
|_____/   
         
  ______   
 |  ____|  
 | |__     
 |  __|    
 | |____   
 |______|  
         
  ______   
 |  ____|  
 | |__     
 |  __|    
 | |       
 |_|       
         
   _____    
  / ____|  
 | |  __   
 | | |_ |  
 | |__| |   
  \_____|  
           
  _    _   
 | |  | |  
 | |__| |  
 |  __  |  
 | |  | |  
 |_|  |_|  
         
  _____   
 |_   _|  
   | |   
   | |   
  _| |_  
 |_____|  

      _   
     | |   
     | |  
 _   | |  
| |__| |  
 \____/   
         
 _  __    
| |/ /    
| ' /     
|  <      
| . \     
|_|\_\    
       
 __  __   
|  \/  |  
| \  / |  
| |\/| |  
| |  | |  
|_|  |_|  
         
 _   _   
| \ | |  
|  \| |  
| . ` |  
| |\  |  
|_| \_|  
        
  ____   
 / __ \   
| |  | |  
| |  | |  
| |__| |  
 \____/  
  
 _____    
|  __ \   
| |__) |  
|  ___/   
| |       
|_|       
         
  ____    
 / __ \   
| |  | |  
| |  | |  
| |__| |  
 \___\_\  
         
  _____    
 |  __ \   
 | |__) |  
 |  _  /   
 | | \ \   
 |_|  \_\  
         
  _____   
 / ____|  
| (___    
 \___ \   
 ____) |  
|_____/   
         
 _______   
|__   __|  
   | |     
   | |     
   | |     
   |_|     
          
  _    _  
 | |  | | 
 | |  | | 
 | |  | | 
 | |__| |  
  \____/  
         
__      __
\ \    / /
 \ \  / / 
  \ \/ /  
   \  /   
    \/    
           
  _    _   
 | |  | |  
 | |  | |  
 | |/\| |  
 \  /\  /   
  \/  \/   
        
__   __  \ \ / /   \ V /     > <     / . \   /_/ \_\  
        
            
*/
