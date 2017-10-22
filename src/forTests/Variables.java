package forTests;

public class Variables extends Main{
	   	
	//1-Общее                                                   - 32
	//2-Аккаунты основные                                       - 40
	//3-E-mail для создания аккаунтов                           - 71
	//4-Промокоды                                               - 117
	//5-Пароли                                                  - 123
	//6-Телефоны                                                - 133
	//7-Имена                                                   - 143
	//8-Названия                                                - 159  
	//9-Тексты подсказок для проверки                           - 209
	//10-Название страниц и разделов                            - 250
	//11-Обозначение цен для Информации о тарифе                - 289 
	//12-Обозначение цен для Пополнения                         - 316
	//13-Название граф в таблице УДП                            - 379
	//14-Названия валют                                         - 483 
	//15-Значения для выбора                                    - 509 
	//16-Полученные значения для проверки						- 547					
	//16-Вводимые значения										- 670					
	//17-Вход													- 907	
	//18-Опции													- 931
	//19-Редактирование аккаунта + Настройки аккаунта			- 985
	//20-Тариф                                                  - 1005
	//21-Редактирование профиля                                 - 1147
	//22-Центры учета                                           - 1176
	//23-Пользователи                                           - 1256 
	//24-Прогноз выручки                                        - 1325
	//25-УДП                                                    - 1500
	
				
	//ПЕРЕМЕННЫЕ
	//Общее
	public String adressSyteEntrance = "https://finance-controlling.net/";   //Адресс страницы входа по Общей ветке
	//public String adressEntrance = "https://app.finance-controlling.net/login";   //Адресс страницы входа по Общей ветке
	
		
	//Аккаунты основные
	protected String mail = "Test26@gmail.com";   //E-mail основной
	public String mailIncorrect = "TestV@gmail.com";   //Не верный E-mail
	public String mailNew = "TestNew@gmail.com";   //Новый E-mail
	public String mailX = "IOBX@gmail.com";   //Не существующий E-mail
	public String mailEmpty = "";   //E-mail без значения
	
	public String mailPers = "Test1@gmail.com";   //E-mail с тарифом Персональный
	public String mailStand = "Test2@gmail.com";   //E-mail с тарифом Стандартный
	public String mailStandPv = "Test3@gmail.com";   //E-mail с тарифом Стандартный ПВ
	public String mailStandUdp = "Test4@gmail.com";   //E-mail с тарифом Стандартный УДП
	public String mailOptim = "Test5@gmail.com";   //E-mail с тарифом Оптимальный
	public String mailOptimPv = "Test6@gmail.com";   //E-mail с тарифом Оптимальный ПВ
	public String mailOptimUdp = "Test7@gmail.com";   //E-mail с тарифом Оптимальный УДП
	public String mailMaxim = "Test8@gmail.com";   //E-mail с тарифом Максимальный
	public String mailMaximPv = "Test9@gmail.com";   //E-mail с тарифом Максимальный ПВ
	public String mailMaximUdp = "Test10@gmail.com";   //E-mail с тарифом Максимальный УДП
		
	public String mailPolZapr = "PolZapr@gmail.com";   //E-mail - Пользователь Запрещен (под andrey.vl.mishchenko@gmail.com - 131285)
	public String mailPolChten = "PolChten@gmail.com";   //E-mail - Пользователь Чтение (под andrey.vl.mishchenko@gmail.com - 131285)
	public String mailPolRedact = "PolRedact@gmail.com";   //E-mail - Пользователь Редактирование (под andrey.vl.mishchenko@gmail.com - 131285)
	public String mailManZapr = "ManZapr@gmail.com";   //E-mail - Пользователь Запрещен (под andrey.vl.mishchenko@gmail.com - 131285)
	public String mailManChten = "ManChten@gmail.com";   //E-mail - Пользователь Чтение (под andrey.vl.mishchenko@gmail.com - 131285)
	public String mailManRedact = "ManRedact@gmail.com";   //E-mail - Пользователь Редактирование (под andrey.vl.mishchenko@gmail.com - 131285)
		
	public String userMail = "Uzer@gmail.com";   //E-mail для создания пользователей
	public String userMailNew = "UzerN@gmail.com";   //E-mail новый для создания пользователей
	public int number = 1;   //Порядковый номер для создания пользователей и ЦУ
	
	
	
	//E-mail для создания аккаунтов
	public String mail_1 = "Test101@gmail.com";   //E-mail для 1-го тест-кейса раздела регистрация
	public String mail_2 = "Test102@gmail.com";   //E-mail для 2-го тест-кейса раздела регистрация
	public String mail_3 = "Test103@gmail.com";   //E-mail для 3-го тест-кейса раздела регистрация
	public String mail_4a = "Test104@gmail.com";   //E-mail для 4-го тест-кейса раздела регистрация
	public String mail_4b = "Test105@gmail.com";   //E-mail для 4-го тест-кейса раздела регистрация
	public String mail_5a = "Test106@gmail.com";   //E-mail для 5-го тест-кейса раздела регистрация
	public String mail_5b = "Test107@gmail.com";   //E-mail для 5-го тест-кейса раздела регистрация
	public String mail_6a = "Test108@gmail.com";   //E-mail для 6-го тест-кейса раздела регистрация
	public String mail_6b = "Test109@gmail.com";   //E-mail для 6-го тест-кейса раздела регистрация
	public String mail_7a = "Test110@gmail.com";   //E-mail для 7-го тест-кейса раздела регистрация
	public String mail_7b = "Test111@gmail.com";   //E-mail для 7-го тест-кейса раздела регистрация
	public String mail_8 = "Test112@gmail.com";   //E-mail для 8-го тест-кейса раздела регистрация
	public String mail_9 = "Test113@gmail.com";   //E-mail для 9-го тест-кейса раздела регистрация
	public String mail_10 = "Test114@gmail.com";   //E-mail для 10-го тест-кейса раздела регистрация
	public String mail_11 = "Test115@gmail.com";   //E-mail для 11-го тест-кейса раздела регистрация
	public String mail_12 = "Test116@gmail.com";   //E-mail для 12-го тест-кейса раздела регистрация
	public String mail_13 = "Test117@gmail.com";   //E-mail для 13-го тест-кейса раздела регистрация
	public String mail_14 = "Test118@gmail.com";   //E-mail для 14-го тест-кейса раздела регистрация
	public String mail_15 = "Test119@gmail.com";   //E-mail для 15-го тест-кейса раздела регистрация
	public String mail_16 = "Test120@gmail.com";   //E-mail для 16-го тест-кейса раздела регистрация
	public String mail_17 = "Test121@gmail.com";   //E-mail для 17-го тест-кейса раздела регистрация
	public String mail_18 = "Test122@gmail.com";   //E-mail для 18-го тест-кейса раздела регистрация
	public String mail_19a = "Test123@gmail.com";   //E-mail для 19-го тест-кейса раздела регистрация
	public String mail_19b = "Test124@gmail.com";   //E-mail для 19-го тест-кейса раздела регистрация
	public String mail_20 = "Test125@gmail.com";   //E-mail для 20-го тест-кейса раздела регистрация
	public String mail_21 = "Test126@gmail.com";   //E-mail для 21-го тест-кейса раздела регистрация
	public String mail_22 = "Test127@gmail.com";   //E-mail для 22-го тест-кейса раздела регистрация
	public String mail_23 = "Test128@gmail.com";   //E-mail для 23-го тест-кейса раздела регистрация
	public String mail_24 = "Test129@gmail.com";   //E-mail для 24-го тест-кейса раздела регистрация
	public String mail_25 = "Test130@gmail.com";   //E-mail для 25-го тест-кейса раздела регистрация
	public String mail_26 = "Test131@gmail.com";   //E-mail для 26-го тест-кейса раздела регистрация
	public String mail_27 = "Test132@gmail.com";   //E-mail для 27-го тест-кейса раздела регистрация
	public String mail_28 = "Test133@gmail.com";   //E-mail для 28-го тест-кейса раздела регистрация
	public String mail_29 = "Test134@gmail.com";   //E-mail для 29-го тест-кейса раздела регистрация
	public String mail_30 = "Test135@gmail.com";   //E-mail для 30-го тест-кейса раздела регистрация
	public String mail_31 = "Test136@gmail.com";   //E-mail для 31-го тест-кейса раздела регистрация
	public String mail_32 = "Test137@gmail.com";   //E-mail для 31-го тест-кейса раздела регистрация
	public String mail_33 = "Test138@gmail.com";   //E-mail для 31-го тест-кейса раздела регистрация
	public String mail_34 = "Test139@gmail.com";   //E-mail для 31-го тест-кейса раздела регистрация
	public String mail_35 = "Test140@gmail.com";   //E-mail для 31-го тест-кейса раздела регистрация
	public String mail_36 = "Test141@gmail.com";   //E-mail для 31-го тест-кейса раздела регистрация
	public String mail_37 = "Test142@gmail.com";   //E-mail для 31-го тест-кейса раздела регистрация
	
	
	
	//Промокоды
	public String promo = "JEB-983652";   //Верный промокод
	public String promoIncorrect = "aaa-000000";   //Не верный промокод
			
	
	
	//Пароли
	public String parol = "131285";   //Верный пароль 
	public String parolIncorrect = "131286";   //Не верный пароль 
	public String parolNew = "131290";   //Новый пароль  
	public String parolSmaller = "13128";   //Пароль до 6 символов
	public String parolEmpty = "";   //Пароль без значения
	public String parolX = "sіы!№;:?/@#$%^&*()1";   //Пароль аккаунта принимающее все символы
		
	
	
	//Телефоны
	public String telephone = "380686109512";   //Верный телефон 
	public String telephoneNew = "380686109513";   //Новый телефон 
	public String telephoneBigger = "3806861095121";   //Телефон на 1 цифру больше 
	public String telephoneSmaller = "38068610951";   //Телефон на 1 цифру меньше
	public String telephoneX = "sіы!№;:?/@#$%^&*()";   //Набор значений для проверки телефона (Тест-кейс №31)
	public String telephoneEmpty = "";   //Телефон без значения
		
	
	
	//Имена
	public String name = "DuckTales";   //Имя администратора аккаунта 
	public String nameNew = "BrothersGavs";   //Новое имя администратора аккаунта
	public String nameEmpty = "";   //Пустое имя администратора аккаунта
	public String nameX = "sіы!№;:?/@#$%^&*()1";   //Имя администратора аккаунта принимающее все символы
	public String nameBigger = "1234567890123456789012345678901";   //Имя администратора аккаунта 31 символ
	public String nameSmaller = "123456789012345678901234567890";   //Имя администратора аккаунта 30 символов
	
