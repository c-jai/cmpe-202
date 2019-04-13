public class Test {

    public static void main(String[] args){
        Character knight = new Knight();
        knight.setCharName("Rob");
        knight.setWeaponOfChoice(new AxeBehaviour());
        knight.announceName();
        knight.fight();

        Character queen = new Knight();
        queen.setCharName("Danerys");
        queen.setWeaponOfChoice(new SwordBehaviour());
        queen.announceName();
        queen.fight();
    }

}
