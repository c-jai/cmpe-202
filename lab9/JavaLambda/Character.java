public abstract class Character {

    String charName;

    WeaponBehaviour weapon;

    public void setCharName(String name){
        charName = name;
    }

    public void announceName(){
        System.out.println("I am " + charName);
    }

    public void setWeaponOfChoice(WeaponBehaviour weaponOfChoice){
        weapon = weaponOfChoice;
    }

    public void fight(){
        System.out.print("I prefer");
        weapon.useWeapon();
    }
}