	public String userName = "Uzer";   //Имя для создания пользователей+менеджеров
	public String userNameBigger = "1234567890123456789012345678901";   //Имя для создания пользователей+менеджеров 31 символ
	public String userNameSmaller = "123456789012345678901234567890";   //Имя для создания пользователей+менеджеров 30 символ
	public String userNameNew = "New uzer";   //Новое имя для создания пользователей+менеджеров
	public String userNameX = "Office Офіс Офис #$%^&*- 1";   //Имя для создания пользователей+менеджеров все типы символов
		
	
	
	//Названия 
	public String home = "MyHome";   //Название организации 
	public String homeNew = "NewHome";   //Новое название организации
	public String homeBigger = "1234567890123456789012345678901";   //Название организации 31 символ
	public String homeSmaller = "123456789012345678901234567890";   //Название организации 30 символ
	public String homeEmpty = "";   //Название организации пустое
	public String homeX = "sіы!№;:?/@#$%^&*()1";   //Название организации аккаунта принимающее все символы
	
	public String centerName = "Офис";   //Название ЦУ
	public String centerNameEmpty = "";   //Пустое название ЦУ
	public String centerNameFirst = "Офис первый";   //Название ЦУ
	public String centerNameSecond = "Офис второй";   //Название ЦУ
	public String centerNameMonthBefore = "9-й Офис До";   //Название ЦУ для проверки видимости по месяцам менять первую цифру перед проведением каждый раз
	public String centerNameMonth = "10-й Офис С";   //Название ЦУ для проверки видимости по месяцам менять періую цифру перед проведением каждый раз
	public String centerNameNew = "Офис новый";   //Новое название ЦУ
	public String centerNameBigger = "1234567890123456789012345678901";   //Название ЦУ 31 символ
	public String centerNameSmaller = "123456789012345678901234567890";   //Название ЦУ 30 символ
	public String centerNameX = "Office Офіс Офис #$%^&*- 1";   //Название ЦУ принимающее все символы
	
	public String grupName = "Группа офисов";   //Название Группы
	public String grupNameNew = "Группа офисов новая";   //Новое название Группы
	public String grupNameBigger = "1234567890123456789012345678901";   //Название Группы 31 символ
	public String grupNameSmaller = "123456789012345678901234567890";   //Название Группы 30 символ
	public String grupNameX = "Grup Группа офисів #$%^&*- 1";   //Название Группы принимающее все символы
	
	public String listName = "Лист УДП";   //Название листа УДП 
	public String listDemo = "Демо";   //Название листа УДП (существующего при создании аккаунта)
	public String listNameFirst = "Лист УДП первый";   //Название листа УДП
	public String listNameSecond = "Лист УДП второй";   //Название листа УДП
	public String listNameBigger = "123456789012345678901";   //Название листа УДП 31 символ
	public String listNameSmaller = "12345678901234567890";   //Название листа УДП 30 символ
	public String listNameX = "#$%^&*-1";   //Название листа символы  
	public String listNameNew = "Лист УДП новый";   //Название нового листа 
			
	public String kategoryDohodName = "Доходы";   //Название категории в Поступлениях
	public String podkategoryDohodName = "Доходы первые";   //Название подкатегории в Поступлениях
	public String podkategoryDohodNameSecond = "Доходы вторые";   //Название подкатегории в Поступлениях
	public String kategoryRashodName = "Расходы";   //Название категории в Расходах
	public String podkategoryRashodName = "Расходы первые";   //Название подкатегории в Расходах
	public String podkategoryRashodNameSecond = "Доходы вторые";   //Название подкатегории в Расходах
	public String kategoryNameX = "SІЫ#$%^&*- 1";   //Название категории/подкатегории со всеми символами
	public String kategoryNameBigger = "1234567890123456789012345678901";   //Проверка название категории/подкатегории 31 символ
	public String kategoryNameSmaller = "123456789012345678901234567890";   //Проверка название категории/подкатегории 30 символ
			
	
	
	//Тексты подсказок для проверки
	//Регистрация
	public String promptEmptyFieldRegistration = "Это поле обязательно для заполнения";   //Подсказка при незаполнении какого либо поля на странице регистрации
	public String promptTelephoneIncorrectRegistration = "Введите корректный номер телефона";   //Подсказка при неверном формате телефона
	public String promptParolSmallerRegistration = "Пароль слишком короткий";   //Подсказка при вводе пароля менее 6 символов на странице регистрации
	public String promptParolDifferentRegistration = "Пароли не совпадают";   //Подсказка при разных паролях на странице регистрации
	public String promptPromoIncorrectRegistration = "Промо-кода «"+ promoIncorrect +"» несуществует.";   //Подсказка при вводе не существующего промо-кода
	public String promptMailSimilarRegistration = "«" + "mail_29" + "» уже зарегистрирован.";   //Подсказка при регистрации 2-го аккаунта с существующим E-mail(под тест-кейс №29)
	//Вход
	public String promptIncorrectMailEntrance = "Неверный логин или пароль!";   //Подсказка при неверном E-mail/пароль на восстановления пароля	
	public String promptIncorrectMailPasswordRecovery = "Пользователь с таким E-Mail не существует";   //Подсказка при неверном E-mail на странице восстановления пароля	
	//Аккаунт
	public String promptChangePakegeLimit = "Ваш аккаунт превышает лимиты для выбранного тарифа!";   //Подсказка при переходе на другой пакет с превышением лимита по ЦУ и пользователям
	public String promptCorrectDate_0 = "Значение должно быть \"1\" или больше.";   //подсказка при установлении количества редактируемых дней = 0
	public String promptCorrectDate_61 = "Значение должно быть \"60\" или меньше.";   //подсказка при установлении количества редактируемых дней = 61
	public String promptIncorrectParol = "Текущий пароль: Неверный текущий пароль.";   //подсказка при изменении данных профиля при неверном заполнении графы "Текущий пароль"
	public String promptIncorrectParolRepeat = "Новый пароль: Пароли не совпадают.";   //Подсказка при вооде неверного пароля в графу повторите пароль при изменении профиля
	public String promptParolChangeSmaller = "Новый пароль: Значение слишком короткое. Должно быть равно 6 символам или больше.";   //Подсказка при изменении пароля профиля на имеющий менее 6 символов
	public String promptPartPv = "У Вас нет доступа к модулю прогнозирования, для активации услуги пройдите в раздел управления тарифным планом.";   //подсказка при открыимм Прогноза выручки не имея его в пакете	
	public String promptPartUdp = "У Вас нет доступа к модулю УДП, для активации услуги пройдите в раздел управления тарифным планом.";   //подсказка при открыимм УДП не имея его в пакете	
	//ЦУ
	public String promptGrupNameEmpty = "Введите имя группы";   //Подсказка при не заполнении имени группы
	public String promptCentersMore = "Вы превысили допустимое количество центров учета в Вашем тарифе, пожалуйста измените тариф или удалите лишние центры учета.";   //Подсказка при создании большего количества ЦУ
	//Пользователи
	public String promptUsersMore = "Вы превысили допустимое количество пользователь в Вашем тарифе, пожалуйста измените тариф или удалите лишних пользователей.";   //Подсказка при создании большего количества пользователей
	public String promptManager = "Менеджер может создавать новых пользователей, наделять их правами доступа и редактировать статьи расходов в УДП";   //Подсказка о возможностяж менеджера
	public String promptPolzovatel = "Пользователь не может создавать других пользователей, управлять доступами и создавать статьи расходов в УДП";   //Подсказка о возможностяж пользователя
	public String promptZaprPv = "У Вас нет доступа к модулю прогнозирования, обратитесь к Вашему администратору.";   //Подсказка при открытии модуля при запре
	public String promptZaprUdp = "У Вас нет доступа к модулю УДП, обратитесь к Вашему администратору.";   //Подсказка при открытии модуля при запре
	public String promptUserMailSimilar = "E-mail: «" + userMail + "» уже зарегистрирован.";   //Подсказка при регистрации пользователя с имеющемся E-mail
	public String promptUserOpen = "Редактирование пользователя " + userName + " " + "(" +userMail +")";   //Текст для проверки того что юзер открылся	
	public String promptAdminOpen = "Редактирование пользователя " + name + " " + "(" +mail +")";   //Текст для проверки того что администратор открылся	
	public String promptIncorrectUserPasswordRepeat = "Новый пароль: Пароли не совпадают.";   //Подсказка при неверном повторении пароля повтора при создании пользователя	
	public String promptUserTelephoneSmaller = "Телефон: Значение недопустимо.";   //Подсказка вводе телефона с меньшим количеством символов
	//Ввод данных
	public String promptPVEmptyCassa = "Нет данных";   //Подсказка при незаполении кассы для ПВ
	public String promptCorrectMoreDays = "Редактирование данных более, чем на 3 дней назад от текущей даты запрещено";   //Подсказка при превышении количества дней для редактирования
	public String promptGrafikDaysSmaller = "Недостаточно данных!"+ "\n" +"Прогноз должен строиться по 4 и более дням.";   //Подсказка при формировании графика с менее чем 4 днями прогноза
	
	
	
	//Название страниц и разделов
	public String pageProfile = "Ваш профиль";   //Проверка страницы Регистрация в системе 
	public String pageRegistration = "Регистрация в системе";   //Проверка страницы Регистрация в системе 
	public String pageEntrance = "Вход в систему";   //Проверка страницы Вход в систему 
	public String pageSistem = "Прогноз выручки";   //Проверка страницы Личный кабинет 
	public String pageRecoveryParol = "Восстановление пароля";   //Проверка страницы Восстановление пароля 
	public String pageEditingCenters = "Редактирование центра учета";   //Проверка страницы Редактирование центра учета 
	
	public String partEntranceFinanceControlling = "Вход";   //Проверка страницы Finance-controlling
	public String partEditingAccount = "Редактирование аккаунта";   //Проверка раздела Редактирование аккаунта
	public String partCenters = "Центры учета";   //Проверка раздела Центры учета
	public String partEditingProfile = "Редактирование профиля";   //Проверка раздела Редактирование профиля
	public String partEvents = "События";   //Проверка раздела События
	public String partTarifInfo = "Информация о тарифах";   //Проверка раздела Информация о тарифах
	public String partAbout = "О сервисе";   //Проверка раздела О сервисе
	public String partPayment = "Оплата/продление";    //Проверка раздела Оплата/продление
	public String partAccountSetting = "Настройки аккаунта";   //Проверка раздела Настройки аккаунта
	public String partUsersAccount = "Пользователи аккаунта";    //Проверка раздела Пользователи аккаунта
	public String partUsers = "Пользователи";   //Раздел Пользователи 
	public String partPv = "Прогноз выручки";    //Проверка раздела Прогноз
	public String partUdp = "Управление денежными потоками";    //Проверка раздела УПД
	public String partGrafik = "Прогноз центра учета"; //Текст при увеличении графика
	public String partGrafikPeriod = "Сумма продаж прошлых периодов"; //Текст при увеличении графика
	
