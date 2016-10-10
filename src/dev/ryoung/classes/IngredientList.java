package dev.ryoung.classes;

import java.util.ArrayList;
import java.util.List;

public class IngredientList {

	private List<Recipe> recipeList;
	
	public IngredientList(){
		recipeList = new ArrayList<Recipe>();
	}

	public List<Recipe> getRecipeList() {
		return recipeList;
	}

	public void setRecipeList(List<Recipe> recipeList) {
		this.recipeList = recipeList;
	}
	
	public void addToList(Recipe recipe){
		recipeList.add(recipe);
	}
	
	public void resetList(){
		recipeList.clear();
	}
}
