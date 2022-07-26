
//2. 정보 수정@@@@@@@

package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Edit {
public static void main() {
	
	
	Scanner sc = new Scanner(System.in);
    File f = new File("C:\\Users\\짱구맘\\Desktop\\승권 자바\\workspace\\movie.txt");
    
    FileReader fr= null;
    BufferedReader br= null;
    
    FileWriter fw= null;
    BufferedWriter bw= null;
    boolean check3 = true;
    
        
    String[] arr = new String[100];
    String[][] arr2= new String[100][6];
       
    try {
       
       fr= new FileReader(f);
       br= new BufferedReader(fr);
        
       
         
         for(int i=0; i<100; i++){
            arr = br.readLine().split("\t");
                for(int j=0; j<6; j++){
                arr2[i][j]=arr[j];	
                }
        }
     
       		     
    }catch(FileNotFoundException e) {
       System.out.println("오류발생");
    }catch (IOException e) {
       // 
       System.out.println("오류발생");
       
    
    }finally {
       
       try {
          if( br!= null) br.close();
          if( fr!= null) fr.close();
       } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
       }
    }
	
    //-------------------------------------------
    //정보수정 시작@@@@
    
    
    int prevNum =0;
    
    boolean check =true;
    boolean check2 =true;
    
    while(check) {
    	
    	
    	
    	System.out.println("정보를 변경할 영화제목을 입력하세요");
        String movieTitle = sc.nextLine();
        
    	for(int i=0; i<100; i++) {
			if(arr2[i][1].equals(movieTitle)) {
				prevNum = i+1; //이전 순위값
				check = false;
				check2 = false;
				break;
			}
    	}
			if (check2==true) {
	        	 System.out.println("영화를 찾을 수 없습니다 다시 입력해주십시요");
	        	
	        	
	        	 
			}
    	}
    
    boolean coin =true;
	while(coin) {
	System.out.println("변경할 정보를 선택해주세요");
	System.out.println("1. 순위");
	System.out.println("2. 제목");
	System.out.println("3. 개봉일");
	System.out.println("4. 매출액");
	System.out.println("5. 관객수");
	System.out.println("6. 상영관수");
	int category = sc.nextInt();
	
	if(category == 1) {
		System.out.println("변경할 순위를 입력하세요");
		String newRank = sc.next();
		
		if(newRank.equals(""+(prevNum+1))) {
			System.out.println("변경전 순위와 같습니다");
			continue;
		}
		
		 
	       try {
	      fw=new FileWriter(f);
	      bw=new BufferedWriter(fw);
	      int nr = Integer.parseInt(newRank);
	      
	      if(nr < prevNum) {
	    	  
	    	  for(int i=0; i<nr-1; i++) {
	    		 bw.write(arr2[i][0]+"\t"+arr2[i][1]+"\t"+arr2[i][2]+"\t"+arr2[i][3]+"\t"+arr2[i][4]+"\t"+arr2[i][5]+"\n");  
	    	  }
	    	 
	    	 
	    	  bw.write(arr2[nr-1][0]+"\t"+arr2[prevNum-1][1]+"\t"+arr2[prevNum-1][2]+"\t"+
	    		 arr2[prevNum-1][3]+"\t"+arr2[prevNum-1][4]+"\t"+arr2[prevNum-1][5]+"\n");
	    	  
	    	   if((prevNum)-nr != 1) {
	    		  for(int i=nr; i<prevNum; i++ ) {
	    	  bw.write(arr2[i][0]+"\t"+arr2[i-1][1]+"\t"+arr2[i-1][2]+"\t"+arr2[i-1][3]+"\t"+arr2[i-1][4]+"\t"+arr2[i-1][5]+"\n");  
	    		  }
	    	   }
//	    	  bw.write( arr2[prevNum-1][0]+"\t"+arr2[prevNum-1][1]+"\t"+arr2[prevNum-1][2]+"\t"+
//	 	    		 arr2[prevNum-1][3]+"\t"+arr2[prevNum-1][4]+"\t"+arr2[prevNum-1][5]+"\n");
	    	  
	    	  for(int i=prevNum; i<100; i++) {
	    		  bw.write(arr2[i][0]+"\t"+arr2[i][1]+"\t"+arr2[i][2]+"\t"+arr2[i][3]+"\t"+arr2[i][4]+"\t"+arr2[i][5]+"\n");
	    	  }	
	    	 //------------------------------------------- 
	      }else if(nr > prevNum) {
	    	  					
	    	  if(prevNum != 1) {
	    		  for(int i=0; i<prevNum-1; i++) {
	    		 bw.write(arr2[i][0]+"\t"+arr2[i][1]+"\t"+arr2[i][2]+"\t"+arr2[i][3]+"\t"+arr2[i][4]+"\t"+arr2[i][5]+"\n");  
	    		  }
	    	  }else {
	    		  for(int i=0; i<6;i++)
	    		  bw.write(arr2[0][0]+"\t"+arr2[0][1]+"\t"+arr2[0][2]+"\t"+arr2[0][3]+"\t"+arr2[0][4]+"\t"+arr2[0][5]+"\n");
	    		  
	    	  }    	  
	    	   if(nr-prevNum != 1) {
	    		  for(int i=prevNum; i<nr; i++ ) {
	    	  bw.write(arr2[i-1][0]+"\t"+arr2[i][1]+"\t"+arr2[i][2]+"\t"+arr2[i][3]+"\t"+arr2[i][4]+"\t"+arr2[i][5]+"\n");  
	    		  }
	    	   }
	    	   
	    	   bw.write(arr2[nr-1][0]+"\t"+arr2[prevNum-1][1]+"\t"+arr2[prevNum-1][2]+"\t"+
	  	    		 arr2[prevNum-1][3]+"\t"+arr2[prevNum-1][4]+"\t"+arr2[prevNum-1][5]+"\n");
	    	  
	    	  for(int i=nr; i<100; i++) {
	    		  bw.write(arr2[i][0]+"\t"+arr2[i][1]+"\t"+arr2[i][2]+"\t"+arr2[i][3]+"\t"+arr2[i][4]+"\t"+arr2[i][5]+"\n");
	    	  }	
	    	  
	      }  
	   
  
	      }catch(IOException e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if (bw!=null) bw.close();
	            if (fw!=null) fw.close();
	         } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }     
	            
	      check3= false;      
	}
	while(check3) {
	if( category ==2) {
		System.out.println("변경할 제목을 입력하세요");
		String title = sc.next();
		arr2[prevNum-1][1]= title; 
	}else if( category ==3) {
		System.out.println("변경할 개봉일을 입력하세요(2022-01-01 형식)");
		String date = sc.next();
		arr2[prevNum-1][2]= date;
	}else if( category ==4) {
		System.out.println("변경할 매출액을 입력하세요");
		String money = sc.next();
		arr2[prevNum-1][3]= money;
	}else if( category ==5) {
		System.out.println("변경할 관객수를 입력하세요");
		String people = sc.next();
		arr2[prevNum-1][4]= people;
	}else if( category ==6) {
		System.out.println("변경할 상영관수를 입력하세요");
		String theater = sc.next();
		arr2[prevNum-1][5]= theater;
		
	}else {
		System.out.println("잘못 선택하셨습니다");
		continue;
	}
	
	 try {
		    
	      fw=new FileWriter(f);
	      bw=new BufferedWriter(fw);
	      
	      for(int i=0; i<100; i++) {
	    	  bw.write(arr2[i][0]+"\t"+arr2[i][1]+"\t"+arr2[i][2]+"\t"+arr2[i][3]+"\t"+arr2[i][4]+"\t"+arr2[i][5]+"\n");
	    	  
	      }	  
	    	
	     
	      }catch(IOException e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if (bw!=null) bw.close();
	            if (fw!=null) fw.close();
	         } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	
	
	
	
	
	 check3=false;
	coin=false;
	}
	}



	

}
}