	public String infoConsultationFirst = "0 800 210-638";   //Текст о консультации 1-я строка
	public String infoConsultationSecond = "Бесплатная консультация";   //Текст о консультации 2-я строка
	public String infoConsultationRate = "Возникли трудности с оплатой? Звоните нам!" + "\n" + "0 (800) 210-638";   //Текст о консультации на странице оплаты
	public String infoReliz = "© 2017 Finance controlling, версия 0.3.1 RC";    //Текст о версии продукта
		
	public String textObshiyPrognoz = "Общий прогноз";   //Текст для проверки
	public String textFactKassa = "Факт. касса";   //Текст для проверки
	public String textVievMail = mail + " (Администратор)";   //Указание E-mail на главной странице
	public String textHello = "Добро пожаловать в систему управления финансами!";   //строка приветствия 
	
	public String partKategoryNastroyka = "Настройка категорий";   //Название раздела Настройка категорий после нажатия на карандаш
	public String textBudzet = "Бюджет \"Лист УДП\" за Январь 2017 - Декабрь 2017";   //Название при формировании бюджета
	
	
	
	//Обозначение цен для Информации о тарифе
	public String priceDolPerson = "3";   //Цена за тариф персональный в долл
	public String priceUahPerson = "75";   //Цена за тариф персональный в грн
	
	public String priceDolStand = "27";   //Цена за тариф стандартный в долл
	public String priceUahStand = "675";   //Цена за тариф стандартный в грн
	public String priceDolStandPv = "12";   //Цена за тариф стандартный с услугой Прогноз в долл
	public String priceUahStandPv = "300";   //Цена за тариф стандартный с услугой Прогноз в грн
	public String priceDolStandUdp = "15";   //Цена за тариф стандартный с услугой УДП в долл
	public String priceUahStanUdp = "375";   //Цена за тариф стандартный с услугой УДП в грн
		
	public String priceDolOptim = "39";   //Цена за тариф оптимальный в долл
	public String priceUahOptim = "975";   //Цена за тариф оптимальный в грн
	public String priceDolOptimPv = "18";   //Цена за тариф оптимальный с услугой Прогноз в долл
	public String priceUahOptimPv = "450";   //Цена за тариф оптимальный с услугой Прогноз в грн
	public String priceDolOptimUdp = "21";   //Цена за тариф оптимальный с услугой УДП в долл
	public String priceUahOptimUdp = "525";   //Цена за тариф оптимальный с услугой УДП в грн
		
	public String priceDolMaxim = "54";   //Цена за тариф максимальный в долл
	public String priceUahMaxim = "1350";   //Цена за тариф максимальный в грн
	public String priceDolMaximPv = "24";   //Цена за тариф максимальный с услугой Прогноз в долл
	public String priceUahMaximPv = "600";   //Цена за тариф максимальный с услугой Прогноз в грн
	public String priceDolMaximUdp = "30";   //Цена за тариф максимальный с услугой УДП в долл
	public String priceUahMaximUdp = "750";   //Цена за тариф максимальный с услугой УДП в грн
	
	
	
	//Обозначение цен для Пополнения
	public String pricePopPerson_30 = "к оплате 75 UAH";   //Цена за пополнение при тарифе персональный 30 дней
	public String pricePopPerson_60 = "к оплате 150 UAH";   //Цена за пополнение при тарифе персональный 60 дней
	public String pricePopPerson_90 = "к оплате 225 UAH";   //Цена за пополнение при тарифе персональный 90 дней
	public String pricePopPerson_180 = "к оплате 450 UAH";   //Цена за пополнение при тарифе персональный 180 дней
	public String pricePopPerson_360 = "к оплате 900 UAH";   //Цена за пополнение при тарифе персональный 360 дней
		
	public String pricePopStand_30 = "к оплате 675 UAH";   //Цена за пополнение при тарифе стандартный 30 дн
	public String pricePopStand_60 = "к оплате 1350 UAH";   //Цена за пополнение при тарифе стандартный 60 дн
	public String pricePopStand_90 = "к оплате 2025 UAH";   //Цена за пополнение при тарифе стандартный 90 дн
	public String pricePopStand_180 = "к оплате 4050 UAH";   //Цена за пополнение при тарифе стандартный 180 дн
	public String pricePopStand_360 = "к оплате 8100 UAH";   //Цена за пополнение при тарифе стандартный 360 дн
	
	public String pricePopStandPv_30 = "к оплате 300 UAH";   //Цена за пополнение при тарифе стандартный услугой Прогноз 30 дн
	public String pricePopStandPv_60 = "к оплате 600 UAH";   //Цена за пополнение при тарифе стандартный услугой Прогноз 60 дн
	public String pricePopStandPv_90 = "к оплате 900 UAH";   //Цена за пополнение при тарифе стандартный услугой Прогноз 90 дн
	public String pricePopStandPv_180 = "к оплате 1800 UAH";  //Цена за пополнение при тарифе стандартный услугой Прогноз 180 дн
	public String pricePopStandPv_360 = "к оплате 3600 UAH";   //Цена за пополнение при тарифе стандартный услугой Прогноз 360 дн
	
	public String pricePopStandUdp_30 = "к оплате 375 UAH";   //Цена за пополнение при тарифе стандартный услугой УДП 30 дн
	public String pricePopStandUdp_60 = "к оплате 750 UAH";   //Цена за пополнение при тарифе стандартный услугой УДП 60 дн
	public String pricePopStandUdp_90 = "к оплате 1125 UAH";   //Цена за пополнение при тарифе стандартный услугой УДП 90 дн
	public String pricePopStandUdp_180 = "к оплате 2250 UAH";  //Цена за пополнение при тарифе стандартный услугой УДП 180 дн
	public String pricePopStandUdp_360 = "к оплате 4500 UAH";   //Цена за пополнение при тарифе стандартный услугой УДП 360 дн
	
	public String pricePopOptim_30 = "к оплате 975 UAH";   //Цена за пополнение при тарифе оптимальный 30 дн
	public String pricePopOptim_60 = "к оплате 1950 UAH";   //Цена за пополнение при тарифе оптимальный 60 дн
	public String pricePopOptim_90 = "к оплате 2925 UAH";   //Цена за пополнение при тарифе оптимальный 90 дн
	public String pricePopOptim_180 = "к оплате 5850 UAH";   //Цена за пополнение при тарифе оптимальный 180 дн
	public String pricePopOptim_360 = "к оплате 11700 UAH";   //Цена за пополнение при тарифе оптимальный 360 дн
	
	public String pricePopOptimPv_30 = "к оплате 450 UAH";   //Цена за пополнение при тарифе оптимальный услугой Прогноз 30 дн
	public String pricePopOptimPv_60 = "к оплате 900 UAH";   //Цена за пополнение при тарифе оптимальный услугой Прогноз 60 дн
	public String pricePopOptimPv_90 = "к оплате 1350 UAH";   //Цена за пополнение при тарифе оптимальный услугой Прогноз 90 дн
	public String pricePopOptimPv_180 = "к оплате 2700 UAH";  //Цена за пополнение при тарифе оптимальный услугой Прогноз 180 дн
	public String pricePopOptimPv_360 = "к оплате 5400 UAH";   //Цена за пополнение при тарифе оптимальный услугой Прогноз 360 дн
	
	public String pricePopOptimUdp_30 = "к оплате 525 UAH";   //Цена за пополнение при тарифе оптимальный услугой УДП 30 дн
	public String pricePopOptimUdp_60 = "к оплате 1050 UAH";   //Цена за пополнение при тарифе оптимальный услугой УДП 60 дн
	public String pricePopOptimUdp_90 = "к оплате 1575 UAH";   //Цена за пополнение при тарифе оптимальный услугой УДП 90 дн
	public String pricePopOptimUdp_180 = "к оплате 3150 UAH";  //Цена за пополнение при тарифе оптимальный услугой УДП 180 дн
	public String pricePopOptimUdp_360 = "к оплате 6300 UAH";   //Цена за пополнение при тарифе оптимальный услугой УДП 360 дн
	
	public String pricePopMaxim_30 = "к оплате 1350 UAH";   //Цена за пополнение при тарифе максимальный 30 дн
	public String pricePopMaxim_60 = "к оплате 2700 UAH";   //Цена за пополнение при тарифе максимальный 60 дн
	public String pricePopMaxim_90 = "к оплате 4050 UAH";   //Цена за пополнение при тарифе максимальный 90 дн
	public String pricePopMaxim_180 = "к оплате 8100 UAH";   //Цена за пополнение при тарифе максимальный 180 дн
	public String pricePopMaxim_360 = "к оплате 16200 UAH";   //Цена за пополнение при тарифе максимальный 360 дн
	
	public String pricePopMaximPv_30 = "к оплате 600 UAH";   //Цена за пополнение при тарифе максимальный услугой Прогноз 30 дн
	public String pricePopMaximPv_60 = "к оплате 1200 UAH";   //Цена за пополнение при тарифе максимальный услугой Прогноз 60 дн
	public String pricePopMaximPv_90 = "к оплате 1800 UAH";   //Цена за пополнение при тарифе максимальный услугой Прогноз 90 дн
	public String pricePopMaximPv_180 = "к оплате 3600 UAH";  //Цена за пополнение при тарифе максимальный услугой Прогноз 180 дн
	public String pricePopMaximPv_360 = "к оплате 7200 UAH";   //Цена за пополнение при тарифе максимальный услугой Прогноз 360 дн
	
	public String pricePopMaximUdp_30 = "к оплате 750 UAH";   //Цена за пополнение при тарифе максимальный услугой УДП 30 дн
	public String pricePopMaximUdp_60 = "к оплате 1500 UAH";   //Цена за пополнение при тарифе максимальный услугой УДП 60 дн
	public String pricePopMaximUdp_90 = "к оплате 2250 UAH";   //Цена за пополнение при тарифе максимальный услугой УДП 90 дн
	public String pricePopMaximUdp_180 = "к оплате 4500 UAH";  //Цена за пополнение при тарифе максимальный услугой УДП 180 дн
	public String pricePopMaximUdp_360 = "к оплате 9000 UAH";   //Цена за пополнение при тарифе максимальный услугой УДП 360 дн	
		
	
	
