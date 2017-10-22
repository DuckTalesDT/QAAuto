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
		//27-Получение сообщения об изменении тарифного плана 
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
		CentersPage centersPage = new CentersPage();
		TarifPage tarifPage = new TarifPage();
		UdpPage udpPage = new UdpPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
						
		//Удаляем пользователей если они есть
		usersPage.deleteAllUserSecond(driver);
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
				
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Открываем УДП
		udpPage.optionUdp(driver);
		
		//Получаем текущий месяц
		String monthToday = driver.findElement(By.xpath("//div[@class='main-tables fixed-th']/div/div[2]/div/div[2]")).getText().split("\\ ")[0];
				
		//Получаем количество дней в месяце
		int daysMonth = udpPage.countDays(driver);
							
		//Получаем текущий день
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
					
		//Корректируем будущий день
		int days = data + 1;
		
		
		//Выводим будущий месяц
		String month = "01";
		if (data == daysMonth){
		if (monthToday.equals("Январь"))
			month = "02";
			else if (monthToday.equals("Февраль"))
				month = "03";
				else if (monthToday.equals("Март"))
					month = "04";
					else if (monthToday.equals("Апрель"))
						month = "05";
						else if	 (monthToday.equals("Май"))
							month = "06";
							else if (monthToday.equals("Июнь"))
								month = "07";
								else if (monthToday.equals("Июль"))
									month = "08";
									else if (monthToday.equals("Август"))
										month = "09";
										else if (monthToday.equals("Сентябрь"))
											month = "10";
											else if (monthToday.equals("Октябрь"))
												month = "11";
												else if (monthToday.equals("Ноябрь"))
													month = "12";
													else if (monthToday.equals("Декабрь"))
														month = "01";
				}
				else
					{
					if (monthToday.equals("Январь"))
						month = "01";
						else if (monthToday.equals("Февраль"))
							month = "02";
							else if (monthToday.equals("Март"))
								month = "03";
								else if (monthToday.equals("Апрель"))
									month = "04";
									else if	 (monthToday.equals("Май"))
										month = "05";
										else if (monthToday.equals("Июнь"))
											month = "06";
											else if (monthToday.equals("Июль"))
												month = "07";
												else if (monthToday.equals("Август"))
													month = "08";
													else if (monthToday.equals("Сентябрь"))
														month = "09";
														else if (monthToday.equals("Октябрь"))
															month = "10";
															else if (monthToday.equals("Ноябрь"))
																month = "11";
																else if (monthToday.equals("Декабрь"))
																	month = "12";
					}
				
		//Выводим текст сообщения 
		String text = "";
		if (days < 10){
			text = "Тариф будет изменен с 2017-"+ month + "-" + "0" + days + "!";	
			}
			else {
				text = "Тариф будет изменен с 2017-"+ month + "-" + days + "!";
				}
				
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Выбираем тариф "Стандартный"
		tarifPage.buttonTarifStand.click();
									
		//Нажимаем "Изменить тарифный план"
		tarifPage.buttonChangeTarif.click();
									
		//Нажимаем "Согласен"
		tarifPage.buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
		
		//Проверяем результат   
		if (text.equals(tarifPage.promptChangeTarif.getText()))
			System.out.println("Rate Twenty-seventh test is pass");
			else
				System.out.println("Rate Twenty-seventh test is false");
								
		//Закрываем всплывающее сообщение
		tarifPage.buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);
				
		//Меняем тариф на максимальный
		tarifPage.changeTarifMaxim(driver);	
		
		//Закрываем сайт
		driver.quit();
		
		}
}
