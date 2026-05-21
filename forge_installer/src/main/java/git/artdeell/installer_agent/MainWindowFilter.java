package git.artdeell.installer_agent;

import javax.swing.*;
import java.awt.*;

@np.annotation.NPProtect
public class MainWindowFilter implements ComponentFilter{
    @Override
    public boolean checkComponent(Component component) {
        return component instanceof JRadioButton
                || component instanceof JTextField
                || component instanceof JButton;
    }
}
