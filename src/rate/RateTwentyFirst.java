package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//21-������������ ������� ����� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (lineTarifPerson == tarifPage.countUslugaPers())
			if (lineFirstTarifPerson.equals(tarifPage.labelPersUslugaFirst.getText()))
				if (lineFourthTarifAll.equals(tarifPage.labelPersUslugaSecond.getText()))
					System.out.println("Rate Twenty-first test is pass");
					else
						System.out.println("Rate Twenty-first test part �3 is false");
				else
					System.out.println("Rate Twenty-first test part �2 is false");
			else
				System.out.println("Rate Twenty-first test part �1 is false");
										
		//��������� ����
		driver.quit();
		
	}
}
