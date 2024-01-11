package pain.content;

import arc.*;
import arc.graphics.*;
import arc.struct.*;
import mindustry.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ctype.UnlockableContent;

import static mindustry.content.Items.*;

public class gamingItems{
    public static Item 
    stone, stoneBricks,
    //copper or bronze. unused for now
  //  bronze, brass, zinc, tin, malachite,
    //iron
    spongeiron, wroughtiron, hematite, castiron, pigiron, steel;
    
//   public static final Seq<Item> EarthItems = new Seq<>();
//    public static final Seq<Item> Begone = new Seq<>();
    
    public static void load(){
        stoneBricks = new Item("stone-bricks", Color.valueOf("00f0ec")){{
            localizedName = "Stone Bricks";
               description = "Fancy stone";
                cost = 0.1f;
                //hardness = 15;
       }};
        stone = new Item("stone", Color.valueOf("00f0ec")){{
            localizedName = "Stone";
               description = "Stone";
                cost = 0.1f;
                //hardness = 15;
       }};
        wroughtiron = new Item("wrought-iron", Color.valueOf("00f0ec")){{
            localizedName = "Wrought Iron";
               description = "Early iron in the process, used in making some structures and better resources";
                cost = 0.1f;
                //hardness = 15;
       }};
        hematite = new Item("hematite", Color.valueOf("00f0ec")){{
            localizedName = "Hematite";
               description = "Iron ore";
                cost = 0.1f;
                //hardness = 15;
       }};
        castiron = new Item("cast-iron", Color.valueOf("00f0ec")){{
            localizedName = "Cast Iron";
               description = "High carbon iron. More useful than wrought iron.";
                cost = 0.3f;
                //hardness = 15;
       }};
        spongeiron = new Item("sponge-iron", Color.valueOf("00f0ec")){{
            localizedName = "Sponge Iron";
               description = "Garbage iron, used only to produce wrought iron. Produced in bloomeries.";
                cost = 0.3f;
                //hardness = 15;
       }};
        pigiron = new Item("pig-iron", Color.valueOf("00f0ec")){{
            localizedName = "Pig Iron";
               description = "Garbage iron, used only to produce better types of iron. Produced from blast furnaces.";
                cost = 0.3f;
                //hardness = 15;
       }};
        steel = new Item("steel", Color.valueOf("00f0ec")){{
            localizedName = "Steel";
               description = "Strong but expensive structural material, useful in many things.";
                cost = 0.3f;
                //hardness = 15;
       }};
     //           EarthItems.addAll(
     //           voltite, iron, lithium, tin, steel, aluminum, uranium, carbon, oxidizer, explosivemix, silicon, copper2, lead2, sand, surgeAlloy, phaseFabric, graphite
     //   );
     //                   Begone.addAll(
     //           thorium, beryllium, tungsten, oxide, carbide, fissileMatter, dormantCyst, scrap, coal, titanium, plastanium, sporePod, blastCompound, pyratite, copper, metaglass, lead
     //   );
    }
}