	//Название граф в таблице УДП
	public String line_ПОСТУПЛЕНИЯ = "ПОСТУПЛЕНИЯ";   //Название линии ПОСТУПЛЕНИЯ
	public String line_Корректировка = "Корректировка";   //Название линии Корректировка
	public String line_ИзМодуляПрогноза = "Из модуля прогноза";   //Название линии Из модуля прогноза
	public String line_ДоходОтПродаж = "Доход от продаж";   //Название линии Доход от продаж
	public String line_Магазин1 = "Магазин 1";   //Название линии Магазин 1
	public String line_Магазин2 = "Магазин 2";   //Название линии Магазин 2
	public String line_Магазин3 = "Магазин 3";   //Название линии Магазин 3
	public String line_ШколаТанца1 = "Школа танца 1";   //Название линии Школа танца 1
	public String line_ШколаТанца2 = "Школа танца 2";   //Название линии Школа танца 2
	public String line_ШколаТанца3 = "Школа танца 3";   //Название линии Школа танца 3
	public String line_РемонтОбуви1 = "Ремонт обуви 1";   //Название линии Ремонт обуви 1
	public String line_РемонтОбуви2 = "Ремонт обуви 2";   //Название линии Ремонт обуви 2
	public String line_РемонтОбуви3 = "Ремонт обуви 3";   //Название линии Ремонт обуви 3
	public String line_ОтделКрупногоОпта = "Отдел крупного опта";   //Название линии Отдел крупного опта
	public String line_ОтделСреднегоОпта = "Отдел среднего опта";   //Название линии Отдел среднего опта
	public String line_ВИПОтдел = "ВИП -отдел";   //Название линии ВИП -отдел
	public String line_КредитыИДрПоступления = "Кредиты и др.поступления";   //Название линии Кредиты и др.поступления
	public String line_КредитБанк = "Кредит Банк";   //Название линии Кредит Банк
	public String line_ЧастныйЗайм = "Частный займ";   //Название линии Частный займ
	public String line_ИзРезерва = "Из резерва";   //Название линии Из резерва
	public String line_Доходы = "Доходы";   //Название линии Доходы
	public String line_Зарплата = "Зарплата";   //Название линии Зарплата
	public String line_ПроцентыПоДепозиту = "Проценты по депозиту";   //Название линии Проценты по депозиту
		
	public String line_САЛЬДО = "САЛЬДО";   //Название линии САЛЬДО
	public String line_Демо = "Демо";   //Название линии Демо
	
	public String line_РАСХОДЫ = "РАСХОДЫ";   //Название линии РАСХОДЫ
	public String line_РасходыИтого = "РАСХОДЫ ИТОГО";   //Название линии Расходы итого
	public String line_РасходыНаОплатуТруда = "Расходы на оплату труда";   //Название линии Расходы на оплату труда
	public String line_ОсновнаяЗарплата = "Основная зарплата";   //Название линии Основная зарплата
	public String line_Премии = "Премии";   //Название линии Премии
	public String line_КоммунальныеПлатежи = "Коммунальные платежи";   //Название линии Коммунальные платежи
	public String line_Аренда = "Аренда";   //Название линии Аренда
	public String line_Интернет = "Интернет";   //Название линии Интернет
	public String line_Телефоны = "Телефоны";   //Название линии Телефоны
	public String line_КоммунальныеРасходы = "Коммунальные расходы";   //Название линии Коммунальные расходы
	public String line_УборкаПомещений = "Уборка помещений";   //Название линии Уборка помещений
	public String line_ОхранаПомещений = "Охрана помещений";   //Название линии Охрана помещений
	public String line_АдминистративноХозяйственные = "Административно-хозяйственные";   //Название линии Административно-хозяйственные
	public String line_Канцтовары = "Канцтовары";   //Название линии Канцтовары
	public String line_ТранспортныеРасходы = "Транспортные расходы";   //Название линии Транспортные расходы
	public String line_БензинГСМ = "Бензин (ГСМ)";   //Название линии Бензин (ГСМ)
	public String line_ХозяйственныеНужды = "Хозяйственные нужды";   //Название линии Хозяйственные нужды
	public String line_ПечатьКсерокс = "Печать/ксерокс";   //Название линии Печать/ксерокс
	public String line_УслугиБанка = "Услуги банка";   //Название линии Услуги банка
	public String line_ОбслуживаниеРемонтТехники = "Обслуживание/ремонт техники";   //Название линии Обслуживание/ремонт техники
	public String line_Командировки = "Командировки";   //Название линии Командировки
	public String line_Расходы911 = "Расходы 911";   //Название линии Расходы 911
	public String line_Маркетинговые = "Маркетинговые";   //Название линии Маркетинговые
	public String line_Реклама = "Реклама";   //Название линии Реклама
	public String line_Мерчендайзинг = "Мерчендайзинг";   //Название линии Мерчендайзинг
	public String line_Подарки = "Подарки";   //Название линии Подарки
	public String line_НалогиИНалоговыеСборы = "Налоги и налоговые сборы";   //Название линии Налоги и налоговые сборы
	public String line_НалогНаПрибыль = "Налог на прибыль";   //Название линии Налог на прибыль
	public String line_НалогиФЛП = "Налоги ФЛП";   //Название линии Налоги ФЛП
	public String line_НалогиНаЗарплату = "Налоги на зарплату";   //Название линии Налоги на зарплату
	public String line_НДС = "НДС";   //Название линии НДС
	public String line_Дополнительные = "Дополнительные";   //Название линии Дополнительные
	public String line_ОбучениеИКонсультации = "Обучение и консультации";   //Название линии Обучение и консультации
	public String line_Прочие = "Прочие";   //Название линии Прочие
	public String line_Поставщики = "Поставщики";   //Название линии Поставщики
	public String line_Поставщик1 = "Поставщик 1";   //Название линии Поставщик 1
	public String line_Поставщик2 = "Поставщик 2";   //Название линии Поставщик 2
	public String line_Поставщик3 = "Поставщик 3";   //Название линии Поставщик 3
	public String line_ПоставщикОдежды = "Поставщик одежды";   //Название линии Поставщик одежды
	public String line_ПоставщикОбуви = "Поставщик обуви";   //Название линии Поставщик обуви
	public String line_ПоставщикАксессуаров = "Поставщик аксессуаров";   //Название линии Поставщик аксессуаров
	public String line_ФинансовыеОперации = "Финансовые операции";   //Название линии Финансовые операции
	public String line_ФИНАНСОВЫЕОПЕРАЦИИ = "ФИНАНСОВЫЕ ОПЕРАЦИИ";   //Название линии Финансовые операции
	public String line_ПополнениеРезерва = "Пополнение резерва";   //Название линии Пополнение резерва
	public String line_ВыведениеПрибыли = "Выведение прибыли";   //Название линии Выведение прибыли
	public String line_КредитБанка = "Кредит банка";   //Название линии Кредит банка
	public String line_ЛичныеРасходы = "Личные расходы";   //Название линии Личные расходы
	public String line_АвтоТранспорт = "Авто/Транспорт";   //Название линии Авто/Транспорт
	public String line_ВнешностьИГигиена = "Внешность и гигиена";   //Название линии Внешность и гигиена
	public String line_Одежда = "Одежда";   //Название линии Одежда
	public String line_Работа = "Работа";   //Название линии Работа
	public String line_Телефон = "Телефон";   //Название линии Телефон
	public String line_РасходыНаСемью = "Расходы на семью";   //Название линии Расходы на семью
	public String line_ЛюбимойЖене = "Любимой жене";   //Название линии Любимой жене
	public String line_ЛюбимымДетям = "Любимым детям";   //Название линии Любимым детям
	public String line_Отдых = "Отдых";   //Название линии Отдых
	public String line_Праздники = "Праздники";   //Название линии Праздники
	public String line_РасходыНаДом = "Расходы на дом";   //Название линии Расходы на дом
	public String line_Коммунальные = "Коммунальные";   //Название линии Коммунальные
	public String line_БытоваяТехникаИМебель = "Бытовая техника и мебель";   //Название линии Бытовая техника и мебель
	public String line_Ремонт = "Ремонт";   //Название линии Ремонт
	public String line_Подарил = "Подарил";   //Название линии Подарил
	public String line_ПотерялКража = "Потерял/кража";   //Название линии Потерял/кража
	public String line_ПроцентыПоКредиту = "Проценты по кредиту";   //Название линии Проценты по кредиту
	public String line_ПоложилНаДепозит = "Положил на депозит";   //Название линии Положил на депозит
	public String line_Убытки = "Убытки";   //Название линии Убытки
	public String line_БракНедостачаПорча = "Брак, недостача, порча";   //Название линии Брак, недостача, порча
	
	public String line_Наценка = "НАЦЕНКА";   //Название линии Наценка
	public String line_ЗакупСтоимость = "ЗАКУП. СТОИМОСТЬ";   //Название линии Закуп. стоимость
	public String line_ВалОперацДоход = "ВАЛ. ОПЕРАЦ. ДОХОД";   //Название линии Вал. операц. доход
	public String line_ОперацПрибыль = "ОПЕРАЦ. ПРИБЫЛЬ";   //Название линии Операц. прибыль
	public String line_ОперацДоход = "ОПЕРАЦ. ДОХОД";   //Название линии Операц. доход
	
	
	
	//Названия валют
	public String valutaUahNal = "UAH нал";   //Тип валюты Гривна наличная для валюты и сальдо
	public String valutaUahBeznal = "UAH безнал";   //Тип валюты Гривна наличная для валюты и сальдо
	public String valutaUsdNal = "USD нал";   //Тип валюты Доллар наличная для валюты и сальдо
	public String valutaUsdBeznal = "USD безнал";   //Тип валюты Доллар наличная для валюты и сальдо
	public String valutaRubNal = "RUB нал";   //Тип валюты Рубль наличная для валюты и сальдо
	public String valutaRubBeznal = "RUB безнал";   //Тип валюты Рубль наличная для валюты и сальдо
	public String valutaEurNal = "EUR нал";   //Тип валюты Евро наличная для валюты и сальдо
	public String valutaEurBeznal = "EUR безнал";   //Тип валюты Евро наличная для валюты и сальдо
	
	public String valutaUahNalInput = "UAH нал :";   //Тип валюты Гривна наличная при вводе значения в ячейку
	public String valutaUahBeznalInput = "UAH б/н :";   //Тип валюты Гривна наличная при вводе значения в ячейку
	public String valutaUsdNalInput = "USD нал :";   //Тип валюты Доллар наличная при вводе значения в ячейку
	public String valutaUsdBeznalInput = "USD б/н :";   //Тип валюты Доллар наличная при вводе значения в ячейку
	public String valutaRubNalInput = "RUB нал :";   //Тип валюты Рубль наличная при вводе значения в ячейку
	public String valutaRubBeznalInput = "RUB б/н :";   //Тип валюты Рубль наличная при вводе значения в ячейку
	public String valutaEurNalInput = "EUR нал :";   //Тип валюты Евро наличная при вводе значения в ячейку
	public String valutaEurBeznalInput = "EUR б/н :";   //Тип валюты Евро наличная при вводе значения в ячейку
	
