public class Order {
    public static int count;
    
    public int ID;
    public Food orderedFod;
    public double portion;
    public double totalPrice;

    public double price;
    public String nameOfFood;

    public Order(double Portion, String Name, double Price){
        addOrder();
        setPortion(Portion);
        setID(count);
        setPrice(Price);
        totalPrice = 0.0;
        setFoodName(Name);
    }

    public Order(double Portion, Food OrderedFood){
        addOrder();
        setPortion(Portion);
        setID(count);
        setPrice(OrderedFood.getPrice());
        totalPrice = 0.0;
        setFoodName(OrderedFood.getName());
    }

    public String getFoodName(){
        return nameOfFood;
    }
    public void setFoodName(String x){
        nameOfFood = x;
    }

    public void addOrder(){
        count++;
    }

    public boolean equals(Order order){
        if (getID() == order.getID()){
            return true;
        }
        else{
            return false;
        }
    }

    public void checkout(){
        totalPrice = getPortion() * getPrice();
    }
    public double getTotalPrice(){
        return totalPrice;
    }

    public void increasePortion(int x){
        setPortion(getPortion() +  x);
    }

    public int getID(){
        return ID;
    }
    public void setID(int x){
        ID = x;
    }

    public double getPortion(){
        return portion;
    }
    public void setPortion(double x){
        portion = x;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double x){
        price = x;
    }

    public String toString(){
        String output = "";
        output += "*************************** \n";
        output += ">> Warning: This order is incomplete. \n";
        output += "Details for Order " + getID() +": \n";
        output += "        " + getFoodName() + "(x " + getPortion() + ") \n";
        output += "        " + "TOTAL = " + getTotalPrice() +"\n";

        return output;
    }

}
