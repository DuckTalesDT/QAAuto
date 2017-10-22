package salesForecast;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//116-������������ � �������� "������ ������" ����� ������������ �������� "����������� ����������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrancePolChten(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
				
		//�������� ���������� ����
		int date = pvPage.countDays(driver);
				
		//������� �������� ��� ����������
		String data = "0";
		if (date == 28)
			data = data_56000;
			else if (date == 29)
				data = data_58000;
				else if (date == 30)
					data = data_60000;
					else if (date == 31)
						data = data_62000;
												
		//��������� ����������� ����������
		pvPage.buttonKoefficientOpen.click();
		
		//������������� ��������
		pvPage.fieldKoefficient_1.sendKeys(empty_6);
		pvPage.fieldKoefficient_1.sendKeys(data_2);
		pvPage.fieldKoefficientSave.click();
		
		//��������� ���������
		if (data.equals(pvPage.fieldKoefficientSave.getText()))
			System.out.println("SalesForecast One hundred sixteenth test is pass");
			else
				System.out.println("SalesForecast One hundred sixteenth test is false");
		
		//��������� ����������� ����������
		pvPage.buttonKoefficientClose.click();
		
		//��������� ����
		driver.quit();
		
	}
}