	public String valutaUah = "UAH:";   //Тип валюты Доллар для проверки в валютном календаре
	public String valutaUsd = "USD:";   //Тип валюты Доллар для проверки в валютном календаре
	public String valutaEur = "EUR:";   //Тип валюты Евро для проверки в валютном календаре
	public String valutaRub = "RUB:";   //Тип валюты Рубль для проверки в валютном календаре
		
	
	
	//Значения для выбора
	public String prioritetHight = "1";   //Приоритет = 1
	public String prioritetMedium = "2";   //Приоритет = 2
	public String prioritetLow = "3";   //Приоритет = 3
	public String prioritetViev = "высокий";   //Приоритет по умолчанию 		
		
	public String rassilkaYes = "Да";   //Значение рассылки Да
	public String rassilkaNo = "Нет";   //Значение рассылки Нет
	
	public String userActivityYes = "Да";   //Значение активности Да
	public String userActivityNo = "Нет";   //Значение Юзер включен Нет
	
	public String userIncludYes = "Да";   //Значение Юзер включен Да
	public String userIncludNo = "Нет";   //Значение активности Нет
	
	public String lisbon = "Europe/Lisbon";   //Значение временной зоны Лисбон
	public String kiev = "Europe/Kiev";   //Значение временной зоны Киев
	
	public String dostupZapr = "Доступ запрещен";   //Текст Доступ запрещен для выставления и проверки доступа
	public String dostupChten = "Только чтение";   //Текст Только чтение для выставления и проверки доступа
	public String dostupRedact = "Редактирование";   //Текст Редактирование для выставления и проверки доступа
	
	public String smsYes = "Да";   //SMS-авторизация пользователя включена
	public String smsNo = "Нет";   //SMS-авторизация пользователя отключена
	
	public String rolMen = "Менеджер";   //Роль юзера - Менеджер
	public String rolPol = "Пользователь";   //Роль юзера - Пользователь
	
	public String rubl = "Рубль";   //Ввод рубля на странице регистрации (ТК №31)
	public String evro = "Евро";   //Ввод евро на странице регистрации (ТК №32)
	public String dollar = "Доллар";   //Ввод евро на странице регистрации (ТК №33)
	
	public String rashodWeek = "неделя";   //Значение фильтра, Расходы За
	public String rashodMonth = "весь месяц";   //Значение фильтра, Расходы За
	public String rashodHalfMonth = "две недели";   //Значение фильтра, Расходы За
	
	
	
	//Полученные значения для проверки
	public String parolText = "text";   //Значение строки пароль текстовое
	public String parolPassword = "password";   //Значение строки пароль скрыто 
	
	public String centersThisMonth = "2017, Октябрь";   //Значение месяца создания ЦУ настоящий (менять месяца)
	public String centersBeforeMonth = "2017, Сентябрь";   //Значение месяца создания ЦУ предыдущий (менять месяца)
	public String grupsMonth = "—";   //Значение месяца создания Группы (прочерк всегда)
	public int countCenters_0 = 0;   //Количество ЦУ = 0
	public int countCenters_1 = 1;   //Количество ЦУ = 1
	public int countCenters_2 = 2;   //Количество ЦУ = 2
	public int countGrups_0 = 0;   //Количество Груп = 0
	public int countGrups_1 = 1;   //Количество Груп = 1
	public int countGrups_2 = 2;   //Количество Груп = 2
	public int countCentersPerso = 0;   //Количество ЦУ при тарифе Персональный = 0
	public int countCentersStand = 3;   //Количество ЦУ при тарифе Стандартный = 3
	public int countCentersOptim = 10;   //Количество ЦУ при тарифе Оптимальный = 10
	public int countCentersMaxim = 25;   //Количество ЦУ при тарифе Максимальный = 25
	public int lineTextCenters = 5;   //количество колонок в таблице по ЦУ
	public String textFirstLineCenters = "Название";   //Название колонки №1 в таблице ЦУ
	public String textSecondLineCenters = "Дата создания";   //Название колонки №2 в таблице ЦУ
	public String textThirdLineCenters = "Дата удаления";   //Название колонки №3 в таблице ЦУ
	public String textFourthLineCenters = "Состояние";   //Название колонки №4 в таблице ЦУ
	public String textFifthLineCenters = "Показывать удаленные центры учета";   //Название колонки №5 в таблице ЦУ
	
	public int countUsers_1 = 1;   //Количество юзеров = 1
	public int countUsers_2 = 2;   //Количество юзеров = 2
	public int countUsers_3 = 3;   //Количество юзеров = 3
	public int countUsersPerso = 1;   //Количество пользователей при тарифе Персональный = 1
	public int countUsersStand = 6;   //Количество пользователей при тарифе Стандартный = 6
	public int countUsersOptim = 20;   //Количество пользователей при тарифе Оптимальный = 20
	public int countUsersMaxim = 50;   //Количество пользователей при тарифе Максимальный = 50
	public int lineTextUsers = 8;    //Количество колонок в таблице по Пользователям
	public String textFirstlineUsers = "№";   //Название колонки №1 в таблице по Пользователям
	public String textSecondlineUsers = "Имя";   //Название колонки №2 в таблице по Пользователям
	public String textThirdlineUsers = "Дата регистрации";   //Название колонки №3 в таблице по Пользователям
	public String textFourthlineUsers = "E-mail";   //Название колонки №4 в таблице по Пользователям
	public String textFifthlineUsers = "Телефон";   //Название колонки №5 в таблице по Пользователям
	public String textSixthlineUsers = "Роль";   //Название колонки №6 в таблице по Пользователям
	public String textSeventhlineUsers = "Включен";   //Название колонки №7 в таблице по Пользователям
	public String textEighthlineUsers = "Управление";   //Название колонки №8 в таблице по Пользователям
	
	public int lineTarifPerson = 2;   //Количество строк возможностей при тарифе персональный
	public int lineTarifAll = 4;   //Количество строк возможностей при остальных тарифах
	
	public String textPerson = "Персональный";   //Текст для проверки активности тарифа Персональный на странице оплаты
	public String textStand = "Стандартный";   //Текст для проверки активности тарифа Стандартный на странице оплаты
	public String textOptim = "Оптимальный";   //Текст для проверки активности тарифа Оптимальный на странице оплаты
	public String textMaxim = "Максимальный";   //Текст для проверки активности тарифа Персональный на странице оплаты
	public String tarifActive = "Ваш тариф";   //Текст для проверки активности тарифа 
	public String tarifActivePerson = "Персональный";   //Текст для проверки активности тарифа Персональный на странице тарифов
	
	public String lineFirstTarifPerson = "1 Пользователь";   //Количество пользователей при тарифе персональный
	public String lineFirstTarifStand = "6 Пользователей";   //Количество пользователей при тарифе стандартный
	public String lineFirstTarifOptim = "20 Пользователей";   //Количество пользователей при тарифе оптимальный
	public String lineFirstTarifMaxim = "50 Пользователей";   //Количество пользователей при тарифе максимальный
		
	public String lineSecondTarifStand = "3 Центров учета";   //Количество ЦУ при тарифе стандартный
	public String lineSecondTarifOptim = "10 Центров учета";   //Количество ЦУ при тарифе оптимальный
	public String lineSecondTarifMaxim = "25 Центров учета";   //Количество ЦУ при тарифе максимальный
		
	public String lineThirdTarifAll = "Прогноз выручки";   //Наличие текста 
	public String lineFourthTarifAll = "Управление денежными потоками";   //Наличие текста
		
	public String lineUserPers = "Пользователь используется 1 из 1";   //Проверка состояния ПВ Да на странице оплаты
	public String lineUserStand = "Пользователей используется 3 из 6";   //Проверка состояния ПВ Да на странице оплаты
	public String lineUserOptim = "Пользователей используется 3 из 20";   //Проверка состояния ПВ Да на странице оплаты
	public String lineUserMaxim = "Пользователей используется 3 из 50";   //Проверка состояния ПВ Да на странице оплаты
	public String lineUserVip = "Пользователей используется 1 из 120";   //Проверка состояния ПВ Да на странице оплаты
	public String lineCenterStand = "Центров учета используется 1 из 3";   //Проверка состояния ПВ Да на странице оплаты
	public String lineCenterOptim = "Центров учета используется 1 из 10";   //Проверка состояния ПВ Да на странице оплаты
	public String lineCenterMaxim = "Центров учета используется 1 из 25";   //Проверка состояния ПВ Да на странице оплаты
	public String lineCenterVip = "Пользователь используется 50 из 50";   //Проверка состояния ПВ Да на странице оплаты
	public String linePvYes = "Прогноз выручки включен";   //Проверка состояния ПВ Да на странице оплаты
	public String linePvNo = "Прогноз выручки отключен";   //Проверка состояния ПВ Нет на странице оплаты
	public String lineUdpYes = "Управление денежными потоками включен";   //Проверка состояния УДП Да на странице оплаты
	public String lineUdpNo = "Управление денежными потоками отключен";   //Проверка состояния УДП Нет на странице оплаты
	
	public String countList_1 = "1";   //Количество листов УДП
	public String countList_2 = "2";   //Количество листов УДП
	public String countList_3 = "3";   //Количество листов УДП
		
	public String checkTodayWork = "second-table-days-th today-column";   //проверка сегодняшнего дня
	public String checkTodayHoliday = "second-table-days-th holiday-cell today-column";   //проверка сегодняшнего дня
	
	public String checkDisabled = "true";   //проверка не активности ячейки
	public String checkDisplay = "display: none;";   //Проверка отсутствия возможности удаления единственного листа
	public String checkReadonly = "true";   //Проверка не корректируемости ячейки
		
