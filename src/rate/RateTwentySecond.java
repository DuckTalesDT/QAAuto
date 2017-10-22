package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//22-������������ ������� ����� ������ "�����������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (lineTarifAll == tarifPage.countUslugaStand())
			if (lineFirstTarifStand.equals(tarifPage.labelStandUslugaFirst.getText()))
				if (lineSecondTarifStand.equals(tarifPage.labelStandUslugaSecond.getText()))
					if (lineThirdTarifAll.equals(tarifPage.labelStandUslugaThird.getText()))
						if (lineFourthTarifAll.equals(tarifPage.labelStandUslugaFourth.getText()))
							System.out.println("Rate Twenty-second test is pass");
							else
								System.out.println("Rate Twenty-second test part �5 is false");
						else
							System.out.println("Rate Twenty-second test part �4 is false");
					else
						System.out.println("Rate Twenty-second test part �3 is false");
				else
					System.out.println("Rate Twenty-second test part �2 is false");
			else
				System.out.println("Rate Twenty-second test part �1 is false");
							
		//��������� ����
		driver.quit();
	}

}
