package content;


import mindustry.type.Item;


public class ModItem {
    public static Item 铜铅合金;
    public static void load(){
        铜铅合金 = new Item ("铜铅合金"){{
            flammability = 0f;
            explosiveness = 0f;
            radioactivity = 1f;
            hardness = 2;
            cost = 2;
        }};


    }
}

