package rate;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateTwentyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//29-������������ ��������������� ����� ��� ��������� ��������� ����� �� "������������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		UsersPage usersPage = new UsersPage();
		CentersPage centersPage = new CentersPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
						
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
													
		//�������� �������� ���� ������������
		tarifPage.changeTarifPers(driver);
				
		//��������� �������/���������
		payPage.goOptionPay(driver);
								
		//��������� ���������
		if (lineTarifPerson  == (payPage.countUslugaAfterChange(driver)))
			if (lineUserPers.equals(payPage.labelUslugaFirstAfterChange.getText()))
				if (lineUdpYes.equals(payPage.labelUslugaSecondAfterChange.getText()))
					System.out.println("Rate Twenty-ninth test is pass");
					else
						System.out.println("Rate Twenty-ninth test part �3 is false");
				else
					System.out.println("Rate Twenty-ninth test part �2 is false");
			else
				System.out.println("Rate Twenty-ninth test part �1 is false");
			
		//���������� ����� �� ������������
		tarifPage.changeTarifMaxim(driver);
																											
		//��������� ����
		driver.quit();
	}

}
