package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UdpPage extends Variables {
	
	//Листы УДП
	public Field fieldAllList = new Field(By.id("office-id"));
	public Field fieldListFirst = new Field(By.xpath("//span[@class='fs-drop-holder']/span[1]"));
	public Field fieldListSecond = new Field(By.xpath("//span[@class='fs-drop-holder']/span[2]"));
	public Field fieldListExit = new Field(By.xpath("//span[@class='fs-drop']/span/a"));
	public Field fieldAddList = new Field(By.id("add-cfm-list-button"));
	public Field fieldMainList = new Field(By.linkText("Общая таблица УДП"));
	public Button buttonEditing = new Button(By.id("change-cfm-list-button"));
	public Button buttonSaveList = new Button(By.cssSelector("input.fc-popup-pseudo-button.send-cfm-list-form"));
	public Button buttonDontSaveList = new Button(By.cssSelector("#add-list > div.header > div.cross.popup-close"));
	public Button buttonListDelete = new Button(By.cssSelector("input.fc-popup-pseudo-button.fc-del-button"));
	public Button buttonListAgreeDelete = new Button(By.cssSelector("span.alert-button.alert-button-danger"));
	public Button buttonListDontAgreeDelete = new Button(By.xpath("//span[@class='alert-button']"));
	public Button buttonListUsluga = new Button(By.id("fc_cfmbundle_sheet_markup_0"));
	public Button buttonListTovar = new Button(By.id("fc_cfmbundle_sheet_markup_1"));
	public Field fieldListName = new Field(By.id("fc_cfmbundle_sheet_title"));
	public Field fieldShablonRoznica = new Field(By.linkText("Шаблон Розница"));
	public Field fieldShablonIndividualni = new Field(By.linkText("Шаблон Индивидуальный"));
	public Field fieldShablonProizvodstvo = new Field(By.linkText("Шаблон Производство"));
	public Field fieldListShablonUslugaTovar = new Field(By.linkText("Шаблон Услуги + Продажа товаров"));
	public Field fieldListShablonUsluga = new Field(By.linkText("Шаблон Услуги"));
	public Field fieldListShablonOpt = new Field(By.linkText("Шаблон ОПТ"));
	public Button buttonCenterFirst = new Button(By.xpath("//div[@id='mCSB_1_container']/div[1]/label/span"));
	public Button buttonCenterSecond = new Button(By.xpath("//div[@id='mCSB_1_container']/div[2]/label/span"));
	public Button buttonCenterThird = new Button(By.xpath("//div[@id='mCSB_1_container']/div[3]/label/span"));

	//Первая таблица
	public Field fieldOstatok = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/thead/tr/th/input"));
	public Field fieldOstatok_1 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[1]/td[2]/input"));
	public Field fieldOstatok_2 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[2]/td[2]/input"));
	public Field fieldOstatok_3 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[3]/td[2]/input"));
	public Field fieldOstatok_4 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[4]/td[2]/input"));
	public Field fieldOstatok_5 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[5]/td[2]/input"));
	public Field fieldOstatok_6 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[6]/td[2]/input"));
	public Field fieldOstatok_7 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[7]/td[2]/input"));
	public Field fieldOstatok_8 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[8]/td[2]/input"));
	public Button buttonEditIncome = new Button(By.id("edit-cfm-income-button"));
	public Button buttonEditRashod = new Button(By.id("edit-cfm-charges-button"));
	public Field fieldKategoriNastroyki_1 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[1]"));
	public Field fieldKategoriNastroyki_2 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[2]"));
	public Field fieldKategoriNastroyki_3 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[3]"));
	public Field fieldKategoriNastroyki_4 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[4]"));
	public Field fieldKategoriNastroyki_5 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[5]"));
	public Field fieldKategoriNastroyki_6 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[6]"));
	public Field fieldKategoriNastroyki_7 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[7]"));
	public Field fieldKategoriNastroyki_8 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[8]"));
	public Field fieldKategoriNastroyki_9 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[9]"));
	public Field fieldKategoriNastroyki_10 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[10]"));
	public Field fieldKategoriNastroyki_11 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[11]"));
	public Field fieldKategoriNastroyki_12 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[12]"));
	public Field fieldKategoriNastroyki_13 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[13]"));
	public Field fieldKategoriNastroyki_14 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[14]"));
	public Field fieldKategoriNastroyki_15 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[15]"));
	public Field fieldKategoriNastroyki_16 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[16]"));
	public Field fieldKategoriNastroyki_17 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[17]"));
	public Field fieldKategoriNastroyki_18 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[18]"));
	public Field fieldKategoriNastroyki_19 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[19]"));
	public Field fieldKategoriNastroyki_20 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[20]"));
	public Field fieldKategoriNastroyki_21 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[21]"));
	public Field fieldKategoriNastroyki_22 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[22]"));
	public Field fieldKategoriNastroyki_23 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[23]"));
	public Field fieldKategoriNastroyki_24 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[24]"));
	public Field fieldKategoriNastroyki_25 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[25]"));
	public Field fieldKategoriNastroyki_26 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[26]"));
	public Field fieldKategoriNastroyki_27 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[27]"));
	public Field fieldKategoriNastroyki_28 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[28]"));
	public Field fieldKategoriNastroyki_29 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[29]"));
	public Field fieldKategoriNastroyki_30 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[30]"));
	public Field fieldKategoriNastroyki_31 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[31]"));
	public Field fieldKategoriNastroyki_32 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[32]"));
	public Field fieldKategoriNastroyki_33 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[33]"));
	public Field fieldKategoriNastroyki_34 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[34]"));
	public Field fieldKategoriNastroyki_35 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[35]"));
	public Field fieldKategoriNastroyki_36 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[36]"));
	public Field fieldKategoriNastroyki_37 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[37]"));
	public Field fieldKategoriNastroyki_38 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[38]"));
	public Field fieldKategoriNastroyki_39 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[39]"));
	public Field fieldKategoriNastroyki_40 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[40]"));
	public Field fieldKategoriNastroyki_41 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[41]"));
	public Field fieldKategoriNastroyki_42 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[42]"));
	public Field fieldKategoriNastroyki_43 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[43]"));
	public Field fieldKategoriNastroyki_44 = new Field(By.xpath("//div[@class='popup-body']/div/div/div[44]"));
	public Field fieldKategoriIncome_1 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[1]/td"));
	public Field fieldKategoriIncome_2 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[2]/td/span"));
	public Field fieldKategoriIncome_3 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[3]/td/span"));
	public Field fieldKategoriIncome_4 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[4]/td/span"));
	public Field fieldKategoriIncome_5 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[5]/td/span"));
	public Field fieldKategoriIncome_6 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[6]/td/span"));
	public Field fieldKategoriIncome_7 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[7]/td/span"));
	public Field fieldKategoriIncome_8 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[8]/td/span"));
	public Field fieldKategoriIncome_9 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[9]/td/span"));
	public Field fieldKategoriIncome_10 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[10]/td/span"));
	public Field fieldKategoriIncome_11 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[11]/td/span"));
	public Field fieldKategoriIncome_12 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[12]/td/span"));
	public Field fieldKategoriIncome_13 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[13]/td/span"));
	public Field fieldKategoriIncome_14 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[14]/td/span"));
	public Field fieldKategoriIncome_15 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[15]/td/span"));
	public Field fieldKategoriIncome_16 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[16]/td/span"));
	public Field fieldKategoriIncome_17 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[17]/td/span"));
	public Field fieldKategoriIncome_18 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[18]/td/span"));
	public Field fieldKategoriIncome_19 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[19]/td/span"));
	public Field fieldKategoriIncome_20 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[20]/td/span"));
	public Field fieldKategoriIncome_21 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[21]/td/span"));
	public Field fieldKategoriIncome_22 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[22]/td/span"));
	public Field fieldKategoriIncome_23 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[23]/td/span"));
	public Field fieldKategoriIncome_24 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[24]/td/span"));
	public Field fieldKategoriSaldo = new Field(By.xpath("//table[@id='saldo-point']"));
	public Field fieldKategoriSaldo_1 = new Field(By.xpath("//table[@id='saldo-point']/tbody/tr[1]"));
	public Field fieldKategoriSaldo_2 = new Field(By.xpath("//table[@id='saldo-point']/tbody/tr[2]"));
	public Field fieldKategoriSaldo_3 = new Field(By.xpath("//table[@id='saldo-point']/tbody/tr[3]"));
	public Field fieldKategoriSaldo_4 = new Field(By.xpath("//table[@id='saldo-point']/tbody/tr[4]"));
	public Field fieldKategoriSaldo_5 = new Field(By.xpath("//table[@id='saldo-point']/tbody/tr[5]"));
	public Field fieldKategoriSaldo_6 = new Field(By.xpath("//table[@id='saldo-point']/tbody/tr[6]"));
	public Field fieldKategoriSaldo_7 = new Field(By.xpath("//table[@id='saldo-point']/tbody/tr[7]"));
	public Field fieldKategoriSaldo_8 = new Field(By.xpath("//table[@id='saldo-point']/tbody/tr[8]"));
	public Field fieldKategoriSaldo_9 = new Field(By.xpath("//table[@id='saldo-point']/tbody/tr[9]"));
	public Field fieldKategoriRashod_1 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[1]/td"));
	public Field fieldKategoriRashod_2 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[2]/td/span"));
	public Field fieldKategoriRashod_3 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[3]/td/span"));
	public Field fieldKategoriRashod_4 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[4]/td/span"));
	public Field fieldKategoriRashod_5 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[5]/td/span"));
	public Field fieldKategoriRashod_6 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[6]/td/span"));
	public Field fieldKategoriRashod_7 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[7]/td/span"));
	public Field fieldKategoriRashod_8 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[8]/td/span"));
	public Field fieldKategoriRashod_9 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[9]/td/span"));
	public Field fieldKategoriRashod_10 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[10]/td/span"));
	public Field fieldKategoriRashod_11 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[11]/td/span"));
	public Field fieldKategoriRashod_12 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[12]/td/span"));
	public Field fieldKategoriRashod_13 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[13]/td/span"));
	public Field fieldKategoriRashod_14 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[14]/td/span"));
	public Field fieldKategoriRashod_15 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[15]/td/span"));
	public Field fieldKategoriRashod_16 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[16]/td/span"));
	public Field fieldKategoriRashod_17 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[17]/td/span"));
	public Field fieldKategoriRashod_18 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[18]/td/span"));
	public Field fieldKategoriRashod_19 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[19]/td/span"));
	public Field fieldKategoriRashod_20 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[20]/td/span"));
	public Field fieldKategoriRashod_21 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[21]/td/span"));
	public Field fieldKategoriRashod_22 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[22]/td/span"));
	public Field fieldKategoriRashod_23 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[23]/td/span"));
	public Field fieldKategoriRashod_24 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[24]/td/span"));
	public Field fieldKategoriRashod_25 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[25]/td/span"));
	public Field fieldKategoriRashod_26 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[26]/td/span"));
	public Field fieldKategoriRashod_27 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[27]/td/span"));
	public Field fieldKategoriRashod_28 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[28]/td/span"));
	public Field fieldKategoriRashod_29 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[29]/td/span"));
	public Field fieldKategoriRashod_30 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[30]/td/span"));
	public Field fieldKategoriRashod_31 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[31]/td/span"));
	public Field fieldKategoriRashod_32 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[32]/td/span"));
	public Field fieldKategoriRashod_33 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[33]/td/span"));
	public Field fieldKategoriRashod_34 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[34]/td/span"));
	public Field fieldKategoriRashod_35 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[35]/td/span"));
	public Field fieldKategoriRashod_36 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[36]/td/span"));
	public Field fieldKategoriRashod_37 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[37]/td/span"));
	public Field fieldKategoriRashod_38 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[38]/td/span"));
	public Field fieldKategoriRashod_39 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[39]/td/span"));
	public Field fieldKategoriRashod_40 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[40]/td/span"));
	public Field fieldKategoriRashod_41 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[41]/td/span"));
	public Field fieldKategoriRashod_42 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[42]/td/span"));
	public Field fieldKategoriRashod_43 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[43]/td/span"));
	public Field fieldKategoriRashod_44 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[44]/td/span"));
	public Field fieldKategoriRashod_45 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[45]/td/span"));
	public Field fieldKategoriRashod_46 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[46]/td/span"));
	public Field fieldKategoriRashod_47 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[47]/td/span"));
	public Field fieldKategoriRashod_48 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[48]/td/span"));
	public Field fieldKategoriRashod_49 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[49]/td/span"));
	public Field fieldKategoriRashod_50 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[50]/td/span"));
	public Field fieldKategoriRashod_51 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[51]/td/span"));
	public Field fieldKategoriRashod_52 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[52]/td/span"));
	public Field fieldKategoriRashod_53 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[53]/td/span"));
	public Field fieldKategoriRashod_54 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[54]/td/span"));
	public Field fieldKategoriRashod_55 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[55]/td/span"));
	public Field fieldKategoriRashod_56 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[56]/td/span"));
	public Field fieldKategoriRashod_57 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[57]/td/span"));
	public Field fieldKategoriRashod_58 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[58]/td/span"));
	public Field fieldKategoriRashod_59 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[59]/td/span"));
	public Field fieldKategoriRashod_60 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[60]/td/span"));
	public Field fieldKategoriRashod_61 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[61]/td/span"));
	public Field fieldKategoriRashod_62 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[62]/td/span"));
	public Field fieldKategoriRashod_63 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[63]/td/span"));
	public Field fieldKategoriRashod_64 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[64]/td/span"));
	public Field fieldKategoriRashod_65 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[65]/td/span"));
	public Field fieldKategoriRashod_66 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[66]/td/span"));
	public Field fieldKategoriRashod_67 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[67]/td/span"));
	public Field fieldKategoriRashod_68 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[68]/td/span"));
	
	//Вторая таблица
	public Button buttonModulPrognoz = new Button(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[3]/td/span[2]"));
	public Button buttonMonth = new Button(By.xpath("//div[@class='main-tables fixed-th']/div/div[2]/div/div[2]"));
	public Button buttonMonthBefore = new Button(By.xpath("//div[@class='main-tables fixed-th']/div/div[2]/div/div[1]"));
	public Button buttonMonthAfter = new Button(By.xpath("//div[@class='main-tables fixed-th']/div/div[2]/div/div[3]"));
	public Button buttonMonthAllList = new Button(By.cssSelector("div.main-tables.fixed-th > div.calendar-holder > div.calendar-but > #fc-period-calendare > div.fc-current-date"));
	public Button buttonMonthBeforeAllList = new Button(By.cssSelector("div.main-tables.fixed-th > div.calendar-holder > div.calendar-but > #fc-period-calendare > div.fc-period-button.fc-month-back"));
	public Button buttonMonthAfterAllList = new Button(By.cssSelector("div.main-tables.fixed-th > div.calendar-holder > div.calendar-but > #fc-period-calendare > div.fc-period-button.fc-month-forward"));
	public Button buttonMonthSeptember = new Button(By.xpath("//div[@data-month-num='09']"));
	public Button buttonMonthOktober = new Button(By.xpath("//div[@data-month-num='10']"));
	public Button buttonMonthNovember = new Button(By.xpath("//div[@data-month-num='11']"));
	public Field fieldIncome_1_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[1]/td[1]"));
	public Field fieldIncome_1_2 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[1]/td[2]"));
	public Field fieldIncome_1_3 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[1]/td[3]"));
	public Field fieldIncome_2_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[2]/td[1]"));
	public Field fieldIncome_3_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[3]/td[1]"));
	public Field fieldIncome_3_2 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[3]/td[1]"));
	public Field fieldIncome_4_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[4]/td[1]"));
	public Field fieldIncome_5_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[5]/td[1]"));
	public Field fieldIncome_5_2 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[5]/td[2]"));
	public Field fieldIncome_5_3 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[5]/td[3]"));
	public Field fieldIncome_5_10 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[5]/td[10]"));
	public Field fieldIncome_5_28 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[5]/td[28]"));
	public Field fieldIncome_6_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[6]/td[1]"));
	public Field fieldIncome_6_2 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[6]/td[2]"));
	public Field fieldIncome_6_3 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[6]/td[3]"));
	public Field fieldIncome_7_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[7]/td[1]"));
	public Field fieldIncome_7_2 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[7]/td[2]"));
	public Field fieldIncome_7_3 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[7]/td[3]"));
	public Field fieldIncome_8_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[8]/td[1]"));
	public Field fieldIncome_9_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[9]/td[1]"));
	public Field fieldIncome_9_2 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[9]/td[2]"));
	public Field fieldIncome_9_3 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[9]/td[3]"));
	public Field fieldIncome_9_10 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[9]/td[10]"));
	public Field fieldIncome_9_28 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[9]/td[28]"));
	public Field fieldIncome_10_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[10]/td[1]"));
	public Field fieldIncome_10_2 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[10]/td[2]"));
	public Field fieldIncome_10_3 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[10]/td[3]"));
	public Field fieldIncome_11_1 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[11]/td[1]"));
	public Field fieldIncome_11_2 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[11]/td[2]"));
	public Field fieldIncome_11_3 = new Field(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/tbody/tr[11]/td[3]"));
	public Field fieldSaldo_1 = new Field(By.xpath("//div[@id='tbl']/div[4]/div[4]/div[4]/table[2]/tbody/tr/td[1]"));
	public Field fieldSaldo_2 = new Field(By.xpath("//div[@id='tbl']/div[4]/div[4]/div[4]/table[2]/tbody/tr/td[2]"));
	public Field fieldSaldo_3 = new Field(By.xpath("//div[@id='tbl']/div[4]/div[4]/div[4]/table[2]/tbody/tr/td[3]"));
	public Field fieldRashod_1_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[1]/td[1]"));
	public Field fieldRashod_1_2 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[1]/td[2]"));
	public Field fieldRashod_1_3 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[1]/td[3]"));
	public Field fieldRashod_2_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[2]/td[1]"));
	public Field fieldRashod_3_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[3]/td[1]"));
	public Field fieldRashod_3_2 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[3]/td[2]"));
	public Field fieldRashod_3_3 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[3]/td[3]"));
	public Field fieldRashod_3_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[3]/td[10]"));
	public Field fieldRashod_3_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[3]/td[28]"));
	public Field fieldRashod_3_31 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[3]/td[31]"));
	public Field fieldRashod_4_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[4]/td[1]"));
	public Field fieldRashod_6_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[6]/td[1]"));
	public Field fieldRashod_6_2 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[6]/td[2]"));
	public Field fieldRashod_6_3 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[6]/td[3]"));
	public Field fieldRashod_6_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[6]/td[10]"));
	public Field fieldRashod_6_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[6]/td[28]"));
	public Field fieldRashod_13_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[13]/td[1]"));
	public Field fieldRashod_13_2 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[13]/td[2]"));
	public Field fieldRashod_13_3 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[13]/td[3]"));
	public Field fieldRashod_13_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[13]/td[10]"));
	public Field fieldRashod_13_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[13]/td[28]"));
	public Field fieldRashod_23_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[23]/td[1]"));
	public Field fieldRashod_23_2 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[23]/td[2]"));
	public Field fieldRashod_23_3 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[23]/td[3]"));
	public Field fieldRashod_23_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[23]/td[10]"));
	public Field fieldRashod_23_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[23]/td[28]"));
	public Field fieldRashod_27_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[27]/td[1]"));
	public Field fieldRashod_27_2 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[27]/td[2]"));
	public Field fieldRashod_27_3 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[27]/td[3]"));
	public Field fieldRashod_27_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[27]/td[10]"));
	public Field fieldRashod_27_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[27]/td[28]"));
	public Field fieldRashod_32_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[32]/td[1]"));
	public Field fieldRashod_32_2 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[32]/td[2]"));
	public Field fieldRashod_32_3 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[32]/td[3]"));
	public Field fieldRashod_32_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[32]/td[10]"));
	public Field fieldRashod_32_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[32]/td[28]"));
	public Field fieldRashod_35_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[35]/td[1]"));
	public Field fieldRashod_35_2 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[35]/td[2]"));
	public Field fieldRashod_35_3 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[35]/td[3]"));
	public Field fieldRashod_35_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[35]/td[10]"));
	public Field fieldRashod_35_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[35]/td[28]"));
	public Field fieldRashod_37_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[37]/td[1]"));
	public Field fieldRashod_37_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[37]/td[10]"));
	public Field fieldRashod_37_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[37]/td[28]"));
	public Field fieldRashod_38_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[38]/td[1]"));
	public Field fieldRashod_39_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[39]/td[1]"));
	public Field fieldRashod_39_2 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[39]/td[2]"));
	public Field fieldRashod_39_3 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[39]/td[3]"));
	public Field fieldRashod_39_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[39]/td[10]"));
	public Field fieldRashod_39_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[39]/td[28]"));
	public Field fieldRashod_40_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[40]/td[1]"));
	public Field fieldRashod_41_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[41]/td[1]"));
	public Field fieldRashod_41_10 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[41]/td[10]"));
	public Field fieldRashod_41_28 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[41]/td[28]"));
	public Field fieldRashod_42_1 = new Field(By.xpath("//table[@class='table-medium table-central charges-table table-bordered']/tbody/tr[42]/td[1]"));
	public Field fieldInputData_1 = new Field(By.xpath("//div[@id='td-popup']/table/tbody/tr[1]/td[2]/input"));
	public Field fieldInputData_2 = new Field(By.xpath("//div[@id='td-popup']/table/tbody/tr[2]/td[2]/input"));
	public Field fieldInputData_3 = new Field(By.xpath("//div[@id='td-popup']/table/tbody/tr[3]/td[2]/input"));
	public Field fieldInputData_4 = new Field(By.xpath("//div[@id='td-popup']/table/tbody/tr[4]/td[2]/input"));
	public Field fieldInputData_5 = new Field(By.xpath("//div[@id='td-popup']/table/tbody/tr[5]/td[2]/input"));
	public Field fieldInputData_6 = new Field(By.xpath("//div[@id='td-popup']/table/tbody/tr[6]/td[2]/input"));
	public Field fieldInputData_7 = new Field(By.xpath("//div[@id='td-popup']/table/tbody/tr[7]/td[2]/input"));
	public Field fieldInputData_8 = new Field(By.xpath("//div[@id='td-popup']/table/tbody/tr[8]/td[2]/input"));
	public Field fieldInputValuta_1 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[1]"));
	public Field fieldInputValuta_2 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[2]"));
	public Field fieldInputValuta_3 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[3]"));
	public Field fieldInputValuta_4 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[4]"));
	public Field fieldInputValuta_5 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[5]"));
	public Field fieldInputValuta_6 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[6]"));
	public Field fieldInputValuta_7 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[7]"));
	public Field fieldInputValuta_8 = new Field(By.xpath("//div[@class='td-popup active']/table/tbody/tr[8]"));
	public Button buttonInputAddComment = new Button(By.xpath("//i[@class='fc-icon-comment2 add-comment']"));
	public Field fieldInputComment = new Field(By.className("comments"));
	public Button buttonInputDataClose = new Button(By.cssSelector("#td-popup > div.cross"));
	public Button buttonInputDataDelete = new Button(By.id("clear-popup"));
	public Button buttonInputDataColumDelete = new Button(By.id("clear-column"));
	public Button buttonInputDataLineDelete = new Button(By.id("clear-row"));
	public Label labelPromptIncorrectDay = new Label(By.id("alert"));
	public Button buttonPromptIncorrectDay = new Button(By.xpath("//span[@class='alert-button alert-button-danger']"));
	public Label labelDay_1 = new Label(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[1]"));
		
	//Третья таблица
	public Field fieldFactIncome_1 = new Field(By.xpath("//tbody[@class='_debit_']/tr[1]/td[1]"));
	public Field fieldFactIncome_3 = new Field(By.xpath("//tbody[@class='_debit_']/tr[3]/td[1]"));
	public Field fieldFactIncome_4 = new Field(By.xpath("//tbody[@class='_debit_']/tr[4]/td[1]"));
	public Field fieldFactIncome_5 = new Field(By.xpath("//tbody[@class='_debit_']/tr[5]/td[1]"));
	public Field fieldFactIncome_8 = new Field(By.xpath("//tbody[@class='_debit_']/tr[8]/td[1]"));
	public Field fieldPlanIncome_1 = new Field(By.xpath("//tbody[@class='_debit_']/tr[1]/td[2]"));
	public Field fieldPlanIncome_2 = new Field(By.xpath("//tbody[@class='_debit_']/tr[2]/td[2]"));
	public Field fieldPlanIncome_3 = new Field(By.xpath("//tbody[@class='_debit_']/tr[3]/td[2]"));
	public Field fieldPlanIncome_4 = new Field(By.xpath("//tbody[@class='_debit_']/tr[4]/td[2]"));
	public Field fieldPlanIncome_5 = new Field(By.xpath("//tbody[@class='_debit_']/tr[5]/td[2]"));
	public Field fieldPlanIncome_8 = new Field(By.xpath("//tbody[@class='_debit_']/tr[8]/td[2]"));
	public Field fieldFactSaldo = new Field(By.xpath("//tr[@id='third-saldo']/td[1]"));
	public Field fieldPlanSaldo = new Field(By.xpath("//tr[@id='third-saldo']/td[2]"));
	public Field fieldFactRashod_1 = new Field(By.xpath("//tbody[@class='_credit_']/tr[1]/td[1]"));
	public Field fieldPlanRashod_1 = new Field(By.xpath("//tbody[@class='_credit_']/tr[1]/td[2]"));
	public Field fieldFactRashod_2 = new Field(By.xpath("//tbody[@class='_credit_']/tr[2]/td[1]"));
	public Field fieldPlanRashod_2 = new Field(By.xpath("//tbody[@class='_credit_']/tr[2]/td[2]"));
	public Field fieldFactRashod_3 = new Field(By.xpath("//tbody[@class='_credit_']/tr[3]/td[1]"));
	public Field fieldPlanRashod_3 = new Field(By.xpath("//tbody[@class='_credit_']/tr[3]/td[2]"));
	public Field fieldFactRashod_38 = new Field(By.xpath("//tbody[@class='_credit_']/tr[38]/td[1]"));
	public Field fieldPlanRashod_38 = new Field(By.xpath("//tbody[@class='_credit_']/tr[38]/td[2]"));
	public Field fieldFactRashod_41 = new Field(By.xpath("//tbody[@class='_credit_']/tr[41]/td[1]"));
	public Field fieldPlanRashod_41 = new Field(By.xpath("//tbody[@class='_credit_']/tr[41]/td[2]"));
	public Field fieldPlan = new Field(By.id("forecast-plan"));
	public Field fieldPrognoz = new Field(By.id("forecast-fact"));
	public Field fieldNacenkaFact = new Field(By.id("overpay-fact"));
	public Field fieldNacenkaPlan = new Field(By.id("overpay-plan"));
	public Field fieldPribFact = new Field(By.id("totals-fact"));
	public Field fieldPribPlan = new Field(By.id("totals-plan"));
	
		//Фильтры
	public Button buttonStepBefore = new Button(By.xpath("//div[@class='icon-button back active']"));
	public Button buttonStepAfter = new Button(By.xpath("//div[@class='icon-button forward active']"));
	public Field fieldFixPlan = new Field(By.xpath("//div[@id='tbl']/div[4]/div[4]/div[3]/table/thead/tr/th[2]/span/span"));
	public Button buttonFixPlan = new Button(By.xpath("//span[@class='fix']"));
	public Button buttonDontFixPlan = new Button(By.xpath("//span[@class='unfix']"));
	public Button buttonAgreeDontFixPlan = new Button(By.xpath("//span[@class='alert-button alert-button-danger']"));
	public Button buttonFiltrPeriod = new Button(By.xpath("//span[@id='interval-drop']/span/span"));
	public Button buttonFiltrPeriodMonth = new Button(By.xpath("//span[@id='interval-drop']/span[3]/span/span[1]"));
	public Button buttonFiltrPeriod_7 = new Button(By.xpath("//span[@id='interval-drop']/span[3]/span/span[2]"));
	public Button buttonFiltrPeriod_14 = new Button(By.xpath("//span[@id='interval-drop']/span[3]/span/span[3]"));
	public Button buttonPrioritet = new Button(By.xpath("//span[@id='label-drop']/span/span"));
	public Button buttonPrioritetAll = new Button(By.xpath("//span[@id='label-drop']/span[3]/span/span[1]"));
	public Button buttonPrioritetHight = new Button(By.xpath("//span[@id='label-drop']/span[3]/span/span[2]"));
	public Button buttonPrioritetMedium = new Button(By.xpath("//span[@id='label-drop']/span[3]/span/span[3]"));
	public Button buttonPrioritetLaw = new Button(By.xpath("//span[@id='label-drop']/span[3]/span/span[4]"));
	public Button buttonPrioritetHightNastroyki = new Button(By.id("editlabelinput1"));
	public Button buttonPrioritetMediumNastroyki = new Button(By.id("editlabelinput2"));
	public Button buttonPrioritetLawNastroyki = new Button(By.id("editlabelinput3"));
	public Field fieldPrioritetIncome_5 = new Field(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr[5]/td/span[3]"));
	public Field fieldPrioritetRashod_3 = new Field(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr[3]/td/span[3]"));
	public Button buttonFiltrItog = new Button(By.xpath("//div[@class='wrapper']/div[4]/label/span"));
		
		//Категории
	public Button buttonAddKategori = new Button(By.id("add-category-to-list-cfm-button"));
	public Button buttonEditAddKategori = new Button(By.id("add-category-to-list-cfm-button-from-popup"));
	public Field fieldNameKategori = new Field(By.id("profile_edit_firstName"));
	public Field fieldEditNameKategori = new Field(By.id("edit_category-name"));
	public Button buttonAddIncome = new Button(By.id("base-type-deb"));
	public Button buttonAddRashod = new Button(By.id("base-type-cred"));
	public Field fieldKategori = new Field(By.linkText("Корневая категория"));
	public Field fieldKategoriDohod = new Field(By.linkText("Доходы"));
	public Field fieldKategoriRashod = new Field(By.linkText("Расходы"));
	public Field fieldKategoriProdazi = new Field(By.linkText("Доход от продаж"));
	public Field fieldKategoriKredit = new Field(By.linkText("Кредиты и др.поступления"));
	public Field fieldKategoriZarplata = new Field(By.linkText("Расходы на оплату труда"));
	public Field fieldKategoriKomunalni = new Field(By.linkText("Коммунальные платежи"));
	public Button buttonKategoriSave = new Button(By.id("new-category-create-btn"));
	public Button buttonEditKategoriSave = new Button(By.id("new-category-update-btn"));
	public Button buttonKategoriDelete_1 = new Button(By.xpath("//div[@class='popup-body']/div/div/i[1]"));
	public Button buttonKategoriDelete_2 = new Button(By.xpath("//div[@class='popup-body']/div/div/i[2]"));
	public Button buttonKategoriDelete_4 = new Button(By.xpath("//div[@class='popup-body']/div/div/i[4]"));
	public Button buttonKategoriAgreeDelete = new Button(By.xpath("//span[@class='alert-button alert-button-danger']"));
	public Button buttonKategoriDontAgreeDelete = new Button(By.cssSelector("span.alert-button"));
	public Button buttonKategoriClose = new Button(By.cssSelector("#add-category-to-list-cfm > div.header > div.cross.popup-close"));
	public Button buttonEditKategoriClose = new Button(By.cssSelector("#edit-cfm-list > div.header > div.cross.popup-close"));
		
		//Настройка валюты
	public Button buttonValuta = new Button(By.id("change-currency-cfm-button"));
	public Button buttonAddValuta = new Button(By.xpath("//div[@class='tab add add-new-currency-to-list']"));
	public Button buttonEditValuta = new Button(By.xpath("//div[@class='tab redact']"));
	public Field fieldAddUah = new Field(By.linkText("UAH"));
	public Field fieldAddUsd = new Field(By.linkText("USD"));
	public Field fieldAddRub = new Field(By.linkText("RUB"));
	public Field fieldAddEur = new Field(By.linkText("EUR"));
	public Button buttonAddNal = new Button(By.id("cash-id"));
	public Button buttonAddBeznal = new Button(By.id("noncash-id"));
	public Button buttonValutaSave = new Button(By.cssSelector("a.change-save-btn.change-currency-save-btn"));																
	public Button buttonNastroykiValuta_1 = new Button(By.xpath("//div[@id='currency_change_list']/div[1]/span"));
	public Button buttonNastroykiValuta_2 = new Button(By.xpath("//div[@id='currency_change_list']/div[2]/span"));
	public Button buttonDeleteValuta_1 = new Button(By.xpath("//div[@id='currency_change_list']/div[1]/i[2]"));
	public Button buttonDeleteValuta_2 = new Button(By.xpath("//div[@id='currency_change_list']/div[2]/i[2]"));
	public Button buttonDeleteValuta_3 = new Button(By.xpath("//div[@id='currency_change_list']/div[3]/i[2]"));
	public Button buttonAgreeDeleteValuta = new Button(By.xpath("//div[@class='list-alert']/div[2]/div[2]"));
	public Button buttonDontAgreeDeleteValuta = new Button(By.xpath("//div[@class='list-alert']/div[2]/div[1]"));
	public Button buttonValutaClose = new Button(By.xpath("//div[@id='change-currency-cfm']/div/div"));
	public Field fieldValuta_1 = new Field(By.xpath("//div[@id='currency_change_list']/div[1]/span"));
	public Field fieldValuta_2 = new Field(By.xpath("//div[@id='currency_change_list']/div[2]/span"));
	public Button buttonValutaNal_1 = new Button(By.xpath("//div[@id='currency_change_list']/div/input"));
	public Button buttonValutaBeznal_1 = new Button(By.xpath("//div[@id='currency_change_list']/div/input[2]"));
	public Button buttonValutaNal_2 = new Button(By.xpath("//div[@id='currency_change_list']/div[2]/input[1]"));
	public Button buttonValutaBeznal_2 = new Button(By.xpath("//div[@id='currency_change_list']/div[2]/input[2]"));
		
		//Валюта
	public Button buttonAllValuta = new Button(By.cssSelector("#currency-drop > span.fs-txt-uni > span"));
	public Button buttonValutaAll = new Button(By.xpath("//span[@id='currency-drop']/span[3]/span/span[1]"));
	public Button buttonValuta_1 = new Button(By.xpath("//span[@id='currency-drop']/span[3]/span/span[2]"));
	public Button buttonValuta_2 = new Button(By.xpath("//span[@id='currency-drop']/span[3]/span/span[3]"));
	public Button buttonValuta_3 = new Button(By.xpath("//span[@id='currency-drop']/span[3]/span/span[4]"));
	public Button buttonValuta_4 = new Button(By.xpath("//span[@id='currency-drop']/span[3]/span/span[5]"));
	public Button buttonValuta_5 = new Button(By.xpath("//span[@id='currency-drop']/span[3]/span/span[6]"));
	public Button buttonValuta_6 = new Button(By.xpath("//span[@id='currency-drop']/span[3]/span/span[7]"));
	public Button buttonValuta_7 = new Button(By.xpath("//span[@id='currency-drop']/span[3]/span/span[8]"));
	public Button buttonValuta_8 = new Button(By.xpath("//span[@id='currency-drop']/span[3]/span/span[9]"));
		
		//Бюджет
	public Label fieldBudzetTitle = new Label(By.xpath("//div[@class='uni-title wrapper-uni-title']"));
	public Label fieldBudzetSave = new Label(By.id("made-budget"));
	public Label fieldBudzetAgreeSave = new Label(By.xpath("//span[@class='alert-button alert-button-danger']"));
	public Button buttonBudzetClose = new Button(By.cssSelector("#change-budget > div.header > div.cross.popup-close"));
	public Button buttonBudzet = new Button(By.id("change-budget-button"));
	public Button buttonBudzetMath = new Button(By.xpath("//ul[@class='popup-radios']/li[1]/label/span"));
	public Button buttonBudzetKlient = new Button(By.xpath("//ul[@class='popup-radios']/li[2]/label/span"));
	public Field fieldBudzetMonthBefore = new Field(By.xpath("//div[@id='change-budget']/div[2]/a[1]/span"));
	public Field fieldBudzetMonthAfter = new Field(By.xpath("//div[@id='change-budget']/div[2]/a[3]/span"));
	public Field fieldBudzetYearBefore = new Field(By.xpath("//div[@id='change-budget']/div[2]/a[2]/span"));
	public Field fieldBudzetYearAfter = new Field(By.xpath("//div[@id='change-budget']/div[2]/a[4]/span"));
	public Field fieldBudzetYear_15 = new Field(By.xpath("//a[@rel='2015']"));
	public Field fieldBudzetYear_16 = new Field(By.xpath("//a[@rel='2016']"));
	public Field fieldBudzetMonth = new Field(By.xpath("//select[@id='end-month']"));
	public Field fieldBudzetYear = new Field(By.xpath("//select[@id='end-year']"));
	
	
	public Field fieldBudzetIncome = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr/td"));
	public Field fieldBudzetRashod = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr/td"));
	public Field fieldBudzetFinans = new Field(By.xpath("//div[@class='first-table']/table[4]/tbody/tr/td"));
	
	public Field fieldBudzetIncome_1 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[1]"));
	public Field fieldBudzetIncome_2 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[2]/td"));
	public Field fieldBudzetIncome_3 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[3]"));
	public Field fieldBudzetIncome_4 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[4]/td/span"));
	public Field fieldBudzetIncome_5 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[5]/td/span"));
	public Field fieldBudzetIncome_6 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[6]/td/span"));
	public Field fieldBudzetIncome_7 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[7]"));
	public Field fieldBudzetIncome_8 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[8]/td/span"));
	public Field fieldBudzetIncome_9 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[9]/td/span"));
	public Field fieldBudzetIncome_10 = new Field(By.xpath("//div[@class='first-table']/table[1]/tbody/tr[10]/td/span"));
	public Field fieldBudzetNacenca = new Field(By.xpath("//div[@class='first-table']/table[2]/tbody/tr[1]"));
	public Field fieldBudzetPay = new Field(By.xpath("//div[@class='first-table']/table[2]/tbody/tr[2]"));
	public Field fieldBudzetRashod_1 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[1]"));
	public Field fieldBudzetRashod_2 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[2]"));
	public Field fieldBudzetRashod_3 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[3]/td/span"));
	public Field fieldBudzetRashod_4 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[4]/td/span"));
	public Field fieldBudzetRashod_5 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[5]"));
	public Field fieldBudzetRashod_6 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[6]/td/span"));
	public Field fieldBudzetRashod_7 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[7]/td/span"));
	public Field fieldBudzetRashod_8 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[8]/td/span"));
	public Field fieldBudzetRashod_9 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[9]/td/span"));
	public Field fieldBudzetRashod_10 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[10]/td/span"));
	public Field fieldBudzetRashod_11 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[11]/td/span"));
	public Field fieldBudzetRashod_12 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[12]"));
	public Field fieldBudzetRashod_13 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[13]/td/span"));
	public Field fieldBudzetRashod_14 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[14]/td/span"));
	public Field fieldBudzetRashod_15 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[15]/td/span"));
	public Field fieldBudzetRashod_16 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[16]/td/span"));
	public Field fieldBudzetRashod_17 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[17]/td/span"));
	public Field fieldBudzetRashod_18 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[18]/td/span"));
	public Field fieldBudzetRashod_19 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[19]/td/span"));
	public Field fieldBudzetRashod_20 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[20]/td/span"));
	public Field fieldBudzetRashod_21 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[21]/td/span"));
	public Field fieldBudzetRashod_22 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[22]"));
	public Field fieldBudzetRashod_23 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[23]/td/span"));
	public Field fieldBudzetRashod_24 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[24]/td/span"));
	public Field fieldBudzetRashod_25 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[25]/td/span"));
	public Field fieldBudzetRashod_26 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[26]"));
	public Field fieldBudzetRashod_27 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[27]/td/span"));
	public Field fieldBudzetRashod_28 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[28]/td/span"));
	public Field fieldBudzetRashod_29 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[29]/td/span"));
	public Field fieldBudzetRashod_30 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[30]/td/span"));
	public Field fieldBudzetRashod_31 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[31]"));
	public Field fieldBudzetRashod_32 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[32]/td/span"));
	public Field fieldBudzetRashod_33 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[33]/td/span"));
	public Field fieldBudzetRashod_34 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[34]"));
	public Field fieldBudzetRashod_35 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[35]/td/span"));
	public Field fieldBudzetRashod_36 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[36]/td/span"));
	public Field fieldBudzetRashod_37 = new Field(By.xpath("//div[@class='first-table']/table[3]/tbody/tr[37]/td/span"));
	public Field fieldBudzetFinans_1 = new Field(By.xpath("//div[@class='first-table']/table[4]/tbody/tr[1]"));
	public Field fieldBudzetFinans_2 = new Field(By.xpath("//div[@class='first-table']/table[4]/tbody/tr[2]/td/span[1]"));
	public Field fieldBudzetFinans_3 = new Field(By.xpath("//div[@class='first-table']/table[4]/tbody/tr[3]/td/span[1]"));
	public Field fieldBudzetFinans_4 = new Field(By.xpath("//div[@class='first-table']/table[4]/tbody/tr[4]/td/span[1]"));
	public Field fieldBudzetFinans_5 = new Field(By.xpath("//div[@class='first-table']/table[4]/tbody/tr[5]/td/span[1]"));
	public Field fieldBudzetDohod_1 = new Field(By.xpath("//div[@class='first-table']/table[5]/tbody/tr[1]"));
	public Field fieldBudzetDohod_2 = new Field(By.xpath("//div[@class='first-table']/table[5]/tbody/tr[2]"));
	public Field fieldBudzetDohod_3 = new Field(By.xpath("//div[@class='first-table']/table[5]/tbody/tr[3]"));
		
	//Валютный календарь
	public Button buttonValutaKalendar = new Button(By.xpath("//a[@class='fc-button fc-popup-button fc-currency-calculation']"));
	public Field fieldValutaKalendarValuta_1 = new Field(By.xpath("//td[@data-day='1']/label[1]"));
	public Field fieldValutaKalendarValuta_2 = new Field(By.xpath("//td[@data-day='1']/label[2]"));
	public Field fieldValutaKalendarValuta_3 = new Field(By.xpath("//td[@data-day='1']/label[3]"));
	public Field fieldValutaKalendarData_1_1 = new Field(By.xpath("//td[@data-day='1']/input[1]"));
	public Field fieldValutaKalendarData_1_2 = new Field(By.xpath("//td[@data-day='1']/input[2]"));
	public Field fieldValutaKalendarData_1_3 = new Field(By.xpath("//td[@data-day='1']/input[3]"));
	public Field fieldValutaKalendarData_10_1 = new Field(By.xpath("//td[@data-day='10']/input[1]"));
	public Field fieldValutaKalendarData_10_2 = new Field(By.xpath("//td[@data-day='10']/input[2]"));
	public Field fieldValutaKalendarData_10_3 = new Field(By.xpath("//td[@data-day='10']/input[3]"));
	public Field fieldValutaKalendarData_20_1 = new Field(By.xpath("//td[@data-day='20']/input[1]"));
	public Field fieldValutaKalendarData_20_2 = new Field(By.xpath("//td[@data-day='20']/input[2]"));
	public Field fieldValutaKalendarData_20_3 = new Field(By.xpath("//td[@data-day='20']/input[3]"));
	public Button buttonValutaKalendarClose = new Button(By.cssSelector("#currency-calendar > div.header > div.cross.popup-calendar-close"));																									
	
		
	//Расходы прошлого периода 
	public Button buttonProshlyPeriod = new Button(By.xpath("//div[@class='copy-charges-min']"));
	public Button buttonAgreeProshlyPeriod = new Button(By.xpath("//span[@class='alert-button alert-button-danger']"));
	public Button buttonDontAgreeProshlyPeriod = new Button(By.xpath("//span[@class='alert-button']"));
			
		//Иное
	public Label labelTitle = new Label(By.xpath("//div[@class='wrapper cfm-wrapper clearfix']/div[2]/h2"));
	public Button buttonUdp = new Button(By.linkText("Управление денежными потоками"));
	public Button buttonNastroyki = new Button(By.xpath("//span[@class='fake-select settings']"));
	
	
	
	//Methods
	public void optionUdp(WebDriver driver) throws InterruptedException {
			
		//Открываем "Прогноз выручки"
		buttonUdp.click();
		Thread.sleep(5000);
		}
	
	public String promptUdpDontOpen(WebDriver driver) throws InterruptedException {
		
		//Открываем "Прогноз выручки"
		Actions toolTip = new Actions(driver);
		WebElement textPrompt = driver.findElement(By.linkText("Управление денежными потоками"));
		
		//Получаем текст подсказки
		toolTip.moveToElement(textPrompt).build().perform();
		WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));
		
		String toolTipText = toolTipElement.getText();
		return toolTipText;
	}
		
	public void GoBeforeMonth(WebDriver driver) throws InterruptedException {
		//Переходим в следующий месяц
		buttonMonthBefore.click();
		Thread.sleep(10000);
	}
	
	public void GoAfterMonth(WebDriver driver) throws InterruptedException {
		//Переходим в следующий месяц 
		buttonMonthAfter.click();
		Thread.sleep(15000);
	}
	
	public String countList(WebDriver driver) {
		
		return fieldAllList.getAttribute("data-count");
	}
	
	public int countValuta(WebDriver driver) {
		
		return driver.findElements(By.xpath("//span[@id='currency-drop']/span[3]/span/span")).size();
	}
	
	public int countValutaNastroyki(WebDriver driver) {
		
		return driver.findElements(By.xpath("//div[@id='currency_change_list']/div")).size();
	}
	
	public int countDays(WebDriver driver) {
		
		return driver.findElements(By.xpath("//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th")).size();
	}
	
	public int countValutaKalendar(WebDriver driver) {
		
		return driver.findElements(By.xpath("//td[@data-day='1']/label")).size();
	}
	
	public int countValutaField(WebDriver driver) {
		
		return driver.findElements(By.xpath("//div[@class='td-popup active']/table/tbody/tr")).size();
	}
		
	public void RashodMonth(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем Расходы за
		buttonFiltrPeriod.click();
		Thread.sleep(1000);
				
		//Выбираем Неделя
		buttonFiltrPeriodMonth.click();
	}
	
	public void Rashod_7Days(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем Расходы за
		buttonFiltrPeriod.click();
		Thread.sleep(1000);
				
		//Выбираем Неделя
		buttonFiltrPeriod_7.click();
	}
	
	public void Rashod_14Days(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем Расходы за
		buttonFiltrPeriod.click();
		Thread.sleep(1000);
				
		//Выбираем 2 недели
		buttonFiltrPeriod_14.click();
	}
	
	public void GoBudzetMath(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем настройки
		buttonNastroyki.click();	
		Thread.sleep(1000);
											    
		//Выбираем Бюджет за период
		buttonBudzet.click();
		Thread.sleep(1000);
				
		//Выбираем Математическим образом
		buttonBudzetMath.click();
				
		//Нажимаем Сформировать
		fieldBudzetSave.click();	
		Thread.sleep(1000);
		
	}
	
	public void GoBudzetKlient(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();	
		Thread.sleep(1000);
													    
		//Выбираем Бюджет за период
		buttonBudzet.click();
		Thread.sleep(1000);
				
		//Выбираем по клиентам
		buttonBudzetKlient.click();
				
		//Нажимаем Сформировать
		fieldBudzetSave.click();	
		Thread.sleep(1000);
		
	}
		
	public void GoTuValuta(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
				
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
						
		//Нажимаем Редактирование валюты
		buttonEditValuta.click();	
		Thread.sleep(1000);
	}
	
	public void GoTuValuta_2(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
				
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
	}
	
	public void AddUahNal(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
		
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
		
		//Выбираем Гривна
		fieldAddUah.click();	
		Thread.sleep(1000);
		fieldAddUah.click();	
		
		//Ставим тип - Наличный
		buttonAddNal.click();	
		
		//Нажимаем Сохранить
		buttonValutaSave.click();	
		Thread.sleep(5000);
	}
	
	public void AddUahBeznal(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
		
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
		
		//Выбираем Гривна
		fieldAddUah.click();	
		Thread.sleep(1000);
		fieldAddUah.click();	
		
		//Ставим тип - Безналичный
		buttonAddBeznal.click();	
		
		//Нажимаем Сохранить
		buttonValutaSave.click();	
		Thread.sleep(5000);
	}
	
	public void AddRubNal(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
		
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
		
		//Выбираем Рубль
		fieldAddUah.click();	
		Thread.sleep(1000);
		fieldAddRub.click();	
		
		//Ставим тип - Наличный
		buttonAddNal.click();	
		
		//Нажимаем Сохранить
		buttonValutaSave.click();	
		Thread.sleep(5000);
	}

	public void AddRubBeznal(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
		
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
		
		//Выбираем Рубль
		fieldAddUah.click();	
		Thread.sleep(1000);
		fieldAddRub.click();	
		
		//Ставим тип - Безналичный
		buttonAddBeznal.click();	
		
		//Нажимаем Сохранить
		buttonValutaSave.click();	
		Thread.sleep(5000);
	}

	public void AddUsdNal(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
		
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
		
		//Выбираем Доллар
		fieldAddUah.click();	
		Thread.sleep(1000);
		fieldAddUsd.click();	
		
		//Ставим тип - Наличный
		buttonAddNal.click();	
		
		//Нажимаем Сохранить
		buttonValutaSave.click();	
		Thread.sleep(5000);
	}

	public void AddUsdBeznal(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
		
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
		
		//Выбираем Доллар
		fieldAddUah.click();	
		Thread.sleep(1000);
		fieldAddUsd.click();	
		
		//Ставим тип - Безналичный
		buttonAddBeznal.click();	
		
		//Нажимаем Сохранить
		buttonValutaSave.click();	
		Thread.sleep(5000);
	}

	public void AddEurNal(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
		
		//Нажимаем Управление валютой
		buttonValuta.click();
		Thread.sleep(1000);
		
		//Выбираем Евро
		fieldAddUah.click();	
		Thread.sleep(1000);
		fieldAddEur.click();	
		
		//Ставим тип - Наличный
		buttonAddNal.click();	
		
		//Нажимаем Сохранить
		buttonValutaSave.click();	
		Thread.sleep(5000);
	}

	public void AddEurBeznal(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();
		Thread.sleep(1000);
		
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
		
		//Выбираем Евро
		fieldAddUah.click();	
		Thread.sleep(1000);
		fieldAddEur.click();	
		
		//Ставим тип - Безналичный
		buttonAddBeznal.click();	
		
		//Нажимаем Сохранить
		buttonValutaSave.click();	
		Thread.sleep(5000);
	}
	
	public void KursValut(WebDriver driver) throws InterruptedException {
		
		//Открываем валютный календарь
		buttonValutaKalendar.click();
		Thread.sleep(1000);
				
		//Вводим значение доллара
		fieldValutaKalendarData_1_1.sendKeys(empty_6);
		fieldValutaKalendarData_1_1.sendKeys(dataDollar);
		fieldValutaKalendarData_10_1.click();
		Thread.sleep(3000);
				
		//Вводим значение евро
		fieldValutaKalendarData_1_2.sendKeys(empty_6);
		fieldValutaKalendarData_1_2.sendKeys(dataEuro);
		fieldValutaKalendarData_10_1.click();
		Thread.sleep(3000);
				
		//Вводим значение рубля
		fieldValutaKalendarData_1_3.sendKeys(empty_6);
		fieldValutaKalendarData_1_3.sendKeys(dataRubl);
		fieldValutaKalendarData_10_1.click();
		Thread.sleep(3000);
				
		//Закрываем валютный календарь
		buttonValutaKalendarClose.click();
		Thread.sleep(1000);
	}
	
	public void DeleteValuta_1(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();	
		Thread.sleep(1000);
				
		//Нажимаем Управление валютой
		buttonValuta.click();	
		Thread.sleep(1000);
				
		//Открываем Редактировать
		buttonEditValuta.click();	
		Thread.sleep(1000);
				
		//Нажимаем на знак удаления
		buttonDeleteValuta_2.click();	
		Thread.sleep(1000);
				
		//Нажимаем Удалить
		buttonAgreeDeleteValuta.click();	
		Thread.sleep(3000);		
				
		//Закрываем окно
		buttonValutaClose.click();
		Thread.sleep(1000);
	}
	
	public void AddListUslugaRoznica(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Розница"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonRoznica.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddListUslugaIndividualni(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Индивидуальный"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonIndividualni.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddListUslugaProizvodstvo(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Производство"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonProizvodstvo.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListUslugaUslugaTovar(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Продажи"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonUslugaTovar.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListUslugaUsluga(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Индивидуальный"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonUsluga.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListUslugaOpt(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Индивидуальный"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonOpt.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListTovarRoznica(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Розница"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonRoznica.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddListTovarIndividualni(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Индивидуальный"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonIndividualni.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddListTovarProizvodstvo(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Производство"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonProizvodstvo.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListTovarUslugaTovar(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Шаблон Услуги + Продажа товаров"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonUslugaTovar.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListTovarUsluga(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Услуга"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonUsluga.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListTovarOpt(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Опт"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonOpt.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddListUslugaRoznicaCu(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Розница"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonRoznica.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddListUslugaIndividualniCu(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Индивидуальный"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonIndividualni.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddListUslugaProizvodstvoCu(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Производство"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonProizvodstvo.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListUslugaUslugaTovarCu(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Продажи"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonUslugaTovar.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListUslugaUslugaCu(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Индивидуальный"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonUsluga.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListUslugaOptCu(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Услуги"
		buttonListUsluga.click();
						
		//Выбираем шаблон "Индивидуальный"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonOpt.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListTovarRoznicaCu(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Розница"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonRoznica.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddListTovarIndividualniCu(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Индивидуальный"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonIndividualni.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddListTovarProizvodstvoCu(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Производство"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldShablonProizvodstvo.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListTovarUslugaTovarCu(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Шаблон Услуги + Продажа товаров"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonUslugaTovar.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListTovarUslugaCu(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Услуга"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonUsluga.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}

	public void AddListTovarOptCu(WebDriver driver) throws InterruptedException {
	
		//Разворачиваем листы УДП
		fieldAllList.click();
		Thread.sleep(1000);
					
		//Нажимаем "Добавить лист УДП"
		fieldAddList.click();
						
		//Вводим название
		fieldListName.sendKeys(listName);
						
		//Выбираем тип "Товар"
		buttonListTovar.click();
						
		//Выбираем шаблон "Опт"
		fieldShablonRoznica.click();
		Thread.sleep(1000);
		fieldListShablonOpt.click();
		
		//Добавляем ЦУ
		buttonCenterFirst.click();
						    
		//Нажимаем "Создать"
		buttonSaveList.click();		
		Thread.sleep(25000);
	}
	
	public void AddKategoriIncome(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();	
		Thread.sleep(1000);
		
		//Выбираем Добавить категорию
		buttonAddKategori.click();
		Thread.sleep(1000);
		
		//Вводим название категории
		fieldNameKategori.sendKeys(kategoryDohodName);
				
		//Выбираем Поступления
		buttonAddIncome.click();
		
		//Выбираем Корневая категория
		fieldKategori.click();
		Thread.sleep(1000);
		fieldKategori.click();
				
		//Нажимаем создать
		buttonKategoriSave.click();
		Thread.sleep(3000);
						
		//Закрываем окно
		buttonKategoriClose.click();
		Thread.sleep(1000);
	}
	
	public void AddPodkategoriIncome(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();	
		Thread.sleep(1000);
		
		//Выбираем Добавить категорию
		buttonAddKategori.click();
		Thread.sleep(1000);
		
		//Вводим название категории
		fieldNameKategori.sendKeys(podkategoryDohodName);
				
		//Выбираем Поступления
		buttonAddIncome.click();
		
		//Выбираем категорию Продажи
		fieldKategori.click();
		Thread.sleep(1000);
		fieldKategoriProdazi.click();
				
		//Нажимаем создать
		buttonKategoriSave.click();
		Thread.sleep(3000);
						
		//Закрываем окно
		buttonKategoriClose.click();
		Thread.sleep(1000);
	}
	
	public void AddPodkategoriIncome_2(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();	
		Thread.sleep(1000);
		
		//Выбираем Добавить категорию
		buttonAddKategori.click();
		Thread.sleep(1000);
		
		//Вводим название категории
		fieldNameKategori.sendKeys(podkategoryDohodName);
				
		//Выбираем Поступления
		buttonAddIncome.click();
		
		//Выбираем категорию Продажи
		fieldKategori.click();
		Thread.sleep(1000);
		fieldKategoriDohod.click();
				
		//Нажимаем создать
		buttonKategoriSave.click();
		Thread.sleep(3000);
						
		//Закрываем окно
		buttonKategoriClose.click();
		Thread.sleep(1000);
	}
	
	public void DeletePodkategoriIncome(WebDriver driver) throws InterruptedException {
		
		//Нажимаем карандаш в Поступлениях
		buttonEditIncome.click();
		Thread.sleep(1000);
				
		//Удаляем первую подкатегорию
		buttonKategoriDelete_1.click();
				
		//Нажимаем Удалить
		buttonKategoriAgreeDelete.click();
		Thread.sleep(3000);
						
		//Закрываем окно
		buttonEditKategoriClose.click();
		Thread.sleep(1000);
	}
	
	public void DeleteKategoriRashod(WebDriver driver) throws InterruptedException {
		
		//Нажимаем карандаш в Расходах
		buttonEditRashod.click();
		Thread.sleep(1000);
				
		//Удаляем первую категорию
		buttonKategoriDelete_1.click();
				
		//Нажимаем Удалить
		buttonKategoriAgreeDelete.click();
		Thread.sleep(3000);
						
		//Закрываем окно
		buttonEditKategoriClose.click();
		Thread.sleep(1000);
	}
	
	public void AddKategoriRashod(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();	
		Thread.sleep(1000);
		
		//Выбираем Добавить категорию
		buttonAddKategori.click();
		Thread.sleep(1000);
		
		//Вводим название категории
		fieldNameKategori.sendKeys(kategoryRashodName);
				
		//Выбираем Расходы
		buttonAddRashod.click();
		
		//Выбираем Корневая категория
		fieldKategori.click();
		Thread.sleep(1000);
		fieldKategori.click();
				
		//Нажимаем создать
		buttonKategoriSave.click();
		Thread.sleep(3000);
						
		//Закрываем окно
		buttonKategoriClose.click();
		Thread.sleep(1000);
	}
	
	public void AddPodkategoriRashod(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();	
		Thread.sleep(1000);
		
		//Выбираем Добавить категорию
		buttonAddKategori.click();
		Thread.sleep(1000);
		
		//Вводим название категории
		fieldNameKategori.sendKeys(podkategoryRashodName);
				
		//Выбираем Расходы
		buttonAddRashod.click();
		
		//Выбираем категорию ЗП
		fieldKategori.click();
		Thread.sleep(1000);
		fieldKategoriZarplata.click();
				
		//Нажимаем создать
		buttonKategoriSave.click();
		Thread.sleep(3000);
						
		//Закрываем окно
		buttonKategoriClose.click();
		Thread.sleep(1000);
	}
	
	public void AddPodkategoriRashod_2(WebDriver driver) throws InterruptedException {
		
		//Разворачиваем настройки
		buttonNastroyki.click();	
		Thread.sleep(1000);
		
		//Выбираем Добавить категорию
		buttonAddKategori.click();
		Thread.sleep(1000);
		
		//Вводим название категории
		fieldNameKategori.sendKeys(podkategoryRashodName);
				
		//Выбираем Расходы
		buttonAddRashod.click();
		
		//Выбираем категорию ЗП
		fieldKategori.click();
		Thread.sleep(1000);
		fieldKategoriRashod.click();
				
		//Нажимаем создать
		buttonKategoriSave.click();
		Thread.sleep(3000);
						
		//Закрываем окно
		buttonKategoriClose.click();
		Thread.sleep(1000);
	}
	
	public int countKategoriIncome(WebDriver driver) throws InterruptedException {
		
		//Количество категорий в Поступлениях
		return driver.findElements(By.xpath("//table[@class='table-medium income-table table-bordered']/tbody/tr")).size()/2;
	}

	public int countKategoriRashod(WebDriver driver) throws InterruptedException {
	
		//Количество категорий в Расходах
		return driver.findElements(By.xpath("//table[@class='table-medium charges-table table-bordered']/tbody/tr")).size()/2;
	}
	
	public int countKategoriNastroyki(WebDriver driver) throws InterruptedException {
		
		//Количество категорий в Настройках
		return driver.findElements(By.xpath("//div[@class='popup-body']/div/div/div")).size()-3;
	}
		
	public int countKategoriSaldo(WebDriver driver) throws InterruptedException {
		
		//Количество категорий в Сальдо
		return driver.findElements(By.xpath("//table[@class='table-medium saldo-table  table-bordered']/tbody/tr")).size()/2;
	}
	
	public void DeleteListUdp(WebDriver driver) throws InterruptedException {
		
		//Получаем количество листов УДП (-1 Демо-лист)
		String countListBefore = fieldAllList.getAttribute("data-count");
				
		int listBefore;
		for (listBefore = Integer.parseInt(countListBefore)-1; listBefore >0 ; listBefore--)
			{					
			//Разворачиваем настройки
			buttonNastroyki.click();
			Thread.sleep(1000);
												    
			//Выбираем Редактировать лист УДП
			buttonEditing.click();
									    
			//Нажимаем удалить
			buttonListDelete.click();
							    
			//Соглашаемся
			buttonListAgreeDelete.click();
			Thread.sleep(5000);
			}
	}
	
	public int FindToday(WebDriver driver) throws InterruptedException {
		
		//Получаем текущий день
		int today = 0;
		if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_1)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_1)).getAttribute("class")))
			today = 1;
			else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_2)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_2)).getAttribute("class")))
				today = 2;
				else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_3)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_3)).getAttribute("class")))
					today = 3;
					else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_4)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_4)).getAttribute("class")))
						today = 4;
						else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_5)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_5)).getAttribute("class")))
							today = 5;
							else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_6)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_6)).getAttribute("class")))
								today = 6;
								else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_7)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_7)).getAttribute("class")))
									today = 7;
									else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_8)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_8)).getAttribute("class")))
										today = 8;
										else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_9)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_9)).getAttribute("class")))
											today = 9;
											else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_10)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_10)).getAttribute("class")))
												today = 10;
												else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_11)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_11)).getAttribute("class")))
													today = 11;
													else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_12)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_12)).getAttribute("class")))
														today = 12;
														else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_13)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_13)).getAttribute("class")))
															today = 13;
															else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_14)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_14)).getAttribute("class")))
																today = 14;
																else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_15)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_15)).getAttribute("class")))
																	today = 15;
																	else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_16)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_16)).getAttribute("class")))
																		today = 16;
																		else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_17)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_17)).getAttribute("class")))
																			today = 17;
																			else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_18)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_18)).getAttribute("class")))
																				today = 18;
																				else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_19)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_19)).getAttribute("class")))
																					today = 19;
																					else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_20)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_20)).getAttribute("class")))
																						today = 20;
																						else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_21)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_21)).getAttribute("class")))
																							today = 21;
																							else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_22)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_22)).getAttribute("class")))
																								today = 22;
																								else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_23)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_23)).getAttribute("class")))
																									today = 23;
																									else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_24)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_24)).getAttribute("class")))
																										today = 24;
																										else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_25)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_25)).getAttribute("class")))
																											today = 25;
																											else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_26)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_26)).getAttribute("class")))
																												today = 26;
																												else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_27)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_27)).getAttribute("class")))
																													today = 27;
																													else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_28)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_28)).getAttribute("class")))
																														today = 28;
																														else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_29)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_29)).getAttribute("class")))
																															today = 29;
																															else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_30)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_30)).getAttribute("class")))
																																today = 30;
																																else if (checkTodayWork.equals(driver.findElement(By.xpath(udpDay_31)).getAttribute("class"))||checkTodayHoliday.equals(driver.findElement(By.xpath(udpDay_31)).getAttribute("class")))
																																	today = 31;
		
		return today;
	}
	
	public void InputDataIncome_5_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_5_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_5_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_5_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataIncome_5_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldIncome_5_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	public void InputDataIncome_6_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_6_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_6_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_6_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataIncome_6_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldIncome_6_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_7_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_7_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_7_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_7_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataIncome_7_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldIncome_7_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_9_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_9_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_9_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_9_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataIncome_9_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldIncome_9_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_10_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_10_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_10_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_10_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataIncome_10_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldIncome_10_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_11_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_11_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataIncome_11_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldIncome_11_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataIncome_11_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldIncome_11_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_4_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_4_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_3_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_3_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_3_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_3_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataRashod_3_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldRashod_3_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_6_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_6_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_6_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_6_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataRashod_6_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldRashod_6_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_13_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_13_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_13_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_13_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataRashod_13_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldRashod_13_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_23_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_23_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_23_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_23_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataRashod_23_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldRashod_23_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_27_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_27_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_27_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_27_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataRashod_27_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldRashod_27_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_32_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_32_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_32_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_32_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataRashod_32_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldRashod_32_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_35_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_35_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();			
	}
	
	public void InputDataRashod_35_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_35_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataRashod_35_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldRashod_35_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_39_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_39_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_39_2(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_39_2.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataRashod_39_3(WebDriver driver) throws InterruptedException {
	
		//Вводим значение
		fieldRashod_39_3.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
	
	public void InputDataRashod_40_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_40_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}

	public void InputDataRashod_42_1(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldRashod_42_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();		
	}
		
	public void InputDataIncomeComment(UdpPage udpPage) throws InterruptedException {
		//Вводим значение c комментарием
		fieldIncome_5_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputAddComment.click();
		fieldInputComment.sendKeys(dataComment);
		buttonInputDataClose.click();
		Thread.sleep(1000);
	}
	
	public void InputDataIncomeCommentNew(UdpPage udpPage) throws InterruptedException {
		//Вводим значение c комментарием
		fieldIncome_5_1.click();
		fieldInputData_1.sendKeys(empty_15);
		fieldInputData_1.sendKeys(dataCeloe_2000);
		fieldInputComment.sendKeys(empty_15);
		fieldInputComment.sendKeys(dataCommentNew);
		buttonInputDataClose.click();
		Thread.sleep(1000);
	}
	
	public void InputOstatok(WebDriver driver) throws InterruptedException {
		
		//Вводим значение
		fieldOstatok.click();
		fieldOstatok_1.sendKeys(empty_15);
		fieldOstatok_1.sendKeys(dataCeloe_1000);
		fieldOstatok_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	public void CopiRashod(WebDriver driver) throws InterruptedException {
		
		//Сворачиваем поступления и расходы
		fieldKategoriIncome_1.click();
		fieldKategoriRashod_1.click();
		//Переносим значения
		buttonProshlyPeriod.click();
		buttonAgreeProshlyPeriod.click();
		Thread.sleep(5000);
		//Разворачиваем расходы
		fieldKategoriRashod_1.click();
	}
	
	public void InputUdp(WebDriver driver) throws InterruptedException {
		
		//Набираем кассу
		fieldIncome_5_1.click();
		fieldInputData_1.sendKeys(dataCeloe_30000);
		buttonInputDataClose.click();
		fieldIncome_5_10.click();
		fieldInputData_1.sendKeys(dataCeloe_30000);
		buttonInputDataClose.click();
		fieldIncome_5_28.click();
		fieldInputData_1.sendKeys(dataCeloe_30000);
		buttonInputDataClose.click();
		//Набираем Финансовые
		fieldIncome_9_1.click();
		fieldInputData_1.sendKeys(dataCeloe_5000);
		buttonInputDataClose.click();
		fieldIncome_9_10.click();
		fieldInputData_1.sendKeys(dataCeloe_5000);
		buttonInputDataClose.click();
		fieldIncome_9_28.click();
		fieldInputData_1.sendKeys(dataCeloe_5000);
		buttonInputDataClose.click();
		//Сворачиваем категорию Поступления
		fieldKategoriIncome_1.click();
		
		//Набираем Расходы
		fieldRashod_3_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_3_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_3_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_2.click();
		fieldRashod_6_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_6_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_6_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_5.click();
		fieldRashod_13_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_13_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_13_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_12.click();
		fieldRashod_23_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_23_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_23_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_22.click();
		fieldRashod_27_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_27_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_27_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_26.click();
		fieldRashod_32_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_32_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_32_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_31.click();
		fieldRashod_35_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_35_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_35_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_34.click();
		fieldRashod_39_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_39_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_39_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		//Разворачиваем категорию Поступления
		fieldKategoriIncome_1.click();		
	}	
	
	public void InputUdp_2(WebDriver driver) throws InterruptedException {
		
		//Набираем кассу
		fieldIncome_5_1.click();
		fieldInputData_1.sendKeys(dataCeloe_30000);
		buttonInputDataClose.click();
		fieldIncome_5_10.click();
		fieldInputData_1.sendKeys(dataCeloe_30000);
		buttonInputDataClose.click();
		fieldIncome_5_28.click();
		fieldInputData_1.sendKeys(dataCeloe_30000);
		buttonInputDataClose.click();
		//Набираем Финансовые
		fieldIncome_9_1.click();
		fieldInputData_1.sendKeys(dataCeloe_5000);
		buttonInputDataClose.click();
		fieldIncome_9_10.click();
		fieldInputData_1.sendKeys(dataCeloe_5000);
		buttonInputDataClose.click();
		fieldIncome_9_28.click();
		fieldInputData_1.sendKeys(dataCeloe_5000);
		buttonInputDataClose.click();
		//Сворачиваем категорию Поступления
		fieldKategoriIncome_1.click();
		
		//Набираем Расходы
		fieldRashod_3_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_3_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_3_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_2.click();
		fieldRashod_6_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_6_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_6_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_5.click();
		fieldRashod_13_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_13_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_13_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_12.click();
		fieldRashod_23_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_23_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_23_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_22.click();
		fieldRashod_27_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_27_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_27_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_26.click();
		fieldRashod_32_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_32_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_32_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_31.click();
		fieldRashod_35_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_35_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_35_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_34.click();
		fieldRashod_37_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_37_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_37_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldKategoriRashod_36.click();
		fieldRashod_41_1.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_41_10.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		fieldRashod_41_28.click();
		fieldInputData_1.sendKeys(dataCeloe_1000);
		buttonInputDataClose.click();
		//Разворачиваем категорию Поступления
		fieldKategoriIncome_1.click();		
	}	
	
	public void InputNacenka(WebDriver driver) throws InterruptedException {
		
		//Ставим Наценка по факту 100%
		fieldNacenkaFact.sendKeys(empty_6);
		fieldNacenkaFact.sendKeys(dataPercent_100);
		fieldNacenkaFact.sendKeys(Keys.ENTER);
					
		//Ставим Наценка по плану 100%	
		fieldNacenkaPlan.sendKeys(empty_6);
		fieldNacenkaPlan.sendKeys(dataPercent_100);
		fieldNacenkaPlan.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}		
	
	public void GoFirstList(WebDriver driver) throws InterruptedException {
		
		//Выбираем первый созданный лист УДП
		fieldAllList.click();
		Thread.sleep(1000);
		fieldListFirst.click();
		Thread.sleep(10000);
	}		
	
	public void GoSecondList(WebDriver driver) throws InterruptedException {
		
		//Выбираем первый созданный лист УДП
		fieldAllList.click();
		Thread.sleep(1000);
		fieldListSecond.click();
		Thread.sleep(10000);
	}	
	
	public void GoMainList(WebDriver driver) throws InterruptedException {
		
		//Выбираем первый созданный лист УДП
		fieldAllList.click();
		Thread.sleep(1000);
		fieldMainList.click();
		Thread.sleep(10000);
	}	
	
}
