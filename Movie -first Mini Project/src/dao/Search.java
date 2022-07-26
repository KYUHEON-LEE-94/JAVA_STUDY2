package dao;


//3. 검색하기@@@@@@@@@@@@@@@


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Search {
   public static void main() {
      Scanner sc = new Scanner(System.in);
      
      
      File f = new File("C:\\Users\\짱구맘\\Desktop\\승권 자바\\workspace\\movie.txt");
      
      FileReader fr= null;
      BufferedReader br= null;
      

      
      try {
         
         fr= new FileReader(f);
         br= new BufferedReader(fr);
         
         

         
         
         String[] arr = new String[1000];
       String[][] arr2= new String[1000][6];
         
         for(int i=0; i<100; i++){
            arr = br.readLine().split("\t");
                for(int j=0; j<6; j++){
                arr2[i][j]=arr[j];	
                }
        }
         
        
         
         boolean check =true;
         boolean check2 =true;
         while(check) {
        	 System.out.println("검색할 영화제목을 입력하세요");
             String search = sc.nextLine();
        	 
             for(int i=0; i<100; i++) {
        		 if(arr2[i][1].equals(search)) {
        			
        			 System.out.println("순위 : " + arr2[i][0]+"위");
        			 System.out.println("제목 : " + arr2[i][1]);
        			 System.out.println("개봉일 : " + arr2[i][2]);
        			 System.out.println("매출액 : " + arr2[i][3]+"원");
        			 System.out.println("관객수 : " + arr2[i][4]+"명");
        			 System.out.println("상영관수 : " + arr2[i][5]+"개");
        			 check2 = false;
        			 break;
        			 }
        	 }
        	 
        	 if (check2==true) {
        	 System.out.println("영화를 찾을 수 없습니다 다시 입력해주십시요");
        	 }else {
        		 System.out.println("");
        		 
        		 check=false;
        	 }
         }//while
     
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
      
      
      
      
   }
   }

