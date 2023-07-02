import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;



public class WheelOfFortune {
	
	public static Stack SortS1(Stack S1) {
		
		int size1 = S1.size();// country say�s� kadar d�ng� kurmak i�in
		int size2 = S1.size()+1;// her d�ng�de en k���k olan pop edilip size1 in  bir azalt�lm�� hali
		Stack tempstack1 = new Stack(size1);// her d�ng�de alfabetik olarak en k���k eleman  hari� temstack1 in i�ine at�l�r
		Stack tempstack2 = new Stack(size1);//alfabetik s�ral� olarak s�rayla tempstack2 nin  i�ine at�l�r
		String minWord = S1.peek().toString();// en k���k eleman minWord e e�itlenir.
		
		
		for(int i=0;i<size1;i++) {
		size2--;
		for (int j=0;j<size2;j++) {
			if(minWord.compareTo(S1.peek().toString())>0) {
				minWord=S1.peek().toString();
				tempstack1.push(S1.pop());
			}
			else{
				tempstack1.push(S1.pop());
			}
		}
		tempstack2.push(minWord);
		while (! (tempstack1.isEmpty()))//alfabetik s�ralamadaki kelime tekrar S1 e push edilmez
		{   if(tempstack1.peek().toString().equalsIgnoreCase(minWord)) {
			tempstack1.pop();
		}
		    else
			S1.push(tempstack1.pop());
		}
           
           //d�ng�deki en k���k eleman� bulabilmek i�in
           minWord="zzzzz";
		}
		
		while (! (S1.isEmpty())) {
			S1.pop();
		}
		while (! (tempstack2.isEmpty()))
			tempstack1.push(tempstack2.pop());
		
		while (! (tempstack1.isEmpty()))
			S1.push(tempstack1.pop());
		
		return S1;
	}
	
	public static Stack StackWheel(Stack StackWheela) {
		StackWheela.push(10);
		StackWheela.push(50);
		StackWheela.push(100);
		StackWheela.push(250);
		StackWheela.push(500);
		StackWheela.push(1000);
		StackWheela.push("Double Money");
		StackWheela.push("Bankrupt");
		return StackWheela;
		
		
	}
	
	public static String StackWheel2(Stack StackWheelb) {
		StackWheelb=StackWheel(StackWheelb) ;
		
		Random randoma=new Random();
        int sizeSW=StackWheelb.size();
        String wheelRandom=" ";
        Stack tempstackForRandomSW = new Stack(sizeSW);
        int randomlyNumbera=randoma.nextInt(1,sizeSW+1);
        
        
        for(int i=0;i<sizeSW;i++) {
          if(StackWheelb.size()==randomlyNumbera) {
        	  wheelRandom =StackWheelb.peek().toString();
        	tempstackForRandomSW.push(StackWheelb.pop());
        	
          } 
          else {
        	tempstackForRandomSW.push(StackWheelb.pop());
        	
          }}
     
        
        while (! (tempstackForRandomSW.isEmpty())) {
        	tempstackForRandomSW.pop();
		}
		return wheelRandom;
	}
	
