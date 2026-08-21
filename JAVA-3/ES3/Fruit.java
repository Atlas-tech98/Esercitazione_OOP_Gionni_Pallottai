public class Fruit {

   private String fruit;

   public Fruit(String fruit) {
      this.fruit = fruit;
   }

   public String getFruit() {
      return this.fruit;
   }

   public void setFruit(String fruit) {
      this.fruit = fruit;
   }

   public void printFruit() {
      System.out.println("Fruit: " + this.fruit);
   }
}
