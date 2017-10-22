package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//23-������������  ������� ����� ������ "�����������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
				
		//��������� ���������
		if (lineTarifAll == tarifPage.countUslugaOptim())
			if (lineFirstTarifOptim.equals(tarifPage.labelOptimUslugaFirst.getText()))
				if (lineSecondTarifOptim.equals(tarifPage.labelOptimUslugaSecond.getText()))
					if (lineThirdTarifAll.equals(tarifPage.labelOptimUslugaThird.getText()))
						if (lineFourthTarifAll.equals(tarifPage.labelOptimUslugaFourth.getText()))
							System.out.println("Rate Twenty-third test is pass");
							else
								System.out.println("Rate Twenty-third test part �5 is false");
						else
							System.out.println("Rate Twenty-third test part �4 is false");
					else
						System.out.println("Rate Twenty-third test part �3 is false");
				else
					System.out.println("Rate Twenty-third test part �2 is false");
			else
				System.out.println("Rate Twenty-third test part �1 is false");
	
		//��������� ����
		driver.quit();
	}

}
