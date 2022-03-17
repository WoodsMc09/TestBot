import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main {


    public static void main(String[] args) throws Exception{
        JDABuilder jda = JDABuilder.createDefault("OTU0MTA0MDYyNDY5NjI3OTM1.YjOQpg.jB94iBDgamcbrcITYgFYjYEULAk");
        jda.setActivity(Activity.playing("testbot"));
        jda.build();

    }
}
