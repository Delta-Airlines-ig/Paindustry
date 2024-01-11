package pain.content;


import arc.graphics.*;
import arc.*;
import arc.graphics.g2d.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.content.*;
import pain.content.*;
//import idk.world.blocks.storage.*;

//import static idk.content.EarthLiquids.*;
import static pain.content.gamingItems.*;
import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static arc.graphics.g2d.Draw.rect;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;

@SuppressWarnings("deprecation")
public class gamingBlocks{
    //environment
    
    public static Block 
    //Redsand, ExposedStone, ExposedStoneWall, RedishStoneWall, RedStonewall, RedStone, RedishStone,
    //ores
    oreIron, gStone,  //not done with uranium
    //walls
   // stoneWall,
    //transport
   // ironconveyor, allocator, interchange, span, surplussorter, shortagesorter, sorter, reversesorter, 
    //storage
   // smalltank, largetank, smallsilo, largesilo, 
    //water drills
    //well, unneeded
    //drills
 //   drillMechanical, 
    //turrets
//    Gorunov, //lmg turret 
    //cores
    //damagedshard, fortress, stronghold, bunker, unitcomputer, broadcaster,
    //power
  //  steamgenerator, powerline, powerpylon, smallbattery; 

    public static void load() {
      gStone = new OreBlock(gamingItems.stone){{
            oreDefault = true;
            oreThreshold = 0.841f;
            oreScale = 25.580953f;
            variants = 2;
        }};
      oreIron = new OreBlock(gamingItems.hematite){{
            oreDefault = true;
            oreThreshold = 0.841f;
            oreScale = 25.580953f;
            variants = 2;
        }};
        steelSmelter = new GenericCrafter("steel-smelter"){{
            localizedName = "Steel smelter";
            requirements(Category.crafting, with(EarthItems.iron, 65, EarthItems.copper2, 40, EarthItems.lead2, 60));
            outputItem = new ItemStack(EarthItems.steel, 3);
	researchCostMultiplier = 2;
            craftTime = 60f;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;

            consumePower(1.5f);
            consumeItems(with(EarthItems.carbon, 2, EarthItems.iron, 5));

        }};
      
    }}
