package com.sam.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "icecream")
public class FlavourModel {
	
	@Id
	private String id;
	
	private String name;
	
	private String allergen;
	
	private String category;
	
	private float buyingPrice;
	
	private float sellingPrice;
	
	private float nutriValue;
	
	private String cream;
	
	private String milk;
	
	private String fruit_content;
	
	private String[] flavours;
	
	private String[] fruits;
	
	private Ingredient[] ingredient;
	
	public FlavourModel() {
		
	}

	public FlavourModel(String name, String allergen, String category, float buyingPrice, float sellingPrice,
			float nutriValue, String cream, String milk, String fruit_content, String[] flavours, String[] fruits,
			Ingredient[] ingredient) {
		super();
		this.name = name;
		this.allergen = allergen;
		this.category = category;
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		this.nutriValue = nutriValue;
		this.cream = cream;
		this.milk = milk;
		this.fruit_content = fruit_content;
		this.flavours = flavours;
		this.fruits = fruits;
		this.ingredient = ingredient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAllergen() {
		return allergen;
	}

	public void setAllergen(String allergen) {
		this.allergen = allergen;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(float buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public float getNutriValue() {
		return nutriValue;
	}

	public void setNutriValue(float nutriValue) {
		this.nutriValue = nutriValue;
	}

	public String getCream() {
		return cream;
	}

	public void setCream(String cream) {
		this.cream = cream;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public String getFruit_content() {
		return fruit_content;
	}

	public void setFruit_content(String fruit_content) {
		this.fruit_content = fruit_content;
	}

	public String[] getFlavours() {
		return flavours;
	}

	public void setFlavours(String[] flavours) {
		this.flavours = flavours;
	}

	public String[] getFruits() {
		return fruits;
	}

	public void setFruits(String[] fruits) {
		this.fruits = fruits;
	}

	public Ingredient[] getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient[] ingredient) {
		this.ingredient = ingredient;
	}

	public String getId() {
		return id;
	}

}
