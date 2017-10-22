package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//24-������������  ������� ����� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
				
		//��������� ���������
		if (lineTarifAll == tarifPage.countUslugaMaxim())
			if (lineFirstTarifMaxim.equals(tarifPage.labelMaximUslugaFirst.getText()))
				if (lineSecondTarifMaxim.equals(tarifPage.labelMaximUslugaSecond.getText()))
					if (lineThirdTarifAll.equals(tarifPage.labelMaximUslugaThird.getText()))
						if (lineFourthTarifAll.equals(tarifPage.labelMaximUslugaFourth.getText()))
							System.out.println("Rate Twenty-fourth test is pass");
							else
								System.out.println("Rate Twenty-fourth test part �5 is false");
						else
							System.out.println("Rate Twenty-fourth test part �4 is false");
					else
						System.out.println("Rate Twenty-fourth test part �3 is false");
				else
					System.out.println("Rate Twenty-fourth test part �2 is false");
			else
				System.out.println("Rate Twenty-fourth test part �1 is false");
									
		//��������� ����
		driver.quit();
	}

}
