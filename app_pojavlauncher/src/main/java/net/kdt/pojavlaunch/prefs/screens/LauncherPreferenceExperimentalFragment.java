package net.kdt.pojavlaunch.prefs.screens;

import android.os.Bundle;

import net.kdt.pojavlaunch.R;

@np.annotation.NPProtect
public class LauncherPreferenceExperimentalFragment extends LauncherPreferenceFragment {

    @Override
    public void onCreatePreferences(Bundle b, String str) {
        addPreferencesFromResource(R.xml.pref_experimental);
    }
}
