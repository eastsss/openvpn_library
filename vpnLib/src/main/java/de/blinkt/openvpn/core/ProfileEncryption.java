/*
 * Copyright (c) 2012-2022 Arne Schwabe
 * Distributed under the GNU GPL v2 with additional terms. For full terms see the file doc/LICENSE.txt
 */

package openvpn.core;

import android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* Dummy class that supports no encryption */
public class ProfileEncryption {
    public static void initMasterCryptAlias()
    {

    }

    public static boolean encryptionEnabled()
    {
        return false;
    }

    public static FileInputStream getEncryptedVpInput(Context context, File file) throws GeneralSecurityException, IOException {
        throw new GeneralSecurityException("encryption of file not supported in this build");
    }

    public static FileOutputStream getEncryptedVpOutput(Context context, File file) throws GeneralSecurityException, IOException {
        throw new GeneralSecurityException("encryption of file not supported in this build");
    }


}