	public static Stack alphabeticS2(Stack S2) {
		
		S2.push("A");
        S2.push("B");
        S2.push("C");
        S2.push("D");
        S2.push("E");
        S2.push("F");
        S2.push("G");
        S2.push("H");
        S2.push("I");
        S2.push("J");
        S2.push("K");
        S2.push("L");
        S2.push("M");
        S2.push("N");
        S2.push("O");
        S2.push("P");
        S2.push("Q");
        S2.push("R");
        S2.push("S");
        S2.push("T");
        S2.push("U");
        S2.push("V");
        S2.push("W");
        S2.push("X");
        S2.push("Y");
        S2.push("Z");
		
		return S2;
	}
	
public static Stack SortS4( Stack S4 ) {
		
	
	   boolean flagS4;//score lar e�it olunca sadece bir tanesini pop etmek i�in
		int size1 = S4.size();//ki�i-score say�s� kadar d�ng� kurmak i�in
		int size2 = S4.size()+1;// her d�ng�de max olan pop edildi�inden  1 azalacak
		Stack tempstack1 = new Stack(size1);// her d�ng�de max score hari� temstack1 in i�ine at�l�r
		Stack tempstack2 = new Stack(size1);//b�y�kten k����e tempstack2 nin  i�ine at�l�r
		int maxScore = (int)S4.peek();// en b�y�k score maxScore a e�itlenir e�itlenir.
		
		
		for(int i=0;i<size1;i++) {
	    flagS4=false;	
		size2--;
		for (int j=0;j<size2;j++) {
			if(maxScore <= (int)S4.peek()) {
				maxScore=(int)S4.peek();
				tempstack1.push(S4.pop());
			}
			
			else{
				tempstack1.push(S4.pop());
			}
		}
		tempstack2.push(maxScore);
		while (! (tempstack1.isEmpty()))//maxScore tekrar S4 e push edilmez 
		{   if((int)tempstack1.peek()==maxScore && flagS4==false) {
			tempstack1.pop();
			flagS4=true;
		}
		    else
			S4.push(tempstack1.pop());
		}
           
           //d�ng�deki en b�y�k score u bulabilmek i�in
		  maxScore =-1;
		}
		
		while (! (S4.isEmpty())) {
			S4.pop();
		}
		while (! (tempstack2.isEmpty()))
			tempstack1.push(tempstack2.pop());
		
		while (! (tempstack1.isEmpty()))
			S4.push(tempstack1.pop());
	
		return S4;
	}

public static Stack SortS3( Stack S4,Stack S3 ) {
	
	
	    boolean flagS3;//score lar e�it olunca sadece bir tanesini pop etmek i�in
		int size1 = S4.size();// ki�i-Score  kadar d�ng� kurmak i�in
		int size2 = S4.size()+1;// her d�ng�de max olan  pop edilip size 1 azalacak
		Stack tempstack1S4 = new Stack(size1);// her d�ng�de max score hari� temstack1 in i�ine at�l�r
		Stack tempstack2S4 = new Stack(size1);//score b�y�kten k����e s�rayla tempstack2 nin  i�ine at�l�r
		Stack tempstack1S3 = new Stack(size1);// her d�ng�de max score lu ki�i  hari� temstack1 in i�ine at�l�r
		Stack tempstack2S3 = new Stack(size1);//score u �ok olandan az olana s�rayla tempstack2 nin  i�ine at�l�r
		int maxScore = (int)S4.peek();// stack teki en b�y�k puan  maxScore a e�itlenir.
		String bestContestant = S3.peek().toString();// stack teki maxScore u  olan ki�i bestContestant a e�itlenir.
		
		
		for(int i=0;i<size1;i++) {
		size2--;
		flagS3=false;
		for (int j=0;j<size2;j++) { 
			
			if(maxScore <= (int)S4.peek()) {
				maxScore=(int)S4.peek();
				bestContestant = S3.peek().toString();
				tempstack1S4.push(S4.pop());
				tempstack1S3.push(S3.pop());
			}
			
			else{
				tempstack1S4.push(S4.pop());
				tempstack1S3.push(S3.pop());
			}
		}
		 tempstack2S4.push(maxScore);
		 tempstack2S3.push(bestContestant );
		while (! (tempstack1S4.isEmpty()))
		{   if((int)tempstack1S4.peek()==maxScore && flagS3==false) {
			tempstack1S4.pop();//maxScore silindi tekrar push edilmedi
			tempstack1S3.pop();// bestContestant silindi tekrar push edilmedi
			flagS3=true;
		}
		    else {
			S4.push(tempstack1S4.pop());
			S3.push(tempstack1S3.pop());
			}
		}
           
           //d�ng�deki max score u bulabilmek i�in
		  maxScore =-1;
		}
		
		while (! (S3.isEmpty())) {
		
			S3.pop();
			S4.pop();
		}
		while (! (tempstack2S3.isEmpty())) {
			tempstack1S3.push(tempstack2S3.pop());
		tempstack1S4.push(tempstack2S4.pop());
		}
		while (! (tempstack1S3.isEmpty())) {
			S3.push(tempstack1S3.pop());
			S4.push(tempstack1S4.pop());
		}
	
		return S3;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//oyuncu ad�n� girer
        Scanner sc =new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name=sc.nextLine();
        System.out.print("\n");
        
        Stack S1,S2,S3,S4,StackWheel;
        StackWheel = new Stack(8);
        S2 = new Stack(26);
        //letters added
        S2= alphabeticS2(S2);
        
        
        File countryFile = new File("countries.txt");
        Scanner countryLineReader = new Scanner(countryFile);
        int countriesAmount = 0;
        while (countryLineReader.hasNextLine()) {
        	countriesAmount++;
        	countryLineReader.nextLine();
        }
        countryLineReader.close();
        S1 = new Stack(countriesAmount);

        Scanner countryReader = new Scanner(countryFile);
        while (countryReader.hasNextLine()) {
        	S1.push(countryReader.nextLine());
        }
        countryReader.close();
        //S1 alfabetik olarak sortland�
        S1= SortS1( S1);
        
        //sorulan rastgele �lke
        Random random=new Random();
        int sizeS1=S1.size();
        String word=" ";
        Stack tempstackForRandom = new Stack(sizeS1);
        int randomlyNumber=random.nextInt(1,sizeS1+1);//ekrana yaz�lacak
        System.out.println("Randomly generated number: "+randomlyNumber);
        while(word==" ") {
          if(S1.size()==randomlyNumber) {
        	word =S1.peek().toString();
        	tempstackForRandom.push(S1.pop());
          } 
          else {
        	tempstackForRandom.push(S1.pop());
          }
        }
        
        //s1 eski haline d�nd�
        while (! (tempstackForRandom.isEmpty()))
			S1.push(tempstackForRandom.pop());
        
        
        
        CircularQueue Q1,Q2;
        Q1 = new CircularQueue(word.length());
        Q2 = new CircularQueue(word.length());
        for(int i=0;i<word.length();i++) {
        	Q1.Enqueue(word.substring(i,i+1));
        }
        for(int i=0;i<word.length();i++) {
        	Q2.Enqueue("-");
        }
        
        
        int lastloop=0;
        int counterCorrectLetter= 0;
        int step=0;
        int score=0;
        while(counterCorrectLetter  < word.length( ) || lastloop < 2)
        {
        	step++;
        int counter=0;
        Random rand=new Random();
        String randomLetter=" #";
        int sizeS2= S2.size();
        Stack tempstackS2 = new Stack(sizeS2);
        System.out.print("Word: ");
        for(int i = 0; i < Q2.size(); i++) {
			System.out.print(Q2.Peek());
			Q2.Enqueue(Q2.Dequeue());
		}
        System.out.print("             ");
        System.out.print("Step: "+step+"   ");
        System.out.print("Score: "+score+"  ");
        
      //Ekrana alfabeyi okuma
        while (! (S2.isEmpty())) {
			tempstackS2.push(S2.pop());
		}
		while (! (tempstackS2.isEmpty())) {
			System.out.print(tempstackS2.peek());//alfabenin yazd�r�lmas�
			S2.push(tempstackS2.pop());
		}
		
       //do�ru �lkeyi tam yazd�ran son yaz�m i�in
		if(counterCorrectLetter==word.length() || lastloop==1 ) {
	    	 lastloop++;
	    	 break;
	     }
		
		
		String wheel=StackWheel2( StackWheel);
        
		//random letter
		// bankrupt durumu guess gerektirmez
        if(!(wheel.equalsIgnoreCase("Bankrupt"))) {
		int randomLetterNumber = rand.nextInt(1,sizeS2+1);
        for(int i=0;i<sizeS2;i++) {
        	if(S2.size() == randomLetterNumber) {
        		randomLetter = S2.pop().toString();//randomletter yani guess alfabe i�ine, push edilmez
        	}
        	else {
        		tempstackS2.push(S2.pop());
        	}
        }
        
        while (! (tempstackS2.isEmpty())) {
			S2.push(tempstackS2.pop());
		}
        
       
       
       }
        else {
        	randomLetter=" ";
        }
        for(int i=0;i<word.length();i++) {
        	if(Q1.Peek().toString().equalsIgnoreCase(randomLetter)) {
        	     Q1.Enqueue(Q1.Dequeue());
        	     Q2.Dequeue();
        	     Q2.Enqueue(randomLetter);
        	     counterCorrectLetter++;
        	     counter++;
        	}
        	else {
        		 Q1.Enqueue(Q1.Dequeue());
        	     Q2.Enqueue(Q2.Dequeue());
        	}
        }
        
        System.out.print("\nWheel: "+ wheel);
        System.out.println("\nGuess: "+ randomLetter);
       
        if(wheel.equalsIgnoreCase("Double Money")) {
        	if(counter!=0) {
        	score=score*2;}
        	
        }
        else if(wheel.equalsIgnoreCase("Bankrupt")) {
        	score=0;
        }
        else {
        	score+=Integer.parseInt(wheel)*counter;
        }
       
        }
        System.out.println("\nYou win $"+score+"!!!");
        
        FileWriter fileWriter = new FileWriter("HighScoreTable.txt" , true);
        fileWriter.write("\n"+name+" "+String.valueOf(score));
        fileWriter.close();
        
        File highScoreTableFile = new File("HighScoreTable.txt");
        Scanner contestantLineReader = new Scanner(highScoreTableFile);     
        int contestantAmount = 0;
        while (contestantLineReader.hasNextLine()) {
        	contestantAmount++;
        	contestantLineReader.nextLine();
        }
        
        contestantLineReader.close();
        
        S3 = new Stack(contestantAmount);
        S4 = new Stack(contestantAmount);

        Scanner contestantReader = new Scanner(highScoreTableFile);
        while (contestantReader.hasNextLine()) {
        	String[] line = contestantReader.nextLine().split(" ");
        	S3.push(line[0]);
        	S4.push(Integer.parseInt(line[1]));
        }
        contestantReader.close();
         
      
        //sortlanm�� S3 ve S4
         System.out.println("\nHigh Score Table");
        S3= SortS3( S4 , S3 );
        S4= SortS4( S4);
    //high score table yazd�rma   
    Stack tempstack4S4 = new Stack(S4.size());
    Stack tempstack3S3 = new Stack(S3.size());
		
		
		while (! (S4.isEmpty())) {
			tempstack4S4.push(S4.pop());
			tempstack3S3.push(S3.pop());
		}
		while (! (tempstack4S4.isEmpty())) {
			System.out.println(tempstack3S3.peek()+"   "+tempstack4S4.peek());
			S4.push(tempstack4S4.pop());
			S3.push(tempstack3S3.pop());
		}
        
		
		 } catch (FileNotFoundException e) {
	        	System.out.println("  File not found! Try again.");
	        }
		
         catch (IOException e) {

      e.printStackTrace();

    }
		   
        
	}

}

