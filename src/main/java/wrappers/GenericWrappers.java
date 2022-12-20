package wrappers;

import java.io.File;



import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporting;







public class GenericWrappers extends Reporting implements Wrappers {

	public  RemoteWebDriver driver;
	int i=1;
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver  = new ChromeDriver(); 
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver  = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
					 driver  = new InternetExplorerDriver();
			}
			
            driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			
			
			System.out.println("The browser "+browser+" is launched with the given URL "+url+" sucessfully");
			reportStep("The browser "+browser+" is launched with the given URL "+url+" sucessfully","pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error","fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error","fail");

		}
			
		}
		
public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
	try {
		driver.findElementById(idValue).sendKeys(data);
		
		reportStep("The element with id "+idValue+" is entered with data\"+data","pass");
		//System.out.println("The element with id "+idValue+" is entered with data"+data);
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		reportStep("The element with id "+idValue+" is not found in DOM","fail");
		//System.err.println("The element with id "+idValue+" is not found in DOM",");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		
		reportStep("The element with id "+idValue+" is not visible in the application","fail");
		//System.err.println("The element with id "+idValue+" is not visible in the application");

	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		
		reportStep("The element with id "+idValue+" is not interactable in the application","fail");
		//System.err.println("The element with id "+idValue+" is not interactable in the application");

	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		
		reportStep("The element with id "+idValue+" is not stable in the application","fail");
		//System.err.println("The element with id "+idValue+" is not stable in the application");

	}catch (WebDriverException e) {
		// TODO: handle exception
		
		reportStep("The element with id "+idValue+" is not launched due to unknown error","fail");
		//System.err.println("The element with id "+idValue+" is not launched due to unknown error");

	}
		
	}

	public void enterByName(String nameValue,String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			reportStep("The element with name "+nameValue+" is entered with data\"+data","pass");
			//System.out.println("The element with name "+nameValue+" is entered with data"+data);
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			reportStep("The element with name "+nameValue+" is not found in DOM","fail");
			//System.err.println("The element with name "+nameValue+" is not found in DOM");
			
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			
			     reportStep("The element with name "+nameValue+" is not visible in the application","fail");
				//System.err.println("The element with name "+nameValue+" is not visible in the application");

		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
			
			     reportStep("The element with name "+nameValue+" is not interactable in the application","fail");
				//System.err.println("The element with name "+nameValue+" is not interactable in the application");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			reportStep("The element with name "+nameValue+" is not stable in the application","fail");
				//System.err.println("The element with name "+nameValue+" is not stable in the application");
		}catch (WebDriverException e) {
				// TODO: handle exception
			
			  reportStep("The element with name "+nameValue+" is not launched due to unknown error","fail");
				//System.err.println("The element with name "+nameValue+" is not launched due to unknown error");
			}
			 
	}
	

	
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			
			reportStep("The element with xpath "+xpathValue+" is entered with data\"+data","pass");
			//System.out.println("The element with xpath "+xpathValue+" is entered with data"+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			 reportStep("The element with xpath "+xpathValue+" is not found in DOM","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			 reportStep("The element with xpath "+xpathValue+" is not visible in the application","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			 reportStep("The element with xpath "+xpathValue+" is not interactable in the application","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			 reportStep("The element with xpath "+xpathValue+" is not stable in the application","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			 reportStep("The element with xpath "+xpathValue+" is not launched due to unknown error","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not launched due to unknown error");

		}
		
	}
	
	public void enterByClass(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			reportStep("The element with xpath "+xpathValue+" is entered with data\"+data","pass");
			//System.out.println("The element with xpath "+xpathValue+" is entered with data"+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			 reportStep("The element with xpath "+xpathValue+" is not found in DOM","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			 reportStep("The element with xpath "+xpathValue+" is not visible in the application","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			 reportStep("The element with xpath "+xpathValue+" is not interactable in the application","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			reportStep("The element with xpath "+xpathValue+" is not stable in the application","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			reportStep("The element with xpath "+xpathValue+" is not launched due to unknown error","fail");
			//System.err.println("The element with xpath "+xpathValue+" is not launched due to unknown error");

		}
		
	}
	
	public void enterByLinkText(String LinkText, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(LinkText).sendKeys(data);
			reportStep("The element with xpath "+LinkText+" is entered with data\"+data","pass");
			//System.out.println("The element with xpath "+LinkText+" is entered with data"+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			reportStep("The element with xpath "+LinkText+" is not found in DOM","fail");
			//System.err.println("The element with xpath "+LinkText+" is not found in DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+LinkText+" is not visible in the application","fail");
			System.err.println("The element with xpath "+LinkText+" is not visible in the application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+LinkText+" is not interactable in the application","fail");
			//System.err.println("The element with xpath "+LinkText+" is not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			reportStep("The element with xpath "+LinkText+" is not stable in the application","fail");
			//System.err.println("The element with xpath "+LinkText+" is not stable in the application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+LinkText+" is not launched due to unknown error","fail");
			//System.err.println("The element with xpath "+LinkText+" is not launched due to unknown error");

		}
		
	}
	
	
	
	

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualText=driver.getTitle();
			if(actualText.equals(title)) {
				
				reportStep("The title of the page "+actualText+" is matched with expected title\"+title","pass");
				//System.out.println("The title of the page "+actualText+" is matched with expected title"+title);
			}else {
				reportStep("The title of the page "+actualText+" is not matched with expected title\"+title","fail");
				//System.err.println("The title of the page "+actualText+" is not matched with expected title"+title);
			}
		    }catch (WebDriverException e) {
			// TODO: handle exception
		    reportStep("The title of the page cannot be verified due to unknown error","fail"); 	
			//System.err.println("The title of the page cannot be verified due to unknown error");

		    }
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText=driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				reportStep("The element with id "+id+" is hodling the text \"+actualText+\" is matched with expected text\"+text","pass");
				//System.out.println("The element with id "+id+" is hodling the text "+actualText+" is matched with expected text"+text);
			}else
				  reportStep("The element with id "+id+" is not matched with expected text\"+text","fail"); 
				//System.out.println("The element with id "+id+" is not matched with expected text"+text );
		
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			reportStep("The element with id of the page "+text+" is not found in DOM","fail"); 
			//System.err.println("The element with id of the page "+text+" is not found in DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id of the page "+text+" is not visible in the application","fail"); 
			//System.err.println("The element with id of the page "+text+" is not visible in the application");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			reportStep("The element with id of the page "+text+" is not stable in the application","fail"); 
			//System.err.println("The element with id of the page "+text+" is not stable in the application");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id of the page "+text+" cannot be verified due to unknown error","fail"); 
			//System.err.println("The element with id of the page "+text+" cannot be verified due to unknown error");

		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText=driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				reportStep("The element with xpath "+xpath+"  is holding the text \"+actualText+\" is matched with expected text\"+text","pass");
				//System.out.println("The element with xpath "+xpath+"  is holding the text "+actualText+" is matched with expected text"+text );
			}else
				reportStep("The element with xpath "+xpath+" is holding the text \"+actualText+\" is not matched with expected text\"+text","fail"); 
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with expected text"+text );
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			reportStep("The element with xpath of the page "+text+" is not found in DOM","fail");
			//System.err.println("The element with xpath of the page "+text+" is not found in DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath of the page "+text+" is not visible in the application","fail");
			//System.err.println("The element with xpath of the page "+text+" is not visible in the application");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpath of the page "+text+" is not stable in the application","fail");
			//System.err.println("The element with xpath of the page "+text+" is not stable in the application");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpath of the page "+text+" cannot be verified due to unknown error","fail");
		//	System.err.println("The element with xpath of the page "+text+" cannot be verified due to unknown error");

		}
		}
	
	public void verifyTextByClassName(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText=driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				reportStep("The element with xpath "+xpath+"  is holding the text \"+actualText+\" is matched with expected text\"+text","pass");
				//System.out.println("The element with xpath "+xpath+"  is holding the text "+actualText+" is matched with expected text"+text );
			}else
				reportStep("The element with xpath "+xpath+" is holding the text \"+actualText+\" is not matched with expected text\"+text","fail");
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with expected text"+text );
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpath of the page "+text+" is not found in DOM","fail");
			//System.err.println("The element with xpath of the page "+text+" is not found in DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath of the page "+text+" is not visible in the application","fail");
			//System.err.println("The element with xpath of the page "+text+" is not visible in the application");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpath of the page "+text+" is not stable in the application","fail");
			//System.err.println("The element with xpath of the page "+text+" is not stable in the application");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpath of the page "+text+" cannot be verified due to unknown error","fail");
			//System.err.println("The element with xpath of the page "+text+" cannot be verified due to unknown error");

		}
		}
		

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText=driver.findElementByXPath(xpath).getText();
			if(actualText.contains(text)) {
				reportStep("The element with xpath "+xpath+"  is holding the text \"+actualText+\" is matched with expected text\"+text","pass");
				//System.out.println("The element with xpath "+xpath+"  is holding the text "+actualText+" is matched with expected text"+text);
			}else
				reportStep("The element with xpath "+xpath+" is holding the text \"+actualText+\" is not matched with expected text\"+text","fail");
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with expected text"+text );
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpath of the page "+text+" is not found in DOM","fail");
			//System.err.println("The element with xpath of the page "+text+" is not found in DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath of the page "+text+" is not visible in the application","fail");
			//System.err.println("The element with xpath of the page "+text+" is not visible in the application");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpath of the page "+text+" is not stable in the application","fail");
			//System.err.println("The element with xpath of the page "+text+" is not stable in the application");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpath of the page "+text+" cannot be verified due to unknown error","fail");
			//System.err.println("The element with xpath of the page "+text+" cannot be verified due to unknown error");

		}
		}
		
	

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			reportStep("The element with id "+id+" is clicked","pass");
			//System.out.println("The element with id "+id+" is clicked");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not found in DOM","fail");
			//System.err.println("The element with id "+id+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not visible in the application","fail");
			//System.err.println("The element with id "+id+" is not visible in the application");

		}catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+id+" is not clicked","fail");
			//System.err.println("The element with id "+id+" is not clicked ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not stable in the application","fail");
			//System.err.println("The element with id "+id+" is not stable in the application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not launched due to unknown error","fail");
			//System.err.println("The element with id "+id+" is not launched due to unknown error");
		}
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			reportStep("The element with classVal "+classVal+" is clicked","pass");
			//System.out.println("The element with classVal "+classVal+" is clicked");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with classVal "+classVal+" is not found in DOM","fail");
		//	System.err.println("The element with classVal "+classVal+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with classVal "+classVal+" is not visible in the application","fail");
			//System.err.println("The element with classVal "+classVal+" is not visible in the application");
        } catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
        	reportStep("The element with classVal "+classVal+" is not clicked","fail");
			//System.err.println("The element with classVal "+classVal+" is not clicked ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with classVal "+classVal+" is not stable in the application","fail");
			//System.err.println("The element with classVal "+classVal+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with classVal "+classVal+" is not launched due to unknown error","fail");
			//System.err.println("The element with classVal "+classVal+" is not launched due to unknown error");

		}
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			reportStep("The element with name "+name+" is clicked","pass");
			//System.out.println("The element with name "+name+" is clicked");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not found in DOM","fail");
			//System.err.println("The element with name "+name+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not visible in the application","fail");
			//System.err.println("The element with name "+name+" is not visible in the application");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			reportStep("The element with name "+name+" is not clicked","fail");
			//System.err.println("The element with name "+name+" is not clicked ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not stable in the application","fail");
			//System.err.println("The element with name "+name+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not launched due to unknown error","fail");
			//System.err.println("The element with name "+name+" is not launched due to unknown error");

		}
		
	}

	public void clickByLink(String LinkText) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(LinkText).click();
			reportStep("The element with name "+LinkText+" is clicked","pass");
			//System.out.println("The element with name "+LinkText+" is clicked");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with name "+LinkText+" is not found in DOM","fail");
			//System.err.println("The element with name "+LinkText+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with name "+LinkText+" is not visible in the application","fail");
			//System.err.println("The element with name "+LinkText+" is not visible in the application");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			reportStep("The element with name "+LinkText+" is not clicked","fail");
			//System.err.println("The element with name "+LinkText+" is not clicked ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with name "+LinkText+" is not stable in the application","fail");
			//System.err.println("The element with name "+LinkText+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with name "+LinkText+" is not launched due to unknown error","fail");
			//System.err.println("The element with name "+LinkText+" is not launched due to unknown error");

		}

	}
	
	public void clickByLinkText(String LinkText) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(LinkText).click();
			reportStep("The element with LinkText "+LinkText+" is clicked","pass");
			//System.out.println("The element with LinkText "+LinkText+" is clicked");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with LinkText "+LinkText+" is not found in DOM","fail");
			//System.err.println("The element with LinkText "+LinkText+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with LinkText "+LinkText+" is not visible in the application","fail");
			//System.err.println("The element with LinkText "+LinkText+" is not visible in the application");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			reportStep("The element with LinkText "+LinkText+" is not clicked","fail");
			//System.err.println("The element with LinkText "+LinkText+" is not clicked ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with LinkText "+LinkText+" is not stable in the application","fail");
			//System.err.println("The element with LinkText "+LinkText+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with LinkText "+LinkText+" is not launched due to unknown error","fail");
			//System.err.println("The element with LinkText "+LinkText+" is not launched due to unknown error");

		}

	}
	

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			reportStep("The element with name "+name+" is clicked","pass");
			//System.out.println("The element with name "+name+" is clicked");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not found in DOM","fail");
			//System.err.println("The element with name "+name+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not visible in the application","fail");
			//System.err.println("The element with name "+name+" is not visible in the application");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			reportStep("The element with name "+name+" is not clicked","fail");
		//	System.err.println("The element with name "+name+" is not clicked ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not stable in the application","fail");
			//System.err.println("The element with name "+name+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not launched due to unknown error","fail");
			//System.err.println("The element with name "+name+" is not launched due to unknown error");

		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			reportStep("The element with XPath "+xpathVal+" is clicked","pass");
			//System.out.println("The element with XPath "+xpathVal+ " is clicked");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with XPath "+xpathVal+" is not found in DOM","fail");
			//System.err.println("The element with XPath "+xpathVal+ " is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with XPath "+xpathVal+" is not visible in the application","fail");
		//	System.err.println("The element with XPath "+xpathVal+ " is not visible in the application");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpathVal "+xpathVal+" is not clicked","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not clicked ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not stable in the application","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not launched due to unknown error","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not launched due to unknown error");

		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			reportStep("The element with XPath "+xpathVal+" is clicked","pass");
			//System.out.println("The element with XPath "+xpathVal+ " is clicked");
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with XPath "+xpathVal+" is not found in DOM","fail");
			//System.err.println("The element with XPath "+xpathVal+ " is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with XPath "+xpathVal+" is not visible in the application","fail");
			//System.err.println("The element with XPath "+xpathVal+ " is not visible in the application");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpathVal "+xpathVal+" is not clicked","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not clicked ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not stable in the application","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The button with xpathVal "+xpathVal+" is not launched due to unknown error","fail");
			//System.err.println("The button with xpathVal "+xpathVal+" is not launched due to unknown error");

		}

	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String applicationtext=null;
		try {
			 applicationtext=driver.findElementById(idVal).getText();
			 reportStep("The Element with id "+idVal+" is holding the text \"+applicationtext","pass");
			//System.out.println("The Element with id "+idVal+" is holding the text "+applicationtext);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The Element with idVal "+idVal+" is not found in DOM","fail");
			//System.err.println("The Element with idVal "+idVal+" is not found in DOM");
        }catch (ElementNotVisibleException e) {
		  	// TODO: handle exception
        	reportStep("The Element with idVal "+idVal+" is not visible in the application","fail");
			//System.err.println("The Element with idVal "+idVal+" is not visible in the application");
        }catch (ElementNotInteractableException e) {
			// TODO: handle exception
        	reportStep("The Element with idVal "+idVal+" is not interactable in the application","fail");
		//	System.err.println("The Element with idVal "+idVal+" is not interactable in the application");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The Element with idVal "+idVal+" is not stable in the application","fail");
			//System.err.println("The Element with idVal "+idVal+" is not stable in the application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The Element with idVal "+idVal+" is not launched due to unknown error","fail");
			//System.err.println("The Element with idVal "+idVal+" is not launched due to unknown error");

		}
		
		return applicationtext;
	} 

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String applicationtext=null;
		try {
			applicationtext=driver.findElementByXPath(xpathVal).getText();
			 reportStep("The element with xpath "+xpathVal+" is holding the text \"+applicationtext","pass");
			//System.out.println("The element with xpath "+xpathVal+" is holding the text "+applicationtext);
			return applicationtext;
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not found in DOM","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not visible in the application","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpathVal "+xpathVal+"  is not interactable in the application","fail");
			//System.err.println("The element with xpathVal "+xpathVal+"  is not interactable in the application ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not stable in the application","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not stable in the application");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not launched due to unknown error","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not launched due to unknown error");

		}
		return applicationtext;
	}
	
	
	public String getTextByXpath(String xpathVal,String data) {
		// TODO Auto-generated method stub
		String applicationtext=null;
		try {
			applicationtext=driver.findElementByXPath(xpathVal).getText();
			 reportStep("The element with xpath "+xpathVal+" is holding the text \"+applicationtext","pass");
			//System.out.println("The element with xpath "+xpathVal+" is holding the text "+applicationtext);
			return applicationtext;
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not found in DOM","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not visible in the application","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpathVal "+xpathVal+"  is not interactable in the application","fail");
			//System.err.println("The element with xpathVal "+xpathVal+"  is not interactable in the application ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not stable in the application","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not stable in the application");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpathVal "+xpathVal+" is not launched due to unknown error","fail");
			//System.err.println("The element with xpathVal "+xpathVal+" is not launched due to unknown error");

		}
		return applicationtext;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element=driver.findElementById(id);
			Select sel=new Select(element);
			sel.selectByVisibleText(value);
			 reportStep("The element with id "+id+" is entered with data\" +value","pass");
		//	System.out.println("The element with id "+id+" is entered with data" +value) ;
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with id  "+value+" is not found in DOM","fail");
			//System.err.println("The element with id  "+value+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id  "+value+" is not visible in the application","fail");
			//System.err.println("The element with id  "+value+" is not visible in the application");
			
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+value+" is not selected","fail");
			//System.err.println("The element with id "+value+" is not selected ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+value+" is not stable in the application","fail");
			//System.err.println("The element with id "+value+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id "+value+" is not launched due to unknown error","fail");
			//System.err.println("The element with id "+value+" is not launched due to unknown error");

		}
		
		
	}
	
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement element=driver.findElementById(id);
			Select sel=new Select(element);
			sel.selectByIndex(value);
			 reportStep("The element with id "+id+" is entered with data\" +value","pass");
			//System.out.println("The element with id "+id+" is entered with data" +value);
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with id  "+value+" is not found in DOM","fail");
		//	System.err.println("The element with id  "+value+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id  "+value+" is not visible in the application","fail");
		//	System.err.println("The element with id  "+value+" is not visible in the application");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+value+" is not selected","fail");
			//System.err.println("The element with id "+value+" is not selected ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+value+" is not stable in the application ","fail");
			//System.err.println("The element with id "+value+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id "+value+" is not launched due to unknown error ","fail");
			//System.err.println("The element with id "+value+" is not launched due to unknown error");

		}
	}
	
	public void selectIndexById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element=driver.findElementById(id);
			Select sel=new Select(element);
			sel.selectByVisibleText(value);
			 reportStep("The element with id "+id+" is entered with data\" +value","pass");
			//System.out.println("The element with id "+id+" is entered with data" +value);
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with id  "+value+" is not found in DOM ","fail");
			//System.err.println("The element with id  "+value+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id  "+value+" is not visible in the application ","fail");
			//System.err.println("The element with id  "+value+" is not visible in the application");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+value+" is not selected ","fail");
		//	System.err.println("The element with id "+value+" is not selected ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+value+" is not stable in the application ","fail");
		//	System.err.println("The element with id "+value+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id "+value+" is not launched due to unknown error ","fail");
			//System.err.println("The element with id "+value+" is not launched due to unknown error");

		}
	}
	
	
	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element=driver.findElementById(id);
			Select sel=new Select(element);
			sel.selectByVisibleText(value);
			 reportStep("The element with id "+id+" is entered with data\" +value","pass");
			//System.out.println("The element with id "+id+" is entered with data" +value);
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			reportStep("The element with id  "+value+" is not found in DOM ","fail");
			//System.err.println("The element with id  "+value+" is not found in DOM");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id  "+value+" is not visible in the application ","fail");
			//System.err.println("The element with id  "+value+" is not visible in the application");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+value+" is not selected ","fail");
			//System.err.println("The element with id "+value+" is not selected ");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+value+" is not stable in the application ","fail");
		//	System.err.println("The element with id "+value+" is not stable in the application ");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id "+value+" is not launched due to unknown error ","fail");
			//System.err.println("The element with id "+value+" is not launched due to unknown error");

		}
	}
	
	
	
