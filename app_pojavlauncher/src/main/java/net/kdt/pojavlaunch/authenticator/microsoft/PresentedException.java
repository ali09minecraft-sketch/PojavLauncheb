package net.kdt.pojavlaunch.authenticator.microsoft;

import android.content.Context;

@np.annotation.NPProtect
public class PresentedException extends RuntimeException {
    final int localizationStringId;
    final Object[] extraArgs;

    public PresentedException(int localizationStringId, Object... extraArgs) {
        this.localizationStringId = localizationStringId;
        this.extraArgs = extraArgs;
    }

    public PresentedException(Throwable throwable, int localizationStringId, Object... extraArgs) {
        super(throwable);
        this.localizationStringId = localizationStringId;
        this.extraArgs = extraArgs;
    }

    public String toString(Context context) {
        return context.getString(localizationStringId, extraArgs);
    }
}
