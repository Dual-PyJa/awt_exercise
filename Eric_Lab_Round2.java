
// Lab:以floor( )產生四捨五入到小數第2位

import java.io.*;  // 用於BufferedReader類別載入

public class Eric_Lab_Round2
{
	public static void main(String[] args) throws IOException  // throws IOException 跳過IO的例外處理??
	{
	   
 	   BufferedReader keyin;  // BufferedReader 是可以讀取鍵盤輸入
	   keyin = new BufferedReader(
			         new InputStreamReader(System.in));  // 建構BufferedReader的新物件
	   
	   
	   // Console keyin = System.console();
	   
	   
	   Boolean check = true;  // 設定迴圈判斷變數
	   while(check)  // 利用回圈多次輸入
	   {		         
	   		System.out.print("請輸入數值: ");
       		String sNum = keyin.readLine();  // 建立sNum，讀出鍵盤輸入值，型態為字串
	   		double iNum = Double.parseDouble(sNum);  // Double 的類別方法 parseDouble 將字串轉為 double
	   		if(iNum > 1000000) // 判斷程式終止的輸入值，預設大於1000000則程式終止
	   		{
	   			check = false; // 變更判斷變數
	   			System.out.println("程式結束"); //提示句
	   			break; // 跳出迴圈
	   		}
       		iNum = Math.floor((iNum * 100) + 0.5) / 100;  // 關鍵運算，利用類別方法floor作四捨五入至小數第二位
	   
	   		System.out.println("結果:" + iNum); // 印出結果
	   }
    
    }
}
