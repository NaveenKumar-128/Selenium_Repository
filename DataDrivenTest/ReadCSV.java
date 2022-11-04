package DataDrivenTest;

public class ReadCSV {
	public static void main(String args[]) {
		tatic String driverPath = "D:\\Softwares\\geckodriver-v0.31.0-win64\\geckodriver.exe";
		public static void main(String[] args) throws IOException, CsvException, InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver",driverPath);			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://demo.opencart.com/");
			
			CSVReader reader = new CSVReader(new FileReader("./Login.csv"));
			 
			 // this will load content into list
			  List<String[]> li=reader.readAll();
			  System.out.println("Total rows that we have is "+li.size());
			            
			 // create Iterator reference
			  Iterator<String[]>i1= li.iterator();
			    
			 // Iterate all values 
			 while(i1.hasNext()){
				 String[] str=i1.next();
			 
				 driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
				 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
				 driver.findElement(By.name("email")).sendKeys(str[0]);
				 driver.findElement(By.name("password")).sendKeys(str[1]);
				 driver.findElement(By.xpath("//button[@type='submit']")).click();
				 Thread.sleep(3000);
				 System.out.println(driver.getTitle());
				 driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
				 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				 Thread.sleep(3000);
			 }	   
			 driver.close();
			}
	}

}
