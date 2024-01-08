package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class gamingMod extends Mod{

    public gamingMod(){
        Log.info("Ruh roh");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Godspeed");
                dialog.cont.add("This is NOT gonna be fun").row();
                //mod sprites are prefixed with the mod name (this mod is called 'gaming' in its config)
                dialog.cont.image(Core.atlas.find("gaming-frog")).pad(20f).row();
                dialog.cont.button("Uhhuh", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("start msg");
    }

}
