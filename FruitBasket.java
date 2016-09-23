package com.one.fruit;

import java.util.HashMap;
import java.util.Map.Entry;

import com.fruit.exception.EmptyBasketException;
import com.one.fruit.FruitConstants;

public class FruitBasket {

	/**
	* The method calculates the total value of fruit basket.
	* The price of each fruit is taken from constants file.
	*
	* @author  Vikram Banga
	* @version 1.0
	* @param basket A map containing key as fruit and value as quantity
	* @return float Returns the total value of basket.
	*/
	public float calculateBasketValue(HashMap<String,Integer> basket) throws EmptyBasketException{
		
		float totalCostOfBucket=0f;
		if(basket!=null && basket.size()>0){
			try{
				float priceOfFruit=0f;
				for(Entry<String, Integer> e: basket.entrySet()){
					if(e.getKey()!=null && e.getValue()!=null && e.getValue()>0){
						
						switch (e.getKey()) {
						case FruitConstants.FRUIT_APPLE:
							priceOfFruit=FruitConstants.APPLE_PRICE*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
							
							break;
						case FruitConstants.FRUIT_BANANA:
							priceOfFruit=FruitConstants.BANANA_PRICE*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
							
							break;
						case FruitConstants.FRUIT_LEMON:
							priceOfFruit=FruitConstants.LEMON_PRICE*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
							
							break;
						case FruitConstants.FRUIT_ORANGE:
							priceOfFruit=FruitConstants.ORANGE_PRICE*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
							
							break;

						case FruitConstants.FRUIT_PEACH:
							priceOfFruit=FruitConstants.PEACH_PRICE*e.getValue();
							totalCostOfBucket=totalCostOfBucket+priceOfFruit;
							
							break;
							
						default:
							
							break;
						}
						
					}
				}
			}catch(Exception e){
				System.out.println("improve");
				e.printStackTrace();
			}
			return totalCostOfBucket;
		}
		else{
			throw new EmptyBasketException("No Fruit present");
		}
	
		
		
	}
	
public static void main(String[] ar) {
	HashMap<String, Integer> mapFruit = new HashMap<String,Integer>();
	mapFruit.put("Apples",4);
	mapFruit.put("Lemons",4);
	FruitBasket fp=new FruitBasket();
	try {
		System.out.println(fp.calculateBasketValue(mapFruit));
	} catch (EmptyBasketException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