public void switchToParentWindow() {
		try {
			
			Set<String> allWinId = driver.getWindowHandles();
			for (String winId : allWinId) {
				driver.switchTo().window(winId);
				break;
			}
			reportStep("The element Switched to the Window","pass");
			//System.out.println("The element Switched to the Window");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			reportStep("The Window is not available in the DOM ","fail");
			//System.err.println("The Window is not available in the DOM");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The Window is not launched due to unknown error","fail");
			//System.err.println("The Window is not launched due to unknown error");

		} 
		}
		
	

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		//check
		try {
			Set<String> allWinIDAfterclick = driver.getWindowHandles();
			for ( String WindowID : allWinIDAfterclick) {
			driver.switchTo().window(WindowID);	
	        }
			reportStep("The element Switched to the Window","pass");
			//System.out.println("The element Switched to the Window");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			reportStep("The Window is not available in the DOM","fail");
			//System.err.println("The Window is not available in the DOM");

		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The Window is not launched due to unknown error","fail");
			//System.err.println("The Window is not launched due to unknown error");

		}
			
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			reportStep("Switched the Alert","pass");
			//System.out.println("Switched the Alert");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			reportStep("The Alert is not present in the Application","fail");
			//System.err.println("The Alert is not present in the Application");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The Alert is not present due to unknown error","fail");
		//	System.err.println("The Alert is not present due to unknown error");
		}
		
		}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			reportStep("Dismiss the Alert","pass");
			//System.out.println("Dismiss the Alert");

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			reportStep("The Alert is not present in the Application","fail");
			//System.err.println("The Alert is not present in the Application");
        }catch (WebDriverException e) {
			// TODO: handle exception
        	reportStep("The Alert is not present due to unknown error","fail");
			//System.err.println("The Alert is not present due to unknown error");

		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText=null;
		try {
			alertText=driver.switchTo().alert().getText();
			
			reportStep("The alert is holding the text \" +alertText","pass");
		//	System.out.println(" The alert is holding the text " +alertText);
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			reportStep("The Alert is not present in the Application","fail");
			//System.err.println("The Alert is not present in the Application");

        }catch (WebDriverException e) {
			// TODO: handle exception
        	reportStep("The Alert is not present due to unknown error","fail");
		//	System.err.println("The Alert is not present due to unknown error");

		}
		return alertText;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		long number=0;
		try {
			number=(long) (Math.random()*100000000)+100000;
			
			File temp=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(temp,dest);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number;
	}
	
	
	
	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			reportStep("closeBrowser","pass");
			//System.out.println("closeBrowser");
			
		
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("The browser is not launched due to unknown error","fail");
			//System.err.println("The browser is not launched due to unknown error");		
			}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("closeAllBrowser");
			reportStep("The all browser are closed","pass",false);
			
		
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("The browser is not launched due to unknown error","fail",false);
			//System.err.println("The browser is not launched due to unknown error");
		}
	}
	
	public void waitProperty(long time) {
		try {
			WebElement element=driver.findElementById("buttomFromTo");
			WebDriverWait wait = new WebDriverWait(driver,30);
			WebElement elementWithWait=wait.until(ExpectedConditions.elementToBeClickable(element));
			elementWithWait.click();
			Thread.sleep(time);
			reportStep("The sleep is activated for time "+time+" milliseconds","pass");
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		
	}
	}
	public void scrollDown()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

			
	public void mouseHoverByXpath(String xpathValue) {
		
		try {
			
			Actions builder = new Actions(driver);
			WebElement element=driver.findElementByXPath(xpathValue);
			builder.moveToElement(element).perform();
		    builder.moveToElement(element).clickAndHold().click().build().perform();
			
			
		             reportStep("The element with xpath "+xpathValue+" is entered with data","pass",false);
			        
					//System.out.println("The element with xpath "+xpathValue+" is entered with data");
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					 reportStep("The element with xpath "+xpathValue+" is not found in DOM","fail",false);
					//System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
				}catch (ElementNotVisibleException e) {
					// TODO: handle exception
					 reportStep("The element with xpath "+xpathValue+" is not visible in the application","fail",false);
					//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
				}catch (ElementNotInteractableException e) {
					// TODO: handle exception
					 reportStep("The element with xpath "+xpathValue+" is not interactable in the application","fail",false);
					//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
				}catch (StaleElementReferenceException e) {
					// TODO: handle exception
					 reportStep("The element with xpath "+xpathValue+" is not stable in the application","fail",false);
					//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
				}catch (WebDriverException e) {
					// TODO: handle exception
					 reportStep("The element with xpath "+xpathValue+" is not launched due to unknown error","fail",false);
					//System.err.println("The element with xpath "+xpathValue+" is not launched due to unknown error");

				}
		}
				

		public void selectVisibileTextByXpath(String xpathValue, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement element=driver.findElementByXPath(xpathValue);
				Select sel=new Select(element);
				sel.selectByVisibleText(value);
				reportStep("The element with Xpath "+xpathValue+" is entered with data\" +value","pass",false);
				//System.out.println("The element with Xpath "+xpathValue+" is entered with data" +value) ;
			}catch (NoSuchElementException e) {
				// TODO: handle exception
				 reportStep("The element with Xpath  "+value+" is not found in DOM","fail",false);
				//System.err.println("The element with Xpath  "+value+" is not found in DOM");

			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				 reportStep("The element with Xpath  "+value+" is not visible in the application","fail",false);
				//System.err.println("The element with Xpath  "+value+" is not visible in the application");
				
			} catch (ElementNotSelectableException e) {
				// TODO Auto-generated catch block
				 reportStep("The element with Xpath "+value+" is not selected ","fail",false);
				//System.err.println("The element with Xpath "+value+" is not selected ");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				 reportStep("The element with Xpath "+value+" is not stable in the application ","fail",false);
				//System.err.println("The element with Xpath "+value+" is not stable in the application ");

			}catch (WebDriverException e) {
				// TODO: handle exception
				 reportStep("The element with Xpath "+value+" is not launched due to unknown error ","fail",false);
				//System.err.println("The element with Xpath "+value+" is not launched due to unknown error");

			}
			
			
		}
	
		
		public void selectIndexByXpath(String xpathValue, int value) {
			// TODO Auto-generated method stub
			try {
				WebElement element=driver.findElementByXPath(xpathValue);
				Select sel=new Select(element);
				sel.selectByIndex(value);
				reportStep("The element with Xpath "+xpathValue+" is entered with data\" +value","pass",false);
				//System.out.println("The element with Xpath "+xpathValue+" is entered with data" +value);
			}catch (NoSuchElementException e) {
				// TODO: handle exception
				 reportStep("The element with Xpath  "+value+" is not found in DOM ","fail",false);
				//System.err.println("The element with Xpath  "+value+" is not found in DOM");

			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				reportStep("The element with Xpath  "+value+" is not visible in the application ","fail",false);
				//System.err.println("The element with Xpath  "+value+" is not visible in the application");
			} catch (ElementNotSelectableException e) {
				// TODO Auto-generated catch block
				reportStep("The element with Xpath "+value+" is not selected ","fail",false);
			//	System.err.println("The element with Xpath "+value+" is not selected ");

			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				reportStep("The element with Xpath "+value+" is not stable in the application ","fail",false);
				//System.err.println("The element with Xpath "+value+" is not stable in the application ");

			}catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The element with Xpath "+value+" is not launched due to unknown error ","fail",false);
				//System.err.println("The element with Xpath "+value+" is not launched due to unknown error");

			}
		}
		
		public void selectValueByXpath(String Xpath, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement element=driver.findElementByXPath(Xpath);
				Select sel=new Select(element);
				sel.selectByVisibleText(value);
				reportStep("The element with Xpath "+Xpath+" is entered with data\" +value","pass",false);
				//System.out.println("The element with Xpath "+Xpath+" is entered with data" +value);
			}catch (NoSuchElementException e) {
				// TODO: handle exception
				reportStep("The element with Xpath  "+value+" is not found in DOM ","fail",false);
				//System.err.println("The element with Xpath  "+value+" is not found in DOM");

			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				reportStep("The element with Xpath  "+value+" is not visible in the application","fail",false);
				//System.err.println("The element with Xpath  "+value+" is not visible in the application");
			} catch (ElementNotSelectableException e) {
				// TODO Auto-generated catch block
				reportStep("The element with Xpath "+value+" is not selected","fail",false);
				//System.err.println("The element with Xpath "+value+" is not selected ");

			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				reportStep("The element with Xpath "+value+" is not stable in the application","fail",false);
				//System.err.println("The element with Xpath "+value+" is not stable in the application ");

			}catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The element with id "+value+" is not launched due to unknown error","fail",false);
				//System.err.println("The element with id "+value+" is not launched due to unknown error");

			}
		}
			
			
		public void implicitWait() {
			try {
			
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

				}catch (NoSuchElementException e) {
					// TODO: handle exception
					reportStep("The element with Xpath  \"+value+\" is not found in DOM ","fail",false);
					//System.err.println("The element with Xpath  "+value+" is not found in DOM");

				}catch (ElementNotVisibleException e) {
					// TODO: handle exception
					reportStep("The element with Xpath  \"+value+\" is not visible in the application","fail",false);
					//System.err.println("The element with Xpath  "+value+" is not visible in the application");
				} catch (ElementNotSelectableException e) {
					// TODO Auto-generated catch block
					reportStep("The element with Xpath \"+value+\" is not selected","fail",false);
					//System.err.println("The element with Xpath "+value+" is not selected ");

				}catch (StaleElementReferenceException e) {
					// TODO: handle exception
					reportStep("The element with Xpath \"+value+\" is not stable in the application","fail",false);
					//System.err.println("The element with Xpath "+value+" is not stable in the application ");

				}catch (WebDriverException e) {
					// TODO: handle exception
					reportStep("The element with id \"+value+\" is not launched due to unknown error","fail",false);
					//System.err.println("The element with id "+value+" is not launched due to unknown error");
				}
		}

		      
}






			
				
	
		
	
		
		
		
		
		


		



		


	


