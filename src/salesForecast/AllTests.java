package salesForecast;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
		//Прогноз выручки 116-64
		
	//Все ТК
	SalesForecastFirst.class,
	SalesForecastSecond.class,
	SalesForecastThird.class, 
	SalesForecastFourth.class,
	SalesForecastFifth.class,
	SalesForecastSixth.class,  
	SalesForecastSeventh.class,
	SalesForecastEighth.class,
	SalesForecastNinth.class,
	//SalesForecastTenth.class,   
	SalesForecastEleventh.class,
	SalesForecastTwelfth.class,
	//SalesForecastThirteenth.class,   
	SalesForecastFourteenth.class,
	//SalesForecastFifteenth.class,   
	SalesForecastSixteenth.class,
	SalesForecastSeventeenth.class,
	SalesForecastEighteenth.class,
	//SalesForecastNinteenth.class,
	//SalesForecastTwentieth.class,
	//SalesForecastTwentyFirst.class,
	SalesForecastTwentySecond.class,   
	SalesForecastTwentyThird.class,
	SalesForecastTwentyFourth.class,
	//SalesForecastTwentyFifth.class,   
	SalesForecastTwentySixth.class,
	SalesForecastTwentySeventh.class,
	SalesForecastTwentyEighth.class,  //false
	SalesForecastTwentyNinth.class,
	//SalesForecastThirtieth.class,
	SalesForecastThirtyFirst.class,
	SalesForecastThirtySecond.class,
	SalesForecastThirtyThird.class,
	SalesForecastThirtyFourth.class,
	//SalesForecastThirtyFifth.class,
	//SalesForecastThirtySixth.class,
	SalesForecastThirtySeventh.class,
	//SalesForecastThirtyEighth.class,
	//SalesForecastThirtyNinth.class,
	//SalesForecastFortieth.class,
	SalesForecastFortyFirst.class,
	//SalesForecastFortySecond.class,
	//SalesForecastFortyThird.class,
	//SalesForecastFortyFourth.class,
	SalesForecastFortyFifth.class,
	SalesForecastFortySixth.class,
	//SalesForecastFortySeventh.class,
	SalesForecastFortyEighth.class,
	//SalesForecastFortyNinth.class,
	//SalesForecastFifties.class,
	//SalesForecastFiftyFirst.class,
	//SalesForecastFiftySecond.class,
	//SalesForecastFiftyThird.class,
	//SalesForecastFiftyFourth.class,
	//SalesForecastFiftyFifth.class,
	//SalesForecastFiftySixth.class,
	//SalesForecastFiftySeventh.class,
	//SalesForecastFiftyEighth.class,
	//SalesForecastFiftyNinth.class,
	//SalesForecastSixties.class,
	//SalesForecastSixtyFirst.class,
	//SalesForecastSixtySecond.class,
	SalesForecastSixtyThird.class,
	//SalesForecastSixtyFourth.class,
	//SalesForecastSixtyFifth.class,	
	SalesForecastSixtySixth.class,
	//SalesForecastSixtySeventh.class,
	SalesForecastSixtyEighth.class,
	//SalesForecastSixtyNinth.class,
	SalesForecastSeventies.class,
	//SalesForecastSeventyFirst.class,
	//SalesForecastSeventySecond.class,
	//SalesForecastSeventyThird.class,
	//SalesForecastSeventyFourth.class,
	//SalesForecastSeventyFifth.class,
	//SalesForecastSeventySixth.class,
	//SalesForecastSeventySeventh.class,
	//SalesForecastSeventyEighth.class,
	//SalesForecastSeventyNinth.class,
	//SalesForecastEighties.class,
	//SalesForecastEightyFirst.class,
	//SalesForecastEightySecond.class,
	//SalesForecastEightyThird.class,
	//SalesForecastEightyFourth.class,
	//SalesForecastEightyFifth.class,
	//SalesForecastEightySixth.class,
	//SalesForecastEightySeventh.class,
	//SalesForecastEightyEighth.class,
	//SalesForecastEightyNinth.class,
	//SalesForecastNinties.class,
	//SalesForecastNintyFirst.class,   
	SalesForecastNintySecond.class,
	//SalesForecastNintyThird.class,
	//SalesForecastNintyFourth.class,
	//SalesForecastNintyFifth.class,
	//SalesForecastNintySixth.class,
	//SalesForecastNintySeventh.class,
	SalesForecastNintyEighth.class,
	SalesForecastNintyNinth.class,
	SalesForecastOneHundred.class,   //false
	SalesForecastOneHundredFirst.class,
	SalesForecastOneHundredSecond.class,   
	SalesForecastOneHundredThird.class,   
	SalesForecastOneHundredFourth.class,  
	SalesForecastOneHundredFifth.class,
	//SalesForecastOneHundredSixth.class,   //false
	SalesForecastOneHundredSeventh.class,
	SalesForecastOneHundredEighth.class,
	SalesForecastOneHundredNinth.class,
	SalesForecastOneHundredTenth.class,   
	SalesForecastOneHundredEleventh.class,
	SalesForecastOneHundredTwelfth.class,
	//SalesForecastOneHundredThirteenth.class,   //false
	//SalesForecastOneHundredFourteenth.class,   //false
	SalesForecastOneHundredFifteenth.class,   
	SalesForecastOneHundredSixteenth.class,   
	SalesForecastOneHundredSeventeenth.class,
	SalesForecastOneHundredEighteenth.class,
	//SalesForecastOneHundredNinteenth.class,   
	//SalesForecastOneHundredTwentieth.class,   //false
	SalesForecastOneHundredTwentyFirst.class,
	SalesForecastOneHundredTwentySecond.class,
	//SalesForecastOneHundredTwentyThird.class,   
	//SalesForecastOneHundredTwentyFourth.class,  
	//SalesForecastOneHundredTwentyFifth.class,   
	//SalesForecastOneHundredTwentySixth.class,   
	//SalesForecastOneHundredTwentySeventh.class,   
	SalesForecastOneHundredTwentyEighth.class, 
	SalesForecastOneHundredTwentyEighthPartTwo.class, 
	SalesForecastOneHundredTwentyNinth.class,
	//SalesForecastOneHundredThirties.class,   
	//SalesForecastOneHundredThirtyFirst.class,   
	//SalesForecastOneHundredThirtySecond.class,   
	//SalesForecastOneHundredThirtyThird.class,   
	//SalesForecastOneHundredThirtyFourth.class,   
	//SalesForecastOneHundredThirtyFifth.class,   
	SalesForecastOneHundredThirtySixth.class,
	//SalesForecastOneHundredThirtySeventh.class,   //false
	
	
	/*
	//По разделам
	//Создание ЦУ
	SalesForecastFirst.class,
	SalesForecastThird.class,
	SalesForecastSecond.class,
	SalesForecastNinth.class,
	SalesForecastFifth.class,
	SalesForecastFourth.class,
	SalesForecastSixth.class,  
	SalesForecastSeventh.class,
	SalesForecastEighth.class,
	
	//Сообщения к созданиям ЦУ
	//SalesForecastTenth.class,   
	//SalesForecastOneHundredThirtySeventh.class,   //false
	
	//Изменение ЦУ
	SalesForecastEleventh.class,
	SalesForecastTwelfth.class,
	SalesForecastFourteenth.class,
	SalesForecastSixteenth.class,
	SalesForecastEighteenth.class,
	SalesForecastSeventeenth.class,
	//SalesForecastFifteenth.class,
	
	//Сообщения к изменениям
	//SalesForecastThirteenth.class,   
	   
	//Период ЦУ
	SalesForecastTwentySecond.class,  
	
	//Отображение ЦУ по месяцам
	SalesForecastTwentyThird.class,
	SalesForecastTwentyFourth.class,
	//SalesForecastTwentyFifth.class,   
	SalesForecastTwentySixth.class,
	
	//Внесение/отображение данных
	SalesForecastTwentySeventh.class,
	SalesForecastTwentyEighth.class,  //false
	SalesForecastTwentyNinth.class,
	SalesForecastThirtySecond.class,
	SalesForecastThirtyThird.class,
	SalesForecastThirtyFourth.class,
	SalesForecastFortySixth.class,
	//SalesForecastFifties.class,
	SalesForecastThirtyFirst.class,
	//SalesForecastThirtySixth.class,
	SalesForecastThirtySeventh.class,
	//SalesForecastFortieth.class,
	SalesForecastFortyEighth.class,
	//SalesForecastFiftyFirst.class,
	SalesForecastFortyFirst.class,
	//SalesForecastFortyFourth.class,
	SalesForecastOneHundredNinth.class,
	SalesForecastOneHundredEleventh.class,
	
	//% выполнения
	SalesForecastFortyFifth.class,
	
	//Расположения/вложения ЦУ/Групп, их отображения
	//SalesForecastFiftySecond.class,
	//SalesForecastFiftyThird.class,
	//SalesForecastFiftyFourth.class,
	//SalesForecastFiftySixth.class,
	//SalesForecastFiftyEighth.class,
	//SalesForecastSixties.class,
	//SalesForecastSixtySecond.class,
	SalesForecastSixtyThird.class,
	//SalesForecastSixtyFourth.class,
	SalesForecastSixtySixth.class,
	SalesForecastOneHundredTwentyNinth.class,
	SalesForecastOneHundredTwentyEighth.class, 
	SalesForecastOneHundredTwentyEighthPartTwo.class, 
	
	//Построение графика
	//SalesForecastEightyEighth.class,
	SalesForecastSeventies.class,
	
	//График Касса нарастающая
	//SalesForecastOneHundredThirtySecond.class, 
	//SalesForecastSeventyFirst.class,
	//SalesForecastSeventySeventh.class,
	//SalesForecastSeventySecond.class,
	//SalesForecastSeventyNinth.class,
	//SalesForecastSeventyEighth.class,
	//SalesForecastEightyFirst.class,
	//SalesForecastSeventyThird.class,
	//SalesForecastSeventyFourth.class,
	//SalesForecastSeventyFifth.class,
	//SalesForecastSeventySixth.class,
	//SalesForecastOneHundredThirties.class,  
	
	//График Прогноз 
	//SalesForecastOneHundredThirtyThird.class,   
	//SalesForecastEightySecond.class,
	//SalesForecastEightySixth.class,
	//SalesForecastEightyThird.class,
	//SalesForecastEightyNinth.class,
	//SalesForecastEightySeventh.class,
	//SalesForecastNinties.class,
	//SalesForecastEightyFourth.class,
	//SalesForecastEightyFifth.class,
	//SalesForecastOneHundredThirtyFirst.class,   
	
	//Коэффициент сезонности
	SalesForecastNintyEighth.class,
	SalesForecastNintyNinth.class,
	SalesForecastOneHundred.class,   //false
	SalesForecastOneHundredFirst.class,
	//SalesForecastOneHundredFourteenth.class,   //false
	SalesForecastOneHundredFifteenth.class,   
	SalesForecastOneHundredSixteenth.class,   
	SalesForecastOneHundredThirtySixth.class,
	
	//Внесение Кассы и через Ентер
	//SalesForecastNintyFirst.class,   
	SalesForecastNintySecond.class,
	SalesForecastOneHundredSecond.class,   
	SalesForecastOneHundredThird.class,   
	SalesForecastOneHundredFourth.class,
	
	//Внесение дней пргнозирования
	SalesForecastOneHundredTenth.class, 
	SalesForecastOneHundredFifth.class,
	//SalesForecastOneHundredSixth.class,   //false
	SalesForecastOneHundredSeventh.class,
	SalesForecastOneHundredEighth.class,
	SalesForecastOneHundredTwelfth.class,
	//SalesForecastOneHundredThirteenth.class,   //false
	
	//Основной график
	SalesForecastSixtyEighth.class,
	//SalesForecastOneHundredTwentySeventh.class, 
	
	//Продажи за прошлый период
	SalesForecastOneHundredSeventeenth.class,
	SalesForecastOneHundredEighteenth.class,
	//SalesForecastOneHundredTwentieth.class,   //false
	SalesForecastOneHundredTwentyFirst.class,
	SalesForecastOneHundredTwentySecond.class,
	//SalesForecastOneHundredTwentyThird.class,   
	//SalesForecastOneHundredTwentyFourth.class,  
	//SalesForecastOneHundredTwentyFifth.class,  */
	})
public class AllTests {

}
