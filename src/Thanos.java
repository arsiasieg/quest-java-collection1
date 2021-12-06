import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	List<Hero> heroes = new ArrayList<Hero>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
    	heroes.add(new Hero("Iron Man", 48));
    	heroes.add(new Hero("Black Widow", 34));
     	heroes.add(new Hero("Captain America", 100));
     	heroes.add(new Hero("Vision", 3));
     	heroes.add(new Hero("Scarlett Witch", 29));
     	heroes.add(new Hero("Thor", 1500));
     	heroes.add(new Hero("Hulk", 49));
     	heroes.add(new Hero("Doctor Strange", 42));
    	
    	// TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
     	Comparator<Hero> comparator = new Comparator<Hero>() {
			
			@Override
			public int compare(Hero hero1, Hero hero2) {
				// TODO Auto-generated method stub
				return hero1.getName().compareTo(hero2.getName());
			}
		};
		
		Collections.sort(heroes, comparator);
        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        Collections.sort(heroes);
        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}
