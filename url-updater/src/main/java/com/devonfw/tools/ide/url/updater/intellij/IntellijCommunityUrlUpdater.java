package com.devonfw.tools.ide.url.updater.intellij;

import com.devonfw.tools.ide.common.OperatingSystem;
import com.devonfw.tools.ide.url.model.folder.UrlVersion;

/**
 * {@link IntellijUrlUpdater} for the community edition of IntelliJ.
 */
public class IntellijCommunityUrlUpdater extends IntellijUrlUpdater {

  @Override
  protected String getEdition() {

    return "intellij"; // community edition is the default edition in devonfw-ide
  }

  @Override
  protected void updateVersion(UrlVersion urlVersion) {

    doUpdateVersion(urlVersion, "https://download.jetbrains.com/idea/ideaIC-${version}.exe", OperatingSystem.WINDOWS);
    doUpdateVersion(urlVersion, "https://download.jetbrains.com/idea/ideaIC-${version}.tar.gz", OperatingSystem.LINUX);
    doUpdateVersion(urlVersion, "https://download.jetbrains.com/idea/ideaIC-${version}.dmg", OperatingSystem.MAC);
  }
}