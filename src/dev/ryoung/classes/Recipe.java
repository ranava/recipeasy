package dev.ryoung.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

	private String name;
	private String category;
	private String ingredient1;
	private String ingredient2;
	private String ingredient3;
	private String ingredient4;
	private String ingredient5;
	private String ingredient6;
	private String ingredient7;
	private String ingredient8;
	private String ingredient9;
	private String ingredient10;
	private String ingredient11;
	private String ingredient12;

	public Recipe(String newName, String newCat, String newIng1, String newIng2, String newIng3, String newIng4, String newIng5, 
			String newIng6, String newIng7, String newIng8, String newIng9, String newIng10, String newIng11, String newIng12){
		
		this.name = newName;
		this.category = newCat;
		this.ingredient1 = newIng1;
		this.ingredient2 = newIng2;
		this.ingredient3 = newIng3;
		this.ingredient4 = newIng4;
		this.ingredient5 = newIng5;
		this.ingredient6 = newIng6;
		this.ingredient7 = newIng7;
		this.ingredient8 = newIng8;
		this.ingredient9 = newIng9;
		this.ingredient10 = newIng10;
		this.ingredient11 = newIng11;
		this.ingredient12 = newIng12;
	}
	
	public Recipe(){
		this.name = "new recipe";
		this.category = "no cat";
		this.ingredient1 = "";
		this.ingredient2 = "";
		this.ingredient3 = "";
		this.ingredient4 = "";
		this.ingredient5 = "";
		this.ingredient6 = "";
		this.ingredient7 = "";
		this.ingredient8 = "";
		this.ingredient9 = "";
		this.ingredient10 = "";
		this.ingredient11 = "";
		this.ingredient12 = "";
	}
	
	public Recipe findRecipe(String line){
		Recipe recipe = null;
		
		String category = line.substring(0, 1);
		
		int space2 = line.indexOf('$', 2);
        String name = line.substring(2, space2);
        
        int space3 = line.indexOf('$', space2 + 1);
        String ing1 = line.substring(space2 + 1, space3);

        int space4 = line.indexOf('$', space3 + 1);
        String ing2 = line.substring(space3 + 1, space4);
        
        int space5 = line.indexOf('$', space4 + 1);
        String ing3 = line.substring(space4 + 1, space5);
        
        int space6 = line.indexOf('$', space5 + 1);
        String ing4 = line.substring(space5 + 1, space6);
        
        int space7 = line.indexOf('$', space6 + 1);
        String ing5 = line.substring(space6 + 1, space7);
        
        int space8 = line.indexOf('$', space7 + 1);
        String ing6 = line.substring(space7 + 1, space8);
        
        int space9 = line.indexOf('$', space8 + 1);
        String ing7 = line.substring(space8 + 1, space9);
        
        int space10 = line.indexOf('$', space9 + 1);
        String ing8 = line.substring(space9 + 1, space10);
        
        int space11 = line.indexOf('$', space10 + 1);
        String ing9 = line.substring(space10 + 1, space11);
        
        int space12 = line.indexOf('$', space11 + 1);
        String ing10 = line.substring(space11 + 1, space12);
        
        int space13 = line.indexOf('$', space12 + 1);
        String ing11 = line.substring(space12 + 1, space13);
        
        String ing12 = line.substring(space13 + 1);

        recipe = new Recipe(name, category, ing1, ing2, ing3, ing4, ing5, ing6, ing7, ing8, ing9, ing10, ing11, ing12);
        
        return recipe;
	}
	
	public List<Recipe> recipeList(String category){
		List<Recipe> recipes = new ArrayList<Recipe>();
		Recipe recipe = new Recipe();
		
		FileReader reader;
		
		try {
			reader = new FileReader("RecipesMasterList.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

	        String line = bufferedReader.readLine();
	
	        while(line != null){
		        String catName = line.substring(0, 1);
		        
		        if (catName.equals(category)){
		        	Recipe newRecipe = recipe.findRecipe(line);
		        	recipes.add(newRecipe);
		        	line = bufferedReader.readLine();
		        } else if (category.equals("X")){
		        	Recipe newRecipe = recipe.findRecipe(line);
		        	recipes.add(newRecipe);
		        	line = bufferedReader.readLine();
		        } else {
		        	line = bufferedReader.readLine();
		        }
	        }
	        bufferedReader.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return recipes;
	}
	
	public Recipe callRecipe(String callingName){
		Recipe recipe = null;
		
		FileReader reader;
		boolean checking = true;
		
		try {
			reader = new FileReader("RecipesMasterList.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

	        String line = bufferedReader.readLine();
	
	        while(checking){
		        int checkSpace = line.indexOf('$');
		        String checkName = line.substring(2, checkSpace);
		        
		        if (checkName.equals(callingName)){
		        
			        recipe = findRecipe(line);
			        checking = false;
			        bufferedReader.close();
			        
		        } else {
		        	line = bufferedReader.readLine();
		        }
	        }
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return recipe;
	}
	
	public void addRecipe(Recipe recipe) {
		FileWriter writer = null;
		try 
        {
           writer = new FileWriter("RecipesMasterList.txt", true);
           
           String line = recipe.getCategory() + "$" + recipe.getName() + "$" + recipe.getIngredient1() + "$" + recipe.getIngredient2() +
        		   "$" + recipe.getIngredient3() + "$" + recipe.getIngredient4() + "$" + recipe.getIngredient5() + "$" + recipe.getIngredient6() + 
        		   "$" + recipe.getIngredient7() + "$" + recipe.getIngredient8() + "$" + recipe.getIngredient9() + "$" + recipe.getIngredient10() +
        		   "$" + recipe.getIngredient11() + "$" + recipe.getIngredient12() + "\n";
           writer.write(line);
           writer.close();
        }
        catch (IOException e) 
        {
           e.printStackTrace();
        } 
		finally {
        	if (writer != null) {
        		try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
        }
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIngredient1() {
		return ingredient1;
	}

	public void setIngredient1(String ingredient1) {
		this.ingredient1 = ingredient1;
	}

	public String getIngredient2() {
		return ingredient2;
	}

	public void setIngredient2(String ingredient2) {
		this.ingredient2 = ingredient2;
	}

	public String getIngredient3() {
		return ingredient3;
	}

	public void setIngredient3(String ingredient3) {
		this.ingredient3 = ingredient3;
	}

	public String getIngredient4() {
		return ingredient4;
	}

	public void setIngredient4(String ingredient4) {
		this.ingredient4 = ingredient4;
	}

	public String getIngredient5() {
		return ingredient5;
	}

	public void setIngredient5(String ingredient5) {
		this.ingredient5 = ingredient5;
	}

	public String getIngredient6() {
		return ingredient6;
	}

	public void setIngredient6(String ingredient6) {
		this.ingredient6 = ingredient6;
	}

	public String getIngredient7() {
		return ingredient7;
	}

	public void setIngredient7(String ingredient7) {
		this.ingredient7 = ingredient7;
	}

	public String getIngredient8() {
		return ingredient8;
	}

	public void setIngredient8(String ingredient8) {
		this.ingredient8 = ingredient8;
	}

	public String getIngredient9() {
		return ingredient9;
	}

	public void setIngredient9(String ingredient9) {
		this.ingredient9 = ingredient9;
	}

	public String getIngredient10() {
		return ingredient10;
	}

	public void setIngredient10(String ingredient10) {
		this.ingredient10 = ingredient10;
	}

	public String getIngredient11() {
		return ingredient11;
	}

	public void setIngredient11(String ingredient11) {
		this.ingredient11 = ingredient11;
	}

	public String getIngredient12() {
		return ingredient12;
	}

	public void setIngredient12(String ingredient12) {
		this.ingredient12 = ingredient12;
	}
}