	public int countKategory_1 = 1;   //Количество категорий+подкатегорий = 1 для проверки
	public int countKategory_2 = 2;   //Количество категорий+подкатегорий = 2 для проверки
	public int countKategory_3 = 3;   //Количество категорий+подкатегорий = 3 для проверки
	public int countKategory_4 = 4;   //Количество категорий+подкатегорий = 4 для проверки
	public int countKategory_5 = 5;   //Количество категорий+подкатегорий = 5 для проверки
	public int countKategory_6 = 6;   //Количество категорий+подкатегорий = 6 для проверки
	public int countKategory_7 = 7;   //Количество категорий+подкатегорий = 5 для проверки
	public int countKategory_8 = 8;   //Количество категорий+подкатегорий = 8 для проверки
	public int countKategory_9 = 9;   //Количество категорий+подкатегорий = 9 для проверки
	public int countKategory_10 = 10;   //Количество категорий+подкатегорий = 10 для проверки
	public int countKategory_11 = 11;   //Количество категорий+подкатегорий = 11 для проверки
	public int countKategory_12 = 12;   //Количество категорий+подкатегорий = 12 для проверки
	public int countKategory_13 = 13;   //Количество категорий+подкатегорий = 13 для проверки
	public int countKategory_24 = 24;   //Количество категорий+подкатегорий = 24 для проверки
	public int countKategory_26 = 26;   //Количество категорий+подкатегорий = 26 для проверки
	public int countKategory_31 = 31;   //Количество категорий+подкатегорий = 31 для проверки
	public int countKategory_32 = 32;   //Количество категорий+подкатегорий = 32 для проверки
	public int countKategory_33 = 33;   //Количество категорий+подкатегорий = 33 для проверки
	public int countKategory_34 = 34;   //Количество категорий+подкатегорий = 32 для проверки
	public int countKategory_37 = 37;   //Количество категорий+подкатегорий = 37 для проверки
	public int countKategory_38 = 38;   //Количество категорий+подкатегорий = 38 для проверки
	public int countKategory_39 = 39;   //Количество категорий+подкатегорий = 39 для проверки
	public int countKategory_40 = 40;   //Количество категорий+подкатегорий = 40 для проверки
	public int countKategory_41 = 41;   //Количество категорий+подкатегорий = 41 для проверки
	public int countKategory_42 = 42;   //Количество категорий+подкатегорий = 42 для проверки
	public int countKategory_43 = 43;   //Количество категорий+подкатегорий = 43 для проверки
	public int countKategory_44 = 44;   //Количество категорий+подкатегорий = 44 для проверки
	public int countKategory_67 = 67;   //Количество категорий+подкатегорий = 67 для проверки
	public int countKategory_68 = 68;   //Количество категорий+подкатегорий = 67 для проверки
	
	public int countLine_1 = 1;   //Количество линий для проверки
	public int countLine_2 = 2;   //Количество линий для проверки
			 
	public int countValuta_1 = 1;   //Количество валют = 1
	public int countValuta_2 = 2;   //Количество валют = 2
	public int countValuta_3 = 3;   //Количество валют = 3
	public int countValuta_6 = 6;   //Количество валют = 6
	public int countValuta_7 = 7;   //Количество валют = 7
	public int countValuta_8 = 8;   //Количество валют = 8
	public int countValuta_9 = 9;   //Количество валют = 9
		
	public String prognozNo = "checkbox-hide";   //Проверка активации модуля прогноза = деактивирован
	
	public String valutaKalendar = "ВАЛЮТНЫЙ КАЛЕНДАРЬ";   //Проверка текста Валютный календарь
	
	
	
	//Вводимые значения
	public String centerCommentEmpty = "";   //Пустой комментарий по центру учета
	public String centerComment = "Офис";   //Комментарий по центру учета
	public String centerCommentNew = "Офис новый";   //Новый комментарий по центру учета
	public String centerCommentX = "#$%^&*-sі1";   //Комментарий ЦУ принимающее все символы
		
	public String userCommentEmpty = "";   //Пустой комментарий по юзеру
	public String userComment = "Юзер";   //Комментарий по юзеру
	public String userCommentNew = "Юзер новый";   //Новый комментарий по юзеру
	public String userCommentX = "#$%^&*- 1sі";   //Комментарий юзеру символы
		
	public String dataSimvols = "sіы#$%^&*";   //Значение для ввода Буквы
	public String dataComment = "Комментарий";   //Значение для ввода комментария по значению 
	public String dataCommentX = "sіы!№;:?/@#$%^&*()1";   //Значение для ввода комментария по значению 
	public String dataCommentNew = "Новый комментарий";   //Значение для ввода нового комментария по значению
	public String dataCommentEmpty = "";   //Пустой комментарий (Прогноз + УДП)
	public String datCommentSimvols = "sіы!№;:?/@#$%^&*()1";   //Значение для ввода нового комментария по значению
	public String empty_1 = "\b";   //Опустошение строки 
	public String empty_2 = "\b\b";   //Опустошение строки 
	public String empty_4 = "\b\b\b\b";   //Опустошение строки 
	public String empty_6 = "\b\b\b\b\b\b";   //Опустошение строки 
	public String empty_15 = "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b";   //Опустошение строки 
	public String empty_35 = "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b";   //Опустошение строки 
		
	public String dataDollar = "5,0000";   //Курс доллара
	public String dataEuro = "7,0000";   //Курс евро
	public String dataRubl = "0,4000";   //Курс рубля
	public String dataDollarBigger = "5,1234";   //Курс доллара с многими знаками
	public String dataEuroBigger = "7,1234";   //Курс евро с многими знаками
	public String dataRublBigger = "0,4123";   //Курс рубля	с многими знаками
	public String dataDollarMore = "5,00001";   //Курс доллара с многими знаками
	public String dataEuroMore = "7,00001";   //Курс евро с многими знаками
	public String dataRublMore = "0,40001";   //Курс рубля	с многими знаками
	public String dataKursValutAnother = "a+-*/$";   //Курс Символы
	public String dataKursValutBegin = "1,0000";   //Курс валюты пустой
	
	public String january = "Январь 2017";   //Название месяца для проверки ПВ и УДП
	public String february = "Февраль 2017";   //Название месяца для проверки ПВ и УДП
	public String march = "Март 2017";   //Название месяца для проверки ПВ и УДП
	public String april = "Апрель 2017";   //Название месяца для проверки ПВ и УДП
	public String may = "Май 2017";   //Название месяца для проверки ПВ и УДП
	public String june = "Июнь 2017";   //Название месяца для проверки ПВ и УДП
	public String july = "Июль 2017";   //Название месяца для проверки ПВ и УДП
	public String august = "Август 2017";   //Название месяца для проверки ПВ и УДП
	public String september = "Сентябрь 2017";   //Название месяца для проверки ПВ и УДП
	public String october = "Октябрь 2017";   //Название месяца для проверки ПВ и УДП
	public String november = "Ноябрь 2017";   //Название месяца для проверки ПВ и УДП
	public String december = "Декабрь 2017";   //Название месяца для проверки ПВ и УДП
	
	public String budjetJanuary = "Январь";   //Название месяца для бюджета за период
	public String budjetFebruary = "Февраль";   //Название месяца для бюджета за период
	public String budjetMarch = "Март";   //Название месяца для бюджета за период
	public String budjetApril = "Апрель";   //Название месяца для бюджета за период
	public String budjetMay = "Май";   //Название месяца для бюджета за период
	public String budjetJune = "Июнь";   //Название месяца для бюджета за период
	public String budjetJuly = "Июль";   //Название месяца для бюджета за период
	public String budjetAugust = "Август";   //Название месяца для бюджета за период
	public String budjetSeptember = "Сентябрь";   //Название месяца для бюджета за период
	public String budjetOctober = "Октябрь";   //Название месяца для бюджета за период
	public String budjetNovember = "Ноябрь";   //Название месяца для бюджета за период
	public String budjetDecember = "Декабрь";   //Название месяца для бюджета за период
	public String year_2017 = "2017";   //Название года для бюджета за период
	public String year_2016 = "2016";   //Название года для бюджета за период
	public String year_2015 = "2015";   //Название года для бюджета за период
		
	public String date_xxx = "SА@#$%^&*(_+/";   //Ввод количества корректируемых дней = 0
	public String date_0 = "0";   //Ввод количества корректируемых дней = 0
	public String date_60 = "60";   //Ввод количества корректируемых дней = 60
	public String date_61 = "61";   //Ввод количества корректируемых дней = 61
	public String date_3 = "3";   //Ввод количества корректируемых дней = 3
	public String date_7 = "7";   //Ввод количества корректируемых дней = 7
	public String dateDays_0 = "0";   //Ввод количества дней для прогнозирования
	public String dateDays_57 = "57";   //Ввод количества дней для прогнозирования
	public String dateDays_5 = "5";   //Ввод количества дней для прогнозирования
	public String dateDays_3 = "3";   //Ввод количества дней для прогнозирования
	public String dateDays_4 = "4";   //Ввод количества дней для прогнозирования
		
