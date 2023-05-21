package Base_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class_Methods {
	
//	
//	public static WebDriver driver;
//	
//	
//	
//	public static void urlLaunch(String data) {
//		driver.get(data);
//
//	}
//
//	
//	public static void quit() {
//		driver.quit();
//
//	}
	public void url(WebDriver d, String e) {
		d.get(e);
	}

	public void clk(WebElement e) {
		e.click();
	}

	public void selint(WebElement e, int i) {
		Select sint = new Select(e);
		sint.selectByIndex(i);
		boolean multiple = sint.isMultiple();
		System.out.println("in this element is multiple" + multiple);
	}

	public void selval(WebElement e, String s) {
		Select svar = new Select(e);
		svar.selectByValue(s);
	}

	public void seltext(WebElement e, String s) {
		Select stext = new Select(e);
		stext.selectByVisibleText(s);
	}

	public void issel(WebElement e) {
		Select sint = new Select(e);
		boolean selected = e.isSelected();
		System.out.println(selected);

	}

	public void dselint(WebElement e, int i) {
		Select dsint = new Select(e);
		dsint.deselectByIndex(i);
	}

	public void dselval(WebElement e, String s) {
		Select svar = new Select(e);
		svar.deselectByValue(s);
	}

	public void dseltext(WebElement e, String s) {
		Select dstext = new Select(e);
		dstext.deselectByVisibleText(s);
	}

	public void dselall(WebElement e) {
		Select dsall = new Select(e);
		dsall.deselectAll();
	}

	public void alertacc(WebDriver d) {
		d.switchTo().alert().accept();
	}

	public void alertdis(WebDriver d) {
		d.switchTo().alert().dismiss();

	}

	public void sendkey(WebElement e, String s) {
		e.sendKeys(s);
	}

	public void sleep(int i) throws InterruptedException {
		Thread.sleep(i);
	}

	public void max(WebDriver d) {
		d.manage().window().maximize();
	}

	public void impwait(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void javascrclk(WebDriver d, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeAsyncScript("arguments[0].click();", e);
	}

	public void javascrsekey(WebElement e, String k) {
		JavascriptExecutor js = (JavascriptExecutor) e;
		js.executeScript("arguments[0].sendkey();", k);
	}

	public void explicit(WebDriver d, int t) {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(t));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void isdis() {

	}

	public void screenshot(WebDriver d) throws IOException {
		TakesScreenshot s = (TakesScreenshot) d;
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		File pic = new File("C:\\Users\\SURENANU\\eclipse-workspace\\Irctc\\Images\\irctc.png");
		org.openqa.selenium.io.FileHandler.copy(screenshotAs, pic);
	}

	public static String excel(String filename, String shee, int ro, int ce) throws IOException {
		File f = new File("C:\\Users\\SURENANU\\Desktop\\" + filename + ".xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet = book.getSheet(shee);
		Row row = sheet.getRow(ro);
		Cell cell = row.getCell(ce);
		CellType ct = cell.getCellType();
		String sv = null;
		if (ct.equals(ct.STRING)) {
			sv = cell.getStringCellValue();
		} else if (ct.equals(ct.NUMERIC)) {
			double nv = cell.getNumericCellValue();
			int i = (int) nv;
			sv = String.valueOf(i);

		}
		return sv;
	}

}
