package com.sgtesting.testscripts;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance_Scenario2 {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {

		launchbrowser();
		navigate();
		login();
		popupwindow();
		creatuser123();
		logout();
		loginasusername1();
		logoutuser1();
		loginasusername2(); 
		logoutuser2(); 
		loginasusername3(); 
		logoutuser3(); 
		login();
		modifyuser123(); 
		logout(); 
		user1loginwithnewpassword(); 
		logout();
		user2loginwithnewpassword(); 
		logout(); 
		user3loginwithnewpassword();
		logout(); 
		login(); 
		deleteuser1(); 
		deleteuser2(); 
		deleteuser3();
		logout();
		closeapplication();
	}
	static void launchbrowser()
	{
		String path = null;
		try
		{
			path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\library\\driver\\chromedriver.exe");
			oBrowser= new ChromeDriver();
			Thread.sleep(2000);
			oBrowser.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/user/submit_tt.do");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void popupwindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void creatuser123()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			//Creation of User 1
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);

			//Creation of User 2
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);

			//Creation of User 3
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasusername1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasusername2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasusername3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyuser123()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);

			//Modifying User 1 Password
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

			//Modifying User 2 Password
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

			//Modifying User 3 Password
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void user1loginwithnewpassword()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user2loginwithnewpassword()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user3loginwithnewpassword()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			//Delete User 1
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			//Delete User 2
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert(); 
			String content=oAlert.getText();
			System.out.println(content); oAlert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			//Delete User 1
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert(); 
			String content=oAlert.getText();
			System.out.println(content); 
			oAlert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeapplication()
	{
		try
		{
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}