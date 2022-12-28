package rev;

public class Food_r {
    public String name;
    public String ingredients;
    public int calories;
    public String type;
    public double price;

    public Food_r(String Name, double Price){
        setName(Name);
        setPrice(Price);
    }

    public Food_r(String Name, String Ingredients, int Calories, String Type, double Price){
        setName(Name);
        setIngredients(Ingredients);
        setCalories(Calories);
        setType(Type);
        setPrice(Price);
    }

    public boolean equals(Food_r food){
        if (getName().equalsIgnoreCase(food.getName()) && getIngredients().equalsIgnoreCase(food.getIngredients())){
            return true;
        }
        else{
            return false;
        }
    }

    public void addIngredient(String newIngredient){
        if(ingredients.length()>0){
            ingredients += " ," + newIngredient;
        }
        else{
            ingredients = newIngredient;
        }
    }

    public boolean doesContain(String x){
        return ingredients.contains(x);
    }

    public String getName(){
        return name;
    } 
    public void setName(String x){
        name = x;
    }

    public String getIngredients(){
        return ingredients;
    }
    public void setIngredients(String x){
        ingredients = x;
    }

    public int getCalories(){
        return calories;
    }
    public void setCalories(int x){
        calories = x;
    }

    public String getType(){
        return type;
    }
    public void setType(String x){
        type = x;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double x){
        price = x;
    }

    public String toString(){
        String output = "";
        output += getName() + " is a " + getType() + " dish. \n";
        output += "It includes " + getIngredients() +". \n";
        output += "Single portion contains " + getCalories() +" calories. \n";
        output += "Single serving cost = " + getPrice() + "\n";

        return output;
    }
}