	public String dataCeloe_0 = "0";   //Значение для ввода и проверки 0 (Прогноз + УДП)
	public String dataCeloeMinus_1000 = "-1 000";   //Отрицательное значение для ввода и проверки -1000 (Прогноз + УДП)
	public String dataCeloeMinus_2000 = "-2 000";   //Отрицательное значение для ввода и проверки -2000 (Прогноз + УДП)
	public String dataCeloeMinus_3000 = "-3 000";   //Отрицательное значение для ввода и проверки -2000 (Прогноз + УДП)
	public String dataCeloeMinus_28000 = "-28 000";   //Значение для ввода и проверки -28000 (Прогноз + УДП)
	public String dataCeloeMinus_29000 = "-29 000";   //Значение для ввода и проверки -29000 (Прогноз + УДП)
	public String dataCeloeMinus_30000 = "-30 000";   //Значение для ввода и проверки -30000 (Прогноз + УДП)
	public String dataCeloeMinus_31000 = "-31 000";   //Значение для ввода и проверки -31000 (Прогноз + УДП)
	public String dataCeloe_1000 = "1 000";   //Значение для ввода и проверки 1000 (Прогноз + УДП)
	public String dataCeloe_2000 = "2 000";   //Значение для ввода и проверки 2000 (Прогноз + УДП)
	public String dataCeloe_3000 = "3 000";   //Значение для ввода и проверки 3000 (Прогноз + УДП)
	public String dataCeloe_4000 = "4 000";   //Значение для ввода и проверки 4000 (Прогноз + УДП)
	public String dataCeloe_5000 = "5 000";   //Значение для ввода и проверки 5000 (Прогноз + УДП)
	public String dataCeloe_6000 = "6 000";   //Значение для ввода и проверки 6000 (Прогноз + УДП)
	public String dataCeloe_7000 = "7 000";   //Значение для ввода и проверки 7000 (Прогноз + УДП)
	public String dataCeloe_8000 = "8 000";   //Значение для ввода и проверки 8000 (Прогноз + УДП)
	public String dataCeloe_9000 = "9 000";   //Значение для ввода и проверки 9000 (Прогноз + УДП)
	public String dataCeloe_10000 = "10 000";   //Значение для ввода и проверки 10000 (Прогноз + УДП)
	public String dataCeloe_11000 = "11 000";   //Значение для ввода и проверки 11000 (Прогноз + УДП)
	public String dataCeloe_12000 = "12 000";   //Значение для ввода и проверки 12000 (Прогноз + УДП)
	public String dataCeloe_13000 = "13 000";   //Значение для ввода и проверки 13000 (Прогноз + УДП)
	public String dataCeloe_14000 = "14 000";   //Значение для ввода и проверки 14000 (Прогноз + УДП)
	public String dataCeloe_15000 = "15 000";   //Значение для ввода и проверки 15000 (Прогноз + УДП)
	public String dataCeloe_16000 = "16 000";   //Значение для ввода и проверки 16000 (Прогноз + УДП)
	public String dataCeloe_17000 = "17 000";   //Значение для ввода и проверки 17000 (Прогноз + УДП)
	public String dataCeloe_18000 = "18 000";   //Значение для ввода и проверки 18000 (Прогноз + УДП)
	public String dataCeloe_19000 = "19 000";   //Значение для ввода и проверки 19000 (Прогноз + УДП)
	public String dataCeloe_20000 = "20 000";   //Значение для ввода и проверки 20000 (Прогноз + УДП)
	public String dataCeloe_21000 = "21 000";   //Значение для ввода и проверки 21000 (Прогноз + УДП)
	public String dataCeloe_22000 = "22 000";   //Значение для ввода и проверки 22000 (Прогноз + УДП)
	public String dataCeloe_23000 = "23 000";   //Значение для ввода и проверки 23000 (Прогноз + УДП)
	public String dataCeloe_24000 = "24 000";   //Значение для ввода и проверки 24000 (Прогноз + УДП)
	public String dataCeloe_25000 = "25 000";   //Значение для ввода и проверки 25000 (Прогноз + УДП)
	public String dataCeloe_26000 = "26 000";   //Значение для ввода и проверки 26000 (Прогноз + УДП)
	public String dataCeloe_27000 = "27 000";   //Значение для ввода и проверки 27000 (Прогноз + УДП)
	public String dataCeloe_28000 = "28 000";   //Значение для ввода и проверки 28000 (Прогноз + УДП)
	public String dataCeloe_29000 = "29 000";   //Значение для ввода и проверки 29000 (Прогноз + УДП)
	public String dataCeloe_30000 = "30 000";   //Значение для ввода и проверки 30000 (Прогноз + УДП)
	public String dataCeloe_31000 = "31 000";   //Значение для ввода и проверки 31000 (Прогноз + УДП)
	public String dataCeloe_32000 = "32 000";   //Значение для ввода и проверки 32000 (Прогноз + УДП)
	public String dataCeloe_33000 = "33 000";   //Значение для ввода и проверки 33000 (Прогноз + УДП)
	public String dataCeloe_34000 = "34 000";   //Значение для ввода и проверки 34000 (Прогноз + УДП)
	public String dataCeloe_35000 = "35 000";   //Значение для ввода и проверки 35000 (Прогноз + УДП)
	public String dataCeloe_36000 = "36 000";   //Значение для ввода и проверки 36000 (Прогноз + УДП)
	public String dataCeloe_37000 = "37 000";   //Значение для ввода и проверки 37000 (Прогноз + УДП)
	public String dataCeloe_38000 = "38 000";   //Значение для ввода и проверки 38000 (Прогноз + УДП)
	public String dataCeloe_39000 = "39 000";   //Значение для ввода и проверки 39000 (Прогноз + УДП)
	public String dataCeloe_40000 = "40 000";   //Значение для ввода и проверки 40000 (Прогноз + УДП)
	public String dataCeloe_41000 = "41 000";   //Значение для ввода и проверки 41000 (Прогноз + УДП)
	public String dataCeloe_42000 = "42 000";   //Значение для ввода и проверки 42000 (Прогноз + УДП)
	public String dataCeloe_43000 = "43 000";   //Значение для ввода и проверки 43000 (Прогноз + УДП)
	public String dataCeloe_44000 = "44 000";   //Значение для ввода и проверки 44000 (Прогноз + УДП)
	public String dataCeloe_45000 = "45 000";   //Значение для ввода и проверки 45000 (Прогноз + УДП)
	public String dataCeloe_46000 = "46 000";   //Значение для ввода и проверки 46000 (Прогноз + УДП)
	public String dataCeloe_47000 = "47 000";   //Значение для ввода и проверки 47000 (Прогноз + УДП)
	public String dataCeloe_48000 = "48 000";   //Значение для ввода и проверки 48000 (Прогноз + УДП)
	public String dataCeloe_49000 = "49 000";   //Значение для ввода и проверки 49000 (Прогноз + УДП)
	public String dataCeloe_50000 = "50 000";   //Значение для ввода и проверки 50000 (Прогноз + УДП)
	public String dataCeloe_51000 = "51 000";   //Значение для ввода и проверки 51000 (Прогноз + УДП)
	public String dataCeloe_52000 = "52 000";   //Значение для ввода и проверки 52000 (Прогноз + УДП)
	public String dataCeloe_53000 = "53 000";   //Значение для ввода и проверки 53000 (Прогноз + УДП)
	public String dataCeloe_54000 = "54 000";   //Значение для ввода и проверки 54000 (Прогноз + УДП)
	public String dataCeloe_55000 = "55 000";   //Значение для ввода и проверки 55000 (Прогноз + УДП)
	public String dataCeloe_56000 = "56 000";   //Значение для ввода и проверки 56000 (Прогноз + УДП)
	public String dataCeloe_57000 = "57 000";   //Значение для ввода и проверки 57000 (Прогноз + УДП)
	public String dataCeloe_58000 = "58 000";   //Значение для ввода и проверки 58000 (Прогноз + УДП)
	public String dataCeloe_59000 = "59 000";   //Значение для ввода и проверки 59000 (Прогноз + УДП)
	public String dataCeloe_60000 = "60 000";   //Значение для ввода и проверки 60000 (Прогноз + УДП)
	public String dataCeloe_61000 = "61 000";   //Значение для ввода и проверки 61000 (Прогноз + УДП)
	public String dataCeloe_62000 = "62 000";   //Значение для ввода и проверки 62000 (Прогноз + УДП)
	public String dataCeloe_63000 = "63 000";   //Значение для ввода и проверки 63000 (Прогноз + УДП)
	public String dataCeloe_64000 = "64 000";   //Значение для ввода и проверки 64000 (Прогноз + УДП)
	public String dataCeloe_65000 = "65 000";   //Значение для ввода и проверки 65000 (Прогноз + УДП)
	public String dataCeloe_66000 = "66 000";   //Значение для ввода и проверки 66000 (Прогноз + УДП)
	public String dataCeloe_69000 = "69 000";   //Значение для ввода и проверки 69000 (Прогноз + УДП)
	public String dataCeloe_70000 = "70 000";   //Значение для ввода и проверки 70000 (Прогноз + УДП)
	public String dataCeloe_72000 = "72 000";   //Значение для ввода и проверки 72000 (Прогноз + УДП)
	public String dataCeloe_75000 = "75 000";   //Значение для ввода и проверки 50000 (Прогноз + УДП)
	public String dataCeloe_78000 = "78 000";   //Значение для ввода и проверки 78000 (Прогноз + УДП)
	public String dataCeloe_81000 = "81 000";   //Значение для ввода и проверки 81000 (Прогноз + УДП)
	public String dataCeloe_87000 = "87 000";   //Значение для ввода и проверки 87000 (Прогноз + УДП)
	public String dataCeloe_90000 = "90 000";   //Значение для ввода и проверки 90000 (Прогноз + УДП)
	public String dataCeloe_93000 = "93 000";   //Значение для ввода и проверки 93000 (Прогноз + УДП)
	public String dataCeloe_96000 = "96 000";   //Значение для ввода и проверки 96000 (Прогноз + УДП)
	public String dataCeloe_105000 = "105 000";   //Значение для ввода и проверки 105000 (Прогноз + УДП)
	public String dataCeloe_138000 = "138 000";   //Значение для ввода и проверки 138000 (Прогноз + УДП)
	public String dataCeloe_132000 = "132 000";   //Значение для ввода и проверки 132000 (Прогноз + УДП)
	public String dataCeloe_1500000 = "1 500 000";   //Значение для ввода и проверки 1500000 (Прогноз + УДП)
	public String dataCeloe_3000000 = "3 000 000";   //Значение для ввода и проверки 3000000 (Прогноз + УДП)
	public String dataCeloe_100000 = "100 000";   //Значение для ввода и проверки 100000 (Прогноз + УДП)
			
