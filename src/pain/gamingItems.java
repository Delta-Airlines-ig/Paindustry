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
        wroughtiron = new Item("Wrought Iron", Color.valueOf("00f0ec")){{
            localizedName = "Wrought Iron";
               description = "sahbdja";
                charge = 9.5f;
                radioactivity = 0f;
                explosiveness = 1f;
                flammability = 0.2f;
                cost = 0.1f;
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
