public class Test {

    public static void main(String[] args){
        Character queen = new Queen();
        queen.setCharName("Cersei");
        
        //lambda expression substitutes class PoisonBehaviour
        WeaponBehaviour poison = () -> System.out.println(" poisoning enemies!"); 
        queen.setWeaponOfChoice(poison);
        queen.announceName();
        queen.fight();

        Character knight = new Knight();
        knight.setCharName("Arya");
        
        //lambda expression substitutes class SwordBehaviour
        WeaponBehaviour sword = () -> System.out.println(" stabbing with a sword!");
        knight.setWeaponOfChoice(sword);
        knight.announceName();
        knight.fight();
    }

}