	public String dataPercent_25 = "25";   //Соотношение выполнения плана 
	public String dataPercent_31 = "31";   //Соотношение выполнения плана 
	public String dataPercent_33 = "33";   //Соотношение выполнения плана 
	public String dataPercent_50 = "50";   //введение наценки
	public String dataPercent_62 = "62";   //Соотношение выполнения плана 
	public String dataPercent_67 = "67";   //Соотношение выполнения плана 
	public String dataPercent_75 = "75";   //введение наценки
	public String dataPercent_93 = "93";   //Соотношение выполнения плана 
	public String dataPercent_100 = "100";   //введение наценки, Соотношение выполнения плана 
	public String dataPercent_125 = "125";   //введение наценки
	public String dataPercent_112 = "112";   //Соотношение выполнения плана 
	public String dataPercent_116 = "116";   //Соотношение выполнения плана 
	public String dataPercent_120 = "120";   //Соотношение выполнения плана 
	public String dataPercent_122 = "122";   //Соотношение выполнения плана 
	public String dataPercent_124 = "124";   //Соотношение выполнения плана
	public String dataX = "—";   //Знак - 
	public String data_0 = "0,00";   //Значение для ввода и проверки 0 (Прогноз + УДП)
	public String dataMinus_1000 = "-1 000,00";   //Значение для ввода -1000,00 и проверки (Прогноз + УДП)
	public String data_1000 = "1 000,00";   //Значение для ввода 1000,00 и проверки (Прогноз + УДП)
	public String data_2000 = "2 000,00";   //Значение для ввода 2000,00 и проверки (Прогноз + УДП)
	public String data_3000 = "3 000,00";   //Значение для ввода 3000,00 и проверки (Прогноз + УДП)
	public String data_4000 = "4 000,00";   //Значение для ввода 4000,00 и проверки (Прогноз + УДП)
	public String data_5000 = "5 000,00";   //Значение для ввода 5000,00 и проверки (Прогноз + УДП)
	public String data_6000 = "6 000,00";   //Значение для ввода 6000,00 и проверки (Прогноз + УДП)
	public String data_7000 = "7 000,00";   //Значение для ввода 7000,00 и проверки (Прогноз + УДП)
	public String data_8000 = "8 000,00";   //Значение для ввода 8000,00 и проверки (Прогноз + УДП)
	public String data_9000 = "9 000,00";   //Значение для ввода 9000,00 и проверки (Прогноз + УДП)
	public String data_10000 = "10 000,00";   //Значение для ввода 10000,00 и проверки (Прогноз + УДП)
	public String data_11000 = "11 000,00";   //Значение для ввода 11000,00 и проверки (Прогноз + УДП)
	public String data_12000 = "12 000,00";   //Значение для ввода 12000,00 и проверки (Прогноз + УДП)
	public String data_13000 = "13 000,00";   //Значение для ввода 13000,00 и проверки (Прогноз + УДП)
	public String data_14000 = "14 000,00";   //Значение для ввода 14000,00 и проверки (Прогноз + УДП)
	public String data_15000 = "15 000,00";   //Значение для ввода 15000,00 и проверки (Прогноз + УДП)
	public String data_16000 = "16 000,00";   //Значение для ввода 16000,00 и проверки (Прогноз + УДП)
	public String data_17000 = "17 000,00";   //Значение для ввода 17000,00 и проверки (Прогноз + УДП)
	public String data_18000 = "18 000,00";   //Значение для ввода 18000,00 и проверки (Прогноз + УДП)
	public String data_19000 = "19 000,00";   //Значение для ввода 19000,00 и проверки (Прогноз + УДП)
	public String data_20000 = "20 000,00";   //Значение для ввода 20000,00 и проверки (Прогноз + УДП)
	public String data_21000 = "21 000,00";   //Значение для ввода 21000,00 и проверки (Прогноз + УДП)
	public String data_22000 = "22 000,00";   //Значение для ввода 22000,00 и проверки (Прогноз + УДП)
	public String data_23000 = "23 000,00";   //Значение для ввода 23000,00 и проверки (Прогноз + УДП)
	public String data_24000 = "24 000,00";   //Значение для ввода 24000,00 и проверки (Прогноз + УДП)
	public String data_25000 = "25 000,00";   //Значение для ввода 25000,00 и проверки (Прогноз + УДП)
	public String data_26000 = "26 000,00";   //Значение для ввода 26000,00 и проверки (Прогноз + УДП)
	public String data_27000 = "27 000,00";   //Значение для ввода 27000,00 и проверки (Прогноз + УДП)
	public String data_28000 = "28 000,00";   //Значение для ввода 28000,00 и проверки (Прогноз + УДП)
	public String data_29000 = "29 000,00";   //Значение для ввода 29000,00 и проверки (Прогноз + УДП)
	public String data_30000 = "30 000,00";   //Значение для ввода 30000,00 и проверки (Прогноз + УДП)
	public String data_31000 = "31 000,00";   //Значение для ввода 31000,00 и проверки (Прогноз + УДП)
	public String data_33000 = "33 000,00";   //Значение для ввода 33000,00 и проверки (Прогноз + УДП)
	public String data_36000 = "36 000,00";   //Значение для ввода 36000,00 и проверки (Прогноз + УДП)
	public String data_39000 = "39 000,00";   //Значение для ввода 39000,00 и проверки (Прогноз + УДП)
	public String data_42000 = "42 000,00";   //Значение для ввода 42000,00 и проверки (Прогноз + УДП)
	public String data_45000 = "45 000,00";   //Значение для ввода 45000,00 и проверки (Прогноз + УДП)
	public String data_48000 = "48 000,00";   //Значение для ввода 48000,00 и проверки (Прогноз + УДП)
	public String data_51000 = "51 000,00";   //Значение для ввода 51000,00 и проверки (Прогноз + УДП)
	public String data_54000 = "54 000,00";   //Значение для ввода 54000,00 и проверки (Прогноз + УДП)
	public String data_56000 = "56 000,00";   //Значение для ввода 56000,00 и проверки (Прогноз + УДП)
	public String data_57000 = "57 000,00";   //Значение для ввода 57000,00 и проверки (Прогноз + УДП)
	public String data_58000 = "58 000,00";   //Значение для ввода 58000,00 и проверки (Прогноз + УДП)
	public String data_60000 = "60 000,00";   //Значение для ввода 60000,00 и проверки (Прогноз + УДП)
	public String data_62000 = "62 000,00";   //Значение для ввода 62000,00 и проверки (Прогноз + УДП)
	public String data_63000 = "63 000,00";   //Значение для ввода 63000,00 и проверки (Прогноз + УДП)
	public String data_66000 = "66 000,00";   //Значение для ввода 66000,00 и проверки (Прогноз + УДП)
	public String data_69000 = "69 000,00";   //Значение для ввода 69000,00 и проверки (Прогноз + УДП)
	public String data_72000 = "72 000,00";   //Значение для ввода 72000,00 и проверки (Прогноз + УДП)
	public String data_75000 = "75 000,00";   //Значение для ввода 75000,00 и проверки (Прогноз + УДП)
	public String data_78000 = "78 000,00";   //Значение для ввода 78000,00 и проверки (Прогноз + УДП)
	public String data_81000 = "81 000,00";   //Значение для ввода 81000,00 и проверки (Прогноз + УДП)
	public String data_84000 = "84 000,00";   //Значение для ввода 84000,00 и проверки (Прогноз + УДП)
	public String data_87000 = "87 000,00";   //Значение для ввода 87000,00 и проверки (Прогноз + УДП)
	public String data_90000 = "90 000,00";   //Значение для ввода 90000,00 и проверки (Прогноз + УДП)
	public String data_93000 = "93 000,00";   //Значение для ввода 93000,00 и проверки (Прогноз + УДП)
	
	public String data_1000Bigger = "1 000,000";   //Значение для ввода c 3 знаками после запятой (Прогноз + УДП)
	public String dataAnother = "sіы+%#)";   //Значение для ввода 
	public String dataEmpty = "";   //Пустое значение 
	public String data_2 = "2,00";   //Значение для использования коэффициента сезонности для проверки (Прогноз)
	public String dataCoefX = "SА@#$%^&*(_+/";   //Значение для использования коэффициента сезонности для проверки (Прогноз)
	
	public String tarifBack = "//div[@class='wrapper']/div[4]";	
	
	//АДРЕСА
	//Вход------------------------------------------------------------------
		
	//Опции---------------------------------------------------------------------------
			
	//Для разворота тарифа - xpath
		public String optionTarif = "//span[@class='holder']/mark[text()='Тариф:']";	
	//Опция О тарифах - xpath
		public String optionAboutTarif = "//a[@href='/fc/administration/billing/tariff/renewal']";	
	//Опция Оплата - xpath
		public String optionPay = "//a[@href='/fc/billing/status']";			
		
	//Для разворота опций - xpath
		public String optionAll = "//span[@class='holder']/i[@class='fc-icon-account']";
	//Опция Редактирование аккаунта - xpath
		public String optionEditingAccount = "//a[@class='holder' and @href='/fc/administration/account/profile']";
	//Опция Редактирование аккаунта - xpath
		public String optionEditingAccountTitle = "uni-title-output";	
	//Опция Настройки аккаунта - xpath
		public String optionAccountSettinth = "//div[@id='wrapper']/nav/div/ul/li[4]/div/ul/li[3]/a";
	//Опция Центры Учета - xpath
		public String optionCenters = "//a[@href='/fc/administration/office/groups']";	
	//Опция Редактирование профиля - xpath
		public String optionEditingProfile = "//a[@href='/fc/profile']";	
	//Опция Пользователи аккаунта - xpath
		public String optionUsers = "//a[@href='/fc/administration/user/list']";	
	//Опция События - xpath
		public String optionEvents = "//a[@href='/fc/administration/account/log']";		
		
	
		
		
	//УДП--------------------------------------------------------------	
			
				
	
							
			
	
			
	
		
	
			
	//Категории в бюджете
	
			

	//1-й день в месяце в месяце - xpath
		public String udpDay_1 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[1]";	
	//2-й день в месяце в месяце - xpath
		public String udpDay_2 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[2]";	
	//3-й день в месяце в месяце - xpath
		public String udpDay_3 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[3]";	
	//4-й день в месяце в месяце - xpath
		public String udpDay_4 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[4]";	
	//5-й день в месяце в месяце - xpath
		public String udpDay_5 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[5]";	
	//6-й день в месяце в месяце - xpath
		public String udpDay_6 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[6]";	
	//7-й день в месяце в месяце - xpath
		public String udpDay_7 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[7]";	
	//8-й день в месяце в месяце - xpath
		public String udpDay_8 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[8]";	
	//9-й день в месяце в месяце - xpath
		public String udpDay_9 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[9]";	
	//10-й день в месяце в месяце - xpath
		public String udpDay_10 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[10]";	
	//11-й день в месяце в месяце - xpath
		public String udpDay_11 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[11]";	
	//12-й день в месяце в месяце - xpath
		public String udpDay_12 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[12]";	
	//13-й день в месяце в месяце - xpath
		public String udpDay_13 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[13]";	
	//14-й день в месяце в месяце - xpath
		public String udpDay_14 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[14]";	
	//15-й день в месяце в месяце - xpath
		public String udpDay_15 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[15]";	
	//16-й день в месяце в месяце - xpath
		public String udpDay_16 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[16]";	
	//17-й день в месяце в месяце - xpath
		public String udpDay_17 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[17]";	
	//18-й день в месяце в месяце - xpath
		public String udpDay_18 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[18]";	
	//19-й день в месяце в месяце - xpath
		public String udpDay_19 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[19]";	
	//20-й день в месяце в месяце - xpath
		public String udpDay_20 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[20]";	
	//21-й день в месяце в месяце - xpath
		public String udpDay_21 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[21]";	
	//22-й день в месяце в месяце - xpath
		public String udpDay_22 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[22]";	
	//23-й день в месяце в месяце - xpath
		public String udpDay_23 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[23]";	
	//24-й день в месяце в месяце - xpath
		public String udpDay_24 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[24]";	
	//25-й день в месяце в месяце - xpath
		public String udpDay_25 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[25]";	
	//26-й день в месяце в месяце - xpath
		public String udpDay_26 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[26]";	
	//27-й день в месяце в месяце - xpath
		public String udpDay_27 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[27]";	
	//28-й день в месяце в месяце - xpath
		public String udpDay_28 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[28]";	
	//29-й день в месяце в месяце - xpath
		public String udpDay_29 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[29]";	
	//30-й день в месяце в месяце - xpath
		public String udpDay_30 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[30]";	
	//31-й день в месяце в месяце - xpath
		public String udpDay_31 = "//table[@class='table-medium table-central income-table table-bordered']/thead/tr/th[31]";	

}
