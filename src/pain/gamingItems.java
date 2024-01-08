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
    //other things
    wroughtiron, hematite, castiron, pigiron, steel, hotwroughtiron, hotcastiron, hotpigiron, hotsteel;
    
//   public static final Seq<Item> EarthItems = new Seq<>();
//    public static final Seq<Item> Begone = new Seq<>();
    
    public static void load(){
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
        pigiron = new Item("pig-iron", Color.valueOf("00f0ec")){{
            localizedName = "Pig Iron";
               description = "Garbage iron, used only to produce better types of iron.";
                cost = 0.3f;
                //hardness = 15;
       }};
        steel = new Item("steel", Color.valueOf("00f0ec")){{
            localizedName = "Steel";
               description = "Strong but expensive structural material, useful in many things";
                cost = 0.3f;
                //hardness = 15;
       }};
        hotwroughtiron = new Item("hot-wrought-iron", Color.valueOf("00f0ec")){{
            localizedName = "Hot Wrought Iron";
               description = "Heated Wrought Iron.";
                cost = 0.1f;
                //hardness = 15;
       }};
        hotcastiron = new Item("hot-cast-iron", Color.valueOf("00f0ec")){{
            localizedName = "Hot Cast Iron";
               description = "Hot Cast Iron";
                cost = 0.3f;
                //hardness = 15;
       }};
        pigiron = new Item("pig-iron", Color.valueOf("00f0ec")){{
            localizedName = "Pig Iron";
               description = "Garbage iron, used only to produce better types of iron.";
                cost = 0.3f;
                //hardness = 15;
       }};
        steel = new Item("steel", Color.valueOf("00f0ec")){{
            localizedName = "Steel";
               description = "Strong but expensive structural material, useful in many things";
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
