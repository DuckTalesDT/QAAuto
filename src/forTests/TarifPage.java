package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TarifPage extends Variables {
	CentersPage centersPage = new CentersPage();
	UsersPage usersPage = new UsersPage();
	
		//Для возврата тарифного плана - xpath
	public Label promptMessage = new Label(By.xpath("//div[@class='wrapper tarif-wrapper shadow-box']/div[3]/div[4]/div/p"));
	public Label promptChangeTarif = new Label(By.id("change-tariff-popup-text"));
			
		//Labels
	public Label labelPersPriceUsd = new Label(By.xpath("//div[@data-id='4']/div[2]/div[1]/span"));
	public Label labelPersPriceUah = new Label(By.xpath("//div[@data-id='4']/div[2]/div[2]/span"));
	public Label labelStandPriceUsd = new Label(By.xpath("//div[@data-id='1']/div[2]/div[1]/span"));
	public Label labelStandPriceUah = new Label(By.xpath("//div[@data-id='1']/div[2]/div[2]/span"));
	public Label labelOptimPriceUsd = new Label(By.xpath("//div[@data-id='2']/div[2]/div[1]/span"));
	public Label labelOptimPriceUah = new Label(By.xpath("//div[@data-id='2']/div[2]/div[2]/span"));
	public Label labelMaximPriceUsd = new Label(By.xpath("//div[@data-id='3']/div[2]/div[1]/span"));
	public Label labelMaximPriceUah = new Label(By.xpath("//div[@data-id='3']/div[2]/div[2]/span"));
	public Label labelVipPriceUsd = new Label(By.xpath("//div[@data-id='5']/div[2]/div[1]/span"));
	public Label labelVipPriceUah = new Label(By.xpath("//div[@data-id='5']/div[2]/div[2]/span"));
	public Label labelMainPrompt = new Label(By.xpath("//div[@class='help-text']"));
	public Label labelPersUslugaFirst = new Label(By.xpath("//div[@data-id='4']/table/tbody/tr[1]/td[2]/p"));
	public Label labelPersUslugaSecond = new Label(By.xpath("//div[@data-id='4']/table/tbody/tr[2]/td[2]/p"));
	public Label labelStandUslugaFirst = new Label(By.xpath("//div[@data-id='1']/table/tbody/tr[1]/td[2]/p"));
	public Label labelStandUslugaSecond = new Label(By.xpath("//div[@data-id='1']/table/tbody/tr[2]/td[2]/p"));
	public Label labelStandUslugaThird = new Label(By.xpath("//div[@data-id='1']/table/tbody/tr[3]/td[2]/p"));
	public Label labelStandUslugaFourth = new Label(By.xpath("//div[@data-id='1']/table/tbody/tr[4]/td[2]/p"));
	public Label labelOptimUslugaFirst = new Label(By.xpath("//div[@data-id='2']/table/tbody/tr[1]/td[2]/p"));
	public Label labelOptimUslugaSecond = new Label(By.xpath("//div[@data-id='2']/table/tbody/tr[2]/td[2]/p"));
	public Label labelOptimUslugaThird = new Label(By.xpath("//div[@data-id='2']/table/tbody/tr[3]/td[2]/p"));
	public Label labelOptimUslugaFourth = new Label(By.xpath("//div[@data-id='2']/table/tbody/tr[4]/td[2]/p"));
	public Label labelMaximUslugaFirst = new Label(By.xpath("//div[@data-id='3']/table/tbody/tr[1]/td[2]/p"));
	public Label labelMaximUslugaSecond = new Label(By.xpath("//div[@data-id='3']/table/tbody/tr[2]/td[2]/p"));
	public Label labelMaximUslugaThird = new Label(By.xpath("//div[@data-id='3']/table/tbody/tr[3]/td[2]/p"));
	public Label labelMaximUslugaFourth = new Label(By.xpath("//div[@data-id='3']/table/tbody/tr[4]/td[2]/p"));
						
		//Buttons
	public Button buttonTarif = new Button(By.xpath("//span[@class='holder']/mark[text()='Тариф:']"));
	public Button buttonAboutTarif = new Button(By.xpath("//a[@href='/fc/administration/billing/tariff/renewal']"));
	public Button buttonTarifPers = new Button(By.xpath("//div[@data-id='4']"));
	public Button buttonTarifStand = new Button(By.xpath("//div[@data-id='1']"));
	public Button buttonTarifOptim = new Button(By.xpath("//div[@data-id='2']"));
	public Button buttonTarifMaxim = new Button(By.xpath("//div[@data-id='3']"));
	public Button buttonTarifVip = new Button(By.xpath("//div[@data-id='5']"));
	public Button buttonChangeTarif = new Button(By.xpath("//a[@class='fc-tariff-btn pp-view change-tariff']"));
	public Button buttonAgreeChangeTarif = new Button(By.id("fc-billing-changer-tariff-btn"));
	public Button buttonChangeTarifWindowClose = new Button(By.xpath("//div[@id='wrapper']/div[2]/div[6]/div/div/div/div[2]/a/i"));
	public Button buttonDontAgreeChangeTarif = new Button(By.xpath("//div[@class='align-center']/div/div/div/div/div/a"));
	public Button buttonStandPv = new Button(By.xpath("//div[@data-id='1']/table/tbody/tr[3]/td/label"));	
	public Button buttonStandUdp = new Button(By.xpath("//div[@data-id='1']/table/tbody/tr[4]/td/label"));
	public Button buttonOptimPv = new Button(By.xpath("//div[@data-id='2']/table/tbody/tr[3]/td/label"));	
	public Button buttonOptimUdp = new Button(By.xpath("//div[@data-id='2']/table/tbody/tr[4]/td/label"));
	public Button buttonMaximPv = new Button(By.xpath("//div[@data-id='3']/table/tbody/tr[3]/td/label"));	
	public Button buttonMaximUdp = new Button(By.xpath("//div[@data-id='3']/table/tbody/tr[4]/td/label"));
	public Button buttonVipPv = new Button(By.xpath("//div[@data-id='5']/table/tbody/tr[3]/td/label"));	
	public Button buttonVipUdp = new Button(By.xpath("//div[@data-id='5']/table/tbody/tr[4]/td/label"));
	
	
	
	//Methods
	public void goOptionAboutTarif(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionTarif))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(optionAboutTarif)).click();
		Thread.sleep(3000);
	}
	
	public int countUslugaPers() {
		return driver.findElements(By.xpath("//div[@data-id='4']/table/tbody/tr")).size();
	}
	
	public int countUslugaStand() {
		return driver.findElements(By.xpath("//div[@data-id='1']/table/tbody/tr")).size();
	}
	
	public int countUslugaOptim() {
		return driver.findElements(By.xpath("//div[@data-id='2']/table/tbody/tr")).size();
	}
	
	public int countUslugaMaxim() {
		return driver.findElements(By.xpath("//div[@data-id='3']/table/tbody/tr")).size();
	}
	
	public void deleteForChangeTarif(WebDriver driver) throws InterruptedException {
		centersPage.goOptionCenters(driver);
		centersPage.deleteAllCenterWizoutOne(driver);
		usersPage.goOptionUsers(driver);
		usersPage.deleteAllUserFourth(driver);
	}
		
	public void changeTarifPers(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		buttonTarifPers.click();
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);
	}
	
	public void changeTarifStand(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		String vievPriceMax = labelStandPriceUsd.getText();
		if (vievPriceMax.equals(priceDolStand)){
			buttonTarifStand.click();
			}
			else if (vievPriceMax.equals(priceDolStandPv)){
				buttonTarifStand.click();
				Thread.sleep(1000);
				buttonStandUdp.click();
				}
				else if (vievPriceMax.equals(priceDolStandUdp)){
					buttonTarifStand.click();
					buttonStandPv.click();
					}
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);	
			
	}
	
	public void changeTarifStandPv(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		String vievPriceStn = labelStandPriceUsd.getText();
		if (vievPriceStn.equals(priceDolStandPv)){
			buttonTarifStand.click();
			}
			else if (vievPriceStn.equals(priceDolStand)){
				buttonTarifStand.click();
				buttonStandUdp.click();
				}
				else if (vievPriceStn.equals(priceDolStandUdp)){
					buttonTarifStand.click();
					buttonStandPv.click();
					buttonStandUdp.click();
					}		
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);	
				
	}
	
	public void changeTarifStandUdp(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		String vievPriceStn = labelStandPriceUsd.getText();
		if (vievPriceStn.equals(priceDolStandUdp)){
			buttonTarifStand.click();
			}
			else if (vievPriceStn.equals(priceDolStand)){
				buttonTarifStand.click();
				buttonStandPv.click();
				}
				else if (vievPriceStn.equals(priceDolStandPv)){
					buttonTarifStand.click();
					buttonStandUdp.click();
					buttonStandPv.click();
					}		
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);	
	}
	
	public void changeTarifOptim(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		String vievPriceMax = labelOptimPriceUsd.getText();
		if (vievPriceMax.equals(priceDolOptim)){
			buttonTarifOptim.click();
			}
			else if (vievPriceMax.equals(priceDolOptimPv)){
				buttonTarifOptim.click();
				Thread.sleep(1000);
				buttonOptimUdp.click();
				}
				else if (vievPriceMax.equals(priceDolOptimUdp)){
					buttonTarifOptim.click();
					buttonOptimPv.click();
					}
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);							
	}
	
	public void changeTarifOptimPv(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		String vievPriceStn = labelOptimPriceUsd.getText();
		if (vievPriceStn.equals(priceDolOptimPv)){
			buttonTarifOptim.click();
			}
			else if (vievPriceStn.equals(priceDolOptim)){
				buttonTarifOptim.click();
				buttonOptimUdp.click();
				}
				else if (vievPriceStn.equals(priceDolOptimUdp)){
					buttonTarifOptim.click();
					buttonOptimPv.click();
					buttonOptimUdp.click();
					}		
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);					
	}
	
	public void changeTarifOptimUdp(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		String vievPriceStn = labelOptimPriceUsd.getText();
		if (vievPriceStn.equals(priceDolOptimUdp)){
			buttonTarifOptim.click();
			}
			else if (vievPriceStn.equals(priceDolOptim)){
				buttonTarifOptim.click();
				buttonOptimPv.click();
				}
				else if (vievPriceStn.equals(priceDolOptimPv)){
					buttonTarifOptim.click();
					buttonOptimUdp.click();
					buttonOptimPv.click();
					}		
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);	
				
	}
		
	public void changeTarifMaxim(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		String vievPriceMax = labelMaximPriceUsd.getText();
		if (vievPriceMax.equals(priceDolMaxim)){
			buttonTarifMaxim.click();
			}
			else if (vievPriceMax.equals(priceDolMaximPv)){
				buttonTarifMaxim.click();
				Thread.sleep(1000);
				buttonMaximUdp.click();
				}
				else if (vievPriceMax.equals(priceDolMaximUdp)){
					buttonTarifMaxim.click();
					buttonMaximPv.click();
					}
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);	
					
	}
	
	public void changeTarifMaximPv(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		String vievPriceStn = labelMaximPriceUsd.getText();
		if (vievPriceStn.equals(priceDolMaximPv)){
			buttonTarifMaxim.click();
			}
			else if (vievPriceStn.equals(priceDolMaxim)){
				buttonTarifMaxim.click();
				buttonMaximUdp.click();
				}
				else if (vievPriceStn.equals(priceDolMaximUdp)){
					buttonTarifMaxim.click();
					buttonMaximPv.click();
					buttonMaximUdp.click();
					}		
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);	
				
	}
	
	public void changeTarifMaximUdp(WebDriver driver) throws InterruptedException {
		goOptionAboutTarif(driver);
		String vievPriceStn = labelMaximPriceUsd.getText();
		if (vievPriceStn.equals(priceDolMaximUdp)){
			buttonTarifMaxim.click();
			}
			else if (vievPriceStn.equals(priceDolMaxim)){
				buttonTarifMaxim.click();
				buttonMaximPv.click();
				}
				else if (vievPriceStn.equals(priceDolMaximPv)){
					buttonTarifMaxim.click();
					buttonMaximUdp.click();
					buttonOptimPv.click();
					}		
		buttonChangeTarif.click();
		buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);					
	}
}
