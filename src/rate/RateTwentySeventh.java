package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.UdpPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateTwentySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//27-��������� ��������� �� ��������� ��������� ����� 
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
		CentersPage centersPage = new CentersPage();
		TarifPage tarifPage = new TarifPage();
		UdpPage udpPage = new UdpPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
						
		//������� ������������� ���� ��� ����
		usersPage.deleteAllUserSecond(driver);
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
				
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//��������� ���
		udpPage.optionUdp(driver);
		
		//�������� ������� �����
		String monthToday = driver.findElement(By.xpath("//div[@class='main-tables fixed-th']/div/div[2]/div/div[2]")).getText().split("\\ ")[0];
				
		//�������� ���������� ���� � ������
		int daysMonth = udpPage.countDays(driver);
							
		//�������� ������� ����
		int data;
		if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_1)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_1)).getAttribute("class")))
			data = 1;
			else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_2)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_2)).getAttribute("class")))
				data = 2;
				else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_3)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_3)).getAttribute("class")))
					data = 3;
					else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_4)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_4)).getAttribute("class")))
						data = 4;
						else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_5)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_5)).getAttribute("class")))
							data = 5;
							else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_6)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_6)).getAttribute("class")))
								data = 6;
								else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_7)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_7)).getAttribute("class")))
									data = 7;
									else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_8)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_8)).getAttribute("class")))
										data = 8;
										else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_9)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_9)).getAttribute("class")))
											data = 9;
											else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_10)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_10)).getAttribute("class")))
												data = 10;
												else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_11)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_11)).getAttribute("class")))
													data = 11;
													else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_12)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_12)).getAttribute("class")))
														data = 12;
														else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_13)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_13)).getAttribute("class")))
															data = 13;
															else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_14)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_14)).getAttribute("class")))
																data = 14;
																else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_15)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_15)).getAttribute("class")))
																	data = 15;
																	else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_16)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_16)).getAttribute("class")))
																		data = 16;
																		else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_17)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_17)).getAttribute("class")))
																			data = 17;
																			else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_18)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_18)).getAttribute("class")))
																				data = 18;
																				else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_19)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_19)).getAttribute("class")))
																					data = 19;
																					else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_20)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_20)).getAttribute("class")))
																						data = 20;
																						else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_21)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_21)).getAttribute("class")))
																							data = 21;
																							else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_22)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_22)).getAttribute("class")))
																								data = 22;
																								else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_23)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_23)).getAttribute("class")))
																									data = 23;
																									else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_24)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_24)).getAttribute("class")))
																										data = 24;
																										else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_25)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_25)).getAttribute("class")))
																											data = 25;
																											else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_26)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_26)).getAttribute("class")))
																												data = 26;
																												else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_27)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_27)).getAttribute("class")))
																													data = 27;
																													else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_28)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_28)).getAttribute("class")))
																														data = 28;
																														else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_29)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_29)).getAttribute("class")))
																															data = 29;
																															else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_30)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_30)).getAttribute("class")))
																																data = 30;
																																else 
																																	data = 31;
					
		//������������ ������� ����
		int days = data + 1;
		
		
		//������� ������� �����
		String month = "01";
		if (data == daysMonth){
		if (monthToday.equals("������"))
			month = "02";
			else if (monthToday.equals("�������"))
				month = "03";
				else if (monthToday.equals("����"))
					month = "04";
					else if (monthToday.equals("������"))
						month = "05";
						else if	 (monthToday.equals("���"))
							month = "06";
							else if (monthToday.equals("����"))
								month = "07";
								else if (monthToday.equals("����"))
									month = "08";
									else if (monthToday.equals("������"))
										month = "09";
										else if (monthToday.equals("��������"))
											month = "10";
											else if (monthToday.equals("�������"))
												month = "11";
												else if (monthToday.equals("������"))
													month = "12";
													else if (monthToday.equals("�������"))
														month = "01";
				}
				else
					{
					if (monthToday.equals("������"))
						month = "01";
						else if (monthToday.equals("�������"))
							month = "02";
							else if (monthToday.equals("����"))
								month = "03";
								else if (monthToday.equals("������"))
									month = "04";
									else if	 (monthToday.equals("���"))
										month = "05";
										else if (monthToday.equals("����"))
											month = "06";
											else if (monthToday.equals("����"))
												month = "07";
												else if (monthToday.equals("������"))
													month = "08";
													else if (monthToday.equals("��������"))
														month = "09";
														else if (monthToday.equals("�������"))
															month = "10";
															else if (monthToday.equals("������"))
																month = "11";
																else if (monthToday.equals("�������"))
																	month = "12";
					}
				
		//������� ����� ��������� 
		String text = "";
		if (days < 10){
			text = "����� ����� ������� � 2017-"+ month + "-" + "0" + days + "!";	
			}
			else {
				text = "����� ����� ������� � 2017-"+ month + "-" + days + "!";
				}
				
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//�������� ����� "�����������"
		tarifPage.buttonTarifStand.click();
									
		//�������� "�������� �������� ����"
		tarifPage.buttonChangeTarif.click();
									
		//�������� "��������"
		tarifPage.buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		
		//��������� ���������   
		if (text.equals(tarifPage.promptChangeTarif.getText()))
			System.out.println("Rate Twenty-seventh test is pass");
			else
				System.out.println("Rate Twenty-seventh test is false");
								
		//��������� ����������� ���������
		tarifPage.buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);
				
		//������ ����� �� ������������
		tarifPage.changeTarifMaxim(driver);	
		
		//��������� ����
		driver.quit();
		
		}
}
