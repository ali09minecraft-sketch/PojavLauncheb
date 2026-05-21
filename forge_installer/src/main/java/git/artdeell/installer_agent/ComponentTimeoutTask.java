package git.artdeell.installer_agent;

import java.util.TimerTask;

@np.annotation.NPProtect
public class ComponentTimeoutTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Initialization timed out!");
        System.exit(17);
    }
}
